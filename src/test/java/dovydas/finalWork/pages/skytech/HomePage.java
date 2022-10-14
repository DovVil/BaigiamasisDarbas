package dovydas.finalWork.pages.skytech;

import dovydas.finalWork.pages.Common;
import dovydas.finalWork.pages.Locators;

public class HomePage {
    public static void open(String url) {
        Common.openUrl(url);
    }


    public static void moveCursorToSeeDetailedMenu() {
        Common.moveCursorToPosition(Locators.Skytech.Home.moveCursorOverMainMenuButton);
    }
    public static void clickDesiredButton() {
        Common.waitForButtonToBeVisible(Locators.Skytech.Home.clickOnGpuButton);
        Common.clickElement(Locators.Skytech.Home.clickOnGpuButton);
    }

}
