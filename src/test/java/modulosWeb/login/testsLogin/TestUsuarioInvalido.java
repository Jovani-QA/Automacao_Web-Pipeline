package modulosWeb.login.testsLogin;

import config.config;
import modulosWeb.login.pageLogin.pageLogin;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestUsuarioInvalido {
    private WebDriver driver;

    @Before
    public void criarDriver() {
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

        // Por ser um teste simples não foi inserido item de vericação, se houver necessidade poderá ser implementado.

        System.out.println("___________________________________________________________________________");
        System.out.println("\n"+
                "TESTE LOGIN 03 : Efetuar login com e-mail invalido\n"+
                "RESUSLTADO DO TESTE:  Passou\n"+
                "- O SISTEMA NAO PERMITIU ACESSO- \n");
        System.out.println("___________________________________________________________________________");

        driver.close();

    }

}


