package TriangleWithCucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.TestCase.assertEquals;

public class MyStepdefs {

    double[] polygonsides;
    double result;
    double[] results;
    int perimeteranswer;

    @Given("^A Triangle with sides (\\d+),(\\d+),(\\d+)$")
    public void aTriangleWithSides(int arg0, int arg1, int arg2) throws Throwable {
        this.polygonsides= new double[]{arg0,arg1, arg2};
    }

    @When("^I ask the area$")
    public void iAskTheArea() throws Throwable {
        this.result = new PolygonHandlerImpl().CalculateArea(new PolygonHandlerImpl().CreatePolygon(this.polygonsides));
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void iShouldBeTold(String arg0) throws Throwable {
        assertEquals(arg0,  Double.toString(result));
    }

    @Given("^A Tiangle with sides (\\d+),(\\d+),(\\d+)$")
    public void aTiangleWithSides(int arg0, int arg1, int arg2) throws Throwable {
        this.polygonsides= new double[]{arg0,arg1, arg2};
    }

    @When("^I ask the Angles$")
    public void iAskTheAngles() throws Throwable {
        this.results = new PolygonHandlerImpl().CalculateAnglesFromTriangle(new PolygonHandlerImpl().CreatePolygon(polygonsides));
    }

    @Then("^I should be given \"([^\"]*)\"$")
    public void iShouldBeGiven(String arg0) throws Throwable {
        double[] expected = new double[]{Double.parseDouble(arg0.split(",")[0]),Double.parseDouble(arg0.split(",")[1]),Double.parseDouble(arg0.split(",")[2])};
        assertEquals(expected[0],  results[0]);
        assertEquals(expected[1],  results[1]);
        assertEquals(expected[2],  results[2]);
    }

    @When("^I ask for the Perimeter of the triangle$")
    public void iAskForThePerimeterOfTheTriangle() throws Throwable {
        this.perimeteranswer = (int)new PolygonHandlerImpl().CalculatePerimeter(new PolygonHandlerImpl().CreatePolygon(polygonsides));
    }

    @Then("^I should be told (\\d+)$")
    public void iShouldBeTold(int arg0) throws Throwable {
        assertEquals(perimeteranswer, arg0);
    }
}
