package modulosWeb.metas.definirMetasMensais.Page;
import org.openqa.selenium.JavascriptExecutor;
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


    //Mapping Metas (inserir colaboradores, meta , distribuir a meta e salvar).

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/form/ul/li[1]/a")
    private WebElement clicarModuloMetas;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[2]/ul[1]/li[1]/div[2]/div[5]/a[1]/i[1]")
    private WebElement botaoMetasmensais;

    @FindBy(how = How.XPATH, using = "//option[@value='c22f4b38-28d8-4922-8846-bb4cc2c99c2d']")
    private WebElement selecionarMes;

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
    @FindBy(how = How.XPATH, using = "(//button[normalize-space()='Salvar'])[1]")
    private WebElement clicarEmSalvar;



   //Mapping Metas (Limpar os dados inseridos).

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/button[2]")
    private WebElement clicarEmxcluirFuncionario;

    @FindBy(how = How.XPATH, using = "//*[@id=\"select_func_rem\"]/option[2]")
    private WebElement excluirAlan;


    @FindBy(how = How.XPATH, using = "//*[@id=\"select_func_rem\"]/option[2]")
    private WebElement excluirAline;

    @FindBy(how = How.XPATH, using = "(//button[normalize-space()='Excluir'])[1]")
    private WebElement confirmarExcluir;




    //Actions Metas (inserir colaboradores, meta , distribuir a meta e salvar).
    public void clicarNoModulodeMetas(){clicarModuloMetas.click();}
    public void clicarnoBotaoDefinirMetas(){botaoMetasmensais.click();}
    public void selecionarMesMeta(){selecionarMes.click();}

    public void apagarValordoCampo(){apagarValor.clear();}

    public void inserirValordaMeta(String valor){inserirMeta.sendKeys(valor);}

    public void clicarNoBtaoInserirColaborador(){clicaInserirColaborador.click();}

    public void selecionarColaboradorJenifer( ){inserirColaboradorJenigfer.click();}
    public void selecionarColaboradorBento(){inserirColaboradorBento.click();}

    public void selecionarColaboradorAlan(){inserirColaboradorAlan.click();}
    public void clicarEmIncluirColaborador( ){clicarEmIncluirColaborador.click();}
    public void abrirDistribuicaodeMetas( ){abrirDistribuicaoMetas.click();}
    public void distribuirValorMetas( ){clicarDistribuirMetas.click();}
    public void clicarNoBotaoSalvar( ){clicarEmSalvar.click();}



    //Actions Metas (Limpar os dados inseridos).
    public void clicarNoBotaoExclusaoFuncionarios( ){clicarEmxcluirFuncionario.click();}
    public void clicarExcluirAlan( ){excluirAlan.click();}
    public void clicarExcluirAline( ){excluirAline.click();}
    public void clicarNoBotaoConfirmarExclusao( ){confirmarExcluir.click();}

    public void scrollPage() {
        ((JavascriptExecutor) driver).executeScript("scroll(0,800)");
    }

    //public void preencherSenha(String senhalCliente){senha.sendKeys(senhalCliente);}

//

}

