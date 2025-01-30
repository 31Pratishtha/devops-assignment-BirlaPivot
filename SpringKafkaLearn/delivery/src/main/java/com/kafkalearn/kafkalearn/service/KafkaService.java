package com.kafkalearn.kafkalearn.service;

import com.kafkalearn.kafkalearn.config.AppConstants;
import com.kafkalearn.shared_models.LocationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, LocationModel> kafkaTemplate;

    public boolean updateLocation(LocationModel location){
//            this.kafkaTemplate.send("location-update", location);
        this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME, location);
        return true;
    }
}
