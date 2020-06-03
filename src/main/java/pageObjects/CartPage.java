package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.CSS, using = ".cart-button") 
	private WebElement btn_Cart;
	
	@FindBy(how = How.CSS, using = ".checkout-button.button.alt.wc-forward") 
	private WebElement btn_ContinueToCheckout;
	
	
	
	public void clickOn_Cart() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(btn_Cart));
		btn_Cart.click();
	}
	
	public void clickOn_ContinueToCheckout(){
		WebDriverWait w= new WebDriverWait(driver,5);
		w.until(ExpectedConditions.elementToBeClickable(btn_ContinueToCheckout));
		
		btn_ContinueToCheckout.click();
		try { Thread.sleep(5000);}
		catch (InterruptedException e) {}
	}
	
}