package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EbayAdvancedSearchElements {

    WebDriver webDriver;

    @FindBy(xpath = "//a[@id='gh-la']")
    public WebElement ebayLogo;

    @FindBy(xpath = "//input[@id='_nkw']")
    public WebElement searchString;

    @FindBy(xpath = "//input[@id='_ex_kw']")
    public WebElement excludeString;

    @FindBy(xpath = "//input[@name='_udlo']")
    public WebElement minPrice;

    @FindBy(xpath = "//input[@name='_udhi']")
    public WebElement maxPrice;

    @FindBy(xpath = "//button[@id='searchBtnLowerLnk']")
    public WebElement searchingButton;



    public EbayAdvancedSearchElements (WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(webDriver, this);
    }

}
