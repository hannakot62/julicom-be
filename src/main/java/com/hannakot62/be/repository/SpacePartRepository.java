package com.hannakot62.be.repository;

import com.hannakot62.be.model.SpacePart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpacePartRepository extends JpaRepository<SpacePart,String> {
}
