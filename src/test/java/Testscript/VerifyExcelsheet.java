package Testscript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Com.Bank.Configuration.Exceelsheet;
import Com.ResusableComponents.BussinessComponents;
import Orpage.LoginPage;

public class VerifyExcelsheet extends BussinessComponents{
public WebDriver driver;
@Test(dataProvider="readdata",dataProviderClass =Exceelsheet.class)
public void Sheet(String Usernamee,String password) throws IOException {
	Navigatetourl();
    System.out.println(Usernamee + " " + password);
    LoginPage lg = new LoginPage(driver);
    
    // Check if Usernamee and password are not null
    if (Usernamee != null && password != null) {
        lg.send(lg.l1, Usernamee, lg.l2, password);
        lg.click(lg.Login);
    } else {
        // Handle the case where either Usernamee or password is null
        System.out.println("Skipping test due to null credentials.");
        throw new IllegalArgumentException("Usernamee and password should not be null.");
    }
}

	
}

