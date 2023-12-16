package com.hannakot62.be.controller;

import com.hannakot62.be.model.CommonService;
import com.hannakot62.be.service.CommonServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/common_services")
public class CommonServiceController {

    @Autowired
    private CommonServiceService commonServiceService;

    @PostMapping("/add")
    public String add(@RequestBody CommonService commonService) {
        commonServiceService.saveCommonService(commonService);
        return "New common service added";
    }

    @GetMapping("/getAll")
    public List<CommonService> getAllCommonServices(){
        return commonServiceService.getAllCommonServices();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CommonService> getCommonServiceById (@PathVariable String id){
        CommonService commonService = commonServiceService.getCommonServiceById(id);
        return new ResponseEntity<>(commonService, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteCommonServiceById(@PathVariable String id){
        commonServiceService.deleteCommonServiceById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CommonService> updateCommonServiceById(@RequestBody CommonService commonService, @PathVariable String id){
        CommonService current = commonServiceService.getCommonServiceById(id);
        commonServiceService.saveCommonService(commonService);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
}
