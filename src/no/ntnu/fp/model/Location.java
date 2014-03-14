package no.ntnu.fp.model;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

public class Location {
	private int NumberOfSeats;
	private String name;
	private ArrayList <Appointment> reserved;
	//Logic
	public boolean isAvailable(Date date, Time startTime, Time endTime){
		int i=0;
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
	public Location(){
		reserved = new ArrayList <Appointment>();
	}
	//Setters & getters
	public int getNumberOfSeats() {
		return NumberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		NumberOfSeats = numberOfSeats;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
