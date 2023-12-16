package com.hannakot62.be.service;

import com.hannakot62.be.model.Review;
import com.hannakot62.be.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService{
    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    @Override
    public Review getReviewById(String id) {
        return reviewRepository.findById(id).get();
    }

    @Override
    public void deleteReviewById(String id) {
        reviewRepository.deleteById(id);
    }
}
