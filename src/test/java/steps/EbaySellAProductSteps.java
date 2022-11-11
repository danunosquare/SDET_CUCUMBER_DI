package steps;

import actions.CommonActions;
import actions.EbaySellAProductActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.fail;

public class EbaySellAProductSteps {

    CommonActions commonActions;
    EbaySellAProductActions ebaySellAProductActions;

    String product = "";


    public EbaySellAProductSteps (CommonActions commonActions, EbaySellAProductActions ebaySellAProductActions) {
        this.commonActions = commonActions;
        this.ebaySellAProductActions = ebaySellAProductActions;
    }


    @When("I click on List an item button")
    public void i_click_on_list_an_item_button() {
        ebaySellAProductActions.clickOnListAnItemButton();

    }
    @When("I enter the product {string} and search")
    public void i_enter_the_product_and_search(String product) {
        this.product = product;
        ebaySellAProductActions.enterAProductOnSuggestionInput(product);
        ebaySellAProductActions.clickOnSearchProduct();
    }
    @Then("I am navigated to prelist of similar products")
    public void i_am_navigated_to_prelist_of_similar_products() throws InterruptedException {

        Thread.sleep(2000);
        String currentTextExpected = commonActions.getCurrentTitle();
        System.out.println("*****" + currentTextExpected);
        String expectedTitleTextContains = "Poner en venta";
        if (!currentTextExpected.contains(expectedTitleTextContains)) {
            fail("Page does not navigate to the expected url");
        }

    }



}
