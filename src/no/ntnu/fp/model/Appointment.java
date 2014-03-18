package no.ntnu.fp.model;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

import no.ntnu.fp.storage.DatabaseHandler;



public class Appointment {
	private int id;
	private Date startTime;
	private Date endTime;
	private String location;
	private ArrayList <Employee> participants;
	private String description;
	private Employee owner;
	private Alarm alarm;
	//Constructor
	public Appointment(Date sT, Date eT, String loc, String des, int oID){
		DatabaseHandler data = new DatabaseHandler();
		data.addAppointment(loc, sT, eT, description, oID);
		participants = new ArrayList <Employee>();
		startTime = sT;
		endTime = eT;
		location = loc;
		description=des;
		owner = data.getEmployee(oID); 
		
	}
	public Appointment(){
		
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
}
