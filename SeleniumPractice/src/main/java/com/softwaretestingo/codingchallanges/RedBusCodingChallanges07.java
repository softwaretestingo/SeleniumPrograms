package com.softwaretestingo.codingchallanges;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RedBusCodingChallanges07 {
	static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		getWeekendDates("Sep 2024");

	}

	public static void getWeekendDates(String umonyear) {
		// action class for handiling keyboard and mouse actions

		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.id("onwardCal"));
		act.moveToElement(ele).click().build().perform();
		String monyear;
		Boolean entered = false;
		while (!entered) {
			monyear = driver.findElement(By.cssSelector("div[class*=DayNavigator__CalendarHeader] >div +  div"))
					.getText();
			monyear = monyear.split("\\n+")[0];

			if (monyear.equals(umonyear.trim())) {
				System.out.println(monyear);
				entered = true;
				List<WebElement> holidays = driver.findElements(By.cssSelector("span[class *=bwoYtA]"));
				display_noofholidays(driver);
				for (int i = 0; i < holidays.size(); i++) {
					System.out.print(holidays.get(i).getText() + " ");

				}

			} else {
				System.out.println(monyear);
				display_noofholidays(driver);

				driver.findElement(By.cssSelector("div[class*=DayNavigator__CalendarHeader] >div +  div +div")).click();

			}
		}
	}

	public static void display_noofholidays(WebDriver driver) {
		String noofholidaysmonth = "";
		int noofholidayscount = 0;
		List<WebElement> noofholidays = driver
				.findElements(By.cssSelector("div[class*=DayNavigator__CalendarHeader] >div + div >div"));
		if (noofholidays.size() > 0) {
			noofholidayscount = 1;
			noofholidaysmonth = noofholidays.get(0).getText();
		}
		if (noofholidayscount != 0)
			System.out.println(noofholidaysmonth);
		else
			System.out.println("No Holidays");

	}

}
