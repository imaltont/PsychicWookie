package no.ntnu.fp.model;

import java.sql.Timestamp;

public class Alarm {
	private int id;
    private int appointmentID;
	private String message;
	private Timestamp time;

	public Alarm(String m, Timestamp d, int appointmentID){
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

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}


    public int getAppointmentID() {
        return appointmentID;
    }
}
