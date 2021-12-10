package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
        
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.linkText("Phone")).click();
        driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9962003626");
        driver.findElement(By.xpath("(//button[@type='button']) [7]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@class='linktext']) [4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Delete")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.linkText("Name and ID")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12614");
        driver.findElement(By.linkText("Find Leads")).click();
        driver.close();
        driver.close();
        

	}

}
