package com.example.FindDoc.serviceimpl;

import com.example.FindDoc.DTO.AuthenticationDTO;
import com.example.FindDoc.Service.service;
import com.example.FindDoc.entity.*;
import com.example.FindDoc.repository.EventsRepository;
import com.example.FindDoc.repository.NewsDetailsRepository;
import com.example.FindDoc.repository.Repo;
import com.example.FindDoc.repository.UserRepository;
import com.mongodb.client.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.conversions.Bson;
import java.util.concurrent.TimeUnit;
import org.bson.Document;
import com.mongodb.client.AggregateIterable;


@Service
@Component
public class ServiceImpl implements service {
    @Autowired
    UserRepository UserRepo;
    @Autowired
    NewsDetailsRepository newsRepository;
    @Autowired
    EventsRepository eventsRepository;
    @Autowired
    Repo hospitalDetailrepo;
    @Autowired
    UserRepository u;

    @Autowired
    MongoClient client;
    @Autowired
    MongoConverter convert;
    @Override
    public List<User> getAllDetails() {
        return UserRepo.findAll() ;
    }
    @Override
    public User findByEmail(String mail){
        return u.findByEmail(mail);
    }
    @Override
    public List<DoctorCard> findByText(String txt){
        final List<DoctorCard> Dcards= new ArrayList<>();
        MongoDatabase database = client.getDatabase("FindDoc");
        MongoCollection<Document> collection = database.getCollection("DoctorCard");
        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search",
                new Document("index", "default")
                        .append("text",
                                new Document("query", txt)
                                        .append("path", Arrays.asList("name", "location", "speciality"))))));
        result.forEach(doc -> Dcards.add(convert.read(DoctorCard.class,doc)));
        return Dcards;
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
    @Override
    public List<HospitalDetails> GetHospitalDetails() {
        return hospitalDetailrepo.findAll();
    }

    @Override
    public void insertDetailsHospital(HospitalDetails h) {
        hospitalDetailrepo.save(h);
        return;
    }

    @Override
    public Optional<HospitalDetails> selectById(String n) {
        return hospitalDetailrepo.findById(n);
    }
}
