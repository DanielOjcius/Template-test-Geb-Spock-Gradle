package specs

import geb.spock.GebSpec
import po.CustomersPage
import po.HomePage

class BlazeMeterHomeSpec extends GebSpec {

    def "get BlazeMeter Home Page"() {
        when: "I go to BlazeMeter Home Page"
        to HomePage

        then: "The Home Page is loaded"
        at HomePage

    }
}