package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class AddCustomersStep {
    static WebDriver driver;
	@Given("user launches telecom application")
	public void user_launches_telecom_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/telecom/");
		driver.manage().window().maximize();
	}

	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() {
		driver.findElement(By.xpath("(//*[text()='Add Customer'])[1]")).click();
	    
	}

	@When("user need to fill up the fields")
	public void user_need_to_fill_up_the_fields() {
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys("suriya");
		driver.findElement(By.id("lname")).sendKeys("kumar");
		driver.findElement(By.id("email")).sendKeys("suriya@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("nill");
		driver.findElement(By.id("telephoneno")).sendKeys("1234567890");
	   
	}

	@When("user need to fill up the field using OneDim List")
	public void user_nees_d_to_fill_up_the_field_using_OneDim_List(DataTable dataTable) {
		List<String> data = dataTable.asList(String.class);
		
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(data.get(0));
		driver.findElement(By.id("lname")).sendKeys(data.get(1));
		driver.findElement(By.id("email")).sendKeys(data.get(2));
		driver.findElement(By.name("addr")).sendKeys(data.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(data.get(4));  
	   
	}
	
	@When("user need to fill up the field using OneDim mmap")
	public void user_nees_d_to_fill_up_the_field_using_OneDim_map(DataTable dataTable) {
		
		Map<String, String> data = dataTable.asMap(String.class, String.class);
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(data.get("Fname"));
		driver.findElement(By.id("lname")).sendKeys(data.get("Lname"));
		driver.findElement(By.id("email")).sendKeys(data.get("Email"));
		driver.findElement(By.name("addr")).sendKeys(data.get("Addr"));
		driver.findElement(By.id("telephoneno")).sendKeys(data.get("Phno"));  
	}
	
	@When("user need to fill up the field using TwoDim List")
	public void user_nees_d_to_fill_up_the_field_using_TwoDim_List(DataTable dataTable) {
		
		List<List<String>> data = dataTable.asLists(String.class);
		
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(data.get(0).get(1));
		driver.findElement(By.id("lname")).sendKeys(data.get(1).get(2));
		driver.findElement(By.id("email")).sendKeys(data.get(2).get(2));
		driver.findElement(By.name("addr")).sendKeys(data.get(3).get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(data.get(2).get(4));  
	   
	}
	
	@When("user need to fill up the field using TwoDim Map")
	public void user_nees_d_to_fill_up_the_field_using_TwoDim_Map(DataTable dataTable) {
		
		List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
		
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(data.get(0).get("Fname"));
		driver.findElement(By.id("lname")).sendKeys(data.get(1).get("Lname"));
		driver.findElement(By.id("email")).sendKeys(data.get(2).get("Mail"));
		driver.findElement(By.name("addr")).sendKeys(data.get(3).get("Address"));
		driver.findElement(By.id("telephoneno")).sendKeys(data.get(2).get("Phno"));  
	   
	}
	
	
	@When("user click on the submit button")
	public void user_click_on_the_submit_button() {
		driver.findElement(By.name("submit")).click();
	}
	
	
	@When("user click on submit button")
	public void user_click_on_submit_button() {
		driver.findElement(By.name("submit")).click();
	    
	}

	@Then("user verify customer id is generated")
	public void user_verify_customer_id_is_generated() {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
		
	    
	}


}
