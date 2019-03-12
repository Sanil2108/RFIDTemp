package com.sanilk.rfidtemp3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController("/")
public class RESTController {

    @Autowired
    Service service;

    @ResponseBody
    @GetMapping("index/")
    public String home(){
        return "Hello";
    }

    @ResponseBody
    @PostMapping("insertData/")
    public InsertDataResponse insertData(@RequestBody InsertDataRequest insertDataRequest){
        return service.insertData(insertDataRequest);
    }

}
