package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductListingPage {
	WebDriver driver;
	
	public ProductListingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.CSS, using = "button.single_add_to_cart_button") 
	private WebElement btn_AddToCart;
	
	@FindAll(@FindBy(how = How.CSS, using = ".noo-product-inner"))
	private List<WebElement> prd_List;	
	
	@FindBy(how=How.ID,using="pa_color")
	private WebElement drpdwn_Color;
	
	@FindAll(@FindBy(how=How.CSS,using="pa_color option"))
	private List<WebElement> color_List;
	
	@FindBy(how=How.ID,using="pa_size")
	private WebElement drpdwn_Size;
	
	@FindAll(@FindBy(how=How.CSS,using="pa_size option"))
	private List<WebElement> size_List;
	
	
	@FindBy(how=How.CSS,using=".input-text.qty.text")
	private WebElement txtbx_Qty;
	
	public void clickOn_AddToCart() {
		btn_AddToCart.click();
	}
	
	
	/*
	 * private void select_Size(String size) { int countSize=0; for(WebElement
	 * size_item: size_List) { if(size_item.getAttribute("value").equals(size)) {
	 * Select s=new Select(drpdwn_Size); s.selectByValue(size.toLowerCase());
	 * countSize++; break; }
	 * 
	 * } if(countSize==0) throw new RuntimeException("size doesn't exist"); }
	 */
	
	public void select_Product(int productNumber,String color,String size,String qty) {
		prd_List.get(productNumber).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select c=new Select(drpdwn_Color);
		c.selectByValue(color.toLowerCase());
		Select s=new Select(drpdwn_Size);
		s.selectByValue(size.toLowerCase());
	//	select_Size(size);
		
		txtbx_Qty.clear();
		txtbx_Qty.sendKeys(qty);
	}

}