#encoding UTF-8

#Author: Carlos Almeida - carloscgta@gmail.com
#Feature: List of scenarios - Mobile Automação
 

@geralConsultaiCarrosApp
Feature: Consulta Carros
 				Eu como usuário gostaria de acessar o app iCarros e realizar uma consulta de carros


  @criarConsultaParaRetornar3CarrosApp
  Scenario Outline: Acessar o app iCarros realizar uma consulta pelo modelo Astra Hatch ano 2008
    Given que estou com o app iCarros aberto
    And seleciono a Marca "<marca>"
    And seleciono o Modelo "<modelo>"
    And seleciono o ano Minimo  "<anoMinimo>" e Ano Maximo "<anoMaximo>"
    And seleciono o Preco minimo "<precoMin>" e Preco Maximo "<precoMax>"
    And Defino a Localidade "<localidade>"
    When clicar em Buscar
    Then deve retornar lista de carros com os criterios definidos na bsuca exibindo apenas "12 ofertas" ofertas

    Examples: 
      | marca  			| modelo 		| anoMinimo  	|anoMaximo  | precoMin 				| precoMax  				|localidade 			 	| 
    	| Chevrolet		|Astra Hatch	|De 2005  		|Até 2008  	| De R$ 14 mil    | Até R$ 20 mil  		|São Paulo - SP  	| 
