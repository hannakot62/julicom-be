package com.hannakot62.be.service;

import com.hannakot62.be.model.News;

import java.util.List;

public interface NewsService {
    public News saveNews (News news);
    public List<News> getAllNews();
    public News getNewsById(String id);
    public void deleteNewsById(String id);
}
