package cobasi;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;



public class Pesquisa {
    String url;
    WebDriver driver;

    @Before
    public void iniciar(){
        url = "https://www.cobasi.com.br";
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/89/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MICROSECONDS);
    }

    @Test
    public void consultarProduto(){
        driver.get("http://www.cobasi.com.br");
        driver.findElement(By.name("q")).sendKeys("Petisco" + Keys.ENTER);
        //driver.findElement(By.cssSelector("div.nm-product-img-container")).click();
        //driver.findElement(By.cssSelector("a.nm-product-img-link")).click();
        driver.findElement(By.cssSelector("img.nm-product-img")).click();


    }

    @After
    public void finalizar(){
        //driver.quit();
    }
}
