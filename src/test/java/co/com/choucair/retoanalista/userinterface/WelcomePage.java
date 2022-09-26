package co.com.choucair.retoanalista.userinterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class WelcomePage extends PageObject {
    public static final Target JOIN_TODAY_BUTTON = Target.the("button that shows us the form to sign up")
            .locatedBy("//a[@class='unauthenticated-nav-bar__sign-up']");
    public static final Target HEADER_WELCOME = Target.the("header that shows us the welcome message")
            .locatedBy("//h1[contains(text(),'The Largest Community of Testers in the World')]");
}
