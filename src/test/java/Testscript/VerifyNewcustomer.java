package Testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import Com.ResusableComponents.BussinessComponents;

public class VerifyNewcustomer extends BussinessComponents{
	@Test
	public void VerifyNewcustomer() throws IOException, InterruptedException {
		Navigatetourl();
		SubmitApplication();
		Loginbutton();
		newcustomercare();
		newcustomername();
		gettext();
		checkboxesmale();
		Datapicker();
		pickerdate();
		cityname();
		statename();
		PinNo();
		number_mobile();
		email();
		password();
		SubmitButton();
		Thread.sleep(10000);
		alart();
	}

	
}
