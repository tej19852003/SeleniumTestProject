package com.test.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GlueClass {
    @When("^Firstline$")
    public void firststep(){
        System.out.println("This is first step");
    }

    @Then("^Secondline$")
    public void secondstep(){
        System.out.println("This is second step");
    }
}
