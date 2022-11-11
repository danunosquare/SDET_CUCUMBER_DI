package steps;

import actions.CommonActions;
import actions.EbayHomeActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.fail;

public class EbayHomeSteps {

    CommonActions commonActions;
    EbayHomeActions ebayHomeActions;

    public EbayHomeSteps(CommonActions commonActions, EbayHomeActions homeActions) {
        this.commonActions = commonActions;
        this.ebayHomeActions = homeActions;
    }

    @Given("I am on Ebay Home Page")
    public void i_am_on_ebay_home_page() {
        commonActions.goToUrl("https://www.ebay.com/");
    }

    @When("I click on Advance Link")
    public void i_click_on_advance_link() {
        ebayHomeActions.clickOnAdvancedLink();
    }

    @When("I click on Sell link")
    public void i_click_on_sell_link() {
        ebayHomeActions.clickOnSendLink();
    }


    @Then("I navigate to advanced Search Page")
    public void i_navigate_to_advanced_search_page() {
        String expUrl = "https://www.ebay.com/sch/ebayadvsearch";
        String actUrl = commonActions.getCurrentUrl();
        if(!expUrl.equals(actUrl)) {
            fail("Page does not navigate to expected Page");
        }
        System.out.println("I navigate to advanced Search Page");

    }

    @When("I search for {string}")
    public void i_search_for_iphone(String product) {
      ebayHomeActions.searchAnItem(product);
      ebayHomeActions.clickOnSearchButton();

    }
    @Then("I validate at least {int} search items present")
    public void i_validate_atleast_search_items_present(int count) {
        int itemCount = ebayHomeActions.getSearchItemCount();
        if(!(itemCount > count)) {
            fail("Less than " + count + " results shown");
        }

    }
    @When("I search for {string} in {string} category")
    public void i_search_for_in_category(String product, String category) throws InterruptedException {
        ebayHomeActions.searchAnItem(product);
        ebayHomeActions.selectCategoryOption(category);
        ebayHomeActions.clickOnSearchButton();
        Thread.sleep(1000);
    }


    @When("I click on {string} link")
    public void i_click_on_moda_link(String category) {
        ebayHomeActions.selectOptionTab(category);
    }
    @Then("I validate that page navigates to {string} and title contains {string}")
    public void i_validate_that_page_navigates_to_and_title_contains(String url, String title) {
        String actualURL = commonActions.getCurrentUrl();
        String actualTitle = commonActions.getCurrentTitle();
        if (!actualURL.equals(url)) {
            fail("Page does not navigate to the expected url");
        }
        System.out.println(actualTitle + " " + title);
        if (!actualTitle.contains(title)) {
            fail("Title mismatch");
        }

    }

}
