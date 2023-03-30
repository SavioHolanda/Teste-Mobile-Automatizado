package telas;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import io.appium.java_client.android.AndroidDriver;
import modulos.login.Login;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginTela {
    private Login ScreenLogin;

    @Before
    @DisplayName("Metodo de criação do driver")
    public void criacaoDriverApp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("app","C:\\Users\\savio.borges\\Downloads\\lojinha-hibrida.apk");
        capabilities.setCapability("deviceName","emulator-5554");
        capabilities.setCapability("platformName", "Android");

        AppiumDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
        ScreenLogin = new Login(driver);
    }

    @Test
    @DisplayName("Teste para Realizar um login com sucesso")
    public void testRealizarLoginComSucesso() throws InterruptedException {
        ScreenLogin.escreverEmail("admin");
        ScreenLogin.escreverSenha("admin");
        ScreenLogin.botaoEntrar();
    }
}
