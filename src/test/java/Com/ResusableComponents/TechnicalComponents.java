package Com.ResusableComponents;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.TakesScreenshot;
import com.google.common.io.Files;

import Com.Bank.Configuration.ConfigurationBrowser;

public class TechnicalComponents extends ConfigurationBrowser{
	
   public static void verifyUrl(String url) {
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
}
   
   public static void type(WebElement element,String text) {
	   element.sendKeys(text);
   }
   
   public static void click(WebElement element) {
	   element.click();
   }
   
   public static String gettext(WebElement element) {
	String text=element.getText();
	return text;
	   }
   
   public static void handleAlert() {
	   try {
		   Alert ac=driver.switchTo().alert();
		   ac.accept();
	   }catch(NoAlertPresentException e) {
		   e.printStackTrace();
	   }
   }
   public static void Selected(WebElement element,String text) {
	   Select sc=new Select(element);
	   sc.selectByVisibleText(text);
   }
   public static String takescreenshot() {
		String filepath="";
		try {
			ts=(TakesScreenshot) driver;
			File f=ts.getScreenshotAs(OutputType.FILE);
			Date d= new Date();
			String screenshotName=(d.getDate() < 10 ? "0" + d.getDate() : d.getDate()) + " " + 
		            (d.getMonth() + 1 < 10 ? "0" + (d.getMonth() + 1) : (d.getMonth() + 1)) + "_" + 
		            (1900 + d.getYear()) + "_" + 
		            (d.getHours() < 10 ? "0" + d.getHours() : d.getHours()) + "_" + 
		            (d.getSeconds() < 10 ? "0" + d.getSeconds() : d.getSeconds());
			filepath=System.getProperty("user.dir")+"/reports/screenshot/"+screenshotName+".jpg";
		    Files.copy(f,  new File(filepath));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filepath;
	}
   public void handle_ads(WebElement element) {
	 if(element.isDisplayed()) {
		 element.click();
	 }
   }
}
