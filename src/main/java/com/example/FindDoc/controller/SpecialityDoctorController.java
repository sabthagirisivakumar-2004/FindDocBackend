package com.example.FindDoc.controller;

import com.example.FindDoc.entity.SpecialityDoctor;
import com.example.FindDoc.repository.SpecialityCardRepo;
import com.example.FindDoc.repository.SpecialityDoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class SpecialityDoctorController {
    @Autowired
    SpecialityDoctorRepo r;
    @GetMapping("/GetAllSpecialityDoctor")
    public List<SpecialityDoctor> getSpecialDoctor(){
        return r.findAll();
    }
}
