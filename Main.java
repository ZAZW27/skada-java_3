abstract class Vehicle{
    private int seats;
    private String name;
    private double fuels;
    private int speed;

    public Vehicle(int seats, String name, double fuels, int speed){
        this.seats = seats;
        this.name = name;
        this.fuels = fuels;
        this.speed = speed;
    }

    // Getter
    public int getSeats(){return this.seats;}
    public String getName(){return this.name;}
    public double getFuels(){return this.fuels;}
    public int getSpeed(){return this.speed;}

    // Setter
    public void setSeats(int seats){this.seats = seats;}
    public void setName(String name){this.name = name;}
    public void setFuels(double fuels){this.fuels = fuels;}
    public void setSpeed(int speed){this.speed = speed;}

    public abstract void move();
    public abstract double calculateFuelConsumption(double fuel);
}

class LandVehicle extends Vehicle{
    private int wheels;
    public LandVehicle(
            int seats, String name, 
            double fuels, 
            int speed, int wheels
        ){
        super(seats, name, fuels, speed);
        this.wheels = wheels;
    }

    @Override
    public void move(){
        System.out.println(
            getName() + " is moving on "
            + wheels 
            + " wheels. with the speed of "
            + getSpeed() + " km/h"
        );
    };

    @Override
    public double calculateFuelConsumption(double distance){
        return distance / getFuels();
    };
}

public class Main{
    public static void main(String[] args) {
        Vehicle car = new LandVehicle(
            4, 
            "Car", 
            50.0, 
            120, 
            4);
        car.move();
        car.calculateFuelConsumption(200); 
    }
}
