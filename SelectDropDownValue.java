package sampleApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownValue {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select source = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		source.selectByVisibleText("Employee");
		Select industry = new Select(driver.findElement(By.id("createLeadForm_industryEnumId")));
		industry.selectByValue("IND_FINANCE");
		Select ownership = new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));
		ownership.selectByIndex(2);
//		driver.close();
	}
}
