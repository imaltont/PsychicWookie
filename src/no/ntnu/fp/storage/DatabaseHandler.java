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
import java.util.ArrayList;
import java.util.Date;


import no.ntnu.fp.model.Employee;
import no.ntnu.fp.model.Alarm;
import no.ntnu.fp.model.Appointment;
import no.ntnu.fp.model.Location;
import no.ntnu.fp.model.Group;
import sun.rmi.runtime.Log;



public class DatabaseHandler
{
    private Connection db;

    public DatabaseHandler ()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            this.db  = DriverManager.getConnection(DatabaseSettings.db_url);
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
                return this.getEmployeeId(rs.getInt("id"));
            }
            return -1;
            } catch (SQLException | NoSuchAlgorithmException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                return -1;
            }

    }

    private int getEmployeeId(int emplyeeId) {
        return 0;  //To change body of created methods use File | Settings | File Templates.
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
            updateState();

            return id;
        } catch (SQLException | NoSuchAlgorithmException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            return -1;
        }
    }


    public void addAlarm ()
    {
        //something something code
    }

    public void addAppointment ()
    {
        //do this sometime
    }

    public void deleteAppointment ()
    {
        //delete "this sometime"
    }

    public Employee getEmployee ()
    {
        //Mr. Marsh
        return null;
    }

    public Appointment getAppointment ()
    {
        //"this sometime"
        return null;
    }

    public Location getLocation ()
    {
        //there
        return null;
    }

    public Alarm getAlarm ()
    {
        //!RINGRINGRINGRINGRING!!!
        return null;
    }

    public Group getGroup ()
    {
        //Integer 1 <= person.
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

    private void updateState () throws SQLException
    {
        int state = getState();

        state += 1;

        PreparedStatement query = this.db.prepareStatement("UPDATE state SET value = ?");
        query.setInt(1, state);
        query.executeUpdate();

    }

    public int getState() throws SQLException {
        PreparedStatement query = this.db.prepareStatement("SELECT value FROM state WHERE id = 1");
        ResultSet rs = query.executeQuery();

        rs.next();

        return rs.getInt(1);
    }
}

