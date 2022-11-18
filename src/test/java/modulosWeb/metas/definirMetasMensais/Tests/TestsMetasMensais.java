package modulosWeb.metas.definirMetasMensais.Tests;

import config.config;
import modulosWeb.login.testsLogin.LoginestruturaPrincipal;
import modulosWeb.metas.definirMetasMensais.Page.inserirMetasMensais;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class TestsMetasMensais {
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


        //Ao realizar uma distribuição para o mês de setembro inserindo 03 colaboradorer
        //e informando o valor de 300 reais. o valor inserido / 3 é = 100 R$. Porém ao distribuir a meta entre ele  o valor por
        //pessoa fia 99,90 e o valor da sobra é 0,30.

        inserirMetasMensais metasMensais   = new inserirMetasMensais(mDriver);
        LoginestruturaPrincipal estruturaL = new LoginestruturaPrincipal();


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


        String result = mDriver.findElement(By.className("spSomaMetaFun")).getText();
        String sobras = mDriver.findElement(By.className("somMetaDist")).getText();
        int totalpessoa = (valormeta)/3;


        if (result.equals(resultadoEsperado)&&(sobras.equals(sobrasEsperada))) {
                System.out.println("\n"+
                        "O TESTE PASSOU!!\n" +
                        "O valor inserido para distribuicao foi:" + " " + valor +"R$"+ "\n" +
                        "O valor esperado da distribuicao por colaborador e:"+ resultadoEsperado +"\n" +
                        "O resultado apresentado na tela foi:" +" "+ result +"\n" +
                        "O resultado esperado das sobras e:" + " " + sobrasEsperada +"\n" +
                        "O valor das sobras apresentdo na tela:"+ " " + sobras +"\n"+
                        "\n");
//                        "CALCULO REALIZADO:\n"+
//                        "O calculo basicamente e o valor de meta inserida dividido por cada colaborador inserido,\n"+
//                        "que resultou em → " + totalpessoa+ ", menos o valor das sobras que resultou → " + sobras +"\n");
            }else{
                System.out.println("\n"+
                        "O TESTE FALHOU!!\n"+
                        "O resultado esperado da distribuicao e:" +" " + resultadoEsperado+ "\n" +
                        "O valor apresentado de distribuicao na tela foi:" + " " + result+ "\n"+
                        "O valor esperado das sobra e:" + " "+ sobrasEsperada + "\n"+
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

