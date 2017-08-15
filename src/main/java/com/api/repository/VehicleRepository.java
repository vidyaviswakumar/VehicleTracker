package com.api.repository;

import com.api.entity.Vehicle;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class VehicleRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Vehicle addVehicle(Vehicle vehicle){
        entityManager.persist(vehicle);
        return vehicle;
    }

}
