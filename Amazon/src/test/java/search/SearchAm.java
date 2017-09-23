package search;

import Base.CommonAPI;
import Search.Searchpage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class SearchAm extends CommonAPI {

    @Test

    public static void testsearch(){
        Searchpage searchpage = PageFactory.initElements(driver,Searchpage.class);
        searchpage.Searchitems();
    }

}
