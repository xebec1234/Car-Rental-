/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carrental;

/**
 *
 * @author admin
 */
public class CarRental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota Vios", 2000);
        Vehicle truck = new Truck("Isuzu", 50);
        
        car.start();
        System.out.println("Car Rentals: " + car.calculateRental(3));
        
        truck.start();
        System.out.println("Truck Rentals: " + truck.calculateRental(100));
    }
    
}
