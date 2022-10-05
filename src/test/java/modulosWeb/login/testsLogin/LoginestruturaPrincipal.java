package modulosWeb.login.testsLogin;

import config.config;
;
import modulosWeb.login.pageLogin.pageLogin;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginestruturaPrincipal {
    private WebDriver Driver;

    @Before
    public void criarDriver() {
        config webdriver = new config();
        Driver = webdriver.WebDriver();
    }

    @Test
    public void estruturaLogin(String email, String senha, WebDriver driver){
        pageLogin estrututaLogin = new pageLogin(driver);

        estrututaLogin.preencherEmail(email);
        estrututaLogin.preencherSenha(senha);
        estrututaLogin.clicarEmEntrar();
//        driver.close();
    }
}
