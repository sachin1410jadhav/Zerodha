package pomClasssess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClassess.UtilityClass1;

public class SellShare {

	// decleration
	
	//Sell Share
	@FindBy(xpath = "//button[@class='button-orange sell']")
	private WebElement SellButton;
	
	//RadiobuttonSellPrice 	
	@FindBy(xpath = "//input[@title='Sell at market price']")
	private WebElement MarketPriceSell;
	
	//RadiobuttonSellPrice dynamic	
	@FindBy(xpath = "/html/body/div[1]/form/section/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/label")
	private WebElement MarketPriceSell1;
	@FindBy(xpath = "/html/body/div[1]/form/section/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/label")
	private WebElement LimitPriceSell1;
	@FindBy(xpath = "/html/body/div[1]/form/section/div/div[2]/div[2]/div[2]/div[3]/div/div[1]/label")
	private WebElement SLPriceSell1;	
	@FindBy(xpath = "/html/body/div[1]/form/section/div/div[2]/div[2]/div[2]/div[3]/div/div[2]/label")
	private WebElement SLMPriceSell1;
	

	// Qty&Submit

	@FindBy(xpath = "//input[@label='Qty.']")
	private WebElement Quantity;
	@FindBy(xpath = "//input[@label='Price']")
	private WebElement Price;
	@FindBy(xpath = "//input[@label='Trigger price']")
	private WebElement TriggerPrice;
	@FindBy(xpath = "//button[@class='submit']")
	private WebElement Submit;

	// initalization
	public SellShare(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

//Usage
	public void Slbutton() {
		SellButton.click();
	}

	public void MPriceSell(WebDriver driver) {
		UtilityClass1.Act(driver, MarketPriceSell);
	}
	public void MPriceSell1() {
		MarketPriceSell1.click();
	}
	public void limitPriceClick() {
		LimitPriceSell1.click();
	}

	public void SLClick() {
		SLPriceSell1.click();
	}
	public void SLMClick() {
		SLMPriceSell1.click();
	}
	public void QtyClear() {
		Quantity.clear();

	}

	public void Qty(String Value) {
		Quantity.sendKeys(Value);
	}
	public void Limitprice(String Key) throws InterruptedException {
		Price.clear();
		Thread.sleep(2500);
		Price.sendKeys(Key);
	}
	
	public void Triggerprice(String Key) throws InterruptedException {
		TriggerPrice.clear();
		TriggerPrice.clear();
		Thread.sleep(3000);
		TriggerPrice.sendKeys(Key);
	}
	public void Sell() {
		Submit.click();
	}

}
