package no.ntnu.fp.model;

import java.util.ArrayList;

public class Employee {
	private String username;
	private String password;
	private String email;
	private String name;
	private ArrayList <Appointment> myAppointments;
	private ArrayList <Appointment> invitedAppointments;
	private ArrayList <Alarm> alarms;
	

//Setters & getters
	public Employee(String username, String password, String email, String name){
		this.username=username;
		this.password=password;
		this.email=email;
		this.name=name;
	}
	public ArrayList<Alarm> getAlarms() {
		return alarms;
	}
	public void setAlarms(ArrayList<Alarm> alarms) {
		this.alarms = alarms;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Appointment> getMyAppointments() {
		return myAppointments;
	}
	public void setMyAppointments(ArrayList<Appointment> myAppointments) {
		this.myAppointments = myAppointments;
	}
	public ArrayList<Appointment> getInvitedAppointments() {
		return invitedAppointments;
	}
	public void setInvitedAppointments(ArrayList<Appointment> invitedAppointments) {
		this.invitedAppointments = invitedAppointments;
	}

}
