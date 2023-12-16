package com.hannakot62.be.repository;

import com.hannakot62.be.model.ExactService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExactServiceRepository extends JpaRepository<ExactService,String> {
}
