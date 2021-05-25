package modules

import geb.Module

class CustomersModule extends Module {

    static content = {
        customerList { $("div.view.view-customer-list.view-id-customer_list ul li") }
    }

}
