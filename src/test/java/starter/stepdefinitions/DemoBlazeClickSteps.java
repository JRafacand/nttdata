package starter.stepdefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import starter.navigation.NavigateTo;

import static net.serenitybdd.core.Serenity.getDriver;

public class DemoBlazeClickSteps {
    @Given("{actor} I navigate to demoblaze")
    public void clickThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.theWikipediaHomePage());
    }

    private WebDriver driver;

    public DemoBlazeClickSteps() {
        this.driver = getDriver();
    }

    @When("{actor} I select a product")
    public void clickOnObject(Actor actor) {
        // Realizar clic en el objeto deseado
        driver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
        driver.findElement(By.xpath("//a[@id='nava']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Nokia lumia 1520')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
        driver.findElement(By.xpath("//a[@id='nava']")).click();
        driver.findElement(By.xpath("//a[@id='cartur']")).click();
        driver.findElement(By.xpath("//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Laptops')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'MacBook air')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
        driver.findElement(By.xpath("//a[@id='nava']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Laptops')]")).click();
        driver.findElement(By.xpath("//button[@id='next2']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'ASUS Full HD')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
        driver.findElement(By.xpath("//a[@id='nava']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Laptops')]")).click();
        driver.findElement(By.xpath("//button[@id='next2']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'2017 Dell 15.6 Inch')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
        driver.findElement(By.xpath("//a[@id='cartur']")).click();
        driver.findElement(By.xpath("//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Monitors')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Apple monitor 24')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
        driver.findElement(By.xpath("//a[@id='nava']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Monitors')]")).click();
        driver.findElement(By.xpath("//button[@id='next2']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'ASUS Full HD')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
    }
    @And("{actor} I proceed to checkout")
    public void checkout(Actor actor) {
        driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
        driver.findElement(By.xpath("//input[@id='name']"));
    }
}
