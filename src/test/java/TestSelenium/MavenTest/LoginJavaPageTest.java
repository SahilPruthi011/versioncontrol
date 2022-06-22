package TestSelenium.MavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class LoginJavaPageTest {
	  ExtentReports extent;

	@BeforeTest
	public void config(){
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("NMG Technologies Automation Results");
		reporter.config().setDocumentTitle("NMG Technologies Interview AQuestion");
		extent=new ExtentReports();
	extent.attachReporter(reporter);	
	extent.setSystemInfo("Tester", "Sahil Pruthi");
	}
	@Test
	public void clickGoogleSearchTextBox() throws InterruptedException
	{
		
		ExtentTest test=extent.createTest("NMG Automation Scenario");
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\namit\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl = "https://www.google.com/";
        driver.get(baseUrl);
        SeleniumTest verify=new SeleniumTest(driver);
 
        verify.clickAndTypeGoogleSearchTextBox();
        verify.typeAndClickDesiredSearchText();
        verify.locateAndClickDesiredWebsiteLink();
        verify.comparePageTitle();
        driver.close();
        extent.flush();
	}
	
}
