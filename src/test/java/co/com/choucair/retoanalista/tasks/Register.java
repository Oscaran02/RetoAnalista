package co.com.choucair.retoanalista.tasks;

import co.com.choucair.retoanalista.userinterface.uTestSignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Select;

public class Register implements Task {
    public static Register onThePage() {
        return Tasks.instrumented(Register.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(uTestSignUpPage.JOIN_TODAY_BUTTON),
                Enter.theValue("Oscar").into(uTestSignUpPage.INPUT_FIRST_NAME),
                Enter.theValue("Pacheco").into(uTestSignUpPage.INPUT_LAST_NAME),
                Enter.theValue("test@gmail.com").into(uTestSignUpPage.INPUT_EMAIL),
                Select.optionNumber(1).from(uTestSignUpPage.SELECT_MONTH),
                Select.optionNumber(1).from(uTestSignUpPage.SELECT_DAY),
                Select.optionNumber(1).from(uTestSignUpPage.SELECT_YEAR),
                Click.on(uTestSignUpPage.NEXT_BUTTON),
                Enter.theValue("Barranquilla").into(uTestSignUpPage.INPUT_CITY),
                Enter.theValue("080002") .into(uTestSignUpPage.INPUT_ZIP),
                Enter.theValue("Colombia").into(uTestSignUpPage.SELECT_COUNTRY),
                Click.on(uTestSignUpPage.LAST_NEXT_BUTTON),
                Select.optionNumber(2).from(uTestSignUpPage.INPUT_COMPUTER),
                Select.optionNumber(2).from(uTestSignUpPage.INPUT_VERSION),
                Select.optionNumber(2).from(uTestSignUpPage.INPUT_LANGUAGE),
                Select.optionNumber(2).from(uTestSignUpPage.INPUT_MOBILE),
                Select.optionNumber(2).from(uTestSignUpPage.INPUT_MODEL),
                Select.optionNumber(2).from(uTestSignUpPage.INPUT_OPERATING_SYSTEM),
                Click.on(uTestSignUpPage.LAST_NEXT_BUTTON),
                Enter.theValue("Oscar").into(uTestSignUpPage.INPUT_PASSWORD),
                Enter.theValue("Oscar").into(uTestSignUpPage.INPUT_CONFIRM_PASSWORD),
                Click.on(uTestSignUpPage.CHECK_TERMS_OF_USE),
                Click.on(uTestSignUpPage.CHECK_PRIVACY_SECURITY),
                Click.on(uTestSignUpPage.COMPLETE_SETUP_BUTTON)
        );
    }
}





