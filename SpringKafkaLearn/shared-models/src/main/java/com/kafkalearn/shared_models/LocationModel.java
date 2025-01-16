package com.kafkalearn.shared_models;

import org.springframework.stereotype.Component;

//@Component
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
