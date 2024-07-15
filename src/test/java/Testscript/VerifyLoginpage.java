package Testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import Com.ResusableComponents.BussinessComponents;

public class VerifyLoginpage extends BussinessComponents{
@Test
public void Navigateurl() throws IOException {
	Navigatetourl();
	SubmitApplication();
	Loginbutton();
}
}
