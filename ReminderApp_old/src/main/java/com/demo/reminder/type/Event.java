package com.demo.reminder.type;

import java.util.Arrays;

public class Event {
	
	private String name;
    private String frequency;
    private String time;
    private String date;
    private String[] daysOfWeek;

    // Constructor
    public Event(String name, String frequency, String time, String date, String[] daysOfWeek) {
        this.name = name;
        this.frequency = frequency;
        this.time = time;
        this.date = date;
        this.daysOfWeek = daysOfWeek;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String[] getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(String[] daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }
    
	@Override
	public String toString() {
		return "Event [name=" + name + ", frequency=" + frequency + ", time=" + time + ", date=" + date
				+ ", daysOfWeek=" + Arrays.toString(daysOfWeek) + "]";
	}

}
