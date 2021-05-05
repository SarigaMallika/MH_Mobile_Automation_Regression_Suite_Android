package Services_positive_scenario;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import Reusable_functions.Generic_functions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Services_positive_scenario extends Generic_functions{
	public static boolean str,str1;

	public static void app_launching()  {
		try {
			app_launch();
			click("welcome_login");
			page_wait(60);
			driver.findElement(By.xpath(OR_reader("Object Locator","login_phone_no"))).sendKeys(td_reader("login_phone_no"));
			driver.findElement(By.xpath(OR_reader("Object Locator","login_password"))).sendKeys(td_reader("login_password"));
			page_wait(60);
			click("login");
			click("services");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/* TC_001 - Validate that the user is navigated to the Services page on clicking Services tab*/
	@Then("User should be navigated to services page")
	public static void services_positive_tc_001() throws Exception {
		try {
			str=driver.findElement(By.xpath(OR_reader("Object Locator","services_title"))).isDisplayed();
			Assert.assertEquals(str, true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("services_positive_tc_001");
		}
	}

	/* User is navigating to the services page by clicking Services tab*/
	@Given("User is on Services page")
	public static void user_is_on_services_page() {
		try {
			click("services");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/* TC_002- Validate that the user is navigated to the Second Opinion page on clicking Second Opinions*/
	@Then("User should be navigated to Second opinions page on clicking Second opinions tab")
	public static void services_positive_tc_002() throws IOException {
		try {
			click("second_opinions");
			str=driver.findElement(By.xpath(OR_reader("Object Locator","second_opinions_title"))).isDisplayed();
			Assert.assertEquals(str, true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("services_positive_tc_002");
		}
	}

	/* TC_003 - Validate that the user is navigated to the Conditions page on clicking Conditions*/
	@Then("User should be navigated to Conditions page on clicking conditions tab")
	public static void services_positive_tc_003() throws IOException {
		try {
			click("conditions");
			page_wait(60);
			str=driver.findElement(By.xpath(OR_reader("Object Locator","conditions_title"))).isDisplayed();
			Assert.assertEquals(str, true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("services_positive_tc_003");
		}
	}
	/* TC_004 - Validate that the user is navigated to the Medications page on clicking Medications*/
	@Then("User should be navigated to Medications page on clicking Medications tab")
	public static void services_positive_tc_004() throws IOException {
		try {
			click("medications");
			str=driver.findElement(By.xpath(OR_reader("Object Locator","Medications_title"))).isDisplayed();
			Assert.assertEquals(str, true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("services_positive_tc_004");
		}
	}

	/* TC_011 - Validate that the user is navigated to the Bills page on clicking Bills */
	@Then("User should be navigated to Bills page on clicking Bills tab")
	public void services_positive_tc_011() throws IOException {
		try {
			click("bills");
			str=driver.findElement(By.xpath(OR_reader("Object Locator","bills_title"))).isDisplayed();
			Assert.assertEquals(str, true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("services_positive_tc_011");
		}
	}

	/* TC_012- Validate that the user is navigated to the Claims page on clicking Claims */
	@Then("User should be navigated to Claims page on clicking Claims tab")
	public static void services_positive_tc_012() throws IOException{
		try {
			click("claims");
			page_wait(60);
			str=driver.findElement(By.xpath(OR_reader("Object Locator","claims_title"))).isDisplayed();
			Assert.assertEquals(str, true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("services_positive_tc_012");
		}
	}

}
