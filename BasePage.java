package pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void waitVisability(By elementBy)
    {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void writeText(By elementBy, String text)
    {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
        driver.findElement(elementBy).clear();
        driver.findElement(elementBy).sendKeys(text);
    }

    public void click(By elementBy)
    {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
        driver.findElement(elementBy).click();
    }
    public String readText(By elemenBy)
    {
        waitVisability(elemenBy);
        return driver.findElement(elemenBy).getText();
    }

    public void assertTextEquals (String expText, String actText)
    {
        Assert.assertEquals(expText, actText);
    }

}

    

