package sampleApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
		public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("FirstName");
		driver.findElement(By.id("lastNameField")).sendKeys("LastName");
		driver.findElement(By.className("smallSubmit")).click();
		String FirstName = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println(FirstName);
//		System.out.println("TestLeaf");		
		driver.close();
	}
}
