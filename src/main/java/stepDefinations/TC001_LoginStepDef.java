package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_LoginStepDef {
	WebDriver driver;
	@Given("User is on Home page")
	public void user_is_on_home_page() {
	    System.out.println("User is on Home page");
	    System.setProperty("webdriver.chrome.driver", "G:\\Selenium1\\Sel@10AM(EST)\\WorkSpace1\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
	}
	@When("user clicks on Sign in")
	public void user_clicks_on_sign_in() {
	  System.out.println("Sign in");
	  driver.findElement(By.linkText("Sign in")).click();
	}
	@Then("Login page is dislayed with title Rediffmail")
	public void login_page_is_dislayed_with_title_rediffmail() {
	   System.out.println("Check title");
	   String title=driver.getTitle();
	   Assert.assertEquals(title,"Rediffmail");
	}
	@When("user enters user name password")
	public void user_enters_user_name_password() {
	   System.out.println("Enter User Name and Password");
	   driver.findElement(By.id("login1")).sendKeys("arpana");
	   driver.findElement(By.id("password")).sendKeys("arpana123");
	}
	@When("clicks on Submit")
	public void clicks_on_submit() {
	    System.out.println("Click on Submit button");
	}
	@Then("user gets connected users inbox and display message as Successful")
	public void user_gets_connected_users_inbox_and_display_message_as_successful() {

		System.out.println("Check user...");
	}
	@When("enter invalid user name and valid password")
	public void enter_invalid_user_name_and_valid_password() {
	   System.out.println("Enter invalid user name and valid password");
	}
	
	@Then("Check for error message")
	public void check_for_error_message() {
	   System.out.println("Error message ");
	}
	@When("user enters valid user name and invalid password")
	public void user_enters_valid_user_name_and_invalid_password() {
	   System.out.println("Enter valid user name and invalid password");
	}





	
}
