package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginMultiple {
	WebDriver driver;
	String url="http://orangehrm.qedgetech.com/";
	@When("^Launch Url in \"([^\"]*)\"$")
	public void launch_Url_in(String brw) throws Throwable {
		if(brw.equalsIgnoreCase("chrome"))
		{
			System.out.println("Executing on chrome browser");
			driver= new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}
		else if(brw.equalsIgnoreCase("firefox"))
		{
			System.out.println("Executing on firefox browser");
			driver= new FirefoxDriver();
			driver.get(url);
		}
		else
		{
		System.out.println("browser is not matching");	
		}
	   
	}

	@When("^Enter \"([^\"]*)\" in username field$")
	public void enter_in_username_field(String username) throws Throwable {
	   driver.findElement(By.name("txtUsername")).sendKeys(username); 
	}

	@When("^Enter \"([^\"]*)\" in password field$")
	public void enter_in_password_field(String password) throws Throwable {
		   driver.findElement(By.name("txtPassword")).sendKeys(password); 
	}

	@When("^Click on Login Button$")
	public void click_on_Login_Button() throws Throwable {
		   driver.findElement(By.name("Submit")).click();
		   Thread.sleep(4000);
	}

	@Then("^Verify url Contains dashboard$")
	public void verify_url_Contains_dashboard() throws Throwable {
		 if(driver.getCurrentUrl().contains("dash"))
		  {
			  System.out.println("Login Success");
		  }
		  else
		  {
			  System.out.println("Login fail");
		  } 
	}

	@Then("^Close browser$")
	public void close_browser() throws Throwable {
		driver.close();
	   
	}

}
