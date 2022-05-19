import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class guestUserOrder {

	@Test
	public static void main(String[]args) throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\driver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo");
		
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]/i[1]")).click();
		
		driver.findElement(By.cssSelector("a[title='Shopping Cart'] i[class='fa fa-shopping-cart']")).click();
		
		Thread.sleep(5000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	
		Thread.sleep(5000);
		List<WebElement> radio = driver.findElements(By.name("account"));
		
		for(WebElement e:radio){ 
			
			if(e.getAttribute("value").equalsIgnoreCase("guest")) {
				
				e.click();
			}
		}
		
		driver.findElement(By.xpath("//input[@id='button-account']")).click();

		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='input-payment-firstname']")).sendKeys("Rawan");
		driver.findElement(By.xpath("//input[@id='input-payment-lastname']")).sendKeys("Almasnaah");
		driver.findElement(By.xpath("//input[@id='input-payment-email']")).sendKeys("Rmasnaah@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-payment-telephone']")).sendKeys("(313)8985155");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#input-payment-address-1")).sendKeys("4726 Firestone");
		driver.findElement(By.cssSelector("#input-payment-city")).sendKeys("Dearborn");
		driver.findElement(By.cssSelector("#input-payment-postcode")).sendKeys("48126");
		driver.findElement(By.cssSelector("#input-payment-country")).sendKeys("United States");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#input-payment-zone")).sendKeys("Michigan");
		driver.findElement(By.cssSelector("#button-guest")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("textarea[name='comment']")).sendKeys("Please include warranty for product.");
		driver.findElement(By.cssSelector("input[value='1'][name='agree']")).click();
		driver.findElement(By.cssSelector("#button-payment-method")).click();
		
	}
}
