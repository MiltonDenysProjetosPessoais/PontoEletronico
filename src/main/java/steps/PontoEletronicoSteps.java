package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PontoEletronicoSteps {


    @Given("abro a pagina de de ponto eletronico")
    public void openPage() {
        pages.BasePage.acessaHomePage();
    }
    @Then("finalizo a aplicacao")
    public void finalizar() {
        pages.BasePage.finalizar();
    }
    @Then("confirmar preferencias")
    public void confirmarPreferencias() {
        pages.PontoEletronicoPage.confirmarPreferencias();
    }
    @Then("eu preencho os campos de login {string} {string}")
    public void preencherLogin(String name, String password) {
        pages.PontoEletronicoPage.preencherLogin(name,password);
    }
    @Then("clico em marcacao")
    public void clicarMarcacao() {
        pages.PontoEletronicoPage.clicarMarcacao();
    }
}
