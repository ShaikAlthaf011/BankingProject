package Orpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.ResusableComponents.TechnicalComponents;

public class Deposite extends TechnicalComponents {
	@FindBy(xpath="//a[contains(text(),'Deposit')]")
	public WebElement Deposite;
	
	@FindBy(xpath="//p[@class='heading3']")
	public WebElement Paragrah;
	
	@FindBy(xpath="//input[@name='accountno']")
	public WebElement Account;
	
	@FindBy(xpath="//input[@name='ammount']")
	public WebElement Amount;
	
	@FindBy(xpath="//input[@name='desc']")
	public WebElement Description;
	
	@FindBy(xpath="//input[@value='Submit']")
	public WebElement Submit;
	
	@FindBy(xpath="//span[contains(text(),'Close']")
	public WebElement  close;
	
public Deposite(WebDriver driver) {
	driver=this.driver;
	PageFactory.initElements(driver,this);
	}

public void deposite(WebElement l1) {
	TechnicalComponents.click(l1);
}
public String get_text(WebElement l2,String text) {
	String str=TechnicalComponents.gettext(l2);
	return str;
	
}
public void AccountNumber(WebElement l3,String text1) {
	TechnicalComponents.type(l3, text1);
}
public void Amount_number(WebElement l4,String text2) {
	TechnicalComponents.type(l4, text2);
}
public void description(WebElement l5,String text4) {
	TechnicalComponents.type(l5, text4);
}
public void Submit_amount(WebElement l6) {
	TechnicalComponents.click(l6);
}
public void close_button(WebElement element) {
	TechnicalComponents.click(element);
}
}
