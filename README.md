# Test BlazeMeter.com
# Geb and Gradle Project

## Description

Testing BlazeMeter web page links and texts using Spock and JUnit 4 tests.
The build is setup to work with Firefox and Chrome

## Usage

For tests using individual browsers:

    ./gradlew chromeTest
    ./gradlew firefoxTest

Headless mode 
	
	./gradlew chromeHeadlessTest”

Run all browsers

    ./gradlew test

(For Windows: use `gradlew.bat` instead of `./gradlew` )

Reports on /build/reports/[browsertype]/test/index.html

