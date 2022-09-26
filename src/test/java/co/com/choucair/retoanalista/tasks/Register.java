package co.com.choucair.retoanalista.tasks;

import co.com.choucair.retoanalista.userinterface.WelcomePage;
import co.com.choucair.retoanalista.userinterface.PersonalInformationPage;
import co.com.choucair.retoanalista.userinterface.AddressPage;
import co.com.choucair.retoanalista.userinterface.DevicesPage;
import co.com.choucair.retoanalista.userinterface.LastStepPage;
import co.com.choucair.retoanalista.userinterface.SuccessfulPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Select;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilExpectation;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Register implements Task {
    public static Register onThePage() {
        return Tasks.instrumented(Register.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(WelcomePage.JOIN_TODAY_BUTTON),
                WaitUntil.the(PersonalInformationPage.INPUT_FIRST_NAME, isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue("Oscar").into(PersonalInformationPage.INPUT_FIRST_NAME),
                Enter.theValue("Pacheco").into(PersonalInformationPage.INPUT_LAST_NAME),
                Enter.theValue("thisIsNotAnAccount8@gmail.com").into(PersonalInformationPage.INPUT_EMAIL),
                Select.optionNumber(1).from(PersonalInformationPage.SELECT_MONTH),
                Select.optionNumber(1).from(PersonalInformationPage.SELECT_DAY),
                Select.optionNumber(1).from(PersonalInformationPage.SELECT_YEAR),
                Click.on(PersonalInformationPage.NEXT_BUTTON),

                WaitUntil.the(AddressPage.AUTO_DETECT, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(AddressPage.LAST_NEXT_BUTTON),


                WaitUntil.the(DevicesPage.INPUT_COMPUTER, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(DevicesPage.LAST_NEXT_BUTTON),

                WaitUntil.the(LastStepPage.INPUT_PASSWORD, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue("isThisAPassword?1").into(LastStepPage.INPUT_PASSWORD),
                Enter.theValue("isThisAPassword?1").into(LastStepPage.INPUT_CONFIRM_PASSWORD),
                Click.on(LastStepPage.CHECK_TERMS_OF_USE),
                Click.on(LastStepPage.CHECK_PRIVACY_SECURITY),
                Click.on(LastStepPage.COMPLETE_SETUP_BUTTON)
        );
    }
}





