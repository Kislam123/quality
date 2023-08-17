package StepdefLucky7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMLucky7.BestbuysearchPOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Bestbuysearch {
	WebDriver driver;
	


@Given("^user visit Bestbuy homepage$")
public void user_visit_Bestbuy_homepage() throws Throwable {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver.exe");	
	    driver=new ChromeDriver();
	    
	    driver.get("https://www.bestbuy.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	}
   


@When("^user types \"([^\"]*)\" and click search icon$")
public void user_types_and_click_search_icon(String arg1) throws Throwable {
	
	 BestbuysearchPOM ser  = new BestbuysearchPOM(driver);
	ser.Bestbuysearch().sendKeys();

}

@Then("^user should be able to visit the expected product$")
public void user_should_be_able_to_visit_the_expected_product() throws Throwable {
    
}



}
