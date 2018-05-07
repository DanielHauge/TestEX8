package Test8;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

class IsItFriday {
    static String isItFriday(String today) {
        if (today!="Friday"){return "Nope";}
    else { return "Yes"; }
}
}

public class Stepdefs {

    private String today;
    private String actualAnswer;

    @Given("^today is Sunday$")
    public void today_is_Sunday() {
        this.today = "Sunday";
    }

    @When("^I ask whether it's Friday yet$")
    public void i_ask_whether_is_s_Friday_yet() {
        this.actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String arg1) {
        assertEquals(arg1, actualAnswer);
    }

    @Given("^today is Friday$")
    public void today_is_Friday() {
        this.today = "Friday";
    }

}