package no.ntnu.fp.model;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

public class Location {
	private int numberOfSeats;
	private String name;
	private ArrayList <Appointment> reserved;
	//Logic
	public boolean isAvailable(Date date, Time startTime, Time endTime, int numberOfParticipants){
		int i=0;
		if(numberOfParticipants>numberOfSeats){
			return false;
		}
		while (i<reserved.size()){
			if(date==reserved.get(i).getDate()){
				if(startTime.after(reserved.get(i).getStartTime()) || startTime==reserved.get(i).getStartTime() && startTime.before(reserved.get(i).getEndTime())){
					return false;
				}
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
