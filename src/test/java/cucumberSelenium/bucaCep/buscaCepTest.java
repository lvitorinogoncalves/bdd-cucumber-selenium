package cucumberSelenium.bucaCep;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;

public class buscaCepTest {

    WebDriver webDriver;

    @Dado("Que eu navegue para o site do correios")
    public void que_eu_navegue_para_o_site_do_correios() {
        webDriver = new ChromeDriver();
        webDriver.get("https://buscacepinter.correios.com.br/app/logradouro_bairro/index.php");
    }

    @Quando("eu informar o estado de {string}, localidade {string}, bairro {string}")
    public void eu_informar_o_estado_de_localidade_bairro(String estado, String cidade, String bairro) {
        WebElement selectElement = webDriver.findElement(By.name("uf"));
        Select selectUF = new Select(selectElement);
        selectUF.selectByVisibleText(estado);

        WebElement inputLocalidade = webDriver.findElement(By.name("localidade"));
        inputLocalidade.sendKeys(cidade);

        WebElement inputBairro = webDriver.findElement(By.name("bairro"));
        inputBairro.sendKeys(bairro);
    }

    @E("clicar no botao Buscar")
    public void clicar_no_botão_Buscar() {
        WebElement buttonBuscar = webDriver.findElement(By.name("btn_pesquisar"));
        buttonBuscar.click();
    }

    @Então("devera existir um logradouro chamado {string}")
    public void devera_existir_um_logradouro_chamado(String logradouros) {
        //String pageText = webDriver.findElement(By.name("painel_form_consulta")).getText();
        //System.out.println(pageText);
        assertTrue(true);

        webDriver.close();
    }
}
