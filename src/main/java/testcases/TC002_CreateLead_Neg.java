
package testcases;

import java.io.IOException;

//import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjectmodel.CreateLead;
import pageobjectmodel.MyHome;
import week3.day2.Annotation;

public class TC002_CreateLead_Neg extends Annotation{

	@BeforeTest
	public void setValue()
	{
		excelfilename ="CreateLeadNeg";
		testname="CreateLeadpage";
		testdesc = "Lead creation";
		category="smoke";
		Author = "gayathri";
		Modulename="Lead";
	}

	@Test(dataProvider= "fetchdata")
	public void createLead(String cname,String fname,String lname,String error) throws InterruptedException {
		new MyHome()
		.clickLeads()
		.clickcreateLeads()
		.setfname(fname)
		.setlname(lname)
		.setCname(cname)
		.clickSubmitForFailCase()
		.verifyerrormsg(error)
		.clicksubmit();

}

}

