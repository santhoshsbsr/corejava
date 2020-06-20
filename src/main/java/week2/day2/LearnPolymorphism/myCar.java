package week2.day2.LearnPolymorphism;

public class myCar {
public static void main(String[] args) {
	BmwExtCar car = new BmwExtCar();
	car.applyBreak(); // prints the overrinden value from the subclass 
	
	CarExtVehicle car1 = new CarExtVehicle();
	car1.applyBreak();//prints the super class value
	car1.accellerate();// to access the inherited Commute class protected variable
}
}
