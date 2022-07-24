package baseClassess;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import configurationClasses.PathConfg;

public class UtilityClass1 {

	public static String readExceelSheet(int row, int col) throws EncryptedDocumentException, IOException {
		FileInputStream f = new FileInputStream(PathConfg.Sheets2);
		Sheet sheet = WorkbookFactory.create(f).getSheet("Sheet3");
		String user = sheet.getRow(row).getCell(col).getStringCellValue();
		System.out.println(user);
		return user;
	}

	public static void takeScreenShot1(WebDriver driver, String tcid) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		String str = d.toString();
		str = str.replace(" ", "_");
		str = str.replace(":", "_");
		File dest = new File(PathConfg.SSpath + tcid + str + ".jpeg");

		FileHandler.copy(src, dest);
	}

	public static String readfile(String key) throws IOException {
		Properties p = new Properties();
		FileInputStream f = new FileInputStream(PathConfg.loginfile);
		p.load(f);
		String value = p.getProperty(key);
		return value;
	}

	public static void Act(WebDriver driver, WebElement Abc) {
		Actions a = new Actions(driver);
		a.moveToElement(Abc).perform();
		a.click().perform();

	}
}
