package com.hannakot62.be.service;

import com.hannakot62.be.model.CommonService;

import java.util.List;

public interface CommonServiceService {
    public CommonService saveCommonService (CommonService commonService);
    public List<CommonService> getAllCommonServices();
    public CommonService getCommonServiceById(String id);
    public void deleteCommonServiceById(String id);
}
