package dovydas.finalWork.pages.skytech;

import dovydas.finalWork.pages.Common;
import dovydas.finalWork.pages.Locators;

public class HomeSearchBarPage {

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void sleep(int millis) {
        Common.sleep(millis);
    }

    public static void enterGpuName(String expectedGpuName) {
        Common.sendKeysToElement(expectedGpuName, Locators.Skytech.SearchBar.inputGpuName);
    }
    public static void clickSearchButton() {
        Common.clickElement(Locators.Skytech.SearchBar.clickButtonToSearch);
    }

}
