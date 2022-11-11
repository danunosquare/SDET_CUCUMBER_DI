package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbaySellingPrelistSugestPageElements {

    WebDriver webDriver;

    public EbaySellingPrelistSugestPageElements (WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@id='s0-1-0-24-6-@keyword-@box-@input-textbox']")
    public WebElement inputProduct;

    @FindBy(xpath = "//div[@class='keyword-suggestion']/button")
    public WebElement searchButton;


}
