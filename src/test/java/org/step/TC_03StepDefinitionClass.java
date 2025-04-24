package org.step;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.PrevajPOM;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_03StepDefinitionClass extends BaseClass {

	PrevajPOM a = new PrevajPOM();

	@When("I fill in all the fields with valid data")
	public void iFillInAllTheFieldsWithValidData() {

		WebElement yourName = waitForElementToBeVisible(a.getYourName(), 20);
		yourName.sendKeys("Arunkumar");

		WebElement yourEmail = waitForElementToBeVisible(a.getYourEmail(), 20);
		yourEmail.sendKeys("arunkumard@prevaj.com");

		WebElement phNo = waitForElementToBeVisible(a.getPhoneNo(), 20);
		phNo.sendKeys("46456456664");

		WebElement helpText = waitForElementToBeVisible(a.getHelpText(), 20);
		helpText.sendKeys("testing purpose");

	}

	@When("I click on  Submit button")
	public void iClickOnSubmitButton() {

		WebElement submitBtn = waitForElementToBeClickable(a.getSubmitButton(), 40);
		clickElement(submitBtn);

	}

	@Then("I should see a success message confirming the form submission")
	public void iShouldSeeASuccessMessageConfirmingTheFormSubmission() {

		WebElement successMgs = waitForElementToBeVisible(a.getSuccessMsg(), 60);
		successMgs.isDisplayed();

	}

	@When("I leave all fields blank")
	public void iLeaveAllFieldsBlank() {

		WebElement yourName = waitForElementToBeVisible(a.getYourName(), 20);
		yourName.clear();

		WebElement yourEmail = waitForElementToBeVisible(a.getYourEmail(), 20);
		yourEmail.clear();

		WebElement phNo = waitForElementToBeVisible(a.getPhoneNo(), 20);
		phNo.clear();

		WebElement helpText = waitForElementToBeVisible(a.getHelpText(), 20);
		helpText.clear();

	}

	@When("I click on the Submit button")
	public void iClickOnTheSubmitButton() {

		WebElement submitBtn = waitForElementToBeClickable(a.getSubmitButton(), 20);
		submitBtn.click();

	}

	@Then("I should see error messages for all required fields")
	public void iShouldSeeErrorMessagesForAllRequiredFields() {

		WebElement reqError = waitForElementToBeVisible(a.getRequiredError(), 20);
		reqError.isDisplayed();

	}

	@When("I fill in all fields with valid data except an invalid email")
	public void iFillInAllFieldsWithValidDataExceptAnInvalidEmail() {

		WebElement yourName = waitForElementToBeVisible(a.getYourName(), 20);
		yourName.sendKeys("Arunkumar");

		WebElement yourEmail = waitForElementToBeVisible(a.getYourEmail(), 20);
		yourEmail.sendKeys("arunkumard.com");

		WebElement phNo = waitForElementToBeVisible(a.getPhoneNo(), 20);
		phNo.sendKeys("46456456455454545641145");

		WebElement helpText = waitForElementToBeVisible(a.getHelpText(), 20);
		helpText.sendKeys("testing purpose");

	}

	@When("I click  the Submit button")
	public void iClickTheSubmitButton() {

		WebElement submitBtn = waitForElementToBeClickable(a.getSubmitButton(), 20);
		submitBtn.click();

	}

	@Then("I should see an error message for invalid email format")
	public void iShouldSeeAnErrorMessageForInvalidEmailFormat() {

		WebElement invalidEmail = waitForElementToBeVisible(a.getValidEmailError(), 60);
		invalidEmail.isDisplayed();

	}

	@When("I fill in all fields with valid data except an invalid phone number")
	public void iFillInAllFieldsWithValidDataExceptAnInvalidPhoneNumber() {

		WebElement yourName = waitForElementToBeVisible(a.getYourName(), 20);
		yourName.sendKeys("Arunkumar");

		WebElement yourEmail = waitForElementToBeVisible(a.getYourEmail(), 20);
		yourEmail.sendKeys("arunkumard.com");

		WebElement phNo = waitForElementToBeVisible(a.getPhoneNo(), 20);
		phNo.sendKeys("");

		WebElement helpText = waitForElementToBeVisible(a.getHelpText(), 20);
		helpText.sendKeys("testing purpose");

	}

	@When("I click Submit button")
	public void iClickSubmitButton() {

		WebElement submitBtn = waitForElementToBeClickable(a.getSubmitButton(), 20);
		submitBtn.click();
	}

	@Then("I should see an error message for invalid phone number format")
	public void iShouldSeeAnErrorMessageForInvalidPhoneNumberFormat() {

		WebElement reqError = waitForElementToBeVisible(a.getRequiredError(), 20);
		reqError.isDisplayed();
	}

}
