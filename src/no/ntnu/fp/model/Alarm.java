package no.ntnu.fp.model;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

public class Alarm {
	private int id;
	private String message;
	private Date date;
	
	public Alarm(String m, Date d){
		message=m;
		date=d;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
