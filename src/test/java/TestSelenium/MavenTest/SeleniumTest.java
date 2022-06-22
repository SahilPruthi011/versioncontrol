package TestSelenium.MavenTest;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

//This class will store method and locators of login Page

public class SeleniumTest {
	WebDriver driver;
By googleTextBox=By.xpath("//input[@class='gLFyf gsfi']");
By listOfWebElements=By.xpath("//*[@role='listbox']/li");
By IndiatorWebsite=By.xpath("//h3[contains(text(),\"Best Time\")]");

public  SeleniumTest(WebDriver driver)
{
	this.driver=driver;
}
public void clickAndTypeGoogleSearchTextBox() throws InterruptedException
{
	WebElement google1=driver.findElement(googleTextBox);
	google1.click();
	google1.sendKeys("qutub op");
Thread.sleep(3000);
}
public void typeAndClickDesiredSearchText()
{

	List<WebElement> listofwebElements=driver.findElements(listOfWebElements);
	for (WebElement e : listofwebElements) {
		if(e.getText().trim().equals("qutub minar open today"));
		{
			e.click();
			break;
		}
		
	}

}
public void locateAndClickDesiredWebsiteLink()
{
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,250)", "");
	WebElement indiator=driver.findElement(IndiatorWebsite);
	indiator.click();

}
public void comparePageTitle()
{
	String a="Best Time to visit Qutub Minar | Opening Time | Entry Time of Qutub Minar";
//	System.out.println(a);
//	System.out.println(driver.getTitle());


	if(a.equals(driver.getTitle().trim()))
	{
		System.out.println("Title matches");
	}
	else {
		System.out.println("No Title matches");
		System.out.println("git 2");
		System.out.println("git 3");


driver.close();
}

}
