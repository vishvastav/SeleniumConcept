package org.example.ex04_Selenium_XPATH;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium21_MiniProject_3 {


    @Description("Verify with valid email, pass, appointment page isloaded")
    @Test
    public void test_katalon_login() throws Exception{

        WebDriver driver = new EdgeDriver();

        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement make_appointment_button = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        make_appointment_button.click();
//        WebElement username_input_box_id = driver.findElement(By.xpath("//input[@name='username']"));
//                //<input type="text" class="form-control" id="txt-username" name="username" placeholder="Username" value autocomplete="off">
//
//        WebElement password_input_box_id = driver.findElement(By.xpath("//input[@name='password']"));


        List<WebElement> username_input_box_xpath_placeholder = driver.findElements(By.xpath("//input[@placeholder='Username']"));
        username_input_box_xpath_placeholder.get(1).sendKeys("John Doe");


        WebElement password_input_box_id = driver.findElement(By.xpath("//input[@name='password']"));
        password_input_box_id.sendKeys("ThisIsNotAPassword");

        WebElement login_button = driver.findElement(By.xpath("//button[@id='btn-login']"));
        login_button.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");


        driver.quit();
    }
}
