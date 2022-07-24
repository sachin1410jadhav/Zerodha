package pomClasssess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Two2FA {
	//Declaration
		@FindBy(xpath = "//input[@id='pin']")
		private WebElement Pin;
		@FindBy(xpath = "//button[text()='Continue ']")
		private WebElement continuebutton;
		@FindBy(xpath = "//a[text()='Forgot 2FA?']")
		private WebElement forget2FA;
		

		// initalization
		public  Two2FA(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}

		// usage
		public void PIN (String pin1) {
			Pin.sendKeys(pin1);
		}

		public void ContButton() {
			continuebutton.click();
		}
		public void Forgot2FA() {
			forget2FA.click();
		}
		
		}

