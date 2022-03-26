package com.juaracoding.cucumber4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber4.drivers.DriverSingleton;

public class BookingPage {
	     private WebDriver driver;
		
		public BookingPage() {
			this.driver = DriverSingleton.getDriver();
			PageFactory.initElements(driver, this);
		}
		@FindBy(css = "#fadein > span > span > span.select2-search.select2-search--dropdown")
		WebElement inputCity;
		
		@FindBy(css = "<input name=\"checkin\" class=\"checkin form-control form-control-lg border-top-r0\" id=\"checkin\" type=\"text\" placeholder=\"\" value=\"29-03-2022\" readonly=\"readonly\">")
		WebElement inputCheckin;

		@FindBy(css = "<input name=\"checkout\" class=\"checkout form-control form-control-lg border-top-l0\" id=\"checkout\" type=\"text\" placeholder=\"\" value=\"30-03-2022\" readonly=\"readonly\">")
		WebElement inputCheckout;
		
		@FindBy(css = "#hotels-search > div > div > div:nth-child(3) > div > div > div > div")
		WebElement btnTravellers;
		
		@FindBy(css = "<button type=\"submit\" id=\"submit\" class=\"btn btn-primary btn-block btn-lg effect ladda-button waves-effect\" data-style=\"zoom-in\"><span class=\"ladda-label\"><i class=\"mdi mdi-search\"></i> Search</span><span class=\"ladda-spinner\"></span></button>")
		WebElement btnSearch;

		private WebElement inputTravellers;
		
		public void sumbitSearch(String city, String checkin, String checkout, String travellers) {
			inputCity.sendKeys(city);
			inputCheckin.sendKeys(checkin);
			inputCheckout.sendKeys(checkout);
			inputTravellers.sendKeys(travellers);
			btnSearch.click();
		}


	}

