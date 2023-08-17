package StepdefLucky7;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMLucky7.WalmartsearchPOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Walmartsearch {
	
	WebDriver driver;



	@Given("^user visits Walmart homepage$")
public void user_visits_Walmart_homepage() throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win32\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("www.walmart.com");
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
    
}

	@When("^user type \"([^\"]*)\" and click searchicon$")
public void user_type_and_click_searchicon(String arg1) throws Throwable {
	WalmartsearchPOM serch = new WalmartsearchPOM(driver);
	serch.Type_walmartsearch().sendKeys(arg1);
	Thread.sleep(3000);
	

}

@Then("^user should be able to see the expected product$")
public void user_should_be_able_to_see_the_expected_product() throws Throwable {
  
}
}
