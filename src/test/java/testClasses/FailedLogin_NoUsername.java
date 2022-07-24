package testClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClassess.BaseClass1;
import baseClassess.UtilityClass1;
import pomClasssess.SignIn;

public class FailedLogin_NoUsername {
	UtilityClass1 uti;
	BaseClass1 base;
	FailedLoginPage1_NoPassword login1;
	String tcID;
	Sheet Sh;
	UtilityClass1 util;
	SignIn Sign;

	
	@BeforeClass
	public void LaunchBrowser() throws IOException {
		base = new BaseClass1();
		base.Brows1();
		Sign = new SignIn(base.driver);
		
	}
@BeforeMethod
public void Refresh() {
	base.driver.navigate().refresh();
}

	@Test
	public void WithoutUsername1() throws EncryptedDocumentException, InvalidFormatException, IOException {
		tcID="TC101";
		Sign.Ps(UtilityClass1.readExceelSheet(1,1));
		Sign.LogButton();
		String Actal = Sign.UnText();
		String Expected = "User ID should be minimum 6 characters.";
		Assert.assertEquals(Actal, Expected);
		Reporter.log("Pass",true);

	}
	@Test
	public void WithoutUsername2() throws EncryptedDocumentException, InvalidFormatException, IOException {
		tcID="TC102";
		Sign.Ps(UtilityClass1.readExceelSheet(2,1));
		Sign.LogButton();
		String Actal = Sign.UnText();
		String Expected = "User ID should be minimum 6 characters.";
		Assert.assertEquals(Actal, Expected);
		Reporter.log("Pass",true);

	}
	@Test
	public void WithoutUsername3() throws EncryptedDocumentException, InvalidFormatException, IOException {
		tcID="TC103";
		Sign.Ps(UtilityClass1.readExceelSheet(3,1));
		Sign.LogButton();
		String Actal = Sign.UnText();
		String Expected = "User ID should be minimum 6 characters.";
		Assert.assertEquals(Actal, Expected);
		
		Reporter.log("Pass",true);

	}
	@Test
	public void WithoutUsername4() throws EncryptedDocumentException, InvalidFormatException, IOException {
		tcID="TC104";
		Sign.Ps(UtilityClass1.readExceelSheet(4,1));
		Sign.LogButton();
		String Actal = Sign.UnText();
		String Expected = "User ID should be minimum 6 characters.";
		Assert.assertEquals(Actal, Expected);
		Reporter.log("Pass",true);

	}@Test
	public void WithoutUsername5() throws EncryptedDocumentException, InvalidFormatException, IOException {
		tcID="TC110";
		Sign.Ps(UtilityClass1.readExceelSheet(5,1));
		Sign.LogButton();
		String Actal = Sign.UnText();
		String Expected = "User ID should be minimum 6 characters.";
		Assert.assertEquals(Actal, Expected);
		Assert.fail();
		Reporter.log("Pass",true);

	}@Test
	public void WithoutUsername6() throws EncryptedDocumentException, InvalidFormatException, IOException {
		tcID="TC106";
		Sign.Ps(UtilityClass1.readExceelSheet(6,1));
		Sign.LogButton();
		String Actal = Sign.UnText();
		String Expected = "User ID should be minimum 6 characters.";
		Assert.assertEquals(Actal, Expected);
		Reporter.log("Pass",true);

	}
	
	@AfterMethod
	public void logout(ITestResult res) throws IOException {
			
		if (ITestResult.FAILURE == res.getStatus()) {
			
			UtilityClass1.takeScreenShot1(base.driver, tcID);
			
			
			}
	}
	
@AfterClass
public void browserClose(){
	base.driver.close();
	
}
}
