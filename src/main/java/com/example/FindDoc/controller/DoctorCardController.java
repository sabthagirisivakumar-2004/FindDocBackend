package com.example.FindDoc.controller;

import com.example.FindDoc.Service.service;
import com.example.FindDoc.entity.DoctorCard;
import com.example.FindDoc.repository.DoctorCardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class DoctorCardController {
    @Autowired
    DoctorCardRepo DC;
    @Autowired
    service s;
    @GetMapping("/doctorCardGet")
    public List<DoctorCard> getDoctorCard(){
        return DC.findAll();
    }
    @PostMapping("/doctorCardPost")
    public String postDoctorCard(@RequestBody DoctorCard d){
        DC.save(d);
        return "Posted Successfully";

    }
    @GetMapping("/searchDoctors/{txt}")
    public List<DoctorCard> search(@PathVariable String txt){
        return s.findByText(txt);
    }
    @GetMapping("/DoctorCardGetById/{n}")
    public Optional<DoctorCard> getById(@PathVariable int n){
        return DC.findById(n);
    }
}
