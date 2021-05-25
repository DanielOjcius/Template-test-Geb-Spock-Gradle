package po

import geb.Page
import modules.CustomersModule

class CustomersPage extends Page {

    static at = {
        waitFor(message: "Error : Failed to load the Customers Page") {
            title == "Customers | BlazeMeter"
        }
        waitFor(message: "Error : Missing Text on list") {
            customersSection.customerList[2].text().trim().toLowerCase() == "globant"
        }
    }

    static content = {
        customersSection { module(CustomersModule) }
    }
}
