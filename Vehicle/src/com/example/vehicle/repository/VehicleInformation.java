package com.example.vehicle.repository;

import com.example.vehicle.entity.Vehicle;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class VehicleInformation {
     private static Set<Vehicle> vehi=new HashSet<>();
     static {
         Vehicle v1 = new Vehicle("Ajay", "V1101", "Lambogini");
         Vehicle v2 = new Vehicle("Bharath", "V2102", "BMW");
         Vehicle v3 = new Vehicle("Cyan", "V3103", "Lambogini");
         Vehicle v4 = new Vehicle("Coral", "V4104", "BMW");
         Vehicle v5 = new Vehicle("Maroon", "V5105", "Lambogini");
         vehi.add(v1);
         vehi.add(v2);
         vehi.add(v3);
         vehi.add(v4);
         vehi.add(v5);

     }
     public static void addVehicle(Vehicle v){
         vehi.add(v);
     }
     public void PrintUsers(){
         System.out.print(vehi);
     }
     public static Vehicle findVehicle(String id){
         for(Vehicle v: vehi){
            if(Objects.equals(v.getId(), id)){
                return v;
            }
         }
         return null;
     }

}
