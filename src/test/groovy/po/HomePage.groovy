package po

import geb.Page
import modules.NavBarModule

class HomePage extends Page {

    static at = {
        waitFor(message: "Error : Failed to get the Home Page") {
            title == "BlazeMeter"
        }
        waitFor(message: "Error : Failed to load Navigation Bar") {
            navBarMenu.navBar
        }
        waitFor(message: "Error : Missing Text on Link") {
            navBarMenu.links[2].text().trim().toLowerCase() == "customers"
        }
    }

    static content = {
        navBarMenu { module(NavBarModule) }
    }
}
