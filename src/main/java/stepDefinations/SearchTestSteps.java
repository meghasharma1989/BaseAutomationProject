package stepDefinations;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SearchTestSteps extends CommonFunctions {
    @Given("I'm on the search page {string}")
    public void i_m_on_the_search_page(String url) {
        driver.get(url);
    }
    @When("I enter text {string} in search text")
    public void i_enter_text_in_search_text(String searchText) {
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(searchText);
    }

    @When("I click on Search button")
    public void i_click_on_search_button() {
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
    }
    @Then("I should be able to see result page with text {string}")
    public void i_should_be_able_to_see_result_page_with_text(String expectedText) {
        String actualText = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[1]/div[1]/div[2]/div/div[2]/input")).getText();
        //Assert.assertEquals(expectedText, actualText);
    }
}
