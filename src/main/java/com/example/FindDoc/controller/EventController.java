package com.example.FindDoc.controller;

import com.example.FindDoc.Service.service;
import com.example.FindDoc.entity.EventsDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {

    @Autowired
    service eventsService;

    @GetMapping("/getEvents")
    public ResponseEntity<List<EventsDetails>> getAllEvents() {
        List<EventsDetails> events = eventsService.getAllEvents();
        return ResponseEntity.ok(events);
    }

    @GetMapping("/getEvent/{id}")
    public ResponseEntity<EventsDetails> getEventById(@PathVariable int id) {
        EventsDetails event = eventsService.getEventById(id);
        return event != null ? ResponseEntity.ok(event) : ResponseEntity.notFound().build();
    }

    @PostMapping("/postEvents")
    public ResponseEntity<EventsDetails> createEvent(@RequestBody EventsDetails eventDetails) {
        EventsDetails createdEvent = eventsService.createEvent(eventDetails);
        return ResponseEntity.ok(createdEvent);
    }
}