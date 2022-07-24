package pomClasssess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SignIn {
	
	
	
	//Declaration
	@FindBy(xpath = "//input[@id='userid']")
	private WebElement username1;
	@FindBy(xpath = "//span[text()='User ID should be minimum 6 characters.']")
	private WebElement usernameText;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	@FindBy(xpath = "//span[text()='Password should be minimum 6 characters.']")
	private WebElement passwordText;
	@FindBy(xpath = "//button[@class='button-orange wide']")
	private WebElement login;
	@FindBy(xpath = "//a[text()='Forgot user ID or password?']")
	private WebElement Forget;

	// initalization
	public  SignIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	// usage
	public void UserN (String UserName) {
		username1.sendKeys(UserName);
	}
	public void Ps (String Password) {
		password.sendKeys(Password);
	}
	public String UnText () {
		String Untext = usernameText.getText();
		return  Untext;
	}
	
	public String PassText () {
		String Pstext = passwordText.getText();
		return  Pstext;
	}
	
	public void LogButton() {
		login.click();
	}
	
	public void ForgotPass_ID() {
		Forget.click();
	}
	public void user() {
		username1.sendKeys("XYZABC");
	}
	
}


