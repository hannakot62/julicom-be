package com.hannakot62.be.service;

import com.hannakot62.be.model.SpacePart;

import java.util.List;

public interface SpacePartService {

    public SpacePart saveSpacePart (SpacePart spacePart);
    public List<SpacePart> getAllSpaceParts();
    public SpacePart getSpacePartById(String id);
    public void deleteSpacePartById(String id);
}
