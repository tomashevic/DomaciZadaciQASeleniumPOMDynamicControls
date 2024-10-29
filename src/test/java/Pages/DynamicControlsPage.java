package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicControlsPage extends BaseTest {

    WebDriver driver;

    WebElement checkBox;

    WebElement removeButton;

    WebElement addButton;

    WebElement message;

    WebElement textField;

    WebElement DisableButton;

    WebElement enableButton;


    public DynamicControlsPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement getCheckBox() {
        return driver.findElement(By.cssSelector("input[type='checkbox']"));
    }

    public WebElement getRemoveButton() {
        return driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']"));
    }

    public WebElement getAddButton() {
        return driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']"));
    }

    public WebElement getMessage() {
        return driver.findElement(By.id("message"));
    }

    public WebElement getTextField() {
        return driver.findElement(By.cssSelector("input[type='text']"));
    }

    public WebElement getDisableButton() {
        return driver.findElement(By.cssSelector("button[onclick='swapInput()']"));
    }

    public WebElement getEnableButton() {
        return driver.findElement(By.cssSelector("button[onclick='swapInput()']"));
    }

    public void clickOnCheckBox() {
        getCheckBox().click();

    }

    public void clickOnRemoveButton() {
        getRemoveButton().click();
    }

    public void clickOnAddButton() {
        getAddButton().click();
    }

    public void clickOnEnableButton() {
        getEnableButton().click();
    }

    public void clickOnDisableButton() {
        getDisableButton().click();
    }

    public void inputTextField(String input) {
        getTextField().clear();
        getTextField().sendKeys(input);
    }
}
