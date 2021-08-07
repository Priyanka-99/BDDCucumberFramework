package runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	public WebDriver driver;
	
	@Given("User must be able to open the browser and enter the url of application")
	public void user_must_be_able_to_open_the_browser_and_enter_the_url_of_application() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);    
	}

	@Given("Click on login button")
	public void click_on_login_button() {
	   driver.findElement(By.xpath("//a[text()='Sign In']")).click();
	}

	@When("Enter the valid username")
	public void enter_the_valid_username() {
	    driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	}

	@When("Enter the valid password")
	public void enter_the_valid_password() {
	   driver.findElement(By.name("password")).sendKeys("abc123");
	}

	@When("Click on submit button")
	public void click_on_submit_button() {
	    driver.findElement(By.xpath("//button[@class='btn btn-color animated fadeInLeft']")).click();
	}

	@When("Print the title and URL of the application")
	public void print_the_title_and_url_of_the_application() {
	    System.out.println("Title: "+driver.getTitle());
	    System.out.println("URL: "+driver.getCurrentUrl());
	}

	@Then("User must be successfully login to the application")
	public void user_must_be_successfully_login_to_the_application() {
	    
	}


}
