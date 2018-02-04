package testNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNGProg {

	public WebDriver driver;
	
	@BeforeClass
	public void intialSetUp(){
		
	
		//System.setProperty("webdriver.edge.driver","C:\\Program Files\\MicrosoftWebDriver.exe");
		 //driver=new EdgeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
	}
	
	
  @Test
  public void f() {
	  
		
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement fName= driver.findElement(By.name("firstName"));
		//editBox.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementsByName('firstName')[0].value='Pankaj'", fName);
		WebElement lName= driver.findElement(By.name("lastName"));
		lName.sendKeys("JIbhkate");
		 System.out.println("First Name and Last");	
		 
		 WebElement address1 =driver.findElement(By.name("address1"));
		 address1.sendKeys("Entering Address One");
		 WebElement phone =driver.findElement(By.name("phone"));
		 phone.sendKeys("879546321");
		 WebElement address2 =driver.findElement(By.name("address2"));
		 address2.sendKeys("Entering Address Two");
		 WebElement city =driver.findElement(By.name("city"));
		 city.sendKeys("Mumbai");
		 WebElement state =driver.findElement(By.name("state"));
		 state.sendKeys("Maharashtra");
		 WebElement pCode =driver.findElement(By.name("postalCode"));
		 pCode.sendKeys("60089");
		 WebElement country =driver.findElement(By.name("country"));
		 Select dropdown= new Select(country);
		 dropdown.selectByVisibleText("INDIA");
		 WebElement email =driver.findElement(By.name("email"));
		 email.sendKeys("pjibhkate");
		 WebElement password =driver.findElement(By.name("password"));
		 password.sendKeys("123789");
		 WebElement confirmPassword =driver.findElement(By.name("confirmPassword"));
		 confirmPassword.sendKeys("123789");
		 WebElement register =driver.findElement(By.name("register"));
		 register.click();
		 
		 
		 driver.close();
		 driver.quit();

  }
}
