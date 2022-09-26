package co.com.choucair.retoanalista.stepdefinitions;

import co.com.choucair.retoanalista.questions.Answer;
import co.com.choucair.retoanalista.tasks.OpenUp;
import co.com.choucair.retoanalista.tasks.Register;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
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
    @When("I fill register form")
    public void iFillRegisterForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.onThePage());
    }
    @Then("I should see the Created account page")
    public void iShouldSeeTheCreatedAccountPage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe("Welcome to the world's largest community of freelance software testers!")));
    }
}
