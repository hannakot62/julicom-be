package com.hannakot62.be.repository;

import com.hannakot62.be.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<News,String> {
}
