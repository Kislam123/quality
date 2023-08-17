package POMLucky7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestbuysearchPOM {
	
	WebDriver driver;
	
	
public BestbuysearchPOM(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(id="gh-search-input")
	WebElement Type_Bestbuysearch;
	public WebElement Bestbuysearch() {
		
		return Type_Bestbuysearch;
	}
	@FindBy(id="nav-search-submit-button")
	WebElement Click_searchicon;
	
	public WebElement Searchicon() {
		return Click_searchicon;


}
}