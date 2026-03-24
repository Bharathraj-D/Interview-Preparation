package com.example.vehicle.service;

import com.example.vehicle.entity.Vehicle;
import com.example.vehicle.repository.VehicleInformation;

public class AddVehicle {
    public static void addvehi(String name,String id,String model){
        Vehicle vehi=new Vehicle(name,id,model);
        VehicleInformation.addVehicle(vehi);
        VehicleInformation
    }
}
