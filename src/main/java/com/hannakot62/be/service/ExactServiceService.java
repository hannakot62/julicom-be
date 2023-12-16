package com.hannakot62.be.service;

import com.hannakot62.be.model.ExactService;

import java.util.List;

public interface ExactServiceService {
    public ExactService saveExactService (ExactService exactService);
    public List<ExactService> getAllExactServices();
    public ExactService getExactServiceById(String id);
    public void deleteExactServiceById(String id);
}
