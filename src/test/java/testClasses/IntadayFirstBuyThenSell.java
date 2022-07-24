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
import pomClasssess.BuyShare;
import pomClasssess.BuyShareLimit;
import pomClasssess.HomeToLogout;
import pomClasssess.Intraday;
import pomClasssess.SignIn;
import pomClasssess.Two2FA;

public class IntadayFirstBuyThenSell {
	UtilityClass1 uti;
	BaseClass1 base;
	FailedLoginPage1_NoPassword login1;
	String tcID;
	Sheet Sh;
	UtilityClass1 util;
	SignIn Sign;
	Two2FA two;
	HomeToLogout HTL;
	Intraday Int;

	@BeforeClass
	public void LaunchBrowser() {
		base = new BaseClass1();
		base.Brows1();
		Sign = new SignIn(base.driver);
		two = new Two2FA(base.driver);
		HTL = new HomeToLogout(base.driver);
		Int=new Intraday(base.driver);
		

	}

	@BeforeMethod
	public void loginpage()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {

		Sign.UserN(UtilityClass1.readfile("un"));
		Sign.Ps(UtilityClass1.readfile("pass"));
		Sign.LogButton();
		Thread.sleep(2500);
		two.PIN(UtilityClass1.readfile("pinforlogin"));
		two.ContButton();

		Reporter.log("Pass", true);

	}

	@Test
	public void ShareBuy() throws IOException, InterruptedException {
		Int.Wlist(UtilityClass1.readExceelSheet(1, 3));
		Thread.sleep(2500);
		Int.SCheck();
		Thread.sleep(2500);
		Int.SClick();
		Thread.sleep(2500);
		Int.BButton();
		Thread.sleep(2500);
		Int.IntradayClick1();
		Thread.sleep(2500);
		Int.MPriceBuy();
		Thread.sleep(2500);
		Int.Qty(UtilityClass1.readExceelSheet(1, 4));
		Thread.sleep(2500);
		Int.Buy();
		Thread.sleep(3000);
		Int.SwitchClick1();
		Thread.sleep(1000);
		Int.MPriceSell();
		Thread.sleep(2500);
		Int.Qty(UtilityClass1.readExceelSheet(1, 4));
		Thread.sleep(2500);
		Int.Sell();
		Thread.sleep(3000);

	}

	@AfterMethod
	public void logout(ITestResult res) throws IOException, InterruptedException {

		if (ITestResult.FAILURE == res.getStatus()) {
			UtilityClass1.takeScreenShot1(base.driver, tcID);
		}
		HTL.UNC();
		Thread.sleep(5000);
		HTL.logoutclick();

	}

	@AfterClass
	public void browserClose() throws InterruptedException {

		base.driver.close();
	}
}
