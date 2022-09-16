package co.com.choucair.retoanalista.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@stories",
        glue = "co.com.choucair.retoanalista.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags {

}
