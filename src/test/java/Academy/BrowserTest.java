package Academy;

import static org.junit.Assert.assertEquals;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrowserTest {

	
	@Test
	public void getData()
	{
		
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://siddharthpathak.azurewebsites.net/webapp/");

        Thread.sleep(5000);
		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		// WebDriver driver =new ChromeDriver();
		String text =driver.findElement(By.xpath("//h1[normalize-space()='RahulShettyAcademy.com Learning']")).getText();
		System.out.println(text);
		// Assert.assertTrue(text.equalsIgnoreCase("RahulShettyAcademy.com Learning"));
		driver.close();
	
		
		
	}
}
