package modulosWeb.metas.definirMetasMensais.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class campoVazioPage {

    private final WebDriver driver;

    //Construtor

    public campoVazioPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    //Mapping Metas Mensais ( Limpar campo  e clicar em salvar ).

    @FindBy(how = How.ID, using = "FuncionariosCalendarioMetas_0__CalendarioFuncionario_0__VLR_META")
    private WebElement limparCampoMetaMensal1;

    @FindBy(how = How.ID, using = "FuncionariosCalendarioMetas_0__CalendarioFuncionario_12__VLR_META")
    private WebElement limparCampoMetaMensal2;

    @FindBy(how = How.ID, using = "FuncionariosCalendarioMetas_0__CalendarioFuncionario_29__VLR_META")
    private WebElement limparCampoMetaMensal3;


    //Actions Metas mensais.
    public void limparCampodoCalendarioMensal1(){limparCampoMetaMensal1.clear();}

    public void limparCampodoCalendarioMensal2(){limparCampoMetaMensal2.clear();}

    public void limparCampodoCalendarioMensal3(){limparCampoMetaMensal3.clear();}
}
