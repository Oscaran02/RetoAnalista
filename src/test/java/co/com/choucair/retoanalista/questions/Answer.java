package co.com.choucair.retoanalista.questions;

import co.com.choucair.retoanalista.userinterface.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.choucair.retoanalista.userinterface.SuccessfulPage.SUCCESSFUL_MESSAGE;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        if (question.contains("Welcome")) {
            result = Visibility.of(WelcomePage.HEADER_WELCOME).answeredBy(actor);
        } else if (question.contains("Your personal information")) {
            result = Visibility.of(PersonalInformationPage.HEADER_PERSONAL_INFORMATION).answeredBy(actor);
        } else if (question.contains("Your address")) {
            result = Visibility.of(AddressPage.HEADER_ADDRESS).answeredBy(actor);
        } else if (question.contains("Devices")) {
            result = Visibility.of(DevicesPage.HEADER_DEVICES).answeredBy(actor);
        } else if (question.contains("Last Step")) {
            result = Visibility.of(LastStepPage.HEADER_LAST_STEP).answeredBy(actor);
        } else if (question.contains("Welcome to the world's largest community of freelance software testers!")) {
            result = Visibility.of(Target.the(question).locatedBy(SUCCESSFUL_MESSAGE)).answeredBy(actor);
        } else {
            result = false;
        }
        return result;
    }
}