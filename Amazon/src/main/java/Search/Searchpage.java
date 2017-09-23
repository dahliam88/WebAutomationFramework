package Search;

import Base.CommonAPI;
import Reporting.TestLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static Base.CommonAPI.driver;

public class Searchpage extends CommonAPI{

    @FindBy(how = How.CSS, using = "#twotabsearchtextbox")
    public static WebElement searchinputWebElement;

   @FindBy(how = How.CSS, using = ".nav-input")
    public static WebElement submitbuttonwebelement;

   public static WebElement getSearchinputWebElement(){
       return searchinputWebElement;
   }
   public static WebElement getSubmitbuttonwebelement(){
       return  submitbuttonwebelement;
   }
   public static void searchFor(String value){
       getSearchinputWebElement().sendKeys(value);
   }
   public static void submitsearchbutton(){
       getSubmitbuttonwebelement().click();
   }
   public void clearSearchInput(){
       getSearchinputWebElement().clear();
   }
   public void Searchitems(){
       String value = "java Books";
       searchFor(value);
       submitsearchbutton();
   }


}

