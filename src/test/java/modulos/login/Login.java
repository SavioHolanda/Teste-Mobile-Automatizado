package modulos.login;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    public Login(AppiumDriver<MobileElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.webkit.WebView[@content-desc=\"Lojinha\"]/android.view.View[2]/android.view.View[2]/android.widget.EditText")
    @iOSFindBy(accessibility = "")
    private MobileElement campoEmail;

    @AndroidFindBy(xpath = "//android.webkit.WebView[@content-desc=\"Lojinha\"]/android.view.View[2]/android.view.View[3]/android.widget.EditText")
    @iOSFindBy(accessibility = "")
    private MobileElement campoSenha;

    @AndroidFindBy(accessibility = "ENTRAR")
    @iOSFindBy(accessibility = "")
    private MobileElement botaoEntrar;

    public void escreverEmail(String email) throws InterruptedException {
        Thread.sleep(5000);
        campoEmail.sendKeys(email);
    }

    public void escreverSenha(String senha) {
        campoSenha.sendKeys(senha);
    }

    public void botaoEntrar()  {
        botaoEntrar.click();
    }
}
