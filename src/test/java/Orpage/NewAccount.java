package Orpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.ResusableComponents.BussinessComponents;
import Com.ResusableComponents.TechnicalComponents;

public class NewAccount extends TechnicalComponents{
  @FindBy(xpath="//a[contains(text(),'New Account')]")
  public WebElement New_Account;
  
  @FindBy(xpath="//input[@name='cusid']")
  public WebElement CusId;
  
  @FindBy(xpath="//select[@name='selaccount']")
  public WebElement accounttype;
  
  @FindBy(xpath="//input[@name='inideposit']")
  public WebElement Deopsite;
  
  @FindBy(xpath="//input[@type='submit']")
  public WebElement Submit;
  
	public NewAccount(WebDriver driver) {
		driver=this.driver;
		PageFactory.initElements(driver,this);
	}
    public void Clickonaccount(WebElement newaccount) {
    	TechnicalComponents.click(newaccount);
    }
    public void Customer_id(WebElement Cusid,String str1) {
    	TechnicalComponents.type(Cusid,str1);
    }
    public void TypeAccount(WebElement Account,String text) {
    	TechnicalComponents.Selected(Account, text);
    }
    public void Depositeamount(WebElement deposite,String text1) {
    	TechnicalComponents.type(deposite,text1);
    }
    public void submitbutton(WebElement Submit_button) {
    	TechnicalComponents.click(Submit_button);
    }
}
