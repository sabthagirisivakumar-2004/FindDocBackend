package com.example.FindDoc.controller;

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
    @GetMapping("/doctorCardGet")
    public List<DoctorCard> getDoctorCard(){
        return DC.findAll();
    }
    @PostMapping("/doctorCardPost")
    public String postDoctorCard(@RequestBody DoctorCard d){
        DC.save(d);
        return "Posted Successfully";

    }
    @GetMapping("/DoctorCardGetById/{n}")
    public Optional<DoctorCard> getById(@PathVariable int n){
        return DC.findById(n);
    }
}
