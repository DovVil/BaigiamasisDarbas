package dovydas.finalWork.pages.skytech;

import dovydas.finalWork.pages.Common;
import dovydas.finalWork.pages.Locators;
import org.openqa.selenium.NoSuchElementException;

public class ShoppingCartPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static boolean readAmountOfStock() {
        String checkIfInStock = "0";
        String readString;
        readString = Common.getElementText(Locators.Skytech.Cart.checkAvailability);
        return !(readString.contains(checkIfInStock));
    }

    public static void stopTest() {
        Common.closeDriver();
    }

    public static void clickAddToCart() {
        Common.clickElement(Locators.Skytech.Cart.clickAddToCartButton);
    }

    public static void clickCheckTheCart() {
        Common.waitForButtonToBeVisible(Locators.Skytech.Cart.clickOnToCheckInsideCart);
        Common.clickElement(Locators.Skytech.Cart.clickOnToCheckInsideCart);
    }

    public static boolean readIfCpuIsAddedToCart() {
        try{
            Common.getElement(Locators.Skytech.Cart.checkIfCpuIsInCart);
            return true;
        }catch(NoSuchElementException e){
            return false;
        }
    }

    public static void clickToRemoveProductFromCart() {
        Common.clickElement(Locators.Skytech.Cart.clickToRemoveCpuFromCart);
    }

    public static boolean checkIfCartIsEmpty() {
        try{
            Common.getElement(Locators.Skytech.Cart.checkIfShoppingCartIsEmpty);
            return true;
        }catch(NoSuchElementException e){
            return false;
        }
    }
}
