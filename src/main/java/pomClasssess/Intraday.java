package pomClasssess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClassess.UtilityClass1;

public class Intraday {

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
	@FindBy(xpath = "//button[@class='button-orange sell']")
	private WebElement SellButton;

	// RadiobuttonBuy

	@FindBy(xpath = "(//label[starts-with(@for,'radio-')])[12]")
	private WebElement MarketPriceBuy;
	@FindBy(xpath = "(//label[starts-with(@for,'radio-')])[13]")
	private WebElement LimitPriceBuy;
	@FindBy(xpath = "(//label[starts-with(@for,'radio-')])[14]")
	private WebElement SLPriceBuy;
	@FindBy(xpath = "(//label[starts-with(@for,'radio-')])[15]")
	private WebElement SLMPriceBuy;

	// RadiobuttonBuyDynamic
	@FindBy(xpath = "(//label[starts-with(@for,'radio-')])[10]")
	private WebElement Intra1;
	@FindBy(xpath = "//label[starts-with(@for,'switch-')]")
	private WebElement Switch1;
	
	// RadiobuttonBuyDynamicAbsolute
	@FindBy(xpath = "/html/body/div[1]/form/section/div/div[2]/div[1]/div/div[1]/label")
	private WebElement Intra;
	@FindBy(xpath = "/html/body/div[1]/form/header/div[1]/div[2]/div/div[2]/span/div/label")
	private WebElement Switch;
	@FindBy(xpath = "/html/body/div[1]/form/section/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/label")
	private WebElement MarketPriceBuy1;
	@FindBy(xpath = "/html/body/div[1]/form/section/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/label")
	private WebElement LimitPriceBuy1;
	@FindBy(xpath = "/html/body/div[1]/form/section/div/div[2]/div[2]/div[2]/div[3]/div/div[1]/label")
	private WebElement SLPriceBuy1;
	@FindBy(xpath = "/html/body/div[1]/form/section/div/div[2]/div[2]/div[2]/div[3]/div/div[2]/label")
	private WebElement SLMPriceBuy1;

	
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
	@FindBy(xpath = "//button[@class='submit']")
	private WebElement Submit;

	// initalization
	public Intraday(WebDriver driver) {
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
	public void SButton() {
		SellButton.click();
	}

	public void MPriceBuy(WebDriver driver) {
		UtilityClass1.Act(driver, MarketPriceBuy);
	}
	
	public void IntradayClick() {
		Intra.click();
		
	}public void IntradayClick1() {
		Intra1.click();
	}
	
	public void SwitchClick() {
		Switch.click();
	}
	public void SwitchClick1() {
		Switch1.click();
	}
	public void MPriceBuy1() {
		MarketPriceBuy1.click();
	}
	public void MPriceBuy() {
		MarketPriceBuy.click();
	}
	
	public void MPriceSell() {
		MarketPriceBuy1.click();
	}


	public void Qty(String Value) throws InterruptedException {
		Quantity.clear();
		Thread.sleep(2000);
		Quantity.sendKeys(Value);
	}

	public void Buy() {
		Submit.click();
	}
	public void Sell() {
		Submit.click();
	}

}
