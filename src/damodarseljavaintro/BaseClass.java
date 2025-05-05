package damodarseljavaintro;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static void main(String[] args) {
		
		
		// Invoking Browser
		// Chrome - ChromeDriver ->Methods close get
	    // 	Firefox - FirefoxDriver ->Methods close get
		//  Safari  - SafariDriver ->Methods close get
		//  WebDriver close get
		// WebDriver methods + class methods
	
		// Chromedriver.exe -> Chrome browser
		// step to invoke chrome drivers//
	    System.setProperty("webdriver.chromedriver", "C:\\Users\\Hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		

		
		
		
		 WebElement login =driver.findElement(By.xpath("//a[@data-target='#signInModal']"));
		 login.click();
		 
		 WebElement usernameclick =driver.findElement(By.xpath("//input[@id='sign-username']"));
		 usernameclick.click();
		 
		 
		 WebElement username =driver.findElement(By.xpath("//input[@id='sign-username']"));
		 username.sendKeys("Damodar");
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		

	}

}
