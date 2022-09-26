package co.com.choucair.retoanalista.userinterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class uTestSignUpPage extends PageObject {
    public static final Target JOIN_TODAY_BUTTON = Target.the("button that shows us the form to sign up")
            .locatedBy("//a[@class='unauthenticated-nav-bar__sign-up']");
    public static final Target INPUT_FIRST_NAME = Target.the("where do we write the first name")
            .locatedBy("//input[@id='firstName']");
    public static final Target INPUT_LAST_NAME = Target.the("where do we write the last name")
            .locatedBy("//input[@id='lastName']");
    public static final Target INPUT_EMAIL = Target.the("where do we write the email")
            .locatedBy("//input[@id='email']");
    public static final Target SELECT_MONTH = Target.the("select the month of birth")
            .locatedBy("//select[@id='birthMonth']");
    public static final Target SELECT_DAY = Target.the("select the day of birth")
            .locatedBy("//select[@id='birthDay']");
    public static final Target SELECT_YEAR = Target.the("select the year of birth")
            .locatedBy("//select[@id='birthYear']");
    public static final Target NEXT_BUTTON = Target.the("button to move to the next form")
            .locatedBy("//a[@class='btn btn-blue']");
    public static final Target INPUT_CITY = Target.the("where do we write the city")
            .locatedBy("//input[@id='city']");
    public static final Target INPUT_ZIP = Target.the("where do we write the zip code")
            .locatedBy("//input[@id='zip']");
    public static final Target INPUT_COUNTRY = Target.the("where do we write the country")
            .locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]");
    public static final Target INPUT_COMPUTER = Target.the("where do we write the computer")
            .locatedBy("//input[@id='computer']");
    public static final Target INPUT_VERSION = Target.the("where do we write the version")
            .locatedBy("//input[@id='version']");
    public static final Target INPUT_LANGUAGE = Target.the("where do we write the language")
            .locatedBy("//input[@id='language']");
    public static final Target INPUT_MOBILE = Target.the("where do we write the mobile")
            .locatedBy("//input[@id='mobile']");
    public static final Target INPUT_MODEL = Target.the("where do we write the model")
            .locatedBy("//input[@id='model']");
    public static final Target INPUT_OPERATING_SYSTEM = Target.the("where do we write the operating system")
            .locatedBy("//input[@id='operatingSystem']");
    public static final Target LAST_NEXT_BUTTON = Target.the("button to move to the last page of the form")
            .locatedBy("//*[@class='btn btn-blue pull-right']");
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
}
