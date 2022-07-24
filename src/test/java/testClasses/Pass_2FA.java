package testClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClassess.BaseClass1;
import baseClassess.UtilityClass1;
import pomClasssess.HomeToLogout;
import pomClasssess.SignIn;
import pomClasssess.Two2FA;

public class Pass_2FA {
	UtilityClass1 uti;
	BaseClass1 base;
	FailedLoginPage1_NoPassword login1;
	String tcID;
	Sheet Sh;
	UtilityClass1 util;
	SignIn Sign;
	Two2FA two;
	HomeToLogout HTL;
	
	@BeforeClass
	public void LaunchBrowser() throws IOException {
		base = new BaseClass1();
		base.Brows1();
		Sign = new SignIn(base.driver);
		two = new Two2FA(base.driver);
		HTL= new HomeToLogout(base.driver);
	}
	
	


	
	@BeforeMethod
	public void loginpage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		
		
		Sign.UserN(UtilityClass1.readfile("un"));
		Sign.Ps(UtilityClass1.readfile("pass"));
		Sign.LogButton();
		
		Reporter.log("Pass",true);

	}
	
	@Test
	public void Two_Factor_Autho1() throws IOException, InterruptedException {
		tcID="TC501";
		Thread.sleep(2500);
		two.PIN(UtilityClass1.readfile("pinforlogin"));
		
		two.ContButton();
	}
	
	@Test
	public void Two_Factor_Autho2() throws IOException, InterruptedException {
		tcID="TC601";
		Thread.sleep(2500);
		two.PIN(UtilityClass1.readfile("pinforlogin1"));
		
		two.ContButton();
	}
//WrongPin
	@AfterMethod
	public void logout(ITestResult res) throws IOException, InterruptedException {
	
		if (ITestResult.FAILURE == res.getStatus()) {
			UtilityClass1.takeScreenShot1(base.driver, tcID);
			}
		Thread.sleep(2000);
		HTL.UNC();
		HTL.logoutclick();
	}
	
@AfterClass
public void browserClose() throws InterruptedException{
	Thread.sleep(10000);
	base.driver.close();
	
}
}


