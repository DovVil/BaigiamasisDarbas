package dovydas.finalWork.tests.skytech;

import dovydas.finalWork.pages.skytech.LoginPage;
import dovydas.finalWork.tests.TestBase;
import org.testng.annotations.BeforeMethod;

public class LoginTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        LoginPage.open("https://www.skytech.lt/login.php");
    }
}
