package com.hannakot62.be.service;

import com.hannakot62.be.model.CommonService;
import com.hannakot62.be.repository.CommonServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonServiceServiceImpl implements CommonServiceService{
    @Autowired
    private CommonServiceRepository commonServiceRepository;


    @Override
    public CommonService saveCommonService(CommonService commonService) {
        return commonServiceRepository.save(commonService);
    }

    @Override
    public List<CommonService> getAllCommonServices() {
        return commonServiceRepository.findAll();
    }

    @Override
    public CommonService getCommonServiceById(String id) {
        return commonServiceRepository.findById(id).get();
    }

    @Override
    public void deleteCommonServiceById(String id) {
        commonServiceRepository.deleteById(id);
    }

}
