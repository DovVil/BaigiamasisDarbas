package dovydas.finalWork.tests.skytech;

import dovydas.finalWork.pages.skytech.ShoppingCartPage;
import dovydas.finalWork.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShoppingCartTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        ShoppingCartPage.open("https://www.skytech.lt/" +
                "100100000514wof-amd-ryzen-7950x-4557ghz-16core32threads-socket-am5-dezuteje-amd--p-602207.html");
    }

    @Test
    private void testAddAndRemove7950XcpuWithinShoppingCart() {
        boolean inStock;
        boolean inCart;
        boolean cartEmpty;
        inStock = ShoppingCartPage.readAmountOfStock();
        if (!inStock) {
            ShoppingCartPage.stopTest();
            System.out.println("Not in stock!");
        }
        ShoppingCartPage.clickAddToCart();
        ShoppingCartPage.clickCheckTheCart();
        inCart = ShoppingCartPage.readIfCpuIsAddedToCart();
        ShoppingCartPage.clickToRemoveProductFromCart();
        cartEmpty = ShoppingCartPage.checkIfCartIsEmpty();

        Assert.assertTrue(inCart && cartEmpty);
    }
}
