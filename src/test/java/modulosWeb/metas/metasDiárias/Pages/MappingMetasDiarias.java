package modulosWeb.metas.metasDiárias.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MappingMetasDiarias {
    private final WebDriver driver;

    //Construtor

    public MappingMetasDiarias(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/form/ul/li[1]/a")
    WebElement testeteste;

}
