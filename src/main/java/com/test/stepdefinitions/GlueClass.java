package com.test.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.BankRateTest;

public class GlueClass {
    @When("^Firstline$")
    public void firststep(){
        System.out.println("This is first step");
    }

    @Then("^Secondline$")
    public void secondstep(){
        System.out.println("This is second step");
    }

    @Then("^Start BankRate app test$")
    public void bankRateAppTest() throws InterruptedException {

        System.out.println("This is third test");
        BankRateTest bankRateTest = new BankRateTest();
        bankRateTest.runSelenium();
    }
}
