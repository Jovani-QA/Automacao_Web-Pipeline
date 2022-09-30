package modulosWeb.login.testsLogin;

import modulosWeb.login.testesUnidade.config.config;

import modulosWeb.login.pageLogin.pageLogin;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestLogin {
    private WebDriver driver;

    @Before
    public void criarDriver(){
        config webdriver = new config();
        driver = webdriver.WebDriver();
    }

    @Test
    public void loginValido(){

        String email = "db106@cstng.com";
        String senha = "cst096";


        pageLogin pagelogin = new pageLogin(driver);

        pagelogin.preencherEmail(email);
        pagelogin.preencherSenha(senha);
        pagelogin.clicarEmEntrar();


        System.out.println("O teste Psasou!!\n" +
                "Login efetuado com sucesso!!");


        driver.close();

    }

}
