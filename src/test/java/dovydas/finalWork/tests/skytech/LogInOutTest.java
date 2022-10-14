package dovydas.finalWork.tests.skytech;

import dovydas.finalWork.pages.skytech.LogInOutPage;
import dovydas.finalWork.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInOutTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        LogInOutPage.open("https://www.skytech.lt/login.php");
    }

    @Test
    private void testLogin() {
        String loginEmail = "bukmanodraugas@gmail.com";
        String loginPassword = "Dovydas1";
        boolean nameIsPresent;
        boolean nameIsAvailable;

        LogInOutPage.clickPrisijunkite();
        LogInOutPage.enterEmailInfo(loginEmail);
        LogInOutPage.enterPasswordInfo(loginPassword);
        LogInOutPage.clickOnPrisijungti();
        nameIsPresent = LogInOutPage.checkIfElementIsAvailable();

        LogInOutPage.moveCursorToSeeAtsijungtiButton();
        LogInOutPage.clickAtsijungti();
        nameIsAvailable = LogInOutPage.checkIfPrisijunkiteElementIsAvailable();

        Assert.assertTrue(nameIsPresent);
        Assert.assertTrue(nameIsAvailable);
    }
}
