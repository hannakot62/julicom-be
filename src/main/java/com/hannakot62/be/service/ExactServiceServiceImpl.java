package com.hannakot62.be.service;

import com.hannakot62.be.model.ExactService;
import com.hannakot62.be.repository.ExactServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExactServiceServiceImpl implements ExactServiceService{

    @Autowired
    private ExactServiceRepository exactServiceRepository;

    @Override
    public ExactService saveExactService(ExactService exactService) {
        return exactServiceRepository.save(exactService);
    }

    @Override
    public List<ExactService> getAllExactServices() {
        return exactServiceRepository.findAll();
    }

    @Override
    public ExactService getExactServiceById(String id) {
        return exactServiceRepository.findById(id).get();
    }

    @Override
    public void deleteExactServiceById(String id) {
        exactServiceRepository.deleteById(id);
    }
}
