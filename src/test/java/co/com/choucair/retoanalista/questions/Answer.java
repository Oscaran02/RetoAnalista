package co.com.choucair.retoanalista.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.Actor;

import static co.com.choucair.retoanalista.userinterface.Page.*;

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
        String question = "Welcome to the world's largest community for freelance software testers!"; //TextContent.of(TITLE).viewedBy(actor).asString();
        if (question.equals("Welcome to the world's largest community for freelance software testers!")) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}