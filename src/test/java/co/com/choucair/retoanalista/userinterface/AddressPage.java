package co.com.choucair.retoanalista.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AddressPage extends PageObject{
    public static final Target INPUT_CITY = Target.the("where do we write the city").locatedBy("//input[@id='city']");
    public static final Target INPUT_ZIP = Target.the("where do we write the zip code").locatedBy("//input[@id='zip']");
    public static final Target INPUT_COUNTRY = Target.the("where do we write the country")
            .locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]");
    public static final Target LAST_NEXT_BUTTON = Target.the("button to move to the last page of the form")
            .locatedBy("//*[@class='btn btn-blue pull-right']");
    public static final Target HEADER_ADDRESS = Target.the("header that shows us the address message")
            .locatedBy("//h1[contains(text(),'Address')]");
    public static final Target AUTO_DETECT = Target.the("button to auto detect the address")
            .locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/span[2]");
}
