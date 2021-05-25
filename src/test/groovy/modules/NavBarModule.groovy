package modules

import geb.Module

class NavBarModule extends Module {

    static content = {
        navBar { $("nav.navbar.navbar-default",0) }
        linksContainer { navBar.find("ul.navbar-nav.navbar-right",0) }
        links { linksContainer.find("li.leaf a") }
    }
}
