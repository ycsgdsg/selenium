package com.cy.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://aps.yafex.cn/fpsdev.php?c=ctrl_cmsProduct&a=viewDecor");
        String handler = chromeDriver.getWindowHandle();

        Set<String> handlers = chromeDriver.getWindowHandles();
        for (String h : handlers) {
            if (!h.equals(handler)) {
                handler = h;
                break;
            }
        }
        chromeDriver.manage().window().maximize();

        while (true) {
            try {
                while (true) {
                    chromeDriver.switchTo().window(handler);
                    Thread.sleep(3 * 1000);
                    WebElement searchBtn = chromeDriver.findElement(By.xpath("//*[@id=\"searchForm\"]/div[2]/div/button[1]"));
                    searchBtn.click();
                    Thread.sleep(3 * 1000);
                    WebElement fillBtn = chromeDriver.findElement(By.xpath("//*[@id=\"supplierInspectionList\"]/tbody[1]/tr[1]/td[18]/div/input[1]"));
                    if (fillBtn == null) return;

                    fillBtn.click();
                    Thread.sleep(3 * 1000);

                    WebElement times = chromeDriver.findElementByClassName("layui-layer");
                    String index = times.getAttribute("times");
                    chromeDriver.switchTo().frame("layui-layer-iframe" + index);

                    WebElement orderCountInput = chromeDriver.findElement(By.xpath("//*[@id=\"buyQty\"]"));
                    String count = orderCountInput.getAttribute("value");

                    WebElement completedCountInput = chromeDriver.findElement(By.xpath("//*[@id=\"finishedNum\"]"));
                    completedCountInput.sendKeys(count);

                    WebElement upTime = chromeDriver.findElement(By.xpath("//*[@id=\"upTime\"]"));
                    upTime.sendKeys("2024-10-16 00:00:00");
                    WebElement checkingTime = chromeDriver.findElement(By.xpath("//*[@id=\"checkingTime\"]"));
                    checkingTime.sendKeys("2024-10-16 00:00:00");

                    WebElement e1 = chromeDriver.findElement(By.xpath("//*[@id=\"sizetab1\"]/tbody/tr[4]/td[3]/input"));
                    e1.click();
                    WebElement e2 = chromeDriver.findElement(By.xpath("//*[@id=\"sizetab1\"]/tbody/tr[5]/td[2]/input"));
                    e2.click();
                    WebElement e3 = chromeDriver.findElement(By.xpath("//*[@id=\"sizetab1\"]/tbody/tr[6]/td[3]/input"));
                    e3.click();
                    WebElement e4 = chromeDriver.findElement(By.xpath("//*[@id=\"sizetab1\"]/tbody/tr[7]/td[2]/input"));
                    e4.click();
                    WebElement e5 = chromeDriver.findElement(By.xpath("//*[@id=\"sizetab1\"]/tbody/tr[8]/td[3]/input"));
                    e5.click();
                    WebElement e6 = chromeDriver.findElement(By.xpath("//*[@id=\"sizetab1\"]/tbody/tr[9]/td[3]/input"));
                    e6.click();
                    WebElement e7 = chromeDriver.findElement(By.xpath("//*[@id=\"sizetab1\"]/tbody/tr[10]/td[2]/input"));
                    e7.click();
                    WebElement e8 = chromeDriver.findElement(By.xpath("//*[@id=\"sizetab1\"]/tbody/tr[11]/td[2]/input"));
                    e8.click();
                    WebElement e9 = chromeDriver.findElement(By.xpath("//*[@id=\"sizetab1\"]/tbody/tr[12]/td[2]/input"));
                    e9.click();
                    WebElement e10 = chromeDriver.findElement(By.xpath("//*[@id=\"sizetab1\"]/tbody/tr[13]/td[3]/input"));
                    e10.click();
                    WebElement e11 = chromeDriver.findElement(By.xpath("//*[@id=\"sizetab1\"]/tbody/tr[14]/td[3]/input"));
                    e11.click();

                    WebElement e12 = chromeDriver.findElement(By.xpath("//*[@id=\"sizetab3\"]/tbody/tr[2]/td[2]/input[1]"));
                    e12.click();
                    WebElement e13 = chromeDriver.findElement(By.xpath("//*[@id=\"sizetab3\"]/tbody/tr[2]/td[4]/input[1]"));
                    e13.click();
                    WebElement e14 = chromeDriver.findElement(By.xpath("//*[@id=\"sizetab3\"]/tbody/tr[2]/td[6]/input[1]"));
                    e14.click();
                    WebElement e15 = chromeDriver.findElement(By.xpath("//*[@id=\"sizetab3\"]/tbody/tr[2]/td[8]/input[1]"));
                    e15.click();
                    WebElement e16 = chromeDriver.findElement(By.xpath("//*[@id=\"sizetab3\"]/tbody/tr[2]/td[10]/input[1]"));
                    e16.click();
                    WebElement e17 = chromeDriver.findElement(By.xpath("//*[@id=\"sizetab3\"]/tbody/tr[2]/td[12]/input[1]"));
                    e17.click();
                    WebElement e18 = chromeDriver.findElement(By.xpath("//*[@id=\"sizetab3\"]/tbody/tr[3]/td[2]/input[1]"));
                    e18.click();
                    WebElement e19 = chromeDriver.findElement(By.xpath("//*[@id=\"sizetab3\"]/tbody/tr[3]/td[4]/input[1]"));
                    e19.click();
                    WebElement e20 = chromeDriver.findElement(By.xpath("//*[@id=\"sizetab3\"]/tbody/tr[3]/td[6]/input[1]"));
                    e20.click();
                    WebElement e21 = chromeDriver.findElement(By.xpath("//*[@id=\"sizetab3\"]/tbody/tr[3]/td[8]/input[1]"));
                    e21.click();
                    WebElement e22 = chromeDriver.findElement(By.xpath("//*[@id=\"sizetab3\"]/tbody/tr[3]/td[10]/input[1]"));
                    e22.click();

                    Select select = new Select(chromeDriver.findElement(By.xpath("//*[@id=\"sizetab5\"]/tbody/tr[2]/td[4]/select")));
                    select.selectByIndex(1);

                    WebElement uploadImageBtn = chromeDriver.findElement(By.xpath("//*[@id=\"uploadImg\"]"));
                    uploadImageBtn.sendKeys("/Users/admin/Pictures/1.jpg");

                    Thread.sleep(3 * 1000);

                    chromeDriver.switchTo().window(handler);
                    WebElement saveBtn = chromeDriver.findElement(By.xpath("//*[@id=\"layui-layer" + index + "\"]/div[3]/a[1]"));
                    saveBtn.click();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
