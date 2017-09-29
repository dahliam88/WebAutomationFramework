package Homepage;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class LocateATMByZipcode extends CommonAPI{

    @Test

    public void searchforATM(){
        searchByCSS("#InLocationFinderID","11106");
    }

    @Test
    public void findlocation(){
        searchByCSS("#BtnLocationFinder", "3506 Broadway Astoria, NY 11106");
    }
    @Test
    public void searchbtn(){
        clickbuttonbyCSS(".btn.btn-primary.custom-search-btn");
    }
}
