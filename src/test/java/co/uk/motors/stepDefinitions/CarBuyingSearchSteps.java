package co.uk.motors.stepDefinitions;

import co.uk.motors.pages.BasePage;
import co.uk.motors.pages.HomePage;
import co.uk.motors.pages.SearchResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class CarBuyingSearchSteps extends BasePage {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    SearchResultPage searchRsultPage = PageFactory.initElements(driver, SearchResultPage.class);
    @Given("i navigate to motors.co.uk homepage")
    public void i_navigate_to_motors_co_uk_homepage() {
        launchUrl();
    }
    @When("i enter post code as {string}")
    public void i_enter_post_code_as(String pCode) {
        homePage.enterPostCode(pCode);
    }
    @When("i select car make as {string}")
    public void i_select_car_make_as(String make) {
        homePage.selectVehicleMaker(make);
    }

    @When("i select care model as {string}")
    public void i_select_care_model_as(String model) {
        homePage.selectVehicleModel(model);
    }

    @When("i select minimum price as {string}")
    public void i_select_minimum_price_as(String minPrice) {
        homePage.selectVehicleMinPrice(minPrice);
    }

    @When("i select maximum price as {string}")
    public void i_select_maximum_price_as(String maxPrice) {
        homePage.selectVehicleMaxPrice(maxPrice);
    }

    @When("i click on search button")
    public void i_click_on_search_button() {
        searchRsultPage= homePage.clickOnSearchButton1();
    }

    @Then("the search reusults based on above criteria are displayed")
    public void the_search_reusults_based_on_above_criteria_are_displayed() {

    }
}
