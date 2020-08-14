package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginsingledata {
	WebDriver driver;
	@When("^I open url in chrome browser$")
	public void i_open_url_in_chrome_browser() throws Throwable {
	   driver= new ChromeDriver();
	   driver.get("http://orangehrm.qedgetech.com/");
	   driver.manage().window().maximize();
	}

	@When("^i enter  username and  enter  password field$")
	public void i_enter_username_and_enter_password_field() throws Throwable {
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
		driver.findElement(By.name("Submit")).click();
	    
	}

	@Then("^i should verify url$")
	public void i_should_verify_url() throws Throwable {
	  if(driver.getCurrentUrl().contains("dash"))
	  {
		  System.out.println("Login Success");
	  }
	  else
	  {
		  System.out.println("Login fail");
	  }
	}
	@Then("^I close browser$")
	public void i_close_browser() throws Throwable {
	    driver.close();
	}
}
