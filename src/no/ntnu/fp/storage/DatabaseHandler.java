package no.ntnu.fp.storage;

/**
 * Created with IntelliJ IDEA.
 * User: Sondre Hegdal
 * Date: 14.03.14
 * Time: 13:07
 * To change this template use File | Settings | File Templates.
 */

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
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
        PreparedStatement query = null;
        try {
            query = this.db.prepareStatement("SELECT id, password FROM ansatt WHERE brukernavn = ?");
            query.setString(1, account);
            ResultSet rs = query.executeQuery();

            if (!rs.next ())
            {
                return -1;
            }

            String hash = encryptPassword(password);
            if (hash.equals(rs.getString("passord")))
            {
                return this.getEmployeeId(rs.getString("brukernavn"));
            }
            return -1;
            } catch (SQLException | NoSuchAlgorithmException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                return -1;
            }

    }

    private int getEmployeeId(String username) throws SQLException {
        PreparedStatement query = this.db.prepareStatement("SELECT id FROM employee WHERE brukernavn = ?");

        query.setString(1, username);
        ResultSet rs = query.executeQuery();

        if (!rs.next())
        {
            return -1;
        }
        return rs.getInt ("brukernavn");
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

    public int addAppointment (String place, Time starteDate, Time endDate, Date date, String description, int ownerId)
    {
        try {
            int id = getNextAutoIncrement ("avtale");

            PreparedStatement query = this.db.prepareStatement("INSERT INTO avtale (avtaleid, sted, starttid, sluttid, dato, beskrivelse, eierid) VALUES (?,?,?,?,?,?,?)");

            query.setInt(1, id);
            query.setString(2, place);
            query.setTime(3, starteDate);
            query.setTime(4, endDate);
            query.setDate(5, (java.sql.Date) date);
            query.setString(6, description);
            query.setInt(7, ownerId);
            query.executeUpdate();

            return id;
        } catch (SQLException  e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            return -1;
        }
    }

    public int addAppointmentCustomPlace (String place, Time starteDate, Time endDate, Date date, String description, int ownerId)
    {
        try {
            int id = getNextAutoIncrement ("avtale");

            PreparedStatement query = this.db.prepareStatement("INSERT INTO avtale (avtaleid, c_sted, starttid, sluttid, dato, beskrivelse, eierid) VALUES (?,?,?,?,?,?,?)");

            query.setInt(1, id);
            query.setString(2, place);
            query.setTime(3, starteDate);
            query.setTime(4, endDate);
            query.setDate(5, (java.sql.Date) date);
            query.setString(6, description);
            query.setInt(7, ownerId);
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
        PreparedStatement query = this.db.prepareStatement("SELECT brukernavn, passord, epost, navn FROM employee WHERE id = ?");
        query.setInt(1, id);
        ResultSet rs = query.executeQuery();

        if (!rs.next())
        {
            return null;
        }

        return new Employee (rs.getString("brukernavn"), rs.getString("passord"), rs.getString("epost"), rs.getString("navn"));
        return null;

    }

    public Appointment getAppointment (int id) throws SQLException {
        PreparedStatement query = this.db.prepareStatement("SELECT dato, starttid, sluttid, sted, c_sted FROM avtale WHERE avtaleid = ?");
        query.setInt(1, id);
        ResultSet rs = query.executeQuery();

        if (!rs.next())
        {
            return null;
        }
        if (rs.getString("c_sted") != null)
        {
            return new Appointment (rs.getDate("dato"), rs.getTime("starttid"), rs.getTime("sluttid"), rs.getString("c_sted"));
        }
        return new Appointment (rs.getDate("dato"), rs.getTime("starttid"), rs.getTime("sluttid"), rs.getString("sted"));
        return null;
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
        PreparedStatement query = this.db.prepareStatement ("SELECT romnr, antplasser FROM sted WHERE id = ?");
        query.setInt(1, id);
        ResultSet rs = query.executeQuery();

        if (!rs.next())
        {
            return null;
        }

        return new Location (rs.getString("romnr"), rs.getInt("antplasser"));
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

        return new Alarm (rs.getString("melding"), rs.getDate("tidspunkt"));
        return null;
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
        return null;
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

