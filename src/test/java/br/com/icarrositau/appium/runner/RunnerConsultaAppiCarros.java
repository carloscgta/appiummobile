package br.com.icarrositau.appium.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "br.com.iCarros.steps", "br.com.iCarros.hooks"}, 
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:src/main/report/cucumber-reports/report.html"},

		 features = {"./src/test/resources/br/com/icarrositau/appium/features" }, 
tags = { "@lerListaDeResultadoValidarValorAVista" })
public class RunnerConsultaAppiCarros {

	
}
