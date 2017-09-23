package Homepage;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class LocateATMByZipcode extends CommonAPI{

    @Test

    public void searchforATM(){
        searchByCSS("#InLocationFinderID","11106");

    }
}
