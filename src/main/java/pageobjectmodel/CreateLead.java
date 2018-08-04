package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import week3.day2.Annotation;

public class CreateLead extends Annotation {
	public CreateLead()

	{
		PageFactory.initElements(driver, this);
	}
	
@FindBy(linkText="Create Lead")
WebElement createlead;

@FindBy(id="createLeadForm_firstName")
WebElement fname;

@FindBy(id="createLeadForm_lastName")
WebElement lname;

@FindBy(id="createLeadForm_companyName")
WebElement cname;

@FindBy(xpath="//input[@name='submitButton']")
WebElement createbutton;

@FindBy(className="errorList")
WebElement errormsg;

public CreateLead setfname(String fdata)
{
	type(fname, fdata);
	return this;
}
public CreateLead setlname(String ldata)
{
	type(lname, ldata);
	return this;
}


public CreateLead setCname(String cdata)
{
	type(cname, cdata);
	return this;
}
public void clicksubmit()
{
	click(createbutton);
}

public CreateLead clickSubmitForFailCase()
{
	click(createbutton);
	return this;
}

public CreateLead verifyerrormsg(String error)

{
	verifyExactText(errormsg, error);
	return this;
}

}
