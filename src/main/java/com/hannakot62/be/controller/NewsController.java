package com.hannakot62.be.controller;

import com.hannakot62.be.model.Image;
import com.hannakot62.be.model.News;
import com.hannakot62.be.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @PostMapping("/add")
    public String add(@RequestBody News news) {
        newsService.saveNews(news);
        return "New news added";
    }

    @GetMapping("/getAll")
    public List<News> getAllNews(){
        return newsService.getAllNews();
    }

    @GetMapping("/{id}")
    public ResponseEntity<News> getNewsById (@PathVariable String id){
        News news = newsService.getNewsById(id);
        return new ResponseEntity<>(news, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteNewsById(@PathVariable String id){
        newsService.deleteNewsById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<News> updateNewsById(@RequestBody News news, @PathVariable String id){
        News current = newsService.getNewsById(id);
        newsService.saveNews(news);
        return  new ResponseEntity<>(HttpStatus.OK);
    }

}
