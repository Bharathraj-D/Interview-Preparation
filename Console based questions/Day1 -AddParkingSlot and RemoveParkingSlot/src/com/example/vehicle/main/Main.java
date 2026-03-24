package com.example.vehicle.main;

import java.util.Scanner;

import static com.example.vehicle.service.AddVehicle.addvehi;

public class Main {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("***WELCOME***");
        System.out.println("1.New customer \n 2.Already Used");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.print("Your Name: ");
                String name=sc.next();
                System.out.print("Vehicle id:  ");
                String id=sc.next();
                System.out.print("Car Model: ");
                String model=sc.next();
                addvehi(name,id,model);
                break;
            case 2:
                System.out.print("Vehicle id:  ");
                String eid=sc.next();

        }
    }
}