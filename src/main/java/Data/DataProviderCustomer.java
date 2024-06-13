package Data;

import org.testng.annotations.DataProvider;

public class DataProviderCustomer {

    @DataProvider(name = "dataCustomer")
    public Object[][] getCustomerData() {
        return new Object[][]{{"Ricardo", "Torres", "ricardo1234123@yopmail.com", "Ricardo@123/", "Ricardo@123/"},
                {"Rosa", "Chavez", "Rosa2222@yopmail.com", "Rosa@123/", "Rosa@123/"}

        };
    }
}
