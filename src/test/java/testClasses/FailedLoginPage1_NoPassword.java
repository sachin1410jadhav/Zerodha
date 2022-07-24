package testClasses;


import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
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

public class FailedLoginPage1_NoPassword {

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
	
	public void WithoutPassword1() throws EncryptedDocumentException, InvalidFormatException, IOException {
		tcID="TC01";
		Sign.UserN(UtilityClass1.readExceelSheet(1,0));
		//Sign.UserN(util.readExceelSheet(1, 0));
		Sign.LogButton();
		String Actal = Sign.PassText();
		String Expected = "Password should be minimum 6 characters.";
		Assert.assertEquals(Actal, Expected);
		Reporter.log("Pass",true);
	}
	@Test
	public void WithoutPassword2() throws EncryptedDocumentException, InvalidFormatException, IOException {
		tcID="TC02";
		Sign.UserN(UtilityClass1.readExceelSheet(2,0));
		Sign.LogButton();
		String Actal = Sign.PassText();
		String Expected = "Password should be minimum 6 characters.";
		Assert.assertEquals(Actal, Expected);
	
		Reporter.log("Pass",true);

	}
	@Test
	public void WithoutPassword3() throws EncryptedDocumentException, InvalidFormatException, IOException {
		tcID="TC03";
		Sign.UserN(UtilityClass1.readExceelSheet(3,0));
		Sign.LogButton();
		String Actal = Sign.PassText();
		String Expected = "Password should be minimum 6 characters.";
		Assert.assertEquals(Actal, Expected);
		Assert.fail();
		Reporter.log("Pass",true);

	}
	@Test
	public void WithoutPassword4() throws EncryptedDocumentException, InvalidFormatException, IOException {
		tcID="TC04";
		Sign.UserN(UtilityClass1.readExceelSheet(4,0));
		Sign.LogButton();
		String Actal = Sign.PassText();
		String Expected = "Password should be minimum 6 characters.";
		Assert.assertEquals(Actal, Expected);
	
		Reporter.log("Pass",true);

	}@Test
	public void WithoutPassword5() throws EncryptedDocumentException, InvalidFormatException, IOException {
		tcID="TC05";
		Sign.UserN(UtilityClass1.readExceelSheet(5,0));
		Sign.LogButton();
		String Actal = Sign.PassText();
		String Expected = "Password should be minimum 6 characters.";
		Assert.assertEquals(Actal, Expected);
		Reporter.log("Pass",true);

	}@Test
	public void WithoutPassword6() throws EncryptedDocumentException, InvalidFormatException, IOException {
		tcID="TC06";
		Sign.UserN(UtilityClass1.readExceelSheet(6,0));
		Sign.LogButton();
		String Actal = Sign.PassText();
		String Expected = "Password should be minimum 6 characters.";
		Assert.assertEquals(Actal, Expected);
	
		Reporter.log("Pass",true);

	}
	
	
	@AfterMethod
	public void logout(ITestResult res) throws IOException {
			
		if (ITestResult.FAILURE == res.getStatus()) {
			UtilityClass1.takeScreenShot1(base.driver, tcID);;
			
			
			}
	}
	
@AfterClass
public void browserClose(){
	base.driver.close();
	
}
}
