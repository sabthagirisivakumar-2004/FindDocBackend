package com.example.FindDoc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.FindDoc.entity.HospitalDetails;
import com.example.FindDoc.repository.Repo;

@RestController
@RequestMapping("/")
public class HospitalController {
@Autowired
Repo r;
@GetMapping("/hospitalProfile")
public List<HospitalDetails> showhospital(){
	return r.findAll();
}
@PostMapping("/hospitalPost")
public String  insertHospitalDetials(@RequestBody HospitalDetails h){
	r.save(h);
	return "posted successfully";
}
@GetMapping("/HospitalById/{n}")
	public Optional<HospitalDetails> getById(@PathVariable int n){
	return r.findById(n);
}
}
