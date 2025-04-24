package org.step;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.PrevajPOM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_01StepDefinitionClass extends BaseClass {

	PrevajPOM a = new PrevajPOM();

	@Given("I am on the Home page")
	public void iAmOnTheHomePage() {

		getPageTitle();

	}

	@When("I click on the Home menu")
	public void iClickOnTheHomeMenu() {

		WebElement homeMenu = waitForElementToBeClickable(a.getHomeMenu(), 30);
		homeMenu.click();
	}

	@Then("Home page should reload")
	public void theHomePageShouldReload() {
		WebElement homeMenu = waitForElementToBeVisible(a.getHomeMenu(), 30);
		homeMenu.isDisplayed();
	}

	@When("I click on the Site Logo")
	public void iClickOnTheSiteLogo() {
		WebElement siteLogo = waitForElementToBeClickable(a.getSiteLogo(), 30);
		siteLogo.click();
	}

	@Then("the Home page should reload")
	public void theHomePageShouldReloadForLogo() {
		WebElement siteLogo = waitForElementToBeVisible(a.getSiteLogo(), 30);
		siteLogo.isDisplayed();
	}

	@When("I click on each header link")
	public void iClickOnEachHeaderLink() {
		try {
			waitForElementToBeClickable(a.getAboutMenu(), 30).click();
			waitForElementToBeVisible(a.getWhoWeAreSection(), 30);

			waitForElementToBeClickable(a.getServicesMenu(), 30).click();
			waitForElementToBeVisible(a.getOurServiceSection(), 30);

			waitForElementToBeClickable(a.getTechMenu(), 30).click();
			waitForElementToBeVisible(a.getTechSection(), 30);

			waitForElementToBeClickable(a.getIndustryMenu(), 30).click();
			waitForElementToBeVisible(a.getIndustrySection(), 30);

//			waitForElementToBeClickable(a.getClientsMenu(), 40).click();
//			waitForElementToBeVisible(a.getOurClientSection(), 30);

			waitForElementToBeClickable(a.getTeamMenu(), 30).click();
			waitForElementToBeVisible(a.getTeamSection(), 30);

			waitForElementToBeClickable(a.getBlogMenu(), 30).click();
			waitForElementToBeVisible(a.getBlogPage(), 30);

			waitForElementToBeClickable(a.getContactMenu(), 30).click();
			waitForElementToBeVisible(a.getConatctSection(), 30);

			System.out.println("Each and every link is displayed on its respective page");

		} catch (Exception e) {
			System.out.println(
					"Each and every link is not displayed on its respective page" + " Error: " + e.getMessage());
		}
	}

	@Then("I should be redirected to their respective pages")
	public void iShouldBeRedirectedToTheirRespectivePages() {

	}

	@When("I click on the Book Meeting button")
	public void iClickOnTheBookMeetingButton() {

		WebElement bookMeetingButton1 = waitForElementToBeVisible(a.getBookaMeetingButton(), 90);
		bookMeetingButton1.isDisplayed();

		WebElement bookMeetingButton = waitForElementToBeClickable(a.getBookaMeetingButton(), 90);
		bookMeetingButton.click();

		switchToFrameByWebElement(waitForElementToBeVisible(a.getIframeBookMeeting(), 90));
	}

	@Then("I should see the popup window")
	public void iShouldSeeThePopupWindow() {

		WebElement meetingPopup = waitForElementToBeVisible(a.getMeetingPopup(), 90);
		meetingPopup.isDisplayed();
	}

	@Given("the Book Meeting popup is displayed")
	public void theBookMeetingPopupIsDisplayed() {

		WebElement bookMeetingButtons = waitForElementToBeVisible(a.getBookaMeetingButton(), 90);
		bookMeetingButtons.isDisplayed();

		WebElement bookMeetingButton = waitForElementToBeClickable(a.getBookaMeetingButton(), 90);
		bookMeetingButton.click();

		switchToFrameByWebElement(waitForElementToBeVisible(a.getIframeBookMeeting(), 90));

		scrollToElement(waitForElementToBeVisible(a.getScrollCalender(), 90));

		switchToMainWindow();
	}

	@When("I click on the close icon")
	public void iClickOnTheCloseIcon() {

		WebElement closeButton1 = waitForElementToBeVisible(a.getCloseButton(), 90);
		closeButton1.isDisplayed();

		WebElement closeButton = waitForElementToBeClickable(a.getCloseButton(), 90);
		clickElement(closeButton);
	}

	@Then("the popup window should close and the Home page should be visible")
	public void thePopupWindowShouldCloseAndHomePageVisible() {

	}

	@When("I click on the Call Us Now button")
	public void iClickOnTheCallUsNowButton() {
		WebElement callUsNowButton = waitForElementToBeClickable(a.getCallUsNowButton(), 30);

		callUsNowButton.click();
	}

	@Then("I should see a call popup alert")
	public void iShouldSeeACallPopupAlert() {

	}
}
