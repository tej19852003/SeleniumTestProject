package org.example;

public class BankRateTest implements WebElementXPath {
    static String browser = EDGE;
//    static String browser = CHROME;

    public static void main(String[] args) throws InterruptedException {

        SeleniumMethods po = new SeleniumMethods();
        if (browser.equals("CHROME")) {
            po.startChromeDriver(url_BankRate);
        } else if (browser.equals("EDGE")){
            po.startEdgeDriver(url_BankRate);
        }

        po.waitfor(oneSecond);

        po.click(button_cookieAccept);
        po.waitfor(oneSecond);
        po.click(button_cookieAccept2);
        po.waitfor(oneSecond);
        po.textBox(textbox_homePrice, "700000");
        po.waitfor(oneSecond);
        po.textBoxwithxpath("(//input[@aria-labelledby='down-payment'])[1]", "55000");
        po.waitfor(oneSecond);
        po.selectDropdown("//select[@id='text22']", "15 years");
        po.waitfor(oneSecond);
        po.selectDropdown("//select[@id='text22']", "30 years");
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
