package no.ntnu.fp.model;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

public class Alarm {
	private int id;
	private String message;
	private Date time;
	
	public Alarm(ArrayList <Employee> p, String m, Date d){
		message=m;
		time=d;
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
	

	
}
