package week2.day2.LearnPolymorphism;

import week2.day2.Commute;

public class Vehicle extends Commute{
public void applyBreak() {
	System.out.println("break normal applied");
}

public void accellerate() {
	System.out.println(carName);
	System.out.println("speed increased");
}
}
