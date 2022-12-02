package modulosWeb.metas.definirMetasMensais.Tests;

import config.config;
import modulosWeb.login.testsLogin.LoginestruturaPrincipal;
import modulosWeb.metas.definirMetasMensais.Page.campoVazioPage;
import modulosWeb.metas.definirMetasMensais.Page.inserirMetasMensaisPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class TestMetasMensaisCampoVazio {
    private WebDriver mDriver;
    @Before
    public void criarDriver() {
        config webdriver = new config();
        mDriver = webdriver.WebDriver();
    }

    @Test
    public void deixarCampoVazioClicarEmSalvar() throws InterruptedException {

        String email = "db118@cstng.com";
        String senha = "cst0962";
        String valor = "300,00";


        LoginestruturaPrincipal estruturaL = new LoginestruturaPrincipal();
           estruturaL.estruturaLogin(email, senha, mDriver);

        inserirMetasMensaisPage metasMensais = new inserirMetasMensaisPage(mDriver);
           metasMensais.clicarNoModulodeMetas();
           metasMensais.clicarnoBotaoDefinirMetas();

           metasMensais.apagarValordoCampo();
           metasMensais.inserirValordaMeta(valor);
           metasMensais.abrirDistribuicaodeMetas();
           metasMensais.distribuirValorMetas();

        // Obtem o resultado apresentado na tela
        String result = mDriver.findElement(By.className("spSomaMetaFun")).getText();
        String sobras = mDriver.findElement(By.className("somMetaDist")).getText();

        System.out.println("Valor da meta para distribuicao:" + result);
        System.out.println("Sobras da distribuicao antes de apagar os campos: " + sobras);
        System.out.println("___________________________________________________________");


        campoVazioPage campoPage = new campoVazioPage(mDriver);
           campoPage.limparCampodoCalendarioMensal1();
           campoPage.limparCampodoCalendarioMensal2();
           campoPage.limparCampodoCalendarioMensal3();
           metasMensais.clicarNoBotaoSalvar();
           metasMensais.clicarnoBotaoDefinirMetas();

        // Obtem o resultado apresentado na tela
        String result02 = mDriver.findElement(By.className("spSomaMetaFun")).getText();
        String sobras02 = mDriver.findElement(By.className("somMetaDist")).getText();


        System.out.println("Sobras da distribuicao depois de apagar de apagar os campos: " + sobras02);
        assertEquals(sobras02, "R$ 28,96");


        metasMensais.clicarNoBotaoSalvar();



    }


    }

