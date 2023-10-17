

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ZaraSearch {
WebDriver driver;

@Given("^el usuario esta en la pagina de inicio$")
public void given() throws Throwable {
	driver=new ChromeDriver();
	driver.navigate().to("https://www.zara.com/ar/");;
	System.out.println("estoy en el given");
}

@When("^el usuario ingresa {article}$")
public void when(String articulo) throws Throwable {
	driver.findElement(By.id("search-products-form-combo-input")).sendKeys(articulo);
}

@When("el usuario ingresa blusa en la caja de busqueda")
public void when() throws Throwable {
	driver.findElement(By.id("search-products-form-combo-input")).sendKeys("blusa");
}

@And("el usuario hace enter")
public void userEnter() {
	driver.findElement(By.id("search-products-form-combo-input")).sendKeys(Keys.RETURN);
}

@Then("las blusas aparecen")
public void blusas() {
System.out.println("estoy en el Then");
}
}
