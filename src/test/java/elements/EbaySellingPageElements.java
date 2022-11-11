package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbaySellingPageElements {

    WebDriver webDriver;

    public EbaySellingPageElements (WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//section[@id='image_banner_1']/div/div/a")
    public WebElement listAnItemButton;
}
