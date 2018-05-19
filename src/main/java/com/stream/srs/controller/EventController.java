package com.stream.srs.controller;

import com.stream.srs.config.SrsProperty;
import com.stream.srs.model.EventRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @Autowired
    SrsProperty property;

    @RequestMapping("/event")
    public int publish(@RequestBody EventRequest request){
        if(property.getAllow().contains(request.getIp()) || property.getAllow().contains(request.getStream()))
            return 0;
        return -1;
    }



}
