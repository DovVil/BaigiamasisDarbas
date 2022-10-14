package dovydas.finalWork.tests.skytech;

import dovydas.finalWork.pages.skytech.SortByPricePage;
import dovydas.finalWork.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SortByPriceTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        SortByPricePage.open(
                "https://www.skytech.lt/vaizdo-plokstes-priedai-vaizdo-plokstes-vga-c-86_85_197_284.html?sort=5a");
    }
    @Test
    private void testSortGpuByPriceHighToLow(){
        SortByPricePage.moveCursorToOpenSortingOptions();
        SortByPricePage.click100to1SortButton();
    }
}
