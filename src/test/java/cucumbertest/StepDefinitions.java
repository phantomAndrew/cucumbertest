package cucumbertest;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumbertest.cucumbertest.Belly;

public class StepDefinitions {
    @Given("^I have (\\d+) cukes in mny belly$")
    public void i_have_cukes_in_mny_belly(int cukes) throws Throwable {
        Belly belly = new Belly();
        belly.eats(cukes);
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^I wait an hour$")
    public void i_wait_an_hour() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^my belly should growl$")
    public void my_belly_should_growl() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
