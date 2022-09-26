package modulosWeb.metas.definirMetasMensais.Tests;

import config.config;
import modulosWeb.login.testsLogin.LoginestruturaPrincipal;
import modulosWeb.metas.definirMetasMensais.Page.inserirMetasMensais;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class testsMetasMensais {
    private WebDriver mDriver;

    @Before
    public void criarDriver() {
        config webdriver = new config();
        mDriver = webdriver.WebDriver();
    }

    @Test
    public void inserirMetaMensaleDistribuir() {
        String email = "db106@cstng.com";
        String senha = "cst0962";
        String valor = "350,00";

        LoginestruturaPrincipal estrututaLogin = new LoginestruturaPrincipal();

        inserirMetasMensais metasMensais = new inserirMetasMensais(mDriver);
        estrututaLogin.estruturaLogin(email, senha, mDriver);

        metasMensais.clicarNoModulodeMetas();
        metasMensais.clicarnoBotaoNoModulodeMetas();
        metasMensais.apagarValordoCampo();
        metasMensais.inserirValordaMeta(valor);

    }
}
