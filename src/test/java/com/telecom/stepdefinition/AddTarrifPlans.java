package com.telecom.stepdefinition;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class AddTarrifPlans {
    static WebDriver driver;
	@Given("user launch the telecom Application")
	public void user_launch_the_telecom_Application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/telecom/");
		driver.manage().window().maximize();
	   
	}

	@Given("click the Add Tariff button")
	public void click_the_Add_Tariff_button() {
	   driver.findElement(By.xpath("//*[text()='Add Tariff Plan']")).click();
	}

	@When("user fil up the Tariff details{string},{string},{string},{string},{string},{string},{string}")
	public void user_fil_up_the_Tariff_details(String mr, String flm, String fim, String fsp, String lpmc, String ipmc, String spc) {
		
	  driver.findElement(By.id("rental1")).sendKeys(mr); 
	  driver.findElement(By.id("local_minutes")).sendKeys(flm); 
	  driver.findElement(By.id("inter_minutes")).sendKeys(fim); 
	  driver.findElement(By.id("sms_pack")).sendKeys(fsp); 
	  driver.findElement(By.id("minutes_charges")).sendKeys(lpmc); 
	  driver.findElement(By.id("inter_charges")).sendKeys(ipmc); 
	  driver.findElement(By.id("sms_charges")).sendKeys(spc); 
	  
	}

	@When("user clik the submit button")
	public void user_clik_the_submit_button() {
	    driver.findElement(By.name("submit")).click();
	}

	@Then("user verifies the Congratulation message")
	public void user_verifies_the_Congratulation_message() {
	   WebElement tt = driver.findElement(By.xpath("//*[contains(text(),'Congratulation')]"));
	   String text = tt.getText();
	   Assert.assertEquals("Congratulation you add Tariff Plan", text);
	}


}
