package com.example.navigationfragmentassignment1;

import java.io.Serializable;

public class ModelClass implements Serializable {

    private String startDate;
    private String EndDate;
    private String startTime;
    private String EndTime;
    private String EventTitle;
    private String EventDescription;
    private int price;

    public ModelClass(String startDate, String endDate, String startTime, String endTime, String eventTitle, String eventDescription, int price) {
        this.startDate = startDate;
        EndDate = endDate;
        this.startTime = startTime;
        EndTime = endTime;
        EventTitle = eventTitle;
        EventDescription = eventDescription;
        this.price = price;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public String getEventTitle() {
        return EventTitle;
    }

    public String getEventDescription() {
        return EventDescription;
    }

    public int getPrice() {
        return price;
    }
}
