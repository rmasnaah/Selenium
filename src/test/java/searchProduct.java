import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchProduct {

public static void main(String[]args) {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/driver/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo");
	
		WebElement searchBar = driver.findElement(By.cssSelector("input[placeholder='Search']"));
		
		searchBar.sendKeys("iPhone");
		
		driver.findElement(By.cssSelector(".fa.fa-search")).click();
		
		try {
			driver.findElement(By.xpath("//a[normalize-space()='iPhone']"));
			System.out.println("Product is Found");
		}
		
		catch(Exception e) {
			System.out.println("Product Not Found");
		}	
	}
}








	
	
	

