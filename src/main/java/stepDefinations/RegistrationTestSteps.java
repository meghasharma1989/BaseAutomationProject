package stepDefinations;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.junit.Assert;

public class RegistrationTestSteps extends CommonFunctions {
    @Given("I'm on Home page {string}")
    public void i_m_on_home_page(String url) {
        driver.get(url);
    }
    @When("I click on My Account link")
    public void i_click_on_my_account_link() {
        driver.findElement(By.linkText("My Account")).click();
    }
    @When("I click Register Now button")
    public void i_click_register_now_button() {
        driver.findElement(By.xpath("//*[@id=\"sec\"]/div/a")).click();
    }
    @Then("I should on the sign uo page with text {string}")
    public void i_should_on_the_sign_uo_page_with_text(String expectedRegPageText) {
        String actualRegPageText = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/h2")).getText();
        Assert.assertEquals(expectedRegPageText, actualRegPageText);
    }
}
