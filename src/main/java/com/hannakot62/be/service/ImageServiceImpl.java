package com.hannakot62.be.service;

import com.hannakot62.be.model.Image;
import com.hannakot62.be.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService{
    @Autowired
    private ImageRepository imageRepository;

    @Override
    public Image saveImage(Image image) {
        return imageRepository.save(image);
    }

    @Override
    public List<Image> getAllImages() {
        return imageRepository.findAll();
    }

    @Override
    public Image getImageById(String id) {
        return imageRepository.findById(id).get();
    }

    @Override
    public void deleteImageById(String id) {
        imageRepository.deleteById(id);
    }
}
