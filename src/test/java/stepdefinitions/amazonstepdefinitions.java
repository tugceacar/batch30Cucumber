package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class amazonstepdefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @When("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @When("nutella icin arama yapar")
    public void nutella_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    }
    @Then("sonucun nutella icerdigini test eder")
    public void sonucun_nutella_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains("Nutella"));

    }

    @And("ana sayfayi kapatir")
    public void anaSayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("java icin arama yapar")
    public void javaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Java"+ Keys.ENTER);
    }

    @Then("sonucun java icerdigini test eder")
    public void sonucunJavaIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains("Java"));    }

    @And("Ipad icin arama yapar")
    public void ipadIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Ipad"+ Keys.ENTER);

    }

    @Then("sonucun Ipad icerdigini test eder")
    public void sonucunIpadIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains("Ipad"));    }
    }

