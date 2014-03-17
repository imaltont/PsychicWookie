package no.ntnu.fp.model;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

public class Alarm {
	private int id;
	private String message;
	private Time time;
	private Date date;
	
	public Alarm(ArrayList <Employee> p, String m, Date d, Time t){
		message=m;
		time=t;
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
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
