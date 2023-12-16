package com.hannakot62.be.controller;

import com.hannakot62.be.model.SpacePart;
import com.hannakot62.be.service.SpacePartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/space_parts")
public class SpacePartController {
    @Autowired
    private SpacePartService spacePartService;

    @PostMapping("/add")
    public String add(@RequestBody SpacePart spacePart) {
        spacePartService.saveSpacePart(spacePart);
        return "New space part added";
    }

    @GetMapping("/getAll")
    public List<SpacePart> getAlSpaceParts(){
        return spacePartService.getAllSpaceParts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SpacePart> getSpacePartById (@PathVariable String id){
        SpacePart spacePart = spacePartService.getSpacePartById(id);
        return new ResponseEntity<>(spacePart, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteSpacePartById(@PathVariable String id){
        spacePartService.deleteSpacePartById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SpacePart> updateSpacePartById(@RequestBody SpacePart spacePart, @PathVariable String id){
        SpacePart current = spacePartService.getSpacePartById(id);
        spacePartService.saveSpacePart(spacePart);
        return  new ResponseEntity<>(HttpStatus.OK);
    }

}
