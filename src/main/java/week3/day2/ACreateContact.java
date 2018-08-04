package week3.day2;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ACreateContact extends Annotation{

@Test(groups= {"smoke"})
	
	public void createContact()
	{
		WebElement createContact = locateElement("xpath", "//a[text()='Create Contact'");
		click(createContact);
		WebElement fName = locateElement("id", "firstNameField");
		type(fName,"Gayatri");
		WebElement lname = locateElement("id", "lastNameField");
		type(lname,"K");
		WebElement fNameLocal = locateElement("id", "createContactForm_firstNameLocal");
		type(fNameLocal,"GayatriTest");
		WebElement lnameLocal = locateElement("id", "createContactForm_lastNameLocal");
		type(lnameLocal,"KTest");
		WebElement personalTitle = locateElement("id", "createContactForm_personalTitle");
		type(personalTitle,"hi");
		WebElement generalProfTitle = locateElement("id", "createContactForm_generalProfTitle");
		type(generalProfTitle,"Hello Mrs");
		WebElement departmentName = locateElement("id", "createContactForm_departmentName");
		type(departmentName,"Computer");
		WebElement Currency=locateElement("createContactForm_preferredCurrencyUomId");
		selectDropDownUsingIndex(Currency,10);
		WebElement description = locateElement("id", "createContactForm_description");
		type(description,"Test description");
		WebElement importantNote = locateElement("id", "createContactForm_importantNote");
		type(importantNote,"Test Important notes");
		WebElement AreaCode = locateElement("id", "createContactForm_primaryPhoneAreaCode");
		type(AreaCode,"600100");
		WebElement Extension = locateElement("id", "createContactForm_primaryPhoneExtension");
		type(Extension,"1900");
		WebElement Email = locateElement("id", "createContactForm_primaryEmail");
		type(Email,"gayathri@gmail.com");
		WebElement PhoneNumber = locateElement("id", "createContactForm_primaryPhoneNumber");
		type(PhoneNumber,"9840360566");
		WebElement AskForName = locateElement("id", "createContactForm_primaryPhoneAskForName");
		type(AskForName,"Sangeetha");
		WebElement tName =locateElement("id","generalToNameField");
		getAttribute(tName, null);
		WebElement Address1 = locateElement("id", "createContactForm_generalAddress1");
		type(Address1,"10/257 vimala nagar 2nd street");
		WebElement Address2 = locateElement("id", "createContactForm_generalAddress2");
		type(Address2,"Near Nilgris");
		WebElement City = locateElement("id", "createContactForm_generalCity");
		type(City,"Chennai");
		WebElement PostalCode = locateElement("id", "createContactForm_generalPostalCode");
		type(PostalCode,"600100");
		WebElement CodeExt = locateElement("id", "createContactForm_generalPostalCodeExt");
		type(CodeExt,"200");
		WebElement AttnName = locateElement("id", "createContactForm_generalAttnName");
		type(AttnName,"AttentionName");
		WebElement country=locateElement("createContactForm_generalCountryGeoId");
		selectDropDownUsingText(country,"India");
		WebElement state=locateElement("createContactForm_generalStateProvinceGeoId");
		selectDropDownUsingText(state,"Texas");
		WebElement clickcontact=locateElement("//input[@name='submitButton']");
		click(clickcontact);
	}
//@Test(invocationCount=2)
//public void createLead()
//{
//WebElement createLink = locateElement("linkText", "Create Lead");
//click(createLink);
////verifyTitle("");
//WebElement cmpny = locateElement("id", "createLeadForm_companyName");
//type(cmpny, "Infosys");
//WebElement firstn = locateElement("createLeadForm_firstName");
//type(firstn,"Gayathri");
//WebElement lName = locateElement("createLeadForm_lastName");
//type(lName, "K");
//WebElement ddSource = locateElement("createLeadForm_dataSourceId");
//selectDropDownUsingIndex(ddSource, 5);
//WebElement createBtnClick = locateElement("class","smallSubmit");
//click(createBtnClick);
//}

//dependonmethods
//@Test(dependsOnMethods={"createContact"})
//public void createLead()
//{
//WebElement createLink = locateElement("linkText", "Create Lead");
//click(createLink);
////verifyTitle("");
//WebElement cmpny = locateElement("id", "createLeadForm_companyName");
//type(cmpny, "Infosys");
//WebElement firstn = locateElement("createLeadForm_firstName");
//type(firstn,"Gayathri");
//WebElement lName = locateElement("createLeadForm_lastName");
//type(lName, "K");
//WebElement ddSource = locateElement("createLeadForm_dataSourceId");
//selectDropDownUsingIndex(ddSource, 5);
//WebElement createBtnClick = locateElement("class","smallSubmit");
//click(createBtnClick);
//}

//timeout
//@Test(timeOut=10000)
//public void createLead()
//{
//WebElement createLink = locateElement("linkText", "Create Lead");
//click(createLink);
////verifyTitle("");
//WebElement cmpny = locateElement("id", "createLeadForm_companyName");
//type(cmpny, "Infosys");
//WebElement firstn = locateElement("createLeadForm_firstName");
//type(firstn,"Gayathri");
//WebElement lName = locateElement("createLeadForm_lastName");
//type(lName, "K");
//WebElement ddSource = locateElement("createLeadForm_dataSourceId");
//selectDropDownUsingIndex(ddSource, 5);
//WebElement createBtnClick = locateElement("class","smallSubmit");
//click(createBtnClick);
//}


//Enabled
//@Test(enabled=true)
//public void createLead()
//{
//WebElement createLink = locateElement("linkText", "Create Lead");
//click(createLink);
////verifyTitle("");
//WebElement cmpny = locateElement("id", "createLeadForm_companyName");
//type(cmpny, "Infosys");
//WebElement firstn = locateElement("createLeadForm_firstName");
//type(firstn,"Gayathri");
//WebElement lName = locateElement("createLeadForm_lastName");
//type(lName, "K");
//WebElement ddSource = locateElement("createLeadForm_dataSourceId");
//selectDropDownUsingIndex(ddSource, 5);
//WebElement createBtnClick = locateElement("class","smallSubmit");
//click(createBtnClick);
//}
}
