package pomClasssess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeToLogout {

	//Declaration
	
	
	@FindBy(xpath = "//span[@class='user-id']")
	private WebElement UNget;
	@FindBy(xpath = "//a[@target='_self']")
	private WebElement Outclick;

	

	// initalization
	public  HomeToLogout(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	// usage
	public void UNC() {
		UNget.click();
		
	}
	public void logoutclick() {
		Outclick.click();
	}
	public String UsernameText() {
		String UserText = UNget.getText();
		return  UserText;
	}
	


}
