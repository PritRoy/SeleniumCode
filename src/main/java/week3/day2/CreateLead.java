package week3.day2;


import java.io.IOException;

//import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends Annotation{

	@BeforeTest
	public void assignValue()
	{
		excelfilename = "CreateLead";
		testname="CreateLeadpage";
		testdesc = "Lead creation";
		category="smoke";
		Author = "gayathri";
		Modulename="Lead";
	}

	@Test(dataProvider= "fetchdata")
	public void createLead(String createLeadForm_companyName,String createLeadForm_firstName,String createLeadForm_lastName ) throws InterruptedException {
		//		startApp("chrome", "http://leaftaps.com/opentaps");
		//		WebElement eleUserName = locateElement("id", "username");
		//		type(eleUserName, "DemoSalesManager");
		//		WebElement elePassword = locateElement("id","password");
		//		type(elePassword, "crmsfa");
		WebElement createLink = locateElement("linkText", "Create Lead");
		click(createLink);
		//verifyTitle("");
		WebElement cmpny = locateElement("id", "createLeadForm_companyName");
		type(cmpny, "Infosys");
		WebElement firstn = locateElement("id","createLeadForm_firstName");
		type(firstn,"Gayathri");
		WebElement lName = locateElement("id","createLeadForm_lastName");
		type(lName, "K");
		//		WebElement ddSource = locateElement("id","createLeadForm_dataSourceId");
		//		selectDropDownUsingIndex(ddSource, 5);
		//		WebElement createBtnClick = locateElement("class","smallSubmit");
		//		click(createBtnClick);
		//		WebElement editlink = locateElement("linkText", "Edit");
		//		click(editlink);

		//	Thread.sleep(30000);
		//		WebElement findlead= locateElement("xpath","//a[text()='Find Leads']");
		//		click(findlead);
		//		WebElement leadid= locateElement("xpath"," //input[@id='ext-gen246']");
		//		type(leadid,"87854943");
		//		WebElement firstname= locateElement("xpath","//input[@id='ext-gen248']");
		//		type(firstname,"gayathri");
		//		
		//		WebElement lastname= locateElement("xpath","//input[@id='ext-gen250']");
		//		type(lastname,"krishnan");
		//		
		//		WebElement findleadbtn= locateElement("xpath","//button[@id='ext-gen334']");
		//		click(findleadbtn);
		/*WebElement mergelead= locateElement("linkText","//a[text()='Merge Leads']");
	click(mergelead);
		WebElement mergefromlead= locateElement("ïd","ComboBox_partyIdFrom");
		type(mergefromlead,"test");
		WebElement mergetolead= locateElement("id","ComboBox_partyIdTo");
		type(mergetolead,"test123");
		WebElement mergebutton = locateElement("class","buttonDangerous");
		click(mergebutton);
		acceptAlert();*/
		//		System.out.println("");

	}


	//	@DataProvider(name="fetchdata")
	//
	//	public Object[][] inputdataforcreatelead()
	//	{
	//
	//		//Normal data Provider
	//		//Object[][] data=new Object[2][3];
	//		//data[0][1]="ValueGlobal";
	//		//data[0][2]="Gayathri";
	//		//data[0][3]="K";
	//		//data[1][1]="Pathfinder";
	//		//data[1][2]="sangeetha";
	//		//data[1][3]="R";
	//		//return data;
	//	}


	/*@DataProvider(name="fetchdata")
	public Object[][] input()
	{
		ReadFromExcel excel = new ReadFromExcel();
		excel.readExcel("CreateLead");

	}*/

	@DataProvider(name="fetchdata")
	public Object[][] input() throws IOException {
		ReadFromExcel excel = new ReadFromExcel();
		return excel.readExcel("CreateLead");
	}



}







