package co.com.choucair.retoanalista.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class PersonalInformationPage extends PageObject {
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
    public static Target HEADER_PERSONAL_INFORMATION = Target.the("header that shows us the personal information message")
            .locatedBy("//h1[contains(text(),'Personal Information')]");
}