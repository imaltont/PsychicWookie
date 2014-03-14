package no.ntnu.fp.storage;

/**
 * Created with IntelliJ IDEA.
 * User: Sondre Hegdal
 * Date: 14.03.14
 * Time: 13:07
 * To change this template use File | Settings | File Templates.
 */

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
        //stay tuned
         return 0;
    }

    public void addUser ()
    {
        //somthing code-ish
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


}

