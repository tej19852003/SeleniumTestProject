package org.example;

public class BankRateTest implements WebElementXPath, Constants {
//    static BROWSER browser = BROWSER.EDGE;
    static BROWSER browser = BROWSER.CHROME;

    public void runSelenium () throws InterruptedException {

        SeleniumMethods po = SeleniumMethods.getInstance();

        if (browser.equals(BROWSER.CHROME)) {
            po.startChromeDriver(url_BankRate);
        } else if (browser.equals(BROWSER.EDGE)){
            po.startEdgeDriver(url_BankRate);
        }

        po.waitfor(oneSecond);

        po.click(button_cookieAccept);
        po.waitfor(oneSecond);
        SeleniumMethods po1 = SeleniumMethods.getInstance();
        po1.click(button_cookieAccept2);
        po1.waitfor(oneSecond);
        SeleniumMethods po2 = SeleniumMethods.getInstance();
        po2.textBox(textbox_homePrice, HOMEPRICE);
        po2.waitfor(oneSecond);
        po2.textBoxwithxpath(textbox_downpayment, DOWNPAYMENT);
        po2.waitfor(oneSecond);
        po.selectDropdown("//select[@id='text22']", YEARS_15);
        po.waitfor(oneSecond);
        po.selectDropdown("//select[@id='text22']", YEARS_30);
        po.waitfor(oneSecond);
        po.textBox("__br_el_29", "60195");
        po.waitfor(oneSecond);
        po.click("//button[@class='w-full Button--primary']");
        po.waitfor(oneSecond);
        po.waitForElementToLoad("(//h2)[1]");
        po.waitfor(oneSecond);

        po.hoverElement("//span[@class='SiteNavCategory-label'][contains(text(),'Banking')]");
        po.waitfor(oneSecond);

        po.hoverElement("//span[@class='SiteNavCategory-label'][contains(text(),'Mortgages')]");
        po.waitfor(oneSecond);

        po.hoverElement("//span[@class='SiteNavCategory-label'][contains(text(),'Investing')]");
        po.waitfor(oneSecond);

        po.quitBrowser();

    }

}
