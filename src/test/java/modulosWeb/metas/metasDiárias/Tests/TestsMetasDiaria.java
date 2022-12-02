package modulosWeb.metas.metasDiárias.Tests;

import config.config;
import modulosWeb.login.testsLogin.LoginestruturaPrincipal;
import modulosWeb.metas.definirMetasMensais.Page.inserirMetasMensaisPage;
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
        inserirMetasMensaisPage metasMensais   = new inserirMetasMensaisPage(mDriver);
        
        estruturaL.estruturaLogin(email, senha, mDriver);
        metasMensais.clicarNoModulodeMetas();
        metasDiarias.ClicarEmMetasDiarias();
        metasDiarias.ApagarValorMeta01();
        metasDiarias.InserirMeta01(meta01);
        metasDiarias.ApagarValorMeta02();
        metasDiarias.InserirMeta02(meta02);
        metasDiarias.ClicarEmSalvarMetaDiaria();

        String resultadoDistribuicaoMetasDiarias = mDriver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/ul[1]/li[2]/div[3]/a[1]/span[1]")).getText();

        //'System.out.println(resultadoDistribuicaoMetasDiarias);


        metasDiarias.ClicarEmMetasDiarias();
        metasDiarias.ApagarValorMeta01();
        metasDiarias.InserirMeta03(meta03);
        metasDiarias.ApagarValorMeta02();
        metasDiarias.InserirMeta04(meta04);
        metasDiarias.ClicarEmSalvarMetaDiaria();

        System.out.println("___________________________________________________________________________");
        System.out.println("\n" +
                        "TESTE METAS DIARIAS TESTE 01:"+"\n"+
                        "01- Inserir meta para o dia 01 !!\n" +
                        "02- Inserir meta para o dia 02 !!\n" +
                        "03- Clicar em salvar !!\n" +
                        "04- Retornar o resultado apresentado na tela, que e a soma dos valores inseridos."+"\n"+
                        "Resultado apresentado na tela:" + resultadoDistribuicaoMetasDiarias + "\n");

        System.out.println(resultadoDistribuicaoMetasDiarias);

        assertEquals(resultadoDistribuicaoMetasDiarias, "R$ 25,00");
        System.out.println("TESTE PASSOU COM SUCESSO!");
        System.out.println("___________________________________________________________________________");

        mDriver.close();



    }
}