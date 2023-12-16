package com.hannakot62.be.controller;

import com.hannakot62.be.model.Vacancy;
import com.hannakot62.be.service.VacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/vacancies")
public class VacancyController {

    @Autowired
    private VacancyService vacancyService;

    @PostMapping("/add")
    public String add(@RequestBody Vacancy vacancy) {
        vacancyService.saveVacancy(vacancy);
        return "New vacancy added";
    }

    @GetMapping("/getAll")
    public List<Vacancy> getAllVacancy(){
        return vacancyService.getAllVacancies();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vacancy> getVacancyById (@PathVariable String id){
        Vacancy vacancy = vacancyService.getVacancyById(id);
        return new ResponseEntity<>(vacancy, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteVacancyById(@PathVariable String id){
        vacancyService.deleteVacancyById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Vacancy> updateVacancyById(@RequestBody Vacancy vacancy, @PathVariable String id){
        Vacancy current = vacancyService.getVacancyById(id);
        vacancyService.saveVacancy(vacancy);
        return  new ResponseEntity<>(HttpStatus.OK);
    }

}
