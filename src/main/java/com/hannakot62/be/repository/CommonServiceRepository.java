package com.hannakot62.be.repository;

import com.hannakot62.be.model.CommonService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommonServiceRepository extends JpaRepository<CommonService,String> {
}
