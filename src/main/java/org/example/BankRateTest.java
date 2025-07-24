package org.example;


public class BankRateTest {

    //    static long fiveSeconds = 5000;
    static long twoSeconds = 2000;
    static long oneSecond = 1000;

    static String url = "https://www.bankrate.com/mortgages/mortgage-calculator/";

    public static void main(String[] args) throws InterruptedException {
        SeleniumMethods po = new SeleniumMethods();


//        po.startEdgeDriver(url);
        po.startChromeDriver(url);
        po.waitfor(oneSecond);
        ////button[@id='onetrust-pc-btn-handler']
        po.click("//button[@id='onetrust-pc-btn-handler']");
        po.waitfor(oneSecond);
        po.click("//button[@class='save-preference-btn-handler onetrust-close-btn-handler']");
        po.waitfor(oneSecond);
        po.textBox("homePrice", "700000");
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
