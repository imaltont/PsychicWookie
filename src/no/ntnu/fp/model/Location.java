package no.ntnu.fp.model;

import java.sql.Timestamp;
import java.util.ArrayList;

public class Location {
	private int numberOfSeats;
	private String name;
	private ArrayList <Appointment> reserved;
	//Logic
	public boolean isAvailable(Timestamp startTime, Timestamp endTime, int numberOfParticipants){
		int i=0;
		if(numberOfParticipants>numberOfSeats){
			return false;
		}
		while (i<reserved.size()){
			if(startTime.after(reserved.get(i).getStartTime()) || startTime==reserved.get(i).getStartTime() && startTime.before(reserved.get(i).getEndTime())){
				return false;
			}
			i++;
			}
		return true;
		}
	//Constructor
	public Location(String n, int nOS){
		reserved = new ArrayList <Appointment>();
		name = n;
		numberOfSeats = nOS;
	}
	//Setters & getters
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		numberOfSeats = numberOfSeats;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
