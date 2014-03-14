package no.ntnu.fp.model;

import java.util.ArrayList;

public class Group {
	private int id;
	private ArrayList <Employee> members;
	private ArrayList <Appointment> invitedAppointments;
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
