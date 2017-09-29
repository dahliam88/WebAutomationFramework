package Test;

import Base.CommonAPI;
import Home.FirstPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FirstPageTest extends CommonAPI {

    @Test(priority = 1)
    public void testsearch(){
        FirstPage firstPage = PageFactory.initElements(driver, FirstPage.class);
        firstPage.CNN();
    }
    @Test(priority = 2)
    public void searchtest(){
        FirstPage pagefirst = PageFactory.initElements(driver, FirstPage.class);
        pagefirst.politics();
    }
    @Test(priority = 3)
    public void test(){
        FirstPage page = PageFactory.initElements(driver, FirstPage.class);
        page.US();
    }
    @Test(priority = 4)
    public void testpage(){
        FirstPage pagetest = PageFactory.initElements(driver,FirstPage.class);
         pagetest.World();
        }
    @Test(priority = 5)
    public void tests(){
        FirstPage Test = PageFactory.initElements(driver, FirstPage.class);
        Test.money();
    }
    @Test(priority = 6)
    public void testOpinion(){
        FirstPage opioniontest = PageFactory.initElements(driver, FirstPage.class);
        opioniontest.opinion();
    }
    @Test(priority = 7)
    public void testhealth(){
        FirstPage healthtest = PageFactory.initElements(driver, FirstPage.class);
        healthtest.Health();
    }
    @Test(priority = 8)
    public void testentertainment(){
        FirstPage entertainmenttest = PageFactory.initElements(driver, FirstPage.class);
        entertainmenttest.entertainment();
    }
    @Test(priority = 9)
    public void Tech(){
        FirstPage techtest = PageFactory.initElements(driver, FirstPage.class);
        techtest.Teach();
    }
    @Test(priority = 10)
    public void Style(){
        FirstPage styletest = PageFactory.initElements(driver, FirstPage.class);
        styletest.Style();
    }
    @Test(priority = 11)
    public void Travel(){
        FirstPage traveltest = PageFactory.initElements(driver, FirstPage.class);
        traveltest.Travel();
    }
    @Test(priority = 12)
    public void Sport(){
        FirstPage sporttest = PageFactory.initElements(driver, FirstPage.class);
        sporttest.Sports();
    }
    @Test(priority = 13)
    public void video(){
        FirstPage videotest = PageFactory.initElements(driver, FirstPage.class);
        videotest.Video();
    }
    @Test(priority = 14)
    public void VR(){
        FirstPage vrtest = PageFactory.initElements(driver, FirstPage.class);
        vrtest.VR();
    }
    }

