package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CHQAPage;

public class CHQAStepDefinitions {

    CHQAPage chqaPage = new CHQAPage();

    @Then("CH login linkine tiklar")
    public void chLoginLinkineTiklar() {

    }

    @And("CH username kutusuna {string} yazar")
    public void chUsernameKutusunaYazar(String arg0) {

    }

    @And("CH password kutusuna {string} yazar")
    public void chPasswordKutusunaYazar(String arg0) {

    }

    @And("CH login butonuna basar")
    public void chLoginButonunaBasar() {

    }

    @Then("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {

    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
    }
}
