package com.hannakot62.be.controller;

import com.hannakot62.be.model.ExactService;
import com.hannakot62.be.service.ExactServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/exact_services")
public class ExactServiceController {

    @Autowired
    private ExactServiceService exactServiceService;


    @PostMapping("/add")
    public String add(@RequestBody ExactService exactService) {
        exactServiceService.saveExactService(exactService);
        return "New exact service added";
    }

    @GetMapping("/getAll")
    public List<ExactService> getAllExactServices(){
        return exactServiceService.getAllExactServices();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExactService> getExactServiceById (@PathVariable String id){
        ExactService exactService = exactServiceService.getExactServiceById(id);
        return new ResponseEntity<>(exactService, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteExactServiceById(@PathVariable String id){
        exactServiceService.deleteExactServiceById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ExactService> updateExactServiceById(@RequestBody ExactService exactService, @PathVariable String id){
        ExactService current = exactServiceService.getExactServiceById(id);
        exactServiceService.saveExactService(exactService);
        return  new ResponseEntity<>(HttpStatus.OK);
    }

}
