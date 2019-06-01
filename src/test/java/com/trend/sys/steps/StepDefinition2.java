package com.trend.sys.steps;

import com.trend.sys.UATBase;
import com.trend.sys.pages.Google;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinition2 extends UATBase {
    Google google;



    @And("^en la pagina de busqueda volver a buscar$")
    public void enLaPaginaDeBusquedaVolverABuscar() {
        google.sercharAnother();
    }
}
