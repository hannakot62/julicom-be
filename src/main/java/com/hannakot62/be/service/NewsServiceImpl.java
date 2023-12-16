package com.hannakot62.be.service;

import com.hannakot62.be.model.News;
import com.hannakot62.be.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService{

    @Autowired
    private NewsRepository newsRepository;

    @Override
    public News saveNews(News news) {
        return newsRepository.save(news);
    }

    @Override
    public List<News> getAllNews() {
        return newsRepository.findAll();
    }

    @Override
    public News getNewsById(String id) {
        return newsRepository.findById(id).get();
    }

    @Override
    public void deleteNewsById(String id) {
        newsRepository.deleteById(id);
    }
}
