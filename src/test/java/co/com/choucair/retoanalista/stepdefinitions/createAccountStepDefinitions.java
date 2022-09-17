package co.com.choucair.retoanalista.stepdefinitions;

import co.com.choucair.retoanalista.tasks.OpenUp;
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
        OnStage.theActorCalled("Oscar").wasAbleTo(OpenUp.thePage());
    }
    @When("I click on the Join today link")
    public void iClickOnTheJoinTodayLink() {

    }
    @Then("I should see the Create an account page")
    public void iShouldSeeTheCreateAnAccountPage() {

    }
}
