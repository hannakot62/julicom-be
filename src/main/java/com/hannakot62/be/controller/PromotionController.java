package com.hannakot62.be.controller;

import com.hannakot62.be.model.Promotion;
import com.hannakot62.be.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/promotions")
public class PromotionController {

    @Autowired
    private PromotionService promotionService;

    @PostMapping("/add")
    public String add(@RequestBody Promotion promotion) {
        promotionService.savePromotion(promotion);
        return "New promotion added";
    }

    @GetMapping("/getAll")
    public List<Promotion> getAllPromotions(){
        return promotionService.getAllPromotions();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Promotion> getPromotionById (@PathVariable String id){
        Promotion promotion = promotionService.getPromotionById(id);
        return new ResponseEntity<>(promotion, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deletePromotionById(@PathVariable String id){
        promotionService.deletePromotionById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Promotion> updatePromotionById(@RequestBody Promotion promotion, @PathVariable String id){
        Promotion current = promotionService.getPromotionById(id);
        promotionService.savePromotion(promotion);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
}
