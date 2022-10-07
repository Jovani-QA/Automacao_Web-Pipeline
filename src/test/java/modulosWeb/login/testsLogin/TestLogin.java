package modulosWeb.login.testsLogin;

import config.config;

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

        String email = "db118@cstng.com";
        String senha = "cst0962";


        pageLogin pagelogin = new pageLogin(driver);

        pagelogin.preencherEmail(email);
        pagelogin.preencherSenha(senha);
        pagelogin.clicarEmEntrar();


        System.out.println("\n"+
                           "RESUSLTADO DO TESTE: Passou\n"+
                           "TESTE : Efetuar login com e-mail e senha válidos\n");

        driver.close();

    }

    public static class testUsuarioInvalido {

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
}
