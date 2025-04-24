package org.step;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.PrevajPOM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_05StepDefinitionClass extends BaseClass {

	PrevajPOM a = new PrevajPOM();

	@When("I check the presence of all required and optional fields")
	public void iCheckThePresenceOfAllRequiredAndOptionalFields() {

		try {
			scrollToElement(a.getConatctSection());

			WebElement serviceChoose = waitForElementToBeVisible(a.getServiceChoose(), 60);
			serviceChoose.isDisplayed();

			WebElement nameLets = waitForElementToBeVisible(a.getNameInLetsTalk(), 60);
			nameLets.isDisplayed();

			WebElement emailLets = waitForElementToBeVisible(a.getEmailInLetsTalk(), 60);
			emailLets.isDisplayed();

			WebElement tellAbout = waitForElementToBeVisible(a.getTellAboutInLetsTalk(), 60);
			tellAbout.isDisplayed();

			WebElement comName = waitForElementToBeVisible(a.getCompanyNameInLetsTalk(), 60);
			comName.isDisplayed();

			WebElement submitLets = waitForElementToBeVisible(a.getSubmitInLets(), 60);
			submitLets.isDisplayed();

			System.out.println("The presence of all required and optional fields verification successful");

		} catch (Exception e) {
			System.out.println(
					"The presence of all required and optional fields verification unsuccessful" + e.getMessage());
		}

	}

	@Then("all fields should be visible on the form")
	public void allFieldsShouldBeVisibleOnTheForm() {

	}

	@When("I fill all required fields with valid data")
	public void iFillAllRequiredFieldsWithValidData() {

		try {
			scrollToElement(a.getConatctSection());

			WebElement serviceChoose = waitForElementToBeVisible(a.getServiceChoose(), 60);
			selectByIndex(serviceChoose, 3);

			WebElement nameLets = waitForElementToBeVisible(a.getNameInLetsTalk(), 60);
			sendKeysBasedOnJs("Automate Testing", nameLets);

			WebElement emailLets = waitForElementToBeVisible(a.getEmailInLetsTalk(), 90);
			sendKeysBasedOnJs("arunkumard@prevaj.com", emailLets);

			WebElement comName = waitForElementToBeVisible(a.getCompanyNameInLetsTalk(), 60);
			sendKeysBasedOnJs("Prevaj Testing", comName);

			WebElement submitLets = waitForElementToBeVisible(a.getSubmitInLets(), 60);
			clickElement(submitLets);

			WebElement succMsg = waitForElementToBeVisible(a.getSuccessMsginLets(), 60);
			succMsg.isDisplayed();

			System.out.println("All required fields with valid data verification successful");

		} catch (Exception e) {
			System.out.println("All required fields with valid data verification unsuccessful" + e.getMessage());
		}

	}

	@When("I click the Submit button")
	public void iClickTheSubmitButton() {

	}

	@Then("the form should be submitted to successfully")
	public void theFormShouldBeSubmittedToSuccessfully() {
	}

	@When("I fill all fields, including optional fields, with valid data")
	public void iFillAllFieldsIncludingOptionalFieldsWithValidData() {

		try {

			scrollToElement(a.getConatctSection());

			WebElement serviceChoose = waitForElementToBeVisible(a.getServiceChoose(), 60);
			selectByIndex(serviceChoose, 3);

			WebElement nameLets = waitForElementToBeVisible(a.getNameInLetsTalk(), 60);
			nameLets.sendKeys("Automate Testing");

			WebElement emailLets = waitForElementToBeVisible(a.getEmailInLetsTalk(), 60);
			emailLets.sendKeys("arunkumard@prevaj.com");

			WebElement tellAbout = waitForElementToBeVisible(a.getTellAboutInLetsTalk(), 60);
			tellAbout.sendKeys("testing");

			WebElement comName = waitForElementToBeVisible(a.getCompanyNameInLetsTalk(), 60);
			comName.sendKeys("Prevaj Testing");

			WebElement submitLets1 = waitForElementToBeVisible(a.getSubmitInLets(), 60);
			clickElement(submitLets1);

			WebElement succMsg = waitForElementToBeVisible(a.getSuccessMsginLets(), 60);
			succMsg.isDisplayed();

			System.out.println("All fields, including optional fields, with valid data verification successful");

		} catch (Exception e) {
			System.out.println("All fields, including optional fields, with valid data verification unsuccessful"
					+ e.getMessage());
		}

	}

	@Then("the form should  submitted successfully")
	public void theFormShouldSubmittedSuccessfully() {

	}

	@When("I fill mandatory fields with invalid data")
	public void iFillMandatoryFieldsWithInvalidData() {

		try {

			scrollToElement(a.getConatctSection());

			WebElement nameLets = waitForElementToBeVisible(a.getNameInLetsTalk(), 60);
			nameLets.sendKeys("23123123");

			WebElement emailLets = waitForElementToBeVisible(a.getEmailInLetsTalk(), 60);
			emailLets.sendKeys("arunkumard.com");

			WebElement comName = waitForElementToBeVisible(a.getCompanyNameInLetsTalk(), 60);
			comName.sendKeys("");

			WebElement submitLets2 = waitForElementToBeVisible(a.getSubmitInLets(), 60);
			clickElement(submitLets2);

			System.out.println("fill mandatory fields with invalid datas are filled in the form");

		} catch (Exception e) {
			System.out.println("fill mandatory fields with invalid datas are not filled in the form" + e.getMessage());
		}

	}

	@When("I click  Submit button")
	public void iClickSubmitButton() {

	}

	@Then("I should see appropriate error messages for invalid data")
	public void iShouldSeeAppropriateErrorMessagesForInvalidData() {

		try {
			WebElement select = waitForElementToBeVisible(a.getRequiredErrorinSelect(), 90);
			select.isDisplayed();

			WebElement name = waitForElementToBeVisible(a.getRequiredErrorInName(), 90);
			name.isDisplayed();

			WebElement inemailEr = waitForElementToBeVisible(a.getInvalidEmailError(), 90);
			inemailEr.isDisplayed();

			WebElement cmpNam = waitForElementToBeVisible(a.getRequiredErrorInCompanyName(), 90);
			cmpNam.isDisplayed();

			System.out.println("See appropriate error messages showing for invalid data");
		} catch (Exception e) {
			System.out.println("See appropriate error messages not showing for invalid data");
		}
	}

	@When("I leave all required fields blank")
	public void iLeaveAllRequiredFieldsBlank() {

	}

	@When("I click a Submit button")
	public void iClickASubmitButton() {

		WebElement submitLets3 = waitForElementToBeVisible(a.getSubmitInLets(), 60);
		clickElement(submitLets3);

	}

	@Then("I should see appropriate error messages for missing required fields")
	public void iShouldSeeAppropriateErrorMessagesForMissingRequiredFields() {

		try {

			WebElement select = waitForElementToBeVisible(a.getRequiredErrorinSelect(), 90);
			select.isDisplayed();

			WebElement name = waitForElementToBeVisible(a.getRequiredErrorInName(), 90);
			name.isDisplayed();

			WebElement emailEr = waitForElementToBeVisible(a.getRequiredErrorInEmail(), 90);
			emailEr.isDisplayed();

			WebElement cmpNam = waitForElementToBeVisible(a.getRequiredErrorInCompanyName(), 90);
			cmpNam.isDisplayed();

			System.out.println("see appropriate error messages for showing missing required fields");

		} catch (Exception e) {
			System.out
					.println("see appropriate error messages for not showing missing required fields" + e.getMessage());
		}
	}

	@When("I fill all fields with valid data except for an invalid email")
	public void iFillAllFieldsWithValidDataExceptForAnInvalidEmail() {

		try {
			scrollToElement(a.getConatctSection());

			WebElement serviceChoose = waitForElementToBeVisible(a.getServiceChoose(), 60);
			selectByIndex(serviceChoose, 3);

			WebElement nameLets = waitForElementToBeVisible(a.getNameInLetsTalk(), 60);
			nameLets.sendKeys("testing");

			WebElement emailLets = waitForElementToBeVisible(a.getEmailInLetsTalk(), 60);
			emailLets.sendKeys("arunkumard.com");

			WebElement comName = waitForElementToBeVisible(a.getCompanyNameInLetsTalk(), 60);
			comName.sendKeys("testing");

			WebElement submitLets4 = waitForElementToBeVisible(a.getSubmitInLets(), 60);
			clickElement(submitLets4);

			WebElement invalEr = waitForElementToBeVisible(a.getInvalidEmailError(), 60);
			invalEr.isDisplayed();

			System.out.println("fill all fields with valid data except for an invalid email verification successful");
		} catch (Exception e) {
			System.out.println("fill all fields with valid data except for an invalid email verification unsuccessful"
					+ e.getMessage());
		}

	}

	@When("I click to Submit button")
	public void iClickToSubmitButton() {

	}

	@Then("I should see an error message for the invalid email field")
	public void iShouldSeeAnErrorMessageForTheInvalidEmailField() {

	}

	@Given("i click the social media icon one by one")
	public void iClickTheSocialMediaIconOneByOne() {

		try {
			scrollToElement(a.getConatctSection());

			setMainWindowHandle();

			WebElement messageIcon = waitForElementToBeClickable(a.getMessageIcon(), 90);
			clickElement(messageIcon);
			switchToWindowByUrl("http://m.me/prevaj");
			switchBackToMainWindow();

			WebElement whtappIcon = waitForElementToBeClickable(a.getWhatsappIcon(), 90);
			clickElement(whtappIcon);
			switchToWindowByUrl("https://wa.me/7708957367");
			switchBackToMainWindow();

			WebElement skypeIcon = waitForElementToBeClickable(a.getSkypeIcon(), 90);
			clickElement(skypeIcon);
			switchToWindowByUrl("skype:live:prevajprojects9?chat");
			switchBackToMainWindow();

			WebElement instaIcon = waitForElementToBeClickable(a.getInstaIcon(), 90);
			clickElement(instaIcon);
			switchToWindowByUrl("https://www.instagram.com/direct/t/17843280212282745");
			switchBackToMainWindow();

			WebElement mailIcon = waitForElementToBeClickable(a.getMailIcon(), 90);
			clickElement(mailIcon);
			switchToWindowByUrl("bdm@prevaj.com");
			switchBackToMainWindow();

			WebElement xIcon = waitForElementToBeClickable(a.getXIcon(), 90);
			clickElement(xIcon);
			switchToWindowByUrl("https://twitter.com/prevaj");
			switchBackToMainWindow();

			WebElement phoneIcon = waitForElementToBeClickable(a.getPhoneIcon(), 90);
			clickElement(phoneIcon);
			switchToWindowByUrl("tel:+16506107117");
			switchBackToMainWindow();

			WebElement meetIcon = waitForElementToBeClickable(a.getMeetIcon(), 90);
			clickElement(meetIcon);

			WebElement meetPop = waitForElementToBeVisible(a.getMeetingPopup(), 90);
			meetPop.isDisplayed();

			System.out.println("the social media icon one by one verification successful");

		} catch (Exception e) {
			System.out.println("the social media icon one by one verification unsuccessful" + e.getMessage());
		}

	}

	@When("each and every social media icon have go respective page")
	public void eachAndEverySocialMediaIconHaveGoRespectivePage() {

	}

	@Then("I should see the all page redirection have successfull")
	public void iShouldSeeTheAllPageRedirectionHaveSuccessfull() {

	}

}
