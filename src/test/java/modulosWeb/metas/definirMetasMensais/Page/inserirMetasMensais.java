package modulosWeb.metas.definirMetasMensais.Page;
import modulosWeb.login.testsLogin.testLogin;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public  class inserirMetasMensais {
    private final WebDriver driver;

    //Construtor

    public inserirMetasMensais(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    //Mapping login
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/form/ul/li[1]/a")
    private WebElement clicarModuloMetas;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[2]/ul[1]/li[1]/div[2]/div[5]/a[1]/i[1]")
    private WebElement botaoMetasmensais;

    @FindBy(how = How.XPATH, using = "(//input[@id='TOTAL_UND'])[1]")
    private WebElement apagarValor;

    @FindBy(how = How.XPATH, using = "(//input[@id='TOTAL_UND'])[1]")
    private WebElement inserirMeta;





    //Actions login
    public void clicarNoModulodeMetas(){clicarModuloMetas.click();}
    public void clicarnoBotaoNoModulodeMetas(){botaoMetasmensais.click();}

    public void apagarValordoCampo(){apagarValor.clear();}

    public void inserirValordaMeta(String valor){inserirMeta.sendKeys(valor);}


    //public void preencherSenha(String senhalCliente){senha.sendKeys(senhalCliente);}



}

