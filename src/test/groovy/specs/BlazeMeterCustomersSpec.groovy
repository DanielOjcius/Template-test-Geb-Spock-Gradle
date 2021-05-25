package specs

import geb.spock.GebSpec
import po.CustomersPage
import po.HomePage

class BlazeMeterCustomersSpec extends GebSpec {

    def "get BlazeMeter Client Page"() {
        given: "Im at Home Page"
        to HomePage

        when: "I click on Customers Link on Navigation Bar"
        navBarMenu.links[2].click()

        then: "I've redirected to Customers Page"
        at CustomersPage
    }

}