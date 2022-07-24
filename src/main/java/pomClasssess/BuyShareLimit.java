package pomClasssess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClassess.UtilityClass1;

public class BuyShareLimit {

	// Declaration


	// RadiobuttonBuy

	@FindBy(xpath = "//input[@title='Buy at market price']")
	private WebElement MarketPriceBuy;
	@FindBy(xpath = "//input[@title='Buy at a preferred price']")
	private WebElement LimitPriceBuy;
	@FindBy(xpath = "//input[@title='Buy at a preferred price with a stoploss']")
	private WebElement SLPriceBuy;
	@FindBy(xpath = "//input[@title='Buy at market price with stoploss']")
	private WebElement SLMPriceBuy;

	// RadiobuttonBuyDynamic

	@FindBy(xpath = "/html/body/div[1]/form/section/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/label")
	private WebElement MarketPriceBuy1;
	@FindBy(xpath = "/html/body/div[1]/form/section/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/label")
	private WebElement LimitPriceBuy1;
	@FindBy(xpath = "/html/body/div[1]/form/section/div/div[2]/div[2]/div[2]/div[3]/div/div[1]/label")
	private WebElement SLPriceBuy1;
	@FindBy(xpath = "/html/body/div[1]/form/section/div/div[2]/div[2]/div[2]/div[3]/div/div[2]/label")
	private WebElement SLMPriceBuy1;

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
	public BuyShareLimit(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	// usage
	public void LPClick() {
		LimitPriceBuy1.click();
	}
	public void SLClick() {
		SLPriceBuy1.click();
	}
	public void SLMClick() {
		SLMPriceBuy1.click();
	}

	public void Qty(String Key) throws InterruptedException {
		Quantity.clear();
		Thread.sleep(2500);
		Quantity.sendKeys(Key);
		}
	
	public void Limitprice(String Key) throws InterruptedException {
		Price.clear();
		Thread.sleep(2500);
		Price.sendKeys(Key);
	}
	
	public void Triggerprice(String Key) throws InterruptedException {
		TriggerPrice.clear();
		TriggerPrice.clear();
		Thread.sleep(2500);
		TriggerPrice.sendKeys(Key);
	}
	
	
  public void Buy() {
	  Submit.click();
  }
}
