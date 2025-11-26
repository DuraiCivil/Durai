package StepsPackage;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginFeature {
	
	
	WebDriver driver;
	
	@Given("I am on login page")
	public void i_am_on_login_page() {

		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
		
	}
	@When("I entered the username and password")
	public void i_entered_the_username_and_password() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    
	}
	@When("I clicked the login Button")
	public void i_clicked_the_login_button() {
		
		driver.findElement(By.id("login-button")).click();
	    
	}
	@Then("It should navgate to thr product page")
	public void it_should_navgate_to_thr_product_page() {
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[text()='Products']"));
		
		Assert.assertTrue(elements.size()>0);
		System.out.println("Validate is success......!!!!!!!!!!!!!!");
		
	    
	}
}
