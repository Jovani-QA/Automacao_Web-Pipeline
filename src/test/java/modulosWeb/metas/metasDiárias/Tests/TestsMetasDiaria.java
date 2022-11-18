package modulosWeb.metas.metasDiárias.Tests;

import config.config;
import modulosWeb.login.testsLogin.LoginestruturaPrincipal;
import modulosWeb.metas.definirMetasMensais.Page.inserirMetasMensais;
import modulosWeb.metas.metasDiárias.Pages.PageMetasDiarias;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class TestsMetasDiaria {
    private WebDriver mDriver;

    @Before
    public void criarDriver() {
        config webdriver = new config();
        mDriver = webdriver.WebDriver();
    }

    @Test
    public void InserirmMetasDiarias(){

        String email = "db118@cstng.com";
        String senha = "cst0962";
        String meta01= "15,00";
        String meta02= "10,00";
        String meta03= "00";
        String meta04= "00";


        PageMetasDiarias metasDiarias = new PageMetasDiarias(mDriver);
        LoginestruturaPrincipal estruturaL = new LoginestruturaPrincipal();
        inserirMetasMensais metasMensais   = new inserirMetasMensais(mDriver);
        
        estruturaL.estruturaLogin(email, senha, mDriver);
        metasMensais.clicarNoModulodeMetas();
        metasDiarias.ClicarEmMetasDiarias();
        metasDiarias.ApagarValorMeta01();
        metasDiarias.InserirMeta01(meta01);
        metasDiarias.ApagarValorMeta02();
        metasDiarias.InserirMeta02(meta02);
        metasDiarias.ClicarEmSalvarMetaDiaria();

        String resultadoDistribuicaoMetasDiarias = mDriver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/ul[1]/li[2]/div[3]/a[1]/span[1]")).getText();

        //System.out.println(resultadoDistribuicaoMetasDiarias);


        metasDiarias.ClicarEmMetasDiarias();
        metasDiarias.ApagarValorMeta01();
        metasDiarias.InserirMeta03(meta03);
        metasDiarias.ApagarValorMeta02();
        metasDiarias.InserirMeta04(meta04);
        metasDiarias.ClicarEmSalvarMetaDiaria();

        System.out.println("O resultado é a meta01 + meta02");
        assertEquals(resultadoDistribuicaoMetasDiarias, "R$ 25,00");
        System.out.println(resultadoDistribuicaoMetasDiarias);

        mDriver.close();

    }
}