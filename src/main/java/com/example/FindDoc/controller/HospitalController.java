package com.example.FindDoc.controller;

import java.util.List;
import java.util.Optional;

import com.example.FindDoc.Service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.FindDoc.entity.HospitalDetails;
import com.example.FindDoc.repository.Repo;

@RestController
@RequestMapping("/")
public class HospitalController {
@Autowired
service s;
@GetMapping("/hospitalProfile")
public List<HospitalDetails> showhospital(){
	return s.GetHospitalDetails();
}
@PostMapping("/hospitalPost")
public String  insertHospitalDetials(@RequestBody HospitalDetails h){
	s.insertDetailsHospital(h);
	return "posted successfully";
}
@GetMapping("/HospitalById/{n}")
	public Optional<HospitalDetails> getById(@PathVariable String n){
	return s.selectById(n);
}
}
