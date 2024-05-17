package com.hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("today is sunday")
    public void todayIsSunday() {
    }

    @When("I ask whether it's Friday yet")
    public void iAskWhetherItSFridayYet() {
    }

    @Then("I should be told {string}")
    public void iShouldBeTold(String arg0) {
    }
}
