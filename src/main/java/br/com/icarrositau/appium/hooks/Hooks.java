package br.com.icarrositau.appium.hooks;


import br.com.icarrositau.appium.core.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks {

	public Hooks() {
		// TODO Auto-generated constructor stub
	}
	
	@Before
	public void antesScenario(Scenario cenario) throws Exception {
		
		System.out.println("Irá rodar antes de cada cenário");
		DriverFactory.getDriver();
		
	}

	
	@After
	public void depoisScenario(Scenario cenario) throws Exception {
		 System.out.println("This will run after the Scenario");
		 DriverFactory.encerrarDriver();
		 
	}

}
