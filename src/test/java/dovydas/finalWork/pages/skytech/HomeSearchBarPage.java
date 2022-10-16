package dovydas.finalWork.pages.skytech;

import dovydas.finalWork.pages.Common;
import dovydas.finalWork.pages.Locators;
import org.openqa.selenium.NoSuchElementException;

public class HomeSearchBarPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void enterGpuName(String expectedGpuName) {
        Common.sendKeysToElement(expectedGpuName, Locators.Skytech.SearchBar.inputGpuName);
    }

    public static void clickSearchButton() {
        Common.clickElement(Locators.Skytech.SearchBar.clickButtonToSearch);
    }

    public static boolean checkIfNameIsAvailable() {
        try {
            Common.getElement(Locators.Skytech.SearchBar.linkRtx4090);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
