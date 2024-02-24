package steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.DemoBlazePage;

public class DemoBlazeSteps {

    DemoBlazePage demoblaze = new DemoBlazePage();

    @Given("^the user navigates to www.demoblaze.com$")
    public void navigateToDemoBlaze() {
        demoblaze.navigateToDemoBlaze();
    }

    @And("^adds first product to the cart$")
    public void addFirstProductToCart() {
        demoblaze.clickFirstProduct();
        demoblaze.clickAddToCart();
        Assert.assertEquals("Product added", demoblaze.retrieveAlertText());
        demoblaze.navigateToDemoBlaze();
    }

    @And("^adds second product to the cart$")
    public void addSecondProductToCart() {
        demoblaze.clickSecondProduct();
        demoblaze.clickAddToCart();
        Assert.assertEquals("Product added", demoblaze.retrieveAlertText());
    }

    @And("^views the cart$")
    public void viewCart() {
        demoblaze.navigateToCart();
        Assert.assertTrue(demoblaze.placeOrderButtonIsDisplayed());
    }

    @And("^completes the purchase form$")
    public void completePurchaseForm() {
        demoblaze.clickPlaceOrderButton();
        demoblaze.writeFormFields();
        demoblaze.submitPurchaseForm();
    }

    @Then("^the user completes the purchase successfully$")
    public void itemCanBeAddedToTheCart() {
        Assert.assertTrue(demoblaze.successAlertIsDisplayed());
    }

}
