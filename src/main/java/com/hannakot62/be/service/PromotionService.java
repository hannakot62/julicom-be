package com.hannakot62.be.service;

import com.hannakot62.be.model.Promotion;

import java.util.List;

public interface PromotionService {
    public Promotion savePromotion (Promotion promotion);
    public List<Promotion> getAllPromotions();
    public Promotion getPromotionById(String id);
    public void deletePromotionById(String id);
}
