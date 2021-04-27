package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertTrue;

public class Post extends Base{
    private Base base;

    public Post(Base base) {
        this.base = base;
    }

    @Given("^que acesso a Cobasi$")
    public void queAcessoACobasi() {
        base.driver.get(base.url);
    }

    @When("^pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String produto) {
        //base.driver.findElement(By.name("q")).sendKeys(produto + Keys.ENTER);
        base.driver.findElement(By.name("q")).sendKeys("Petisco" + Keys.ENTER);
    }

    @Then("^exibe a expressao \"([^\"]*)\" no titulo da guia$")
    public void exibeAExpressaoNoTituloDaGuia(String produto) {
        assertTrue(base.driver.getTitle().contains(produto));
    }
}
