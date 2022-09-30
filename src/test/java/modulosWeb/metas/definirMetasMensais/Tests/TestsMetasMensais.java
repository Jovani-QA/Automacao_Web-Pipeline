package modulosWeb.metas.definirMetasMensais.Tests;

import modulosWeb.login.testesUnidade.config.config;
import modulosWeb.login.testsLogin.LoginestruturaPrincipal;
import modulosWeb.metas.definirMetasMensais.Page.inserirMetasMensais;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestsMetasMensais {
    private WebDriver mDriver;

    @Before
    public void criarDriver() {
        config webdriver = new config();
        mDriver = webdriver.WebDriver();
    }

    @Test
    public void inserirMetaMensaleDistribuir() throws InterruptedException {

        String email = "db106@cstng.com";
        String senha = "cst0962";
        String valor = "300,00";
        int valormeta = 300;
        String resultadoEsperado = "R$ 99,90";
        String sobrasEsperada = "R$ 0,30";


        //Ao realizar uma distribuição para o mês de setembro inserindo 03 colaboradorer
        //e informando o valor de 300 reais. o valor inserido / 3 é = 100 R$. Porém ao distribuir a meta entre ele  o valor por
        //pessoa fia 99,90 e o valor da sobra é 0,30.



        LoginestruturaPrincipal estrututaLogin = new LoginestruturaPrincipal();
        inserirMetasMensais metasMensais = new inserirMetasMensais(mDriver);
        estrututaLogin.estruturaLogin(email, senha, mDriver);


        metasMensais.clicarNoModulodeMetas();
        metasMensais.clicarnoBotaoDefinirMetas();
        metasMensais.selecionarMesMeta();
        metasMensais.clicarNoBtaoInserirColaborador();
        metasMensais.selecionarColaboradorJenifer();
        metasMensais.clicarEmIncluirColaborador();
        metasMensais.clicarNoBtaoInserirColaborador();
        metasMensais.selecionarColaboradorAlan();
        metasMensais.clicarEmIncluirColaborador();
        metasMensais.apagarValordoCampo();
        metasMensais.inserirValordaMeta(valor);
        metasMensais.abrirDistribuicaodeMetas();
        metasMensais.distribuirValorMetas();


        String result = mDriver.findElement(By.className("spSomaMetaFun")).getText();
        String sobras = mDriver.findElement(By.className("somMetaDist")).getText();
        int totalpessoa = (valormeta)/3;



        if (result.equals(resultadoEsperado)&&(sobras.equals(sobrasEsperada))) {
                System.out.println("O TESTE PASSOU!!\n" +
                        "O valor inserido para distribuicao foi:" + " " + valor +"R$"+ "\n" +
                        "O valor esperado da distribuicao por colaborador e:"+ resultadoEsperado +"\n" +
                        "O resultado apresentado na tela foi:" +" "+ result +"\n" +
                        "O resultado esperado das sobras e:" + " " + sobrasEsperada +"\n" +
                        "O valor das sobras apresentdo na tela:"+ " " + sobras +"\n"+
                        "\n"+

                        "O calculo basicamente  e o valor de meta inserida dividido por cada colaborador inserido =" + totalpessoa+ "\n");
            }else{
                System.out.println("O TESTE FALHOU!!\n"+
                        "O resultado esperado da distribuicao e:" +" " + resultadoEsperado+ "\n" +
                        "O valor apresentado de distribuicao na tela foi:" + " " + result+ "\n"+
                        "O valor esperado das sobra e:" + " "+ sobrasEsperada + "\n"+
                        "O valor das sobras apresentado foi" + sobras);

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

            mDriver.close();


        }
    }

