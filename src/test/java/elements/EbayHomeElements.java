package elements;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class EbayHomeElements {

    WebDriver webDriver;

    public EbayHomeElements (WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//a[@id='gh-as-a']")
    public WebElement advancedLink;

    @FindBy(xpath = "//input[@id='gh-ac']")
    public WebElement searchBox;

    @FindBy(xpath = "//input[@id='gh-btn']")
    public WebElement searchButton;

    @FindBy(xpath = "//h1[@class='srp-controls__count-heading']/span")
    public WebElement numOfItems;

    @FindBy(xpath = "//select[@id='gh-cat']")
    public WebElement categories;

    @FindBy(xpath = "//select[@id='gh-cat']/option")
    public List<WebElement> catOptions;

    @FindBy(xpath = "//li[@id='gh-p-2']")
    public WebElement sellLink;

}
