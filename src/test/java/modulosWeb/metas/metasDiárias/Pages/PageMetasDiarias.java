package modulosWeb.metas.metasDiárias.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageMetasDiarias {
    private final WebDriver driver;

    //Construtor

    public PageMetasDiarias(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    //Napping
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[2]/ul[1]/li[2]/div[2]/div[4]/a[1]/i[1]")
    WebElement clicarMetasDiarias;
    @FindBy(how = How.ID, using = "MetasDias_8__MUD_VALOR")
    WebElement apagarValor01;
    @FindBy(how = How.ID, using = "MetasDias_8__MUD_VALOR")
    WebElement metas01;
    @FindBy(how = How.ID, using = "MetasDias_10__MUD_VALOR")
    WebElement apagarValor02;
    @FindBy(how = How.ID, using = "MetasDias_10__MUD_VALOR")
    WebElement metas02;
    @FindBy(how = How.ID, using = "MetasDias_8__MUD_VALOR")
    WebElement metas03;

    @FindBy(how = How.ID, using = "MetasDias_10__MUD_VALOR")
    WebElement metas04;
    @FindBy(how = How.ID, using = "btnSave")
    WebElement clicarEmSalvar;


    //Actions
    public void ClicarEmMetasDiarias( ){clicarMetasDiarias.click();}
    public void ApagarValorMeta01(){apagarValor01.clear();}
    public void InserirMeta01(String meta ){metas01.sendKeys(meta);}
    public void ApagarValorMeta02(){apagarValor02.clear();}
    public void InserirMeta02(String meta ){metas02.sendKeys(meta);}
    public void InserirMeta03(String meta ){metas03.sendKeys(meta);}
    public void InserirMeta04(String meta ){metas04.sendKeys(meta);}
    public void ClicarEmSalvarMetaDiaria( ){clicarEmSalvar.click();}




}
