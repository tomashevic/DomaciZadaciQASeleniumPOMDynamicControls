package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicControlsTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }

    @Test
    public void userCanEnableAndDisableInputTextField() {
        String homePageUrl = driver.getCurrentUrl();
        homepagePage.clickOnDynamicControlsPageLink();
        Assert.assertNotEquals(driver.getCurrentUrl(), homePageUrl);
        dynamicControlsPage.clickOnEnableButton();
        Assert.assertTrue(dynamicControlsPage.getMessage().isDisplayed());
        dynamicControlsPage.inputTextField("Sample text");
        System.out.println(dynamicControlsPage.getMessage().getText());
        dynamicControlsPage.clickOnDisableButton();
        Assert.assertTrue(dynamicControlsPage.getMessage().isDisplayed());
        System.out.println(dynamicControlsPage.getMessage().getText());

    }

    @Test
    public void userCanRemoveAndAddCheckbox() {
        String homePageUrl = driver.getCurrentUrl();
        homepagePage.clickOnDynamicControlsPageLink();
        Assert.assertNotEquals(driver.getCurrentUrl(), homePageUrl);
        dynamicControlsPage.clickOnCheckBox();
        dynamicControlsPage.clickOnRemoveButton();
        Assert.assertTrue(dynamicControlsPage.getMessage().isDisplayed());

        boolean isPresent = false;

        try {
            isPresent = driver.findElement(By.cssSelector("input[type='checkbox']")).isDisplayed();
        } catch (Exception e) {

        }

        Assert.assertFalse(isPresent);

        System.out.println(dynamicControlsPage.getMessage().getText());
        dynamicControlsPage.clickOnAddButton();
        Assert.assertTrue(dynamicControlsPage.getMessage().isDisplayed());
        dynamicControlsPage.clickOnCheckBox();
        System.out.println(dynamicControlsPage.getMessage().getText());

    }

    @Test
    public void userCanRemoveCheckboxAndEnableInputTextField() {
        String homePageUrl = driver.getCurrentUrl();
        homepagePage.clickOnDynamicControlsPageLink();
        Assert.assertNotEquals(driver.getCurrentUrl(), homePageUrl);
        dynamicControlsPage.clickOnCheckBox();
        dynamicControlsPage.clickOnRemoveButton();
        Assert.assertTrue(dynamicControlsPage.getMessage().isDisplayed());

        boolean isPresent = false;

        try {
            isPresent = driver.findElement(By.cssSelector("input[type='checkbox']")).isDisplayed();
        } catch (Exception e) {

        }

        Assert.assertFalse(isPresent);
        System.out.println(dynamicControlsPage.getMessage().getText());
        dynamicControlsPage.clickOnEnableButton();
        Assert.assertTrue(dynamicControlsPage.getMessage().isDisplayed());
        dynamicControlsPage.inputTextField("Sample text");
        System.out.println(dynamicControlsPage.getMessage().getText());

    }

}
