package table;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class Data extends CommonAPI {


    @FindBy(how = How.CSS, using = ".w3-responsive .w3-table-all.notranslate tbody tr:nth-child(4) td:nth-child(4)")
    public static WebElement customerIDWebElement;

    @FindBy(how = How.CSS, using = ".w3-responsive .w3-table-all.notranslate tbody tr:nth-child(1) th:nth-child(2)")
    public static WebElement customerNameWebElement;

    @FindBy(how = How.CSS, using = ".w3-responsive .w3-table-all.notranslate tbody tr:nth-child(1) th:nth-child(3)")
    public static WebElement contactNameWebElement;

    @FindBy(how = How.CSS, using = ".w3-responsive .w3-table-all.notranslate tbody tr:nth-child(1) th:nth-child(4)")
    public static WebElement addressWebElement;

    @FindBy(how = How.CSS, using = ".w3-responsive .w3-table-all.notranslate tbody tr:nth-child(1) th:nth-child(5)")
    public static WebElement cityWebElement;

    @FindBy(how = How.CSS, using = ".w3-responsive .w3-table-all.notranslate tbody tr:nth-child(1) th:nth-child(6)")
    public static WebElement postalCodeWebElement;

    @FindBy(how = How.CSS, using = ".w3-responsive .w3-table-all.notranslate tbody tr:nth-child(1) th:nth-child(7)")
    public static WebElement countryWebElement;

    public WebElement getCustomerIDWebElement(){
        return customerIDWebElement;
    }
    public String getCellData(){
        String cell = getCustomerIDWebElement().getText();
        return cell;
    }
    public WebElement getCustomerNameWebElement(){
        return  customerNameWebElement;
    }
    public String Data(){
      String Data = getCustomerNameWebElement().getText();
      return Data;
    }
    public WebElement getContactNameWebElement(){
        return  contactNameWebElement;
    }
    public String getcontact(){
        String getcontact = getContactNameWebElement().getText();
        return getcontact;
        }
    public WebElement getAddressWebElement(){
        return addressWebElement;
    }
    public String getaddress(){
        String getaddress = getAddressWebElement().getText();
        return getaddress;
    }
    public WebElement getCityWebElement() {
        return cityWebElement;
    }
    public String getcity(){
        String getcity = getCityWebElement().getText();
        return  getcity;
    }
    public WebElement getPostalCodeWebElement(){
        return postalCodeWebElement;
    }
    public String getpostal(){
        String getpostal = getPostalCodeWebElement().getText();
        return  getpostal;
    }
    public WebElement getCountryWebElement(){
        return countryWebElement;
    }
    public String getcountry(){
        String getcountry = getCountryWebElement().getText();
        return getcountry;
    }
    public void readData(){
        String data = getCellData();
    }

    public void table(){
        List<String> list = getTextFromWebElements(".w3-responsive .w3-table-all.notranslate tbody tr td");
        for(String st:list){
            System.out.println(st);
        }

    }

    public void verifyHeader() {
    }
}




