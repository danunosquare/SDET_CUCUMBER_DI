package actions;

import elements.EbayHomeElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import steps.CommontSteps;

import java.util.List;

public class EbayHomeActions {

    private WebDriver driver;
    EbayHomeElements ebayHomeElements;

    public EbayHomeActions(CommontSteps commontSteps) {
       this.driver = commontSteps.getWebDriver();
       ebayHomeElements = new EbayHomeElements(driver);
    }

    public void clickOnAdvancedLink() {
        ebayHomeElements.advancedLink.click();
    }

    public void searchAnItem(String productName) {
        ebayHomeElements.searchBox.sendKeys(productName);
    }

    public void clickOnSearchButton() {
        ebayHomeElements.searchButton.click();
    }

    public int getSearchItemCount() {
        String value = ebayHomeElements.numOfItems.getText();
        return Integer.parseInt(value.replace(".", "").trim());

    }

    public void selectCategoryOption(String option) {
        ebayHomeElements.categories.click();
        List<WebElement> options = ebayHomeElements.catOptions;
        for(WebElement element: options) {
            if(element.getText().trim().equals(option)) {
                element.click();
                break;
            }
        }
    }

    public void selectOptionTab(String option) {
        driver.findElement(By.linkText(option)).click();
    }

    public void clickOnSendLink() {
        ebayHomeElements.sellLink.click();
    }
}
