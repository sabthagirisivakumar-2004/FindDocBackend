package com.example.FindDoc.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "HospitalDetail")
public class HospitalDetails {

    @Id
    private String id;

    private String name;
    private String about;
    private String phone;
    private String address;
    private String image;

    private List<String> services;

    private List<Doctor> doctors;

    private List<String> news;

    private List<String> events;

    // Constructors
    public HospitalDetails() {}

    public HospitalDetails(String name, String about, String phone, String address, String image, List<String> services, List<Doctor> doctors, List<String> news, List<String> events) {
        this.name = name;
        this.about = about;
        this.phone = phone;
        this.address = address;
        this.image = image;
        this.services = services;
        this.doctors = doctors;
        this.news = news;
        this.events = events;
    }

    // Getters and setters
    // ...


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<String> getServices() {
        return services;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public List<String> getNews() {
        return news;
    }

    public void setNews(List<String> news) {
        this.news = news;
    }

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }
}

@Document
class Doctor {

    @Id
    private String id;

    private String img;
    private String name;
    private String location;



    private String Speciality;
    private String status;

    // Default constructor
    public Doctor() {}

    // Constructors
    public Doctor(String img, String name, String location, String speciality, String status) {
        this.img = img;
        this.name = name;
        this.location = location;
        Speciality = speciality;
        this.status = status;
    }

    // Getters and setters
    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}