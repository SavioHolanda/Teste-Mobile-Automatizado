package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTela {
    private WebDriver app;
    public LoginTela(WebDriver app){
        this.app = app;
    }

    public LoginTela escreverEmail(String email)  {
        app.findElement(By.xpath("//android.webkit.WebView[@content-desc=\"Lojinha\"]/android.view.View[2]/android.view.View[2]/android.widget.EditText")).sendKeys(email);
        return this;
    }

    public LoginTela escreverSenha(String senha) {
        app.findElement(By.xpath("//android.webkit.WebView[@content-desc=\"Lojinha\"]/android.view.View[2]/android.view.View[3]/android.widget.EditText")).sendKeys(senha);
        return this;
    }

    public ListaProdutoTela botaoEntrar()  {
        app.findElement(By.xpath("//android.widget.Button[@content-desc=\"ENTRAR\"]")).click();
        return new ListaProdutoTela(app);
    }

    public LoginTela botaoEntrarComErro()  {
        app.findElement(By.xpath("//android.widget.Button[@content-desc=\"ENTRAR\"]")).click();
        return this;
    }
}
