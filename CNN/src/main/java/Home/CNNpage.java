package Home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CNNpage {
    @FindBy(how = How.CSS,using = "#logo")
    public static WebElement cnnlogo;
    @FindBy(how = How.CSS,using = ".nav-menu-links__link")
    public static WebElement menuUS;
    @FindBy(how = How.CSS,using = ".nav-section__submenu-item")
    public static WebElement crimeJustice;
    @FindBy(how = How.XPATH,using = ".//*[@id='nav-section-submenu']/a[2]")
    public static WebElement energyandEnvironment;
    @FindBy(how = How.XPATH,using = ".//*[@id='nav-section-submenu']/a[2]")
    public static WebElement ExtremeWeather;
    @FindBy(how = How.XPATH,using = ".//*[@id='nav-section-submenu']/a[4]")
    public static WebElement spaceScience;

    public void CNN(){
        cnnlogo.click();
    }
    public void US(){
        menuUS.click();
    }
    public void clickOnCrimeAndJustice(){
        crimeJustice.click();
    }
    public void clickonEnergyAndEnvironment(){
        energyandEnvironment.click();
    }
    public void clickOnExtremeWeather(){
        ExtremeWeather.click();
    }
    public void clickOnSpaceScience(){
        spaceScience.click();
    }
}

