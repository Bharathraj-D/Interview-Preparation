package com.example.vehicle.service;

import com.example.vehicle.entity.Vehicle;
import com.example.vehicle.repository.ParkingLot;

public class Parking {
    public void parkVehicle(String id){
       ParkingLot.addSlot(id);
    }
    public void parkVehicle(Vehicle vehi){
        ParkingLot.addSlot(vehi);
    }
    public void removeVehicle(String id){
        ParkingLot.removeSlot(id);
    }

}
