
package testcases;

import java.io.IOException;

//import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjectmodel.MyHome;
import week3.day2.Annotation;

public class TC001 extends Annotation{

	@BeforeTest
	public void setValue()
	{
		excelfilename = "CreateLead";
		testname="CreateLeadpage";
		testdesc = "Lead creation";
		category="smoke";
		Author = "gayathri";
		Modulename="Lead";
	}

	@Test(dataProvider= "fetchdata")
	public void createLead(String cname,String fname,String lname ) throws InterruptedException {
		new MyHome()
		.clickLeads()
		.clickcreateLeads()
		.setfname(fname)
		.setlname(lname)
		.setCname(cname)
		.clicksubmit();
		
		
		
		

	}
}

