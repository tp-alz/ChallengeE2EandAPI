@DemoBlaze
Feature: Purchase flow on DemoBlaze website

    Scenario: Purchase flow test with two products
        Given the user navigates to www.demoblaze.com
        And adds first product to the cart
        And adds second product to the cart
        And views the cart
        And completes the purchase form
        Then the user completes the purchase successfully

