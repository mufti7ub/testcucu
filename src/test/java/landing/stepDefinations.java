package landing;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepDefinations {
	WebDriver driver = new ChromeDriver();
	@Given("User should Accept the popup")
	public void user_should_accept_the_popup() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User should Accept the popup");
	}

	@Given("Close popup")
	public void close_popup() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Close popup");
	}

	@Given("User should be on the login page")
	public void user_should_be_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User should be on the login page");
	
	}

	@When("user enter user name")
	public void user_enter_email_user_name() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("user enter user name");
	}

	@When("user enter password")
	public void user_enter_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user enter user name");
	}

	@When("click on login")
	public void click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("click on login");
	}

	@Then("Success message displayed")
	public void success_message_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Success message displayed");
	}
	
	@Then("User redirected to dashboard")
	public void user_redirected_to_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User redirected to dashboard");
	}
	
	@Then("User redirected to dashboard success")
	public void user_redirected_to_dashboard_success() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User redirected to dashboard success");
	}
	
	@Before()
	public void before() {
	    // Write code here that turns the phrase above into concrete actions
		// Xpath contains - //span[contains(@id,'nav-c')]
		// xpath find by id - //span[@id='nav-cart-count']
	
		driver.get("https://www.amazon.in/");
		System.out.println("browser opened");
		
		System.out.println("website title is: " + driver.getTitle());
		System.out.println("website url is: " + driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
	}
	
	@After()
	public void after() {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
		System.out.println("browser closed");
		
	}
	
	public void clickdropdown(String dropdownmenuname) {
	driver.findElement(By.xpath("//div[@id='"+dropdownmenuname+"']")).click();
	}
}
