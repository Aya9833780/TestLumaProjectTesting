package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FindProduct {
    private WebDriver driver;
    private WebDriverWait wait;
    private By clickFilter1 = By.cssSelector("#ui-id-4");
    

    public FindProduct(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    public void ClickLFilter(){
        driver.findElement(clickFilter1).click();
    }



}
