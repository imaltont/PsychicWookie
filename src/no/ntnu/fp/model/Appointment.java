package no.ntnu.fp.model;

import java.sql.Date;
import java.util.ArrayList;



public class Appointment {
	private int id;
	private Date startTime;
	private Date endTime;
	private String location;
	private Location location2;
	private ArrayList <Employee> participants;
	private String message;
	private int owner;
	private Alarm alarm;
	//Constructor
	public Appointment(Date sT, Date eT, String l, String m, int o){
		participants = new ArrayList <Employee>();
		startTime = sT;
		endTime = eT;
		location = l;
		message = m;
		owner = o;
	}
	//Logic
	public void removeParticipant(Employee employee){
		participants.remove(employee);
	}
	public void addParticipant(Employee employee){
		participants.add(employee);
	}
	//Setters & getters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Location getLocation2() {
		return location2;
	}
	public void setLocation2(Location location2) {
		this.location2 = location2;
	}
	public ArrayList<Employee> getParticipants() {
		return participants;
	}
	public void setParticipants(ArrayList<Employee> participants) {
		this.participants = participants;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getOwner() {
		return owner;
	}
	public void setOwner(int owner) {
		this.owner = owner;
	}
	public Alarm getAlarm() {
		return alarm;
	}
	public void setAlarm(Alarm alarm) {
		this.alarm = alarm;
	}

}
