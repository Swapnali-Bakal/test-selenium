package test_selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {
	@Test
	public void test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html");
		driver.findElement(By.name("characters")).sendKeys("Cdac1234");
		driver.findElement(By.name("validate")).click();
	}

}

