package com.example.FindDoc.Service;

import com.example.FindDoc.DTO.AuthenticationDTO;
import com.example.FindDoc.entity.EventsDetails;
import com.example.FindDoc.entity.NewsDetails;
import com.example.FindDoc.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface service {
    List<User> getAllDetails();

    User postAllDetails(AuthenticationDTO user);
    User findByEmail(String mail);
    List<NewsDetails> getAllNews();

    NewsDetails getNewsById(int id);

    NewsDetails createNews(NewsDetails newsDetails);
    List<EventsDetails> getAllEvents();

    EventsDetails getEventById(int id);

    EventsDetails createEvent(EventsDetails eventDetails);
}
