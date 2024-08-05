package com.example.FindDoc.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "News")
public class NewsDetails {

    @Id

    private int id;
    private String Ntitle;
    private String Ndate;
    private String Ncontent;



    public NewsDetails() {}

    public NewsDetails(int id, String Ntitle, String Ndate, String Ncontent) {
        this.id = id;
        this.Ntitle = Ntitle;
        this.Ndate = Ndate;
        this.Ncontent = Ncontent;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNtitle() {
        return Ntitle;
    }

    public void setNtitle(String Ntitle) {
        this.Ntitle = Ntitle;
    }

    public String getNdate() {
        return Ndate;
    }

    public void setNdate(String Ndate) {
        this.Ndate = Ndate;
    }

    public String getNcontent() {
        return Ncontent;
    }

    public void setNcontent(String Ncontent) {
        this.Ncontent = Ncontent;
    }
}