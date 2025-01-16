package com.kafkalearn.kafkalearn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import java.lang.Integer;

@Component
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class LocationModel {

    private Integer latitude;
    private Integer longitude;

    public LocationModel(Integer latitude, Integer longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public LocationModel() {}


    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }
}
