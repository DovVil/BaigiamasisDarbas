package dovydas.finalWork.tests.skytech;

import dovydas.finalWork.pages.skytech.HomeSearchBarPage;
import dovydas.finalWork.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomeSearchBarTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        HomeSearchBarPage.open("https://www.skytech.lt/");
    }

    @Test
    private void testSearchOfGpuRtx4090() {
        String expectedGpuName = "RTX 4090";
        boolean nameIsAvailable;

        HomeSearchBarPage.enterGpuName(expectedGpuName);
        HomeSearchBarPage.clickSearchButton();
        nameIsAvailable = HomeSearchBarPage.checkIfNameIsAvailable();
        Assert.assertTrue(nameIsAvailable);
    }
}
