package Data;

import org.testng.annotations.DataProvider;

public class DataProviderCustomer {

    @DataProvider(name = "dataCustomer")
    public Object[][] getCustomerData() {
        return new Object[][]{{"Ricardo", "Torres", "ricardo1234@yopmail.com", "Ricardo@123/", "Ricardo@123/"},
                {"Rosa", "Chavez", "Rosa@yopmail.com", "Rosa@123/", "Rosa@123/"}

        };
    }
}
