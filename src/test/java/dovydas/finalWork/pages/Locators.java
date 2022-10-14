package dovydas.finalWork.pages;

import org.openqa.selenium.By;

public class Locators {
    public static class Skytech {
        public static class SearchBar {
            public static By inputGpuName = By.xpath("//input[@class='search-field inactive']");
            public static By clickButtonToSearch = By.xpath("//input[@class='search-button']");
            public static By linkRtx4090 =
                    By.xpath("//table[@class='productListing']//*[contains(text(),'RTX 4090')]");
        }

        public static class Home {
            public static By moveCursorOverMainMenuButton =
                    By.xpath("(//*[@class='main-nav'])[1]");
            public static By clickOnGpuButton =
                    By.xpath("//*[@id='navbar']//*[contains(text(),'Vaizdo plokštės')]");
            public static By readElementText = By.xpath("//h1[contains(text(),'Vaizdo plokštės')]");
        }
        public static class Login{
            public static By clickOnPrisijunkite = By.xpath("//*[@class='link-login']");
            public static By enterEmailAddress = By.xpath("//input[@name='email_address']");
        }

    }
}
