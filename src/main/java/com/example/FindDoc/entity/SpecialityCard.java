package com.example.FindDoc.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SpecialityCard")
public class SpecialityCard {
    @Id
    private int id;
    private String Simg;
    private String speciality;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSimg() {
        return Simg;
    }

    public void setSimg(String simg) {
        Simg = simg;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
