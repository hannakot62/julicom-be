package com.hannakot62.be.controller;

import com.hannakot62.be.model.Review;
import com.hannakot62.be.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/add")
    public String add(@RequestBody Review review) {
        reviewService.saveReview(review);
        return "New review added";
    }

    @GetMapping("/getAll")
    public List<Review> getAllReviews(){
        return reviewService.getAllReviews();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Review> getReviewById (@PathVariable String id){
        Review review = reviewService.getReviewById(id);
        return new ResponseEntity<>(review, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteReviewById(@PathVariable String id){
        reviewService.deleteReviewById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Review> updateReviewById(@RequestBody Review review, @PathVariable String id){
        Review current = reviewService.getReviewById(id);
        reviewService.saveReview(review);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
}
