package baseClassess;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import configurationClasses.PathConfg;

public class BaseClass1 {

	public WebDriver driver;

	public void Brows1() {
		System.setProperty("webdriver.chrome.driver", PathConfg.driver12);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(PathConfg.Weburl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
	}

}
