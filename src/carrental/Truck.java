/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrental;

/**
 *
 * @author admin
 */
public class Truck implements Vehicle{
    public String model;
    public double perKmRate;
    
    public Truck(String model, double perKmRate) {
        this.model = model;
        this.perKmRate = perKmRate;
    }
    
    @Override
    public void start() {
        System.out.println(model + " truck is starting...");
    }
    
    @Override 
    public void stop() {
        System.out.println(model + " truck is stopping...");
    }
    
    @Override 
    public double calculateRental(int distance) {
        return perKmRate * distance;
    }
}
