package no.ntnu.fp.model;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;



public class Appointment {
	private int id;
	private Date date;
	private Time startTime;
	private Time endTime;
	private String location;
	private Location location2;
	private ArrayList <Employee> participants;
	private String message;
	private Employee owner;
	private Alarm alarm;
	//Constructor
	public Appointment(Date d, Time sT, Time eT, String l,ArrayList <Employee> p, String m, Employee o){
		participants = new ArrayList <Employee>();
		date=d;
		startTime = sT;
		endTime = eT;
		location = l;
		participants = p;
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
	public Employee getOwner() {
		return owner;
	}
	public void setOwner(Employee owner) {
		this.owner = owner;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ArrayList<Employee> getParticipants() {
		return participants;
	}
	public void setParticipants(ArrayList<Employee> participants) {
		this.participants = participants;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getStartDate() {
		return date;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setStartDate(Date date) {
		this.date = date;
	}
	public Time getStartTime() {
		return startTime;
	}
	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}
	public Time getEndTime() {
		return endTime;
	}
	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
