package no.ntnu.fp.model;

import java.sql.Date;

public class Alarm {
	private int id;
    private int appointmentID;
	private String message;
	private Date time;
	
	public Alarm(String m, Date d, int appointmentID){
		message=m;
		time=d;
        this.appointmentID = appointmentID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}


    public int getAppointmentID() {
        return appointmentID;
    }
}
