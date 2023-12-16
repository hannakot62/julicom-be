package com.hannakot62.be.controller;

import com.hannakot62.be.model.Image;
import com.hannakot62.be.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/images")
public class ImageController {

    @Autowired
    private ImageService imageService;

    @PostMapping("/add")
    public String add(@RequestBody Image image) {
        imageService.saveImage(image);
        return "New image added";
    }

    @GetMapping("/getAll")
    public List<Image> getAllImages(){
        return imageService.getAllImages();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Image> getImageById (@PathVariable String id){
        Image image = imageService.getImageById(id);
        return new ResponseEntity<>(image, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteImageById(@PathVariable String id){
        imageService.deleteImageById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Image> updateImageById(@RequestBody Image image, @PathVariable String id){
        Image current = imageService.getImageById(id);
        imageService.saveImage(image);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
}
