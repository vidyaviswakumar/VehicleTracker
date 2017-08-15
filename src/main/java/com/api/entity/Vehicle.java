package com.api.entity;

import javax.persistence.Entity;

@Entity
public class Vehicle {

    private String vehicleNo;
    private String make;
    private String model;
    private int year;
    private int redlineRpm;
    private int maxFuelVolume;
    private String lastServiceDate;
}
