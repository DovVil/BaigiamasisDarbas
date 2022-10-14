package dovydas.finalWork.tests.skytech;

import dovydas.finalWork.pages.skytech.HomeSearchBarPage;
import dovydas.finalWork.tests.TestBase;
import org.testng.annotations.BeforeMethod;


public class HomeSearchBarTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        HomeSearchBarPage.open("https://www.skytech.lt/");
    }

}
