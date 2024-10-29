package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomepagePage extends BaseTest {

    WebDriver driver;

    WebElement dynamicControlsPageLink;

    public HomepagePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getDynamicControlsPageLink() {
        return driver.findElement(By.linkText("Dynamic Controls"));
    }

    public void clickOnDynamicControlsPageLink() {
        getDynamicControlsPageLink().click();
    }
}
