package stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void preScenario(Scenario Sc) {
		System.out.println("scenario id" +Sc.getId());
		System.out.println("scenario name" +Sc.getName());
		System.out.println("scenario status" +Sc.getStatus());
	
	}
	
	@After
	public void postScenario(Scenario spost) {
		
		System.out.println("scenario status" +spost.getStatus());
		
	}
	
	
}
