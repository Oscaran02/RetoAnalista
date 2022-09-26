package co.com.choucair.retoanalista.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class DevicesPage extends PageObject {
    public static final Target INPUT_COMPUTER = Target.the("where do we write the computer")
            .locatedBy("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span");
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
    public static final Target HEADER_DEVICES = Target.the("header that shows us the devices message")
            .locatedBy("//h1[contains(text(),'Devices')]");
}
