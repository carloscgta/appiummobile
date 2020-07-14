package br.com.icarrositau.appium.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//plugin = {"com.cucumber.listener.ExtentCucumberFormatter:src/main/report/cucumber-reports/report.html"},
@RunWith(Cucumber.class)
@CucumberOptions(glue = { " br.com.icarrositau.appium.steps", " br.com.icarrositau.appium.hooks"}, 
 features = {"./src/test/resources/br/com/icarrositau/appium/features" }, 
tags = { "@lerListaDeResultadoValidarValorAVista" })
public class RunnerConsultaAppiCarros {

	
}
