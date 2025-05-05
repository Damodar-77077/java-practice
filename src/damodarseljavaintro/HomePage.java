package damodarseljavaintro;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HomePage extends BaseClass {
	
	 static String loginbutton="a[@data-target='#logInModal']";
	
	
	public void Homelogin() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
		WebElement login =driver.findElement(By.xpath("a[@data-target='#logInModal']"));
		 login.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
