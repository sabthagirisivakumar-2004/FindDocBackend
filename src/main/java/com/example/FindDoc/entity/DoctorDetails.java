package com.example.FindDoc.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "DoctorDetail")
public class DoctorDetails {
    @Id
    private int id;
    private String Bimg;
    private  String Dimg;
    private String Dname;
    private String Speciality;
    private String Location;
    private String About;
    private String Status;
    private String Fees;
    private String Actions[];
    private String Duties[];
    private String Eimg;
    private String Ehname;
    private String Erole;
    private String Eduration;
    private String Elocation;
    private String Rimg;
    private String Rname;
    private String Rdate;
    private String Rdesc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBimg() {
        return Bimg;
    }

    public void setBimg(String bimg) {
        Bimg = bimg;
    }

    public String getDimg() {
        return Dimg;
    }

    public void setDimg(String dimg) {
        Dimg = dimg;
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String dname) {
        Dname = dname;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getAbout() {
        return About;
    }

    public void setAbout(String about) {
        About = about;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getFees() {
        return Fees;
    }

    public void setFees(String fees) {
        Fees = fees;
    }

    public String[] getActions() {
        return Actions;
    }

    public void setActions(String[] actions) {
        Actions = actions;
    }

    public String[] getDuties() {
        return Duties;
    }

    public void setDuties(String[] duties) {
        Duties = duties;
    }

    public String getEimg() {
        return Eimg;
    }

    public void setEimg(String eimg) {
        Eimg = eimg;
    }

    public String getEhname() {
        return Ehname;
    }

    public void setEhname(String ehname) {
        Ehname = ehname;
    }

    public String getErole() {
        return Erole;
    }

    public void setErole(String erole) {
        Erole = erole;
    }

    public String getEduration() {
        return Eduration;
    }

    public void setEduration(String eduration) {
        Eduration = eduration;
    }

    public String getElocation() {
        return Elocation;
    }

    public void setElocation(String elocation) {
        Elocation = elocation;
    }

    public String getRimg() {
        return Rimg;
    }

    public void setRimg(String rimg) {
        Rimg = rimg;
    }

    public String getRname() {
        return Rname;
    }

    public void setRname(String rname) {
        Rname = rname;
    }

    public String getRdate() {
        return Rdate;
    }

    public void setRdate(String rdate) {
        Rdate = rdate;
    }

    public String getRdesc() {
        return Rdesc;
    }

    public void setRdesc(String rdesc) {
        Rdesc = rdesc;
    }
}
