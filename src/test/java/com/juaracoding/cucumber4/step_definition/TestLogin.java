package com.juaracoding.cucumber4.step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.assertEquals;
import org.juaracoding.cucumber4.config.AutomationFrameworkConfig;
import com.juaracoding.cucumber4.drivers.DriverSingleton;
import com.juaracoding.cucumber4.pages.LoginPage;
import com.juaracoding.cucumber4.utlis.ConfigurationProperties;
import com.juaracoding.cucumber4.utlis.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfig.class)
public class TestLogin {
	
	private WebDriver driver;
	private LoginPage loginPage;
	
	@Autowired
	ConfigurationProperties configurationProperties;
	@Before
	public void initializeObject() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		loginPage = new LoginPage();	
	}
	@Given("Customer mengisi url")
	public void customer_mengakses_url() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
	}
	@When("Customer klik login button")
	public void customer_klik_login_button() {
		loginPage.sumbitLogin(configurationProperties.getEmail(), configurationProperties.getPassword());
	}
	@Then("Customer berhasil login")
	public void customer_berhasil_login() {
				assertEquals(configurationProperties.getTxtWelcome(), loginPage.getTxtWelcome());
		}
}
