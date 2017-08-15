package com.api.controller;

import com.api.entity.Vehicle;
import com.api.repository.VehicleRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/vehicles")
public class VehicleController {

    private VehicleRepository vehicleRepository;

    @RequestMapping(method= RequestMethod.PUT, consumes= MediaType.APPLICATION_JSON_UTF8_VALUE, produces= MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Vehicle addVehicle(@RequestBody Vehicle vehicle){
        vehicleRepository.addVehicle(vehicle);
        return vehicle;
    }
}
