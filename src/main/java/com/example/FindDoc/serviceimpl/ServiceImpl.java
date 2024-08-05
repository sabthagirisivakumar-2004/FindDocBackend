package com.example.FindDoc.serviceimpl;

import com.example.FindDoc.DTO.AuthenticationDTO;
import com.example.FindDoc.Service.service;
import com.example.FindDoc.entity.EventsDetails;
import com.example.FindDoc.entity.NewsDetails;
import com.example.FindDoc.entity.User;
import com.example.FindDoc.repository.EventsRepository;
import com.example.FindDoc.repository.NewsDetailsRepository;
import com.example.FindDoc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ServiceImpl implements service {
    @Autowired
    UserRepository UserRepo;
    @Autowired
    NewsDetailsRepository newsRepository;
    @Autowired
    EventsRepository eventsRepository;
    @Override
    public List<User> getAllDetails() {
        return UserRepo.findAll() ;
    }

    @Override
    public User postAllDetails(AuthenticationDTO Auth) {

        String id=Auth.getId();
        if(id == null || id.isEmpty()){
            id= UUID.randomUUID().toString();
        }
        User u = new User(Auth.getId(), Auth.getEmail(), Auth.getPassword());
        return UserRepo.save(u);
    }


    @Override
    public User findByEmail(String mail) {
        return UserRepo.findByEmail(mail);
    }
    @Override
    public List<NewsDetails> getAllNews() {
        return newsRepository.findAll();
    }

    @Override
    public NewsDetails getNewsById(int id) {
        return newsRepository.findById(id).orElse(null);
    }

    @Override
    public NewsDetails createNews(NewsDetails newsDetails) {
        return newsRepository.save(newsDetails);
    }
    @Override
    public List<EventsDetails> getAllEvents() {
        return eventsRepository.findAll();
    }
    @Override
    public EventsDetails getEventById(int id) {
        return eventsRepository.findById(id).orElse(null);
    }
    @Override
    public EventsDetails createEvent(EventsDetails eventDetails) {
        return eventsRepository.save(eventDetails);
    }
}
