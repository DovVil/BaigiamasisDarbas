package dovydas.finalWork.tests.skytech;

import dovydas.finalWork.pages.skytech.LoginPage;
import dovydas.finalWork.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        LoginPage.open("https://www.skytech.lt/login.php");
    }

    @Test
    private void testLogin() {
        String loginEmail = "bukmanodraugas@gmail.com";
        String loginPassword = "Dovydas1";
        boolean nameIsPresent;

        LoginPage.clickPrisijunkite();
        LoginPage.enterEmailInfo(loginEmail);
        LoginPage.enterPasswordInfo(loginPassword);
        LoginPage.clickOnPrisijungti();
        nameIsPresent = LoginPage.checkIfElementIsAvailable();
        Assert.assertTrue(nameIsPresent);
    }
}
