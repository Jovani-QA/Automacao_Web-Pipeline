package modulosWeb.login.testsLogin;

import config.config;
import modulosWeb.login.pageLogin.pageLogin;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class testUsuarioInvalido {

    private WebDriver driver;

    @Before
    public void criarDriver(){
        config webdriver = new config();
        driver = webdriver.WebDriver();
    }

    @Test
    public void loginUsuarioInvalido(){
        String email = "db106@cstng";
        String senha = "cst0962";

        pageLogin pagelogin = new pageLogin(driver);

        pagelogin.preencherEmail(email);
        pagelogin.preencherSenha(senha);
        pagelogin.clicarEmEntrar();

    }

}
