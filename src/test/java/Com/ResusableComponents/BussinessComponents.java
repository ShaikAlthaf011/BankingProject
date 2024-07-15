package Com.ResusableComponents;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import Com.Bank.Configuration.ExtentFactory;
import Orpage.Deposite;
import Orpage.LoginPage;
import Orpage.NewAccount;
import Orpage.NewCustomer;


public class BussinessComponents extends TechnicalComponents{
public static WebDriver driver;
public LoginPage lp;
public NewCustomer nw;
public NewAccount ac;
public Deposite dp;

public void Navigatetourl() throws IOException {
	TechnicalComponents.verifyUrl(inputfile("url"));
    lp=new LoginPage(driver);
}
public void SubmitApplication() {
	lp=new LoginPage(driver);
	lp.send(lp.l1, "mngr580996", lp.l2, "AhyzamA");
 		
}
public void Loginbutton() {
	lp=new LoginPage(driver);
	lp.Click(lp.Login);
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Verify login page");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void newcustomer() {
	nw=new NewCustomer(driver);
}
public void newcustomercare() {
	nw=new NewCustomer(driver);
	nw.click(nw.new_customer);
	
}
public void newcustomername() {
	nw=new NewCustomer(driver);
	nw.send_customer_name(nw.customer_name,"ShaikAlthaf");
	
}
public void gettext() {
	nw=new NewCustomer(driver);
	String l1=nw.gettext(nw.paragraph);
	String str2="Add New Customer";
	if(l1.equals(str2)) {
		System.out.println("Test case is passed");
	}else {
		System.out.println("Test case is Failed");
	}
	
}
public void checkboxesmale() {
	nw=new NewCustomer(driver);
	nw.clickonmalebox(nw.checkboxmale);
	
}
public void Datapicker() {
	nw=new NewCustomer(driver);
	nw.datebutton(nw.Date,"12-06-2024");
	
	
}
public void pickerdate() {
	nw=new NewCustomer(driver);
	nw.adress_book(nw.Adress, "D.no:6/19,NanadamuriNager,KalyandurgamRoad,Ananatapur");
	
}
public void cityname() {
	nw=new NewCustomer(driver);
	nw.city(nw.City,"Ananatapur");
	
}
public void statename() {
	nw=new NewCustomer(driver);
	nw.State(nw.state,"AndhraPradesh");
	
}
public void PinNo() {
	nw=new NewCustomer(driver);
	nw.pin(nw.pinno,"515001");
	
}
public void number_mobile() {
	nw=new NewCustomer(driver);
	nw.MobileNumber(nw.Mobile_number,"7032618224");
	
}
public void email() {
	nw=new NewCustomer(driver);
	nw.Email_id(nw.email,"altushaik@gmail.com");
	
}
public void password() {
	nw=new NewCustomer(driver);
	nw.Password(nw.password,"shaik@11");

}
public void SubmitButton() {
	nw=new NewCustomer(driver);
	nw.Button_submit(nw.Submit_button);
	
}

public void alart() {
	nw=new NewCustomer(driver);
	nw.handleAlert();
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Verify the Handling");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void New_Account() {
	ac=new NewAccount(driver);
	
}
public void Account_new() {
	ac=new NewAccount(driver);
	ac.Clickonaccount(ac.New_Account);
	
	
}
public void Cistomer_Id() {
	ac=new NewAccount(driver);
	ac.Customer_id(ac.CusId,"2213");

}
public void account_type() {
	ac=new NewAccount(driver);
	ac.TypeAccount(ac.accounttype,"Current");
	
}
public void adddepositeamount() {
	ac=new NewAccount(driver);
	ac.Depositeamount(ac.Deopsite,"5000");
	
}
public void add_button() {
	ac=new NewAccount(driver);
	ac.submitbutton(ac.Submit);
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Verify the Submit Button");
}
public void Handling_alert() {
	ac=new NewAccount(driver);
	ac.handleAlert();
}
public void DEPOSITE() {
	dp=new Deposite(driver);
	dp.deposite(dp.Deposite);
}
public void Paragrpah_text() {
	dp=new Deposite(driver);
	String str1=dp.get_text(dp.Paragrah,"Amount Deposit Form");
    String str2="Amount Deposit Form";
    if(str1.equals(str2)) {
    	System.out.println("Test case is Passed");
    }else {
    	System.out.println("Test case is Failed");
    }
   
	
}
public void Account_No() {
	dp=new Deposite(driver);
	dp.AccountNumber(dp.Account,"0385100210");
	
}
public void Amount() {
	dp=new Deposite(driver);
	dp.AccountNumber(dp.Amount,"5000");
	
}
public void Des() {
	dp=new Deposite(driver);
	dp.description(dp.Description,"Saving");
}
public void Submit_button() {
	dp=new Deposite(driver);
	dp.Submit_amount(dp.Submit);
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Verify the Submit");
	
}
public void handle_adss() {
	dp=new Deposite(driver);
	dp.handle_ads(dp.close);
}

}