package com.hannakot62.be.service;

import com.hannakot62.be.model.Promotion;
import com.hannakot62.be.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionServiceImpl implements PromotionService{
    @Autowired
    private PromotionRepository promotionRepository;

    @Override
    public Promotion savePromotion(Promotion promotion) {
        return promotionRepository.save(promotion);
    }

    @Override
    public List<Promotion> getAllPromotions() {
        return promotionRepository.findAll();
    }

    @Override
    public Promotion getPromotionById(String id) {
        return promotionRepository.findById(id).get();
    }

    @Override
    public void deletePromotionById(String id) {
        promotionRepository.deleteById(id);
    }
}
