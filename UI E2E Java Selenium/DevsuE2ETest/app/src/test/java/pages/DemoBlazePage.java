package pages;

public class DemoBlazePage extends BasePage {

    private String firstProduct = "//a[contains(text(),'Samsung galaxy s6')]";
    private String secondProduct = "//a[contains(text(),'Nokia lumia 1520')]";
    private String addToCartButton = "//a[contains(text(),'Add to cart')]";
    private String navigateToCartButton = "//a[@id='cartur']";
    private String placeOrderButton = "//button[contains(text(),'Place Order')]";
    private String nameInput = "//input[@id='name']";
    private String countryInput = "//input[@id='country']";
    private String cityInput = "//input[@id='city']";
    private String creditCardInput = "//input[@id='card']";
    private String monthInput = "//input[@id='month']";
    private String yearInput = "//input[@id='year']";
    private String purchaseButton = "//button[contains(text(),'Purchase')]";
    private String purchaseSuccessAlert = "//h2[contains(text(),'Thank you for your purchase!')]";

    public DemoBlazePage() {
        super(driver);
    }

    public void navigateToDemoBlaze() {
        navigateTo("https://www.DemoBlaze.com/");
    }

    public void clickFirstProduct() {
        clickElement(firstProduct);
    }

    public void clickSecondProduct() {
        clickElement(secondProduct);
    }

    public void clickAddToCart() {
        clickElement(addToCartButton);
    }

    public void navigateToCart() {
        clickElement(navigateToCartButton);
    }

    public boolean placeOrderButtonIsDisplayed() {
        return elementIsDisplayed(placeOrderButton);
    }

    public void clickPlaceOrderButton() {
        clickElement(placeOrderButton);
    }

    public void writeFormFields() {
        clickElement(nameInput);
        write(nameInput, "Thomas P. Alvarez");
        write(countryInput, "Ecuador");
        write(cityInput, "Quito");
        write(creditCardInput, "00000000000");
        write(monthInput, "02");
        write(yearInput, "2025");
    }

    public void submitPurchaseForm() {
        clickElement(purchaseButton);
    }

    public boolean successAlertIsDisplayed() {
        return elementIsDisplayed(purchaseSuccessAlert);
    }
}
