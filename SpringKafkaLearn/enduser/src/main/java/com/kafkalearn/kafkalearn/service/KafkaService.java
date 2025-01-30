package com.kafkalearn.kafkalearn.service;

import com.kafkalearn.kafkalearn.config.AppConstants;
import com.kafkalearn.shared_models.LocationModel;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    //function that will get executed whenever a msg is produced from the producer
    @KafkaListener(topics = AppConstants.LOCATION_UPDATE_TOPIC, groupId = AppConstants.GROUP_ID)
    public void updateLocation(LocationModel location){
        System.out.println("in kafka server listener");
        System.out.println(location.getLatitude());
        System.out.println(location.getLongitude());
    }
}
