package pages;


import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;

public class PontoEletronicoPage extends BasePage {
    public static void clicarMarcacao(){
        clicar(By.cssSelector("#ext-147"));

    }
    public static void preencherLogin(String name, String password) {

        try {
            preencher(By.cssSelector("#ext-152"),name);
            Thread.sleep(1000);
            preencher(By.cssSelector("#ext-151"),password);
            Thread.sleep(1000);

        } catch (InterruptedException e) {
        }
        preencher(By.cssSelector("#ext-118"),password);

    }
    public static void confirmarPreferencias() {
        clicar(By.xpath("//*[contains(text(),'Confirmar preferências')]"));
    }
}