package dovydas.finalWork.pages.skytech;

import dovydas.finalWork.pages.Common;
import dovydas.finalWork.pages.Locators;

public class LoginPage {
    public static void open(String url) {
        Common.openUrl(url);
    }


    public static void enterEmailInfo(String loginEmail) {
        Common.sendKeysToElement(loginEmail,Locators.Skytech.Login.enterEmailAddress);
    }

    public static void clickPrisijunkite() {
        Common.clickElement(Locators.Skytech.Login.clickOnPrisijunkite);
    }
}
