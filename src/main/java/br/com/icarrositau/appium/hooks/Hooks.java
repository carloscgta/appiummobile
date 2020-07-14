package br.com.icarrositau.appium.hooks;

import org.junit.AfterClass;

import br.com.icarrositau.appium.core.DriverFactory;
import io.cucumber.core.gherkin.Scenario;
import io.cucumber.java.Before;

public class Hooks {

	public Hooks() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Before
	public void antesScenario(Scenario cenario) throws Exception {
		
		System.out.println("Irá rodar antes de cada cenário");
		DriverFactory.getDriver();
		
	}

	
	@AfterClass
	public void depoisScenario(Scenario cenario) throws Exception {
		 System.out.println("This will run after the Scenario");
		 DriverFactory.encerrarDriver();
		 
	}

}
