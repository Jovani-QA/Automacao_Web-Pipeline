package modulosWeb.login.testsLogin;

import config.config;
import modulosWeb.login.pageLogin.pageLogin;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class TestSenhaInvalida {

    private WebDriver driver;

    @Before
    public void criarDriver(){
        config webdriver = new config();
        driver = webdriver.WebDriver();
    }

    @Test
    public void loginsenhaInvalida(){
        String email = "db106@cstng.com";
        String senha = "aaaaa";
        String mensagenEsperada ="Usuário e/ou Senha inválidos";

        //Mensagem atual = Usuário e/ou Senha inválidos

        pageLogin pagelogin = new pageLogin(driver);


        pagelogin.preencherEmail(email);
        pagelogin.preencherSenha(senha);
        pagelogin.clicarEmEntrar();


        String result = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[2]/p[1]")).getText();

        // Resposta esperada: Usuário e/ou Senha inválidos"

     if(result.equals(mensagenEsperada)){
         System.out.println("\n"
                           + "TESTE LOGIN 03: inserir e-mail valido porem senha ( INVALIDA )!!\n"
                           + "RESULTADO DO TESTE: Passou!!\n"
                           + "A MENSAGEM ESPERADA É:"+" " + mensagenEsperada + "\n"
                           + "A MENSAGEM APRENSENTADA NA TELA FOI:"+" " + result +"\n");
     } else{
         System.out.println("\n"+
                            "TESTE LOGIN 03: inserir e-mail valido porem senha ( INVALIDA )!!\n"+
                            "RESULTADO DO TESTE: Falhou!!\n" +
                            "O RESULTADO APRESENTADO NA TELA FOI:"+ " "+ result + "\n"+
                            "O RESULTADO ESPERADO ERA:"+ " "+ mensagenEsperada +"\n");
       }
        driver.close();

    }
}

