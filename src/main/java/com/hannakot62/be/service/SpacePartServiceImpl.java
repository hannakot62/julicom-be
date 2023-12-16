package com.hannakot62.be.service;

import com.hannakot62.be.model.SpacePart;
import com.hannakot62.be.repository.SpacePartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpacePartServiceImpl implements SpacePartService{
    @Autowired
    private SpacePartRepository spacePartRepository;

    @Override
    public SpacePart saveSpacePart(SpacePart spacePart) {
        return spacePartRepository.save(spacePart);
    }

    @Override
    public List<SpacePart> getAllSpaceParts() {
        return spacePartRepository.findAll();
    }

    @Override
    public SpacePart getSpacePartById(String id) {
        return spacePartRepository.findById(id).get();
    }

    @Override
    public void deleteSpacePartById(String id) {
        spacePartRepository.deleteById(id);
    }
}
