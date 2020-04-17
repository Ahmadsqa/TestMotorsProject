package co.uk.motors.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(name = "PostCode")
    private WebElement postCode;

    @FindBy(id = "Make")
    private WebElement vehicleMaker;

    @FindBy(id = "Model")
    private WebElement vehibleModel;

    @FindBy(id = "MinPrice")
    private WebElement vehicleMinPrice;

    @FindBy(id = "MaxPrice")
    private WebElement vehicleMaxPrice;

    @FindBy(css = "#searchPanel > section > div > section > div.inline-input-bar.sp__bar > button > span.sp__btn-title")
    private WebElement searchButton1;
    @FindBy(id = "gdprAgree")
    private WebElement agreeButton;
    public void enterPostCode (String pCode)
    {
        postCode.clear();
        postCode.sendKeys(pCode);
    }

    public void selectVehicleMaker (String make)
    {
        selectByText(vehicleMaker, make);
    }
    public void selectVehicleModel(String model){
        selectByText(vehibleModel, model);
    }

    public void selectVehicleMinPrice(String minPrice){
        selectByText(vehicleMinPrice, minPrice);
    }

    public void selectVehicleMaxPrice(String maxPrice){
        selectByText(vehicleMaxPrice, maxPrice);
    }
    public SearchResultPage clickOnSearchButton1() {
        agreeButton.click();
        searchButton1.click();
        return new SearchResultPage(driver);
    }
}
