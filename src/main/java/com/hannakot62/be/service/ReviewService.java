package com.hannakot62.be.service;

import com.hannakot62.be.model.Promotion;
import com.hannakot62.be.model.Review;

import java.util.List;

public interface ReviewService {
    public Review saveReview (Review review);
    public List<Review> getAllReviews();
    public Review getReviewById(String id);
    public void deleteReviewById(String id);
}
