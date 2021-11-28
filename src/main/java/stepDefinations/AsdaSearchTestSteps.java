package stepDefinations;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class AsdaSearchTestSteps extends CommonFunctions {

    @Given("I'm on asda home page {string}")
    public void i_m_on_asda_home_page(String url) {
        driver.get(url);
    }
    @When("I click on Groceries section")
    public void i_click_on_groceries_section() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/nav/div[2]/ul[1]/li[1]/a")).click();
    }
    @When("I click on Fruit, Veg & Salad button")
    public void i_click_on_fruit_veg_salad_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/header/div/div/div/div[2]/div/div/div/div[2]/div[4]/div/button/span[2]")).click();
    }
    @When("I click on Fruit button")
    public void i_click_on_fruit_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/header/div/div/div/div[2]/div/div/div/div[3]/div[3]/div/button")).click();
    }
    @When("I click on Apples button")
    public void i_click_on_apples_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/header/div/div/div/div[2]/div/div/div/div[4]/div[4]/div/button")).click();
    }
}
