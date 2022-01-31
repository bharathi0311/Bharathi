package sampleApplication;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("BNYM");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Bharathi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("DG");		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
//		driver.close();
	}
}


//driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("11/3/21");
////ContactInfo
//driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
//driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
//driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("1234");
//driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("bhartidg03@gmail.com");
//driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9962440311");
//driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Name");
//driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("test.com");
////PrimaryAddress
//driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("TestName");
//driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("AttnName");
//driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Address1");
//driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Address2");
//driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("City");
//driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("100");
//driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("1234");