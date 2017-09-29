package Home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CNNWorld {

    @FindBy(how = How.XPATH,using = ".//*[@id='nav']/div[2]/div[2]/a[2]")
    public static WebElement world;
    @FindBy(how = How.XPATH,using = ".//*[@id='nav-section-submenu']/a[1]")
    public static WebElement worldAfrica;
    @FindBy(how = How.XPATH,using = ".//*[@id='nav-section-submenu']/a[2]")
    public static WebElement America;
    @FindBy(how = How.XPATH,using = ".//*[@id='nav-section-submenu']/a[3]")
    public static WebElement Asia;
    @FindBy(how = How.XPATH,using = ".//*[@id='nav-section-submenu']/a[4]")
    public static WebElement Europe;
    @FindBy(how = How.XPATH,using = ".//*[@id='nav-section-submenu']/a[5]")
    public static WebElement MiddleEast;

    public void CnnWorld(){
        world.click();
    }
    public void Africa(){
        worldAfrica.click();
    }
    public void America(){
        America.click();
    }
    public void Asia(){
        Asia.click();
    }
    public void Europe(){
        Europe.click();
    }
    public void MiddleEast(){
        MiddleEast.click();
    }
}

