package Testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import Com.ResusableComponents.BussinessComponents;

public class VerifyDeposite extends BussinessComponents{
@Test
public void VerifyDeposite() throws IOException {
	Navigatetourl();
	SubmitApplication();
	Loginbutton();
	DEPOSITE();
	Paragrpah_text();
	Account_No();
	Amount();
	Des();
	Submit_button();
	alart();
}
}
