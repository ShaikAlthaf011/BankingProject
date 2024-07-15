package Orpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.ResusableComponents.TechnicalComponents;

public class NewCustomer extends TechnicalComponents {
   @FindBy(xpath="//a[contains(text(),'New Customer')]")
   public WebElement new_customer;
   
   @FindBy(xpath="//input[@name='name']")
   public WebElement customer_name;
   
   @FindBy(xpath="//p[@class='heading3']")
   public WebElement paragraph;
   
   @FindBy(xpath="//input[@name='rad1'][1]")
   public WebElement checkboxmale;
   
   @FindBy(xpath="//input[@type='date']")
   public WebElement Date;
   
   @FindBy(xpath="//textarea")
   public WebElement Adress;
   
   @FindBy(xpath="//input[@name='city']")
   public WebElement City;
   
   @FindBy(xpath="//input[@name='state']")
   public WebElement state;
   
   @FindBy(xpath="//input[@name='pinno']")
   public WebElement pinno;
   
   @FindBy(xpath="//input[@name='telephoneno']")
   public WebElement Mobile_number;
   
   @FindBy(xpath="//input[@name='emailid']")
   public WebElement email;
   
   @FindBy(xpath="//input[@name='password']")
   public WebElement password;
   
   @FindBy(xpath="//input[@type='submit']")
   public WebElement Submit_button;
   
	public NewCustomer(WebDriver driver) {
		driver=this.driver;
		PageFactory.initElements(driver,this);
	}
public void Click_on_customer(WebElement element) {
	TechnicalComponents.click(new_customer);
}
public void send_customer_name(WebElement name,String customername) {
	TechnicalComponents.type(name, customername);
}
public String paragraph(WebElement paragrap) {
	String str1=TechnicalComponents.gettext(paragrap);
	return str1;
}
public void clickonmalebox(WebElement male) {
	TechnicalComponents.click(male);
}
public void datebutton(WebElement DateButton,String text2) {
	TechnicalComponents.type(DateButton,text2);
}
public void adress_book(WebElement filladress,String text3) {
	TechnicalComponents.type(filladress,text3);
}
public void city(WebElement cityname,String text4) {
	TechnicalComponents.type(cityname, text4);
}
public void State(WebElement state,String text5) {
	TechnicalComponents.type(state, text5);
}
public void pin(WebElement pinnumber,String text6) {
	TechnicalComponents.type(pinnumber, text6);
}
public void MobileNumber(WebElement number,String text7) {
	TechnicalComponents.type(number, text7);
}
public void Email_id(WebElement email,String text8) {
	TechnicalComponents.type(email, text8);
}
public void Password(WebElement password,String text9) {
	TechnicalComponents.type(password, text9);
}
public void Button_submit(WebElement Submit) {
	TechnicalComponents.click(Submit);
}

}
