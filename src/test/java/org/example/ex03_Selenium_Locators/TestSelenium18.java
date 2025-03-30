package org.example.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium18 {
    @Description ("Verify VWO")
    @Test
    public void test_login_vwo(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("---Start maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");
//<a href="https://vwo.com/free-trial/?utm_medium=website&utm_source=login-page&utm_campaign=mof_eg_loginpage"
//        class="text-link" data-qa="bericafeqo">
//            Start a free trial</a>
//        <button type="button"
//        class="btn btn--link btn--primary Td(u)"
//    onclick="login.goToSSOView()"
//    data-qa="dobevozose">Sign in using SSO</button>flex

        WebElement a_tag_free_trial_full_match = driver.findElement(By.linkText("Start a free trial"));
        a_tag_free_trial_full_match.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
