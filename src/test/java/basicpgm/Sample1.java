package basicpgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseClassess.BaseClass1;
import baseClassess.UtilityClass1;
import configurationClasses.PathConfg;
import pomClasssess.SignIn;

public class Sample1 {

	
	BaseClass1 base = new BaseClass1();
	UtilityClass1 uti;
	String tcID;
	SignIn sign = new SignIn(base.driver);
	
	@BeforeClass
	public void LaunchBrowser() {
		base.Brows1();
		}
	
	@Test
	public void A() {
	
	
	}
}
