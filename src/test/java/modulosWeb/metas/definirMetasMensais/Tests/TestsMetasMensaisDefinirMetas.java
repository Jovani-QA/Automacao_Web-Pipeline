package modulosWeb.metas.definirMetasMensais.Tests;

import config.config;
import modulosWeb.login.testsLogin.LoginestruturaPrincipal;
import modulosWeb.metas.definirMetasMensais.Page.inserirMetasMensaisPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class TestsMetasMensaisDefinirMetas {
    private WebDriver mDriver;

    @Before
    public void criarDriver() {
        config webdriver = new config();
        mDriver = webdriver.WebDriver();
    }

    @Test
    public void inserirMetaMensaleDistribuir() throws InterruptedException {

        String email = "db118@cstng.com";
        String senha = "cst0962";
        String valor = "300,00";
        int valormeta = 300;
        String resultadoEsperado = "R$ 100,13";
        String sobrasEsperada = "R$ -0,39";


        inserirMetasMensaisPage metasMensais = new inserirMetasMensaisPage(mDriver);
        LoginestruturaPrincipal estruturaL = new LoginestruturaPrincipal();

        // ( estruturaL ) →  estrutura do login criada para usar em todas as fases do projeto.
        estruturaL.estruturaLogin(email, senha, mDriver);
        metasMensais.clicarNoModulodeMetas();
        metasMensais.clicarnoBotaoDefinirMetas();
        metasMensais.selecionarMesMetaMensal();
        metasMensais.clicarNoBtaoInserirColaborador();
        metasMensais.selecionarColaborador01();
        metasMensais.clicarEmIncluirColaborador();
        metasMensais.clicarNoBtaoInserirColaborador();
        metasMensais.selecionarColaborador02();
        metasMensais.clicarEmIncluirColaborador();
        metasMensais.apagarValordoCampo();
        metasMensais.inserirValordaMeta(valor);
        metasMensais.abrirDistribuicaodeMetas();
        metasMensais.distribuirValorMetas();

        // Obtem o resultado apresentado na tela
        String result = mDriver.findElement(By.className("spSomaMetaFun")).getText();
        String sobras = mDriver.findElement(By.className("somMetaDist")).getText();
        //Cálculo que vai ser usado para a distribuição de metas
        int totalpessoa = (valormeta) / 3;


        if (result.equals(resultadoEsperado) && (sobras.equals(sobrasEsperada))) {
            System.out.println("\n" +
                    "TESTE METAS MENSAIS 01: Inserir a meta mesal e distribuir para os 03 colaboradores\n" +
                    "O TESTE PASSOU!!\n" +
                    "O valor inserido para distribuicao foi:" + " " + valor + "R$" + "\n" +
                    "O valor esperado da distribuicao por colaborador e:" + resultadoEsperado + "\n" +
                    "O resultado apresentado na tela foi:" + " " + result + "\n" +
                    "O resultado esperado das sobras e:" + " " + sobrasEsperada + "\n" +
                    "O valor das sobras apresentado na tela:" + " " + sobras + "\n" +
                    "\n");
//                        "CALCULO REALIZADO:\n"+
//                        "O calculo basicamente e o valor de meta inserida dividido por cada colaborador inserido,\n"+
//                        "que resultou em → " + totalpessoa+ ", menos o valor das sobras que resultou → " + sobras +"\n");
        } else {
            System.out.println("\n" +
                    "TESTE METAS MENSAIS 01: Inserir a meta mesal e distribuir para os 03 colaboradores\n" +
                    "O TESTE FALHOU!!\n" +
                    "O resultado esperado da distribuicao e:" + " " + resultadoEsperado + "\n" +
                    "O valor apresentado de distribuicao na tela foi:" + " " + result + "\n" +
                    "O valor esperado das sobra e:" + " " + sobrasEsperada + "\n" +
                    "O valor das sobras apresentado foi" + sobras + "\n");

        }

        // Excluir massa e dados utilizados!

        metasMensais.clicarNoBotaoSalvar();
        metasMensais.clicarnoBotaoDefinirMetas();
        metasMensais.clicarNoBotaoExclusaoFuncionarios();
        metasMensais.clicarExcluirAlan();
        metasMensais.clicarNoBotaoConfirmarExclusao();
        metasMensais.clicarNoBotaoExclusaoFuncionarios();
        metasMensais.clicarExcluirAline();
        metasMensais.clicarNoBotaoConfirmarExclusao();
        metasMensais.clicarNoBotaoSalvar();
        metasMensais.scrollPage();

        assertEquals(result, resultadoEsperado);
        assertEquals(sobras, sobrasEsperada);
        mDriver.close();


    }

}