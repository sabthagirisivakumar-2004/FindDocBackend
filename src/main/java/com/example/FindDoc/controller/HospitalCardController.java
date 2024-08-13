package com.example.FindDoc.controller;

import com.example.FindDoc.Service.service;
import com.example.FindDoc.entity.HospitalCard;
import com.example.FindDoc.repository.HospitalCardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class HospitalCardController {
    @Autowired
    HospitalCardRepo h;
     @Autowired
     service s;
    @GetMapping("/HospitalCardGet")
    public List<HospitalCard> getHospitalCard(){
        return h.findAll();
    }
    @PostMapping("/HospitalCardPost")
    public String postHospitalCard(@RequestBody HospitalCard hc){
        h.save(hc);
        return "Posted Successfully";
    }
    @GetMapping("/hospitalCardSearch/{txt}")
    public List<HospitalCard> findbyHospitalCard(@PathVariable String txt){
        return s.findByHcard(txt);
    }

    @GetMapping("/HospitalCardGetById/{n}")
    public Optional<HospitalCard> getById(@PathVariable int n){
        return h.findById(n);
    }

}
