#encoding UTF-8
#Author: Carlos Almeida - carloscgta@gmail.com
#Feature: List of scenarios


@geralConsultaiCarros
Feature: Consulta Carros
 				Eu como usuÃ¡rio gostaria de acessar o site iCarros e realizar uma consulta de carros

  @lerListaDeResultadoValidarValorAVista
  Scenario Outline: Acessar site iCarros realizar uma consulta pelo modelo Astra Hatch ano 2008
    Given que estou na pagina de consulta do site iCarros
    And seleciono a Marca "<marca>"
    And seleciono o Modelo "<modelo>"
    And seleciono o ano Minimo  "<anoMinimo>" e Ano Maximo "<anoMaximo>"
    And seleciono o Preco minimo "<precoMin>" e Preco Maximo "<precoMax>"
    And Defino a Localidade "<localidade>"
    When clicar em Buscar
    Then deve retornar lista de carros com os criterios definidos na bsuca exibindo apenas ofertas
    Examples: 
      | marca  			| modelo 		| anoMinimo  	|anoMaximo  | precoMin 				| precoMax  				|localidade 			 	| 
    	| Chevrolet		|Astra Hatch	|De 2005  		|Até 2008  	| De R$ 14 mil    | Até R$ 20 mil  		|São Paulo - SP  	| 