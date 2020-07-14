package br.com.icarrositau.appium.steps;
import br.com.icarrositau.appium.core.DriverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ConsultarCarrosSteps {

	public ConsultarCarrosSteps() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	@Before
	public void antesScenario(io.cucumber.java.Scenario cenario) throws Exception {
		
		// Chamar métod de gerar relatório aqui
		
	}

	
	@Given("que estou com o app iCarros aberto")
	public void que_estou_com_o_app_iCarros_aberto() {
	    
	}

	@Given("seleciono a Marca {string}")
	public void seleciono_a_Marca(String string) {

	}

	@Given("seleciono o Modelo {string}")
	public void seleciono_o_Modelo(String string) {
	
	}

	@Given("seleciono o ano Minimo  {string} e Ano Maximo {string}")
	public void seleciono_o_ano_Minimo_e_Ano_Maximo(String string, String string2) {
	
	}

	@Given("seleciono o Preco minimo {string} e Preco Maximo {string}")
	public void seleciono_o_Preco_minimo_e_Preco_Maximo(String string, String string2) {
	    
		
	}

	@Given("Defino a Localidade {string}")
	public void defino_a_Localidade(String string) {
	
		
	}

	@When("clicar em Buscar")
	public void clicar_em_Buscar() {
	   
	}

	@Then("deve retornar lista de carros com os criterios definidos na bsuca exibindo apenas {string} ofertas")
	public void deve_retornar_lista_de_carros_com_os_criterios_definidos_na_bsuca_exibindo_apenas_ofertas(String string) {
	   
	}

}
