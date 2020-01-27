package com.digi.petclinic.veterinarian_service;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;

@RunWith(Cucumber.class)
@ActiveProfiles("test")
@CucumberOptions(features = "src/main/resources/feature", glue="com.digi.petclinic.veterinarian_service.stepdef")
public class CucumberVeterinarianServiceTest {

}
