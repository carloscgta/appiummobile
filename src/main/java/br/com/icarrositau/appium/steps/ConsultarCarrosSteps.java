package br.com.icarrositau.appium.steps;
import br.com.icarrositau.appium.core.DriverFactory;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class ConsultarCarrosSteps {

	public ConsultarCarrosSteps() {
		// TODO Auto-generated constructor stub
	}
	
	@Before
	public void antesScenario(Scenario cenario) throws Exception {
		
		// Chamar métod de gerar relatório aqui
		System.out.println("asldfkjaklsdfj");
		
	}
	
	@Given("^que estou na pagina de consulta do site iCarros$")
	public void que_estou_na_pagina_de_consulta_do_site_iCarros() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^seleciono a Marca \"([^\"]*)\"$")
	public void seleciono_a_Marca(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^seleciono o Modelo \"([^\"]*)\"$")
	public void seleciono_o_Modelo(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^seleciono o ano Minimo  \"([^\"]*)\" e Ano Maximo \"([^\"]*)\"$")
	public void seleciono_o_ano_Minimo_e_Ano_Maximo(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^seleciono o Preco minimo \"([^\"]*)\" e Preco Maximo \"([^\"]*)\"$")
	public void seleciono_o_Preco_minimo_e_Preco_Maximo(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^Defino a Localidade \"([^\"]*)\"$")
	public void defino_a_Localidade(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^clicar em Buscar$")
	public void clicar_em_Buscar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^deve retornar lista de carros com os criterios definidos na bsuca exibindo apenas ofertas$")
	public void deve_retornar_lista_de_carros_com_os_criterios_definidos_na_bsuca_exibindo_apenas_ofertas() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	@After
	public void depoisScenario(Scenario cenario) throws Exception {
		 System.out.println("This will run after the Scenario");
		 DriverFactory.encerrarDriver();
		 
	}
}
