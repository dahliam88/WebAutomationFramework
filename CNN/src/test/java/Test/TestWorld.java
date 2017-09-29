package Test;

import Base.CommonAPI;
import Home.CNNWorld;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestWorld extends CommonAPI {
    @Test(priority = 1)
    public void testWorld(){
    CNNWorld cnn = PageFactory.initElements(driver,CNNWorld.class);
    cnn.CnnWorld();
    }
    @Test(priority = 2)
    public void TestAfrica(){
        CNNWorld    cnn = PageFactory.initElements(driver,CNNWorld.class);
        cnn.Africa();
    }
    @Test(priority = 3)
    public void TestAmerica(){
        CNNWorld cnn = PageFactory.initElements(driver,CNNWorld.class);
        cnn.America();
    }
    @Test(priority = 4)
    public void TestAsia(){
        CNNWorld cnn = PageFactory.initElements(driver,CNNWorld.class);
        cnn.Asia();
    }
    @Test(priority = 5)
    public void TestEurope(){
        CNNWorld cnn = PageFactory.initElements(driver,CNNWorld.class) ;
        cnn.Europe();
    }
    @Test(priority = 6)
    public void TestMiddleEast(){
        CNNWorld cnn = PageFactory.initElements(driver,CNNWorld.class);
        cnn.MiddleEast();
    }
}

