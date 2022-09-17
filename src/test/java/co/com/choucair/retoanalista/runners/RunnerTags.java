package co.com.choucair.retoanalista.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
// Next two imports not working, deprecated?
//import cucumber.api.CucumberOptions;
//import cucumber.api.SnippetType;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/createAccount.feature",
        tags = "@stories",
        glue = "co.com.choucair.retoanalista.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerTags {

}
