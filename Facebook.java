package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ganeshkumar");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("S");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("ganeshkumar.yudish10@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("messi30");
		WebElement elesource = driver.findElement(By.id("day"));
		Select source = new Select(elesource);
		source.selectByValue("21");
		
		WebElement elesource1 = driver.findElement(By.id("month"));
		Select source1 = new Select(elesource1);
		source1.selectByValue("6");
		
		 WebElement elesource2 = driver.findElement(By.id("year"));
		 Select source2 = new Select(elesource2);
		 source2.selectByValue("2000");
		 driver.findElement(By.name("sex")).click();
		 
		 driver.close();
		 
		
		
		

	}

}
