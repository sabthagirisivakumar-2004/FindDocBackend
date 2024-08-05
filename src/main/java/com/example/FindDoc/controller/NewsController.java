package com.example.FindDoc.controller;

import com.example.FindDoc.Service.service;
import com.example.FindDoc.entity.NewsDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewsController {

    @Autowired
    private service newsService;

    @GetMapping("/getNews")
    public ResponseEntity<List<NewsDetails>> getAllNews() {
        List<NewsDetails> newsList = newsService.getAllNews();
        return ResponseEntity.ok(newsList);
    }

    @GetMapping("/getNewsBy/{id}")
    public ResponseEntity<NewsDetails> getNewsById(@PathVariable int id) {
        NewsDetails news = newsService.getNewsById(id);
        return news != null ? ResponseEntity.ok(news) : ResponseEntity.notFound().build();
    }

    @PostMapping("/postNews")
    public ResponseEntity<NewsDetails> createNews(@RequestBody NewsDetails newsDetails) {
        NewsDetails createdNews = newsService.createNews(newsDetails);
        return ResponseEntity.ok(createdNews);
    }
}