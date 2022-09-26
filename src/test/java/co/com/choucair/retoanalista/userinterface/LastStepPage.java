package co.com.choucair.retoanalista.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class LastStepPage extends PageObject {
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .locatedBy("//input[@id='password']");
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where do we write the password confirmation")
            .locatedBy("//input[@id='confirmPassword']");
    public static final Target CHECK_STAY_INFORMED = Target.the("check the box to stay informed")
            .locatedBy("//input[@id='newsletterOptIn']");
    public static final Target CHECK_TERMS_OF_USE = Target.the("check the box to accept the terms of use")
            .locatedBy("//input[@id='termOfUse']");
    public static final Target CHECK_PRIVACY_SECURITY = Target.the("check the box to accept the privacy and security policy")
            .locatedBy("//input[@id='privacySetting']");
    public static final Target COMPLETE_SETUP_BUTTON = Target.the("button to complete the setup")
            .locatedBy("//a[@id='laddaBtn']");
    public static final Target HEADER_LAST_STEP = Target.the("header that shows us the last step message")
            .locatedBy("//h1[contains(text(),'Last Step:')]");
}
