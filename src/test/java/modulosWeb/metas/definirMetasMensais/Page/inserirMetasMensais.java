package modulosWeb.metas.definirMetasMensais.Page;
import modulosWeb.login.testsLogin.testLogin;
import org.junit.Test;
import org.openqa.selenium.By;
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


    //Mapping Metas
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/form/ul/li[1]/a")
    private WebElement clicarModuloMetas;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[2]/ul[1]/li[1]/div[2]/div[5]/a[1]/i[1]")
    private WebElement botaoMetasmensais;

    @FindBy(how = How.XPATH, using = "(//input[@id='TOTAL_UND'])[1]")
    private WebElement apagarValor;

    @FindBy(how = How.XPATH, using = "(//input[@id='TOTAL_UND'])[1]")
    private WebElement inserirMeta;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]")
    private WebElement clicaInserirColaborador;


    @FindBy(how = How.XPATH, using = "(//option[@value='c84fab2c-2894-4e63-bfff-ad7271290cff'])[1]")
    private WebElement inserirColaboradorJenigfer;

    @FindBy(how = How.XPATH, using = "//html[1]/body[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/select[1]/option[29]")
    private WebElement inserirColaboradorBento;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/select[1]/option[3]")
    private WebElement inserirColaboradorAlan;

    @FindBy(how = How.XPATH, using = "//*[@id=\"AddUserModal\"]/div/div/div[3]/button[2]")
    private WebElement clicarEmIncluirColaborador;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/i[1]")
    private WebElement abrirDistribuicaoMetas;
    @FindBy(how = How.ID, using = "lnkDistMetas")
    private WebElement clicarDistribuirMetas;

    @FindBy(how = How.ID, using = "somMetaFun_ece2f541-996d-401c-ba28-316d5677a860")
    private WebElement resultadoDistribuiçãoIndividual;





    //Actions Metas
    public void clicarNoModulodeMetas(){clicarModuloMetas.click();}
    public void clicarnoBotaoNoModulodeMetas(){botaoMetasmensais.click();}

    public void apagarValordoCampo(){apagarValor.clear();}

    public void inserirValordaMeta(String valor){inserirMeta.sendKeys(valor);}

    public void clicarNoBtaoInserirColaborador(){clicaInserirColaborador.click();}

    public void selecionarColaboradorJenifer( ){inserirColaboradorJenigfer.click();}
    public void selecionarColaboradorBento(){inserirColaboradorBento.click();}

    public void selecionarColaboradorAlan(){inserirColaboradorAlan.click();}
    public void clicarEmIncluirColaborador( ){clicarEmIncluirColaborador.click();}
    public void abrirDistribuicaodeMetas( ){abrirDistribuicaoMetas.click();}

    public void distribuirValorMetas( ){clicarDistribuirMetas.click();}



    //public void preencherSenha(String senhalCliente){senha.sendKeys(senhalCliente);}

//

}

