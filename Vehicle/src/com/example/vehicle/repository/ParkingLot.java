package com.example.vehicle.repository;

import com.example.vehicle.entity.Vehicle;

import java.util.HashSet;
import java.util.Set;

public class ParkingLot {
    private static Set<Vehicle> slot=new HashSet<>();
    public static void addSlot(String id){
        Vehicle veh=VehicleInformation.findVehicle(id);
        if(veh!=null){
            slot.add(veh);
            System.out.println("Vehicle Parked Successfully");
        }
        else{
            System.out.println("Vehicle is Not found on database");
        }
    }
    public static void addSlot(Vehicle vehi){
        slot.add(vehi);
        System.out.println("Vehicle Parked Successfully");
    }
    public static void removeSlot(String id){
        Vehicle veh=VehicleInformation.findVehicle(id);
        if(slot.contains(veh)) {
            slot.remove(veh);
            System.out.print("Slot deleted");
        }
        else{
            System.out.print("Vehicle is not in Parking Slot");
        }
    }
}
