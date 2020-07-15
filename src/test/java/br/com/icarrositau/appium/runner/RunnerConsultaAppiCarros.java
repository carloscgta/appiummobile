package br.com.icarrositau.appium.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

//plugin = {"com.cucumber.listener.ExtentCucumberFormatter:src/main/report/cucumber-reports/report.html"},
@RunWith(Cucumber.class)
@CucumberOptions(glue = { " br.com.icarrositau.appium.steps", " br.com.icarrositau.appium.hooks"}, 
 features = {"./src/main/features/" }, 
tags = { "@lerListaDeResultadoValidarValorAVista" })
public class RunnerConsultaAppiCarros {

	
}
