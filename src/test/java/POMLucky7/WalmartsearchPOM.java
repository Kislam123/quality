package POMLucky7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WalmartsearchPOM {
	
	WebDriver driver;


public WalmartsearchPOM(WebDriver driver) {
	
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy(name="q")
WebElement Type_Walmartsearch;
public WebElement Type_walmartsearch() {
	
	return Type_Walmartsearch;
}


}
