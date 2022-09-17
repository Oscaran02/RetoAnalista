package co.com.choucair.retoanalista.questions;

import net.serenitybdd.screenplay.Question;

public class Answer implements Question<Boolean> {
    private String question;
    public Answer(String question) {
        this.question = question;
    }
    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(net.serenitybdd.screenplay.Actor actor) {
        boolean result;
        String name = "Welcome, Oscar";
        if (question.equals(name)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
