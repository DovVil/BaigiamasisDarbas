package dovydas.finalWork.pages;

import org.openqa.selenium.By;

public class Locators {
    public static class Skytech{
        public static class SearchBar{
            public static By inputGpuName = By.xpath("//input[@class='search-field inactive']");
            public static By clickButtonToSearch = By.xpath("//input[@class='search-button']");
        }
    }
}
