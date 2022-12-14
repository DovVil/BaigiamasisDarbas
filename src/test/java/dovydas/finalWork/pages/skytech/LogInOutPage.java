package dovydas.finalWork.pages.skytech;

import dovydas.finalWork.pages.Common;
import dovydas.finalWork.pages.Locators;
import org.openqa.selenium.NoSuchElementException;

public class LogInOutPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void enterEmailInfo(String loginEmail) {
        Common.sendKeysToElement(loginEmail, Locators.Skytech.Login.enterEmailAddress);
    }

    public static void clickPrisijunkite() {
        Common.clickElement(Locators.Skytech.Login.clickOnPrisijunkite);
    }

    public static void enterPasswordInfo(String loginPassword) {
        Common.sendKeysToElement(loginPassword, Locators.Skytech.Login.enterPassword);
    }

    public static void clickOnPrisijungti() {
        Common.clickElement(Locators.Skytech.Login.clickPrisijungti);
    }

    public static boolean checkIfElementIsAvailable() {
        try {
            Common.getElement(Locators.Skytech.Login.linkElementManoDuomenys);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public static boolean checkIfPrisijunkiteElementIsAvailable() {
        try {
            Common.getElement(Locators.Skytech.Login.clickOnPrisijunkite);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public static void moveCursorToSeeAtsijungtiButton() {
        Common.moveCursorToPosition(Locators.Skytech.Login.moveCursorToSeeAtsijungtiButton);
    }

    public static void clickAtsijungti() {
        Common.clickElement(Locators.Skytech.Login.clickAtsijungtiButton);
    }
}
