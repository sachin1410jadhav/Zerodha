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

public class Pass_Uer_Pass {
	
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
/*@BeforeMethod
public void Refresh() {
	base.driver.navigate().refresh();
}*/

	
	@Test
	public void UsernamePass() throws EncryptedDocumentException, InvalidFormatException, IOException {
		tcID="TC102";
		//Sign.UserN(UtilityClass1.readExceelSheet(1, 0));
		//Sign.Ps(UtilityClass1.readExceelSheet(1, 1));

		Sign.UserN(UtilityClass1.readfile("un"));
		Sign.Ps(UtilityClass1.readfile("pass"));
		Sign.LogButton();
		
		Reporter.log("Pass",true);

	}
	
	
	@AfterMethod
	public void logout(ITestResult res) throws IOException {
			
		if (ITestResult.FAILURE == res.getStatus()) {
			
			UtilityClass1.takeScreenShot1(base.driver, tcID);
			
			
			}
	}
	
@AfterClass
public void browserClose() throws InterruptedException{
	Thread.sleep(10000);
	base.driver.close();
	
}
}
