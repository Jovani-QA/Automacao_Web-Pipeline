package modulosWeb.login.pageLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class pageLogin {
    private final WebDriver driver;

    //Construtor
    public pageLogin(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    //Mapping login

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[1]/section[1]/form[1]/div[1]/div[1]/input[1]")
    private WebElement email;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[1]/section[1]/form[1]/div[2]/div[1]/input[1]")
    private WebElement senha;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[1]/section[1]/form[1]/div[3]/div[1]/input[1]")
    private WebElement entrar;




    //Actions login

    public void preencherEmail(String emailCliente){email.sendKeys(emailCliente);}

    public void preencherSenha(String senhalCliente){senha.sendKeys(senhalCliente);}

    public void clicarEmEntrar(){entrar.click();}


}


