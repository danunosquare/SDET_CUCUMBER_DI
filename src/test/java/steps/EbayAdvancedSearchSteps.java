package steps;

import actions.CommonActions;
import actions.EbayAdvancedSearchActions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.fail;

public class EbayAdvancedSearchSteps {

    CommonActions commonActions;
    EbayAdvancedSearchActions ebayAdvancedSearchActions;

    public EbayAdvancedSearchSteps (CommonActions commonActions, EbayAdvancedSearchActions ebayAdvancedSearchActions) {
        this.commonActions = commonActions;
        this.ebayAdvancedSearchActions = ebayAdvancedSearchActions;
    }



    @Given("I am Ebay Advanced Search Page")
    public void i_am_ebay_advanced_search_page() {
        commonActions.goToUrl("https://www.ebay.com/sch/ebayadvsearch");
    }

    @When("I click on Ebay Logo")
    public void i_click_on_ebay_logo() {
        ebayAdvancedSearchActions.goToAdvancedSearch();


    }
    @Then("I am navigated to Ebay Home page")
    public void i_am_navigated_to_ebay_home_page() {
        String expUrl = "https://www.ebay.com/";
        String actUrl = commonActions.getCurrentUrl();
        if(!expUrl.equals(actUrl)) {
            fail("Page does not navigate to expected Page");
        }

    }

    @When("I advanced search an item")
    public void i_advanced_search_an_item(DataTable dataTable) throws InterruptedException {

        ebayAdvancedSearchActions.enterSearchItem(dataTable.cell(1,0));
        ebayAdvancedSearchActions.enterExcludeItem(dataTable.cell(1,1));
        ebayAdvancedSearchActions.enterMinPrice(dataTable.cell(1,2));
        ebayAdvancedSearchActions.enterMaxPrice(dataTable.cell(1,3));
        ebayAdvancedSearchActions.clickOnSearchButton();
        Thread.sleep(1000);
    }

}
