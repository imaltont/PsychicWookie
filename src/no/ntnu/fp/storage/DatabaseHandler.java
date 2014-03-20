package no.ntnu.fp.storage;

/**
 * Created with IntelliJ IDEA.
 * User: Sondre Hegdal
 * Date: 14.03.14
 * Time: 13:07
 * To change this template use File | Settings | File Templates.
 */

import no.ntnu.fp.model.*;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;



public class DatabaseHandler
{
    private Connection db;

    public DatabaseHandler ()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            this.db  = DriverManager.getConnection(DatabaseSettings.db_url, DatabaseSettings.db_username, DatabaseSettings.db_pw);
            System.out.print ("Database connection established");
        }

        catch (ClassNotFoundException | IllegalAccessException | SQLException | InstantiationException e) {
            System.out.print ("You suck, " + e.getMessage());
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }

    public void close ()
    {
        try {
            this.db.close();
        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public int authenticate (String account, String password)
    {

        try {
            PreparedStatement query = this.db.prepareStatement("SELECT id, passord FROM ansatt WHERE brukernavn = ?");
            query.setString(1, account);
            ResultSet rs = query.executeQuery();

            if (!rs.next ())
            {
                return -1;
            }

            String hash = encryptPassword(password);
            if (hash.equals(rs.getString("passord")))
            {
                return this.getEmployeeId(account);
            }

            return -1;
            } catch (SQLException | NoSuchAlgorithmException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                return -1;
            }

    }

    public int getEmployeeId(String username) throws SQLException {
        PreparedStatement query = this.db.prepareStatement("SELECT id FROM ansatt WHERE brukernavn = ?");

        query.setString(1, username);
        ResultSet rs = query.executeQuery();

        if (!rs.next())
        {
            return -1;
        }
        return rs.getInt ("id");
    }


    public int addUser (String username, String password, String email, String name)
    {
        try {
            int id = getNextAutoIncrement ("ansatt");

            PreparedStatement query = this.db.prepareStatement("INSERT INTO ansatt (id, brukernavn, epost, passord, navn) VALUES (?,?,?,?,?)");

            query.setInt(1, id);
            query.setString(2, username);
            query.setString(3, email);
            query.setString(4, encryptPassword(password));
            query.setString(5, name);
            query.executeUpdate();

            return id;
        } catch (SQLException | NoSuchAlgorithmException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            return -1;
        }
    }


    public int addAlarm (String message, Date time, int appointmentId)
    {
        try {
            int id = getNextAutoIncrement ("varsel");

            PreparedStatement query = this.db.prepareStatement("INSERT INTO varsel (varselid, tidspunkt, melding, avtaleid) VALUES (?,?,?,?)");

            query.setInt(1, id);
            query.setDate(2, (java.sql.Date) time);
            query.setString(3, message);
            query.setInt(4, appointmentId);
            query.executeUpdate();

            return id;
        } catch (SQLException  e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            return -1;
        }
    }

    public int addAppointment (int placeId, Date starteDate, Date endDate, String description, int ownerId)
    {
        try {
            int id = getNextAutoIncrement ("avtale");

            PreparedStatement query = this.db.prepareStatement("INSERT INTO avtale (avtaleid, sted, starttid, sluttid, beskrivelse, eierid) VALUES (?,?,?,?,?,?)");

            query.setInt(1, id);
            query.setString(2, getLocationName(placeId));
            query.setDate(3, (java.sql.Date) starteDate);
            query.setDate(4, (java.sql.Date) endDate);
            query.setString(5, description);
            query.setInt(6, ownerId);
            query.executeUpdate();

            return id;
        } catch (SQLException  e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            return -1;
        }
    }

    public void removeParticipant (int employeeId, int appointmentId) throws SQLException {
        PreparedStatement query = this.db.prepareStatement("DELETE FROM invitert_avtale WHERE ansattid = ? AND avtaleid = ?");
        query.setInt(1, employeeId);
        query.setInt(2, appointmentId);
        query.executeUpdate();
    }

    public ArrayList <Integer> getParticipants (int appointmentId) throws SQLException {
        ArrayList <Integer> id = new ArrayList<Integer>();

        PreparedStatement query = this.db.prepareStatement("SELECT ansattid FROM invitert_avtale WHERE avtaleid = ? AND id = ?");
        query.setInt(1, appointmentId);
        ResultSet rs;

        for (int i = 0; i < getNextAutoIncrement("invitert_avtale"); i++)
        {
            query.setInt(2, i);
            rs = query.executeQuery();
            if (rs.next())
            {
                id.add(rs.getInt("ansattid"));
            }
        }

        return id;
    }

    public void inviteEmployee (int employeeId, int appointmentId) throws SQLException {
        int id = getNextAutoIncrement("invitert_avtale");

        PreparedStatement query = this.db.prepareStatement("INSERT INTO invitert_avtale (id, ansattId,avtaleId) VALUES (?,?,?)");

        query.setInt(1, id);
        query.setInt(2, employeeId);
        query.setInt(3, appointmentId);
        query.executeUpdate();

    }

    public int getNumberOfEmployees () throws SQLException {
        return getNextAutoIncrement("ansatt");
    }

    public void answerAppointment (int employeeId, int appointmentId, int answer) throws SQLException {
        PreparedStatement query = this.db.prepareStatement("UPDATE invitert_avtale SET skal_komme = ? WHERE ansattid = ? AND avtaleid = ?");
        query.setInt(1, answer);
        query.setInt(2, employeeId);
        query.setInt(3, appointmentId);
        query.executeUpdate();

    }

    public boolean getAnswer (int employeeId, int appointmentId) throws SQLException {
        PreparedStatement query = this.db.prepareStatement("SELECT skal_komme FROM invitert_avtale WHERE ansattid = ? AND avtaleid = ?");
        query.setInt(1, employeeId);
        query.setInt(2, appointmentId);
        ResultSet rs = query.executeQuery();

        if (rs.getInt("skal_komme") == 0)
        {
            return false;
        }
        else
        {
            return true;
        }

    }

    public String getLocationName(int placeId) throws SQLException {
        PreparedStatement query = this.db.prepareStatement("SELECT romnr FROM sted WHERE id = ?");
        query.setInt(1, placeId);
        ResultSet rs = query.executeQuery();

        if (!rs.next())
        {
            return null;
        }

        return rs.getString("romnr");

    }

    public int getNumberOfPlaces () throws SQLException {
        return getNextAutoIncrement("sted");
    }

    public int addAppointmentCustomPlace (String place, Date starteDate, Date endDate, String description, int ownerId)
    {
        try {
            int id = getNextAutoIncrement ("avtale");

            PreparedStatement query = this.db.prepareStatement("INSERT INTO avtale (avtaleid, c_sted, starttid, sluttid, beskrivelse, eierid) VALUES (?,?,?,?,?,?)");

            query.setInt(1, id);
            query.setString(2, place);
            query.setDate(3, (java.sql.Date) starteDate);
            query.setDate(4, (java.sql.Date) endDate);
            query.setString(5, description);
            query.setInt(6, ownerId);
            query.executeUpdate();

            return id;
        } catch (SQLException  e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            return -1;
        }
    }


    public void deleteAppointment (int appointmentId) throws SQLException {
        PreparedStatement query = this.db.prepareStatement("DELETE FROM avtale WHERE avtaleId = ?");
        query.setInt(1, appointmentId);
        query.executeUpdate();
    }

    public Employee getEmployee (int id) throws SQLException {
        PreparedStatement query = this.db.prepareStatement("SELECT brukernavn, passord, epost, navn FROM ansatt WHERE id = ?");
        query.setInt(1, id);
        ResultSet rs = query.executeQuery();

        if (!rs.next())
        {
            return null;
        }

        return new Employee (rs.getString("brukernavn"), rs.getString("passord"), rs.getString("epost"), rs.getString("navn"));


    }

    public Appointment getAppointment (int id) throws SQLException {
        PreparedStatement query = this.db.prepareStatement("SELECT dato, starttid, sluttid, sted, c_sted, beskrivelse, eierid FROM avtale WHERE avtaleid = ?");
        query.setInt(1, id);
        ResultSet rs = query.executeQuery();

        if (!rs.next())
        {
            return null;
        }

        if (rs.getString("sted") == null)
        {
            return new Appointment (rs.getDate("starttid"), rs.getDate("sluttid"), rs.getString("c_sted"), rs.getString("beskrivelse"), rs.getInt("eierid"));
        }

        return new Appointment (rs.getDate("starttid"), rs.getDate("sluttid"), rs.getString("sted"), rs.getString("beskrivelse"), rs.getInt("eierid"));
    }

    public int getAppointmentId (int eierid) throws SQLException {
        PreparedStatement query = this.db.prepareStatement("SELECT avtaleid FROM avtale WHERE eierid = ?");
        query.setInt(1, eierid);

        ResultSet rs = query.executeQuery();

        if (!rs.next())
        {
            return -1;
        }

        return rs.getInt("avtaleid");
    }

    public Location getLocation (int id) throws SQLException {
        PreparedStatement query = this.db.prepareStatement ("SELECT romnr, antallplasser FROM sted WHERE id = ?");
        query.setInt(1, id);
        ResultSet rs = query.executeQuery();

        if (!rs.next())
        {
            return null;
        }

        return new Location (rs.getString("romnr"), rs.getInt("antallplasser"));
    }

    public Alarm getAlarm (int id, int appointmentId) throws SQLException {
        PreparedStatement query = this.db.prepareStatement ("SELECT melding, tidspunkt FROM varsel WHERE varselid = ? AND avtaleid = ?");
        query.setInt(1, id);
        query.setInt(2, appointmentId);
        ResultSet rs = query.executeQuery();

        if (!rs.next())
        {
            return null;
        }

        return new Alarm (rs.getString("melding"), rs.getDate("tidspunkt"), appointmentId);
    }

    public Group getGroup (int id) throws SQLException {
        PreparedStatement query = this.db.prepareStatement ("SELECT gruppenr, epost FROM gruppe WHERE id = ?");
        query.setInt(1, id);
        ResultSet rs = query.executeQuery();

        if (!rs.next())
        {
            return null;
        }
        return new Group(rs.getString("gruppenr"), rs.getString("epost"));
    }

    public void addMember (int groupId, int employeeId) throws SQLException {
        int id = getNextAutoIncrement("medlem_av");

        PreparedStatement query = this.db.prepareStatement("INSERT INTO medlem_av (id, medlemid, gruppeid) VALUES (?,?,?)");
        query.setInt(1, id);
        query.setInt(2, employeeId);
        query.setInt(3, groupId);
        query.executeUpdate();
    }

    public ArrayList <Integer> getMemberId(int groupId) throws SQLException {
        ArrayList <Integer> id = new ArrayList<Integer>();

        PreparedStatement query = this.db.prepareStatement("SELECT medlemid FROM medlem_av WHERE gruppeid = ? AND id = ?");
        query.setInt(1, groupId);
        ResultSet rs;

        for (int i = 0; i < getNextAutoIncrement("medlem_av"); i++)
        {
            query.setInt(2, i);
            rs = query.executeQuery();
            if (rs.next())
            {
                id.add(rs.getInt("medlemid"));
            }
        }

        return id;
    }

    private int getNextAutoIncrement(String table) throws SQLException
    {
        PreparedStatement query = this.db.prepareStatement("SHOW TABLE STATUS LIKE ?");
        query.setString(1, table);
        ResultSet rs = query.executeQuery();
        rs.next();
        return rs.getInt("Auto_increment");
    }

    private String encryptPassword(String string) throws NoSuchAlgorithmException {
        MessageDigest mDigest = MessageDigest.getInstance("SHA1");
        byte [] result = mDigest.digest (string.getBytes());
        StringBuffer buffer = new StringBuffer ();
        for (int i = 0; i < result.length; i++)
        {
            buffer.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }

        return buffer.toString();

    }
}

