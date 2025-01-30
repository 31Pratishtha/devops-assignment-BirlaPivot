package com.kafkalearn.kafkalearn.controller;

import com.kafkalearn.kafkalearn.service.KafkaService;
import com.kafkalearn.shared_models.LocationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private KafkaService kafkaService;

//    @PostMapping("/update")
//    public ResponseEntity<?> updateLocation(){
//        this.kafkaService.updateLocation("Lat: " + Math.round(Math.random() * 100) + "," + "Long:" + Math.round(Math.random() * 100));
////        this.kafkaService.updateLocation(new LocationModel(5, 8));
//        return new ResponseEntity<>(Map.of("message", "location updated."), HttpStatus.OK);
//    }

    @PostMapping("/update")
    public ResponseEntity<?> updateLocation(){
//        this.kafkaService.updateLocation(new LocationModel(5, 8));
        this.kafkaService.updateLocation(new LocationModel(5, 8));
//        System.out.println("sending locs");
        return new ResponseEntity<>(Map.of("message", "location updated."), HttpStatus.OK);
    }
}
