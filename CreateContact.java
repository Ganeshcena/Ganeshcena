package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Contacts")).click();
        driver.findElement(By.linkText("Create Contact")).click();
        driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Ganeshkumar");
        driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Sundar");
        driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Ganeshkumar");
        driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("Sundar");
        driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("AutomationTesting");
        driver.findElement(By.name("description")).sendKeys("I am Become a Automation testing Engineer");
        driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("ganeshkumar.yudish10@gmail.com");

        WebElement elesource = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		Select source = new Select(elesource);
		source.selectByValue("NY");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("I am Become a Automation testing Engineer");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("getTheTitleOfTheResultingPage");
		driver.close();
		
	
		
		

	}

}
