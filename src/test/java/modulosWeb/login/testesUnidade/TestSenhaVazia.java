//package modulosWeb.login.testesUnidade;
//import modulosWeb.login.pageLogin.pageLogin;
//import config.config;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class TestSenhaVazia {
//    private WebDriver driver;
//
//    @Before
//    public void criarDriver(){
//        config webdriver = new config();
//        driver = webdriver.WebDriver();
//    }
//
//    @Test
//    public void loginSenmhaVazia(){
//        String email = "db106@cstng.com";
//        String senha = "";
//
//        pageLogin pagelogin = new pageLogin(driver);
//
//        pagelogin.preencherEmail(email);
//        pagelogin.preencherSenha(senha);
//        pagelogin.clicarEmEntrar();
//        String result = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[2]/p[1]")).getText();
//
//        if(result.equals("Usuário e/ou Senha inválidos")){
//            System.out.println("O teste de senha inválida passou, a informação encontrada na tela é:"+ "" + result);
//        } else{
//            System.out.println("O teste falhou,o resultado apresentado na tela foi:"+ " "+ result);
//        }
//        //driver.quit();
//    }
//}
////
////// Foi encontrado um bug ao automatizar esse teste .. a tela acaba travando!!
////
