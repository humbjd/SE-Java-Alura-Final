package br.com.alura.leilao;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/* public class selectProduct {//
    WebDriver browser;

    @BeforeAll
    public void beforeAll(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver
    }
    */

}


public class HelloWorldSelenium {




    @Test
    public void hello(){
        System.setProperty("webdriver.chrome.driver", "/drivers/chromedriver");
        WebDriver browser = new ChromeDriver();
        //WebDriverManager.chromedriver().setup();
        browser.navigate().to("https://localhost:8080/leiloes");
        browser.quit();

    }
}
//