package Test;

import Base.CommonAPI;
import Home.CNNpage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCNN extends CommonAPI{

    @Test
    public void testCnn(){
        CNNpage cnn = PageFactory.initElements(driver,CNNpage.class);
        cnn.CNN();
    }
    @Test
    public void testUS(){
        CNNpage cnn = PageFactory.initElements(driver,CNNpage.class);
        cnn.US();
    }
    @Test
    public void testCrimeandJustice(){
        CNNpage cnn = PageFactory.initElements(driver,CNNpage.class);
        cnn.clickOnCrimeAndJustice();
    }
    @Test
    public void testEnergyandEnvironment(){
        CNNpage cnn = PageFactory.initElements(driver,CNNpage.class);
        cnn.clickonEnergyAndEnvironment();
    }
    @Test(priority = 5)
    public void TestExtremeWeather(){
        CNNpage cnn = PageFactory.initElements(driver,CNNpage.class);
        cnn.clickOnExtremeWeather();
    }
    @Test(priority = 6)
    public void TestSpaceandScience(){
        CNNpage cnn = PageFactory.initElements(driver,CNNpage.class);
        cnn.clickOnSpaceScience();
    }

}

