/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrental;

/**
 *
 * @author admin
 */
public class Car implements Vehicle {
    private String model;
    private double dailyRate;
    
    public Car (String model, double dailyRate) {
        this.model = model;
        this.dailyRate = dailyRate;
    }
    
    public String getModel() {
        return model;
    }
    
    @Override
    public void start() {
        System.out.println(model + " is starting...");
    }
    
    @Override 
    public void stop() {
        System.out.println(model + " is stopping...");
    }
    
    @Override 
    public double calculateRental(int days) {
        return dailyRate * days;
    }
    
}
