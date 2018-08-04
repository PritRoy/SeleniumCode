package week3.day2;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class MergeLead extends SeMethods {
	@Test(enabled=false)
	public void MergeLead() throws InterruptedException
	{
		startApp("chrome", "http://leaftaps.com/opentaps/");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement crsmfaLink = locateElement("linkText", "CRM/SFA");
		click(crsmfaLink);
		WebElement createLink = locateElement("linkText", "Create Lead");
		click(createLink);
		WebElement mergelead = locateElement("xpath","//a[text()='Merge Leads']");
		click(mergelead);
		WebElement fromlead = locateElement("id","ComboBox_partyIdFrom");
		click(fromlead);

		WebElement tolead = locateElement("id","ComboBox_partyIdTo");
		click(tolead);
		WebElement mergebtn = locateElement("xpath","//a[text()='Merge']");
		click(mergebtn);

	}
}