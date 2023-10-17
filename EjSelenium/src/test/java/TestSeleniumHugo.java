import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.sql.Driver;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSeleniumHugo {
	
	WebDriver driver = new ChromeDriver();
	@Before
	public void setUp() throws Exception {
		
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		//driver.findElement(By.xpath("//*[@id=\"save\"]/span[1]/div/span")).click();
	}
	
	
	By registerLinkLocator = By.linkText("REGISTER");
	By registerPageLocator = By.xpath("//img[@src='images/mast_register.gif']");
	
	//paso 2
	By usernameLocator = By.id("email");
	By passwordLocator = By.id("password");
	By confirmPasswordLocator =  By.cssSelector("input[name='confirmPassword");
	//paso 3
	By registerBtnLocator = By.name("submit");
	
	//2do escenario
	//paso 4
	By userLocator = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input");
	By passLocator = By.name("password");
	By loginBtnLocator = By.name("submit");
	
	//paso 5
	By pageLocator = By.tagName("h3");

	@Test
	public void registerUser() throws InterruptedException{
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		Thread.sleep(2000);
		if(driver.findElement(registerPageLocator).isDisplayed()) {
			WebElement userName = driver.findElement(By.xpath("//*[@id=\"email\"]"));
			userName.click();
			userName.clear();
			userName.sendKeys("Hugo");
			
			WebElement pass = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input"));
			pass.click();
			pass.clear();
			pass.sendKeys("12345");
			
			WebElement confirmPass = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input"));
			confirmPass.click();
			confirmPass.clear();
			confirmPass.sendKeys("12345");
			
			WebElement submit = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input"));
			submit.click();
			submit.clear();
			
	
		}
		else {
			System.out.println("pagina de registro no encontrada");
		}
		List<WebElement> fonts = driver.findElements(By.tagName("font"));
		
		assertEquals("Note: your user name is Hugo.",fonts.get(5).getText());
	}
	
	@Test
	public void loginUser() throws  InterruptedException{
		if(driver.findElement(userLocator).isDisplayed()) {
			WebElement loginUser = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"));
			loginUser.click();
			loginUser.clear();
			loginUser.sendKeys("Hugo");
			WebElement loginPass = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input"));
			loginPass.click();
			loginPass.clear();
			loginPass.sendKeys("12345");
			
			WebElement loginbtn = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input"));
			loginbtn.click();
			loginbtn.clear();


			Thread.sleep(2000);
			assertTrue(driver.findElement(pageLocator).isDisplayed());
		}
		else {
			System.out.println("el usuario o contraseña son incorrectos");
		}
	}

}
