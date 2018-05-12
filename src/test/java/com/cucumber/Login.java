package com.cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	WebDriver driver = new FirefoxDriver();
	
@Given("^I Open ERS application$")
public void i_Open_ERS_application() throws Throwable {
		System.out.println("Write --- Your selenium code here");
		driver.get("http://borkotmicrotechna.com/ers/Login.html");
	}

@When("^I enter valid credential$")
public void i_enter_valid_credential() throws Throwable {	
	driver.findElement(By.name("UserName")).sendKeys("Borkot");
	driver.findElement(By.name("Password")).sendKeys("abc123");	
	System.out.println(" -- selenium code");    
}

@And("^click on the Sign button$")
public void click_on_the_Sign_button() throws Throwable {
	System.out.println(" AND -- selenium code");	
	driver.findElement(By.name("Login")).submit();
	//driver.findElement(By.name("Login")).click();
}

@Then("^I should able to verify the ERS registration page\\.$")
public void i_should_able_to_verify_the_ERS_registration_page() throws Throwable {
	String x = driver.getTitle();
	Assert.assertEquals("ERS", x); 
	//Assert.assertArrayEquals(expecteds, actuals);	
	System.out.println("Assertion - step");
}


}
