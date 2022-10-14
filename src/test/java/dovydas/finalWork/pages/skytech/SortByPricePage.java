package dovydas.finalWork.pages.skytech;

import dovydas.finalWork.pages.Common;
import dovydas.finalWork.pages.Locators;

public class SortByPricePage {
    public static void open(String url) {
        Common.openUrl(url);
    }


    public static void moveCursorToOpenSortingOptions() {
        Common.moveCursorToPosition(Locators.Skytech.Sort.mouseoverSortButton);
    }


    public static void click100to1SortButton() {
        Common.waitForButtonToBeVisible(Locators.Skytech.Sort.clickSortByPriceHighToLowButton);
        Common.clickElement(Locators.Skytech.Sort.clickSortByPriceHighToLowButton);
    }

    public static String getPriceOfTheFirstListing() {
        Common.waitForButtonToBeVisible(Locators.Skytech.Sort.readFirstListingPrice);
        return Common.getElementText(Locators.Skytech.Sort.readFirstListingPrice);
    }

    public static String getPriceOfTheSecondListing() {
        Common.waitForButtonToBeVisible(Locators.Skytech.Sort.readSecondListingPrice);
        return Common.getElementText(Locators.Skytech.Sort.readSecondListingPrice);
    }

}
