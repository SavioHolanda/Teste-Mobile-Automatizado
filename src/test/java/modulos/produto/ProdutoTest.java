package modulos.login;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import telas.LoginTela;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ProdutoTest {

    private WebDriver app;

    @Before
    @DisplayName("Metodo de criação do driver")
    public void criacaoDriverApp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app","C:\\Users\\savio.borges\\Downloads\\lojinha-hibrida.apk");
        capabilities.setCapability("deviceName","emulator-5554");
        capabilities.setCapability("platformName", "Android");

        this.app = new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        this.app.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    @DisplayName("Teste para Realizar um login com sucesso")
    public void testRealizarLoginComSucesso() {
        new LoginTela(app)
                .escreverEmail("admin")
                .escreverSenha("admin")
                .botaoEntrar();
    }
    @Test
    @DisplayName("Teste para Realizar um login invalido")
    public void testRealizarLoginInvalido() {
        new LoginTela(app)
                .escreverEmail("admin")
                .escreverSenha("123")
                .botaoEntrar();
    }
    @After
    public void fecharDriver(){
        app.quit();
    }
}