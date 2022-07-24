package pomClasssess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClassess.UtilityClass1;

public class BuyShare {

	// Declaration

	// Search Share
	@FindBy(xpath = "//input[@icon='search']")
	private WebElement Watclist;
	@FindBy(xpath = "(//span[@class='symbol'])[1]")
	private WebElement ShareCheck;
	@FindBy(xpath = "(//span[@class='nice-name'])[1]")
	private WebElement ShareClick;
	@FindBy(xpath = "(//span[@class='nice-name'])[2]")
	private WebElement ShareClick1;

	// Buy button
	@FindBy(xpath = "//button[@class='button-blue buy']")
	private WebElement BuyButton;

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

	//@FindBy(xpath = "/html/body/div[1]/form/section/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/label")
	//private WebElement MarketPriceBuy1;
	@FindBy(xpath = "(//label[starts-with(@for,'radio-')])[12]")
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
	@FindBy(xpath = "//button[@class='submit']")
	private WebElement Submit;

	
	
	
	// initalization
	
	
	
	public BuyShare(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	
	
	
	
	// usage
	
	
	
	
	public void Wlist(String Share) {
		Watclist.sendKeys(Share);
	}

	public void SCheck() {
		ShareCheck.click();
	}

	public void SClick() {
		ShareClick.click();
	}
	
	public void SClick1() {
		ShareClick1.click();
	}

	public void BButton() {
		BuyButton.click();
	}

	public void MPriceBuy(WebDriver driver) {
		UtilityClass1.Act(driver, MarketPriceBuy);
	}

	public void MPriceBuy1() {
		MarketPriceBuy1.click();
	}

	public void QtyClear() {
		Quantity.clear();

	}

	public void Qty(String Value) {
		Quantity.sendKeys(Value);
	}

	public void Buy() {
		Submit.click();
	}

}
