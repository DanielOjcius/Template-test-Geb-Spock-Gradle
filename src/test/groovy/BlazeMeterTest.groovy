import geb.junit4.GebReportingTest
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import po.CustomersPage
import po.HomePage

@RunWith(JUnit4)
class BlazeMeterTest extends GebReportingTest {

    @Test
    void getBlazeMeterHomePage() {
        to HomePage
        assert title == "BlazeMeter"
        assert navBarMenu.links[2].text().trim().toLowerCase() == "customers"
    }

    @Test
    void getBlazeMeterClientPage() {
        at HomePage
        navBarMenu.links[2].click()
        at CustomersPage
        assert customersSection.customerList[2].text().trim().toLowerCase() == "globant"
    }

}