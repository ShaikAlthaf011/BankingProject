package Testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import Com.ResusableComponents.BussinessComponents;

public class VerifyNewAccount extends BussinessComponents {
@Test
public void VerifyNewAccount () throws IOException, InterruptedException {
	Navigatetourl();
	SubmitApplication();
	Loginbutton();
	Account_new();
	Cistomer_Id();
	account_type();
	adddepositeamount();
	add_button();
	Thread.sleep(1000);
	Handling_alert();
}
}
