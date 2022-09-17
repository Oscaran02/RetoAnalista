package co.com.choucair.retoanalista.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class createAccountStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("I am on the home page")
    public void iAmOnTheHomePage() {

    }
    @When("I click on the Join today link")
    public void iClickOnTheJoinTodayLink() {

    }
    @Then("I should see the Create an account page")
    public void iShouldSeeTheCreateAnAccountPage() {

    }
}
