package com.hannakot62.be.service;

import com.hannakot62.be.model.ExactService;
import com.hannakot62.be.model.Image;

import java.util.List;

public interface ImageService {
    public Image saveImage (Image image);
    public List<Image> getAllImages();
    public Image getImageById(String id);
    public void deleteImageById(String id);
}
