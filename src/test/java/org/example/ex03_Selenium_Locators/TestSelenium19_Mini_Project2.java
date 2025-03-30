package org.example.ex03_Selenium_Locators;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium19_Mini_Project2 {


    @Owner("Vishal")
    @Severity(SeverityLevel.BLOCKER)
    @TmsLink("https://google.com")
    @Description("Verify that the erorr message comes with invalid email on signup")
    @Test
    public void vwo_free_trail_error_verify(){

        WebDriver driver = new EdgeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://app.vwo.com");
        WebElement a_tag_free_trial_full_match = driver.findElement(By.linkText("Start a free trial"));
        a_tag_free_trial_full_match.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("abc");
        WebElement checkbox_policy =driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox_policy.click();

        List<WebElement> buttonList = driver.findElements(By.tagName("button"));
        buttonList.get(0).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        List<WebElement> error_msg = driver.findElements(By.className("invalid-reason"));
//        Assert.assertTrue(error_msg.isDisplayed());
        Assert.assertEquals(error_msg.get(0).getText(),"The email address you entered is incorrect.");

        driver.quit();



    }
}
