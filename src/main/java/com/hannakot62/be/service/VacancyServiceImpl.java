package com.hannakot62.be.service;

import com.hannakot62.be.model.Vacancy;
import com.hannakot62.be.repository.VacancyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacancyServiceImpl implements VacancyService{
    @Autowired
    private VacancyRepository vacancyRepository;

    @Override
    public Vacancy saveVacancy(Vacancy vacancy) {
        return vacancyRepository.save(vacancy);
    }

    @Override
    public List<Vacancy> getAllVacancies() {
        return vacancyRepository.findAll();
    }

    @Override
    public Vacancy getVacancyById(String id) {
        return vacancyRepository.findById(id).get();
    }

    @Override
    public void deleteVacancyById(String id) {
        vacancyRepository.deleteById(id);
    }
}
