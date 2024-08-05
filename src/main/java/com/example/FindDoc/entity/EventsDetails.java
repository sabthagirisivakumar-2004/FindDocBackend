package com.example.FindDoc.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Event")
public class EventsDetails {

    @Id
    private int _id;
    private String Etitle;
    private String Edate;
    private Location Elocation;
    private String Edescription;
    private String Eimage;

    // Constructors, Getters, and Setters

    public EventsDetails() {}

    public EventsDetails(int _id, String Etitle, String Edate, Location Elocation, String Edescription, String Eimage) {
        this._id = _id;
        this.Etitle = Etitle;
        this.Edate = Edate;
        this.Elocation = Elocation;
        this.Edescription = Edescription;
        this.Eimage = Eimage;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getTitle() {
        return Etitle;
    }

    public void setTitle(String Etitle) {
        this.Etitle = Etitle;
    }

    public String getDate() {
        return Edate;
    }

    public void setDate(String Edate) {
        this.Edate = Edate;
    }

    public Location getLocation() {
        return Elocation;
    }

    public void setLocation(Location Elocation) {
        this.Elocation = Elocation;
    }

    public String getDescription() {
        return Edescription;
    }

    public void setDescription(String Edescription) {
        this.Edescription = Edescription;
    }

    public String getImage() {
        return Eimage;
    }

    public void setImage(String Eimage) {
        this.Eimage = Eimage;
    }

    public static class Location {
        private String name;
        private String address;

        public Location() {}

        public Location(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
}