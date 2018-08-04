package week4.day2;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import week3.day2.SeMethods;



public class Flipkart extends SeMethods{

	@Test

	public void Flipkart() throws InterruptedException {

		startApp("chrome", "https://www.flipkart.com/");
		WebElement eleClose = locateElement("xpath", "//button[text()='✕']");
		click(eleClose);
		WebElement eleTV = locateElement("xpath", "//span[text()='TVs & Appliances']");
		WebElement eleSumsung = locateElement("xpath","(//span[text()='Samsung'])[2]");
		mouseoverAction(eleTV,eleSumsung);
		WebElement priceFiltermin=locateElement("xpath","(//select[@class='fPjUPw'])[1]");
		selectDropDownUsingText(priceFiltermin,"₹25000");
		WebElement priceFiltermax=locateElement("xpath","(//select[@class='fPjUPw'])[2]");
		selectDropDownUsingText(priceFiltermax,"₹60000");
		WebElement screenSize=locateElement("xpath","//div[text()='Screen Size']");
		click(screenSize);
		WebElement size=locateElement("xpath","//div[text()='48 - 55']");
		click(size);
		WebElement fp=locateElement("xpath","//div[text()='Samsung Series 6 123cm (49 inch) Full HD Curved LED Smart TV']");
		click(fp);
		Thread.sleep(3000);
		//WebElement getprice=locateElement("xpath","//div[text()='₹59,999'])[1]");
		//System.out.println(getprice);
		

		switchToWindow(1);
		WebElement comparecb = locateElement("xpath","//span[text()='Compare']");
		click(comparecb);
		//closeBrowser();
		//WebElement closeButton = locateElement("xpath","//span[@class='_3CbzG3']");
		//click(closeButton);
		closeBrowser();
		switchToWindow(1);
		WebElement secTV = locateElement("xpath","//div[text()='Samsung Series 5 123cm (49 inch) Full HD LED TV']");
		click(secTV);
		switchToWindow(1);


		WebElement comparecb1 = locateElement("xpath","//span[text()='Compare']");
		click(comparecb1);
		WebElement comparecb2 = locateElement("xpath","//span[text()='Compare']");
		click(comparecb2);

		
		//		WebElement closeButton1 = locateElement("xpath","//span[text()='Compare']");
		//		click(closeButton1);





	}


}
