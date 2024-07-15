package Orpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.ResusableComponents.TechnicalComponents;

public class LoginPage extends TechnicalComponents{
	
	public LoginPage(WebDriver driver2) {
		driver2=this.driver;
		PageFactory.initElements(driver2,this);
	}
	@FindBy(xpath="//input[@name='uid']")
	public WebElement l1;
    @FindBy(xpath="//input[@name='password']")
    public WebElement l2;
    @FindBy(xpath="//input[@value='LOGIN']")
    public WebElement Login;
	
public void send(WebElement username,String str1,WebElement password,String str2) {
	TechnicalComponents.type(username,str1);
	TechnicalComponents.type(password, str2);
}
public void Click(WebElement element) {
	TechnicalComponents.click(element);
}

}
