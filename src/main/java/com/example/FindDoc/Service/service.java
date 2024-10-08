package com.example.FindDoc.Service;

import com.example.FindDoc.DTO.AuthenticationDTO;
import com.example.FindDoc.entity.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface service {
    List<User> getAllDetails();
    List<DoctorCard> findByText(String txt);
    List<HospitalCard> findByHcard(String txt);
    User postAllDetails(AuthenticationDTO user);
    User findByEmail(String mail);
    List<NewsDetails> getAllNews();

    NewsDetails getNewsById(int id);

    NewsDetails createNews(NewsDetails newsDetails);
    List<EventsDetails> getAllEvents();

    EventsDetails getEventById(int id);

    EventsDetails createEvent(EventsDetails eventDetails);
    List<HospitalDetails> GetHospitalDetails();

    void insertDetailsHospital(HospitalDetails h);

    Optional<HospitalDetails> selectById(int n);

}
