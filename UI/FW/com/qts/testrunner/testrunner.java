package com.qts.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
	(
	features="./Features/Login.feature", 
	glue= {"com.qts.stepdefination"},
	monochrome= true,
	dryRun=false,
	plugin= {"pretty","html:testoutput"}
	)

public class testrunner {
	
	
}
