package br.com.icarrositau.appium.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { " br.com.icarrositau.appium.steps", " br.com.icarrositau.appium.hooks"}, 
 features = {"C:\\Users\\carlosteixeira\\eclipse-workspace\\appiummobile\\features\\" }, 
tags = { "@lerListaDeResultadoValidarValorAVista" })
public class RunnerConsultaAppiCarros {

	
}
