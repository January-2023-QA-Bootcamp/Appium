package app.demo.tests;

import org.junit.jupiter.api.Test;

import base.TestBase;

public class CheckoutTests extends TestBase{

	@Test
	public void testCheckout() {
		pageObj.clcikOrderBy();
		pageObj.clickNameDescending();
		pageObj.clickItem();
		pageObj.validateItemTitle("Sauce Labs Onesie");
	}
}
