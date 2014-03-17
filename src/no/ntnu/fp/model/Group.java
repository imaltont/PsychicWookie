package no.ntnu.fp.model;

import java.util.ArrayList;

public class Group {
	private String id;
	private ArrayList <Employee> members;
	private ArrayList <Appointment> invitedAppointments;
	
	public Group(String id, String email){
		this.id=id;
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String email;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ArrayList<Employee> getMembers() {
		return members;
	}
	public void setMembers(ArrayList<Employee> members) {
		this.members = members;
	}
	public ArrayList<Appointment> getInvitedAppointments() {
		return invitedAppointments;
	}
	public void setInvitedAppointments(ArrayList<Appointment> invitedAppointments) {
		this.invitedAppointments = invitedAppointments;
	}
	
}
