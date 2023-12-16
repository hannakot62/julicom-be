package com.hannakot62.be.service;

import com.hannakot62.be.model.Vacancy;

import java.util.List;

public interface VacancyService {
    public Vacancy saveVacancy (Vacancy vacancy);
    public List<Vacancy> getAllVacancies();
    public Vacancy getVacancyById(String id);
    public void deleteVacancyById(String id);
}
