package dovydas.finalWork.tests.skytech;

import dovydas.finalWork.pages.skytech.HomePage;
import dovydas.finalWork.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        HomePage.open("https://www.skytech.lt/");
    }

    @Test
    private void testMainMenuNavigation() {
        String expectedMessage = "Vaizdo plokštės";
        String actualMessage;

        HomePage.moveCursorToSeeDetailedMenu();
        HomePage.clickDesiredButton();
        actualMessage = HomePage.readMessage();

        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }
}
