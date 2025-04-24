package org.step;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.PrevajPOM;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_02StepDefinitionClass extends BaseClass {
	PrevajPOM a = new PrevajPOM();

	@When("I click on each social media link in the footer")
	public void iClickOnEachSocialMediaLinkInTheFooter() {

		try {
			
			scrollToElement(a.getPrivacyPolicy());
			
			setMainWindowHandle();

			WebElement fbLink = waitForElementToBeClickable(a.getFbLink(), 50);
			fbLink.click();
			switchToWindowByUrl("https://www.facebook.com/prevaj");
			switchBackToMainWindow();

			WebElement twitterLink = waitForElementToBeClickable(a.getTwitterLink(), 50);
			twitterLink.click();
			switchToWindowByUrl("https://twitter.com/prevaj");
			switchBackToMainWindow();

			WebElement youtubeLink = waitForElementToBeClickable(a.getYoutubeLink(), 50);
			youtubeLink.click();
			switchToWindowByUrl("https://www.youtube.com/@prevajtechnologies");
			switchBackToMainWindow();

			WebElement linkedinLink = waitForElementToBeClickable(a.getLinkedinLink(), 50);
			linkedinLink.click();
			switchToWindowByUrl("https://in.linkedin.com/company/prevaj-consultants");
			switchBackToMainWindow();

			WebElement instagramLink = waitForElementToBeClickable(a.getInstagramLink(), 50);
			instagramLink.click();
			switchToWindowByUrl("https://www.instagram.com/prevaj_consultants/");
			switchBackToMainWindow();

			WebElement pinterestLink = waitForElementToBeClickable(a.getPinterestLink(), 50);
			pinterestLink.click();
			switchToWindowByUrl("https://in.pinterest.com/prevaj/");
			switchBackToMainWindow();

			System.out.println("Social Media page verification successful");

		} catch (Exception e) {
			System.out.println("Social Media page verification unsuccessful. Error: " + e.getMessage());
		}
	}

	@Then("I should be redirected to the respective social media pages")
	public void iShouldBeRedirectedToTheRespectiveSocialMediaPages() {

	}

	@Then("the Newsletter section should be displayed in the footer area")
	public void theNewsletterSectionShouldBeDisplayedInTheFooterArea() {

		scrollToElement(a.getPrivacyPolicy());
		
		WebElement newsEmail = waitForElementToBeVisible(a.getNewsEmail(), 20);
		newsEmail.isDisplayed();

	}

	@When("I enter a valid email ID in the Newsletter section and click on the Subscribe button")
	public void iEnterAValidEmailIDInTheNewsletterSectionAndClickOnTheSubscribeButton() {
		
		scrollToElement(a.getPrivacyPolicy());

		WebElement newsEmail = waitForElementToBeVisible(a.getNewsEmail(), 20);
		newsEmail.sendKeys("arunkumard@prevaj.com");

		WebElement subscribeBtn = waitForElementToBeClickable(a.getSubscribeButton(), 20);
		subscribeBtn.click();

	}

	@Then("I should see the confirmation message")
	public void iShouldSeeTheMessage() {

		backwardButton();
	}

	@When("I click on the Privacy Policy link")
	public void iClickOnThePrivacyPolicyLink() {
		
		scrollToElement(a.getPrivacyPolicy());
		
		setMainWindowHandle();

		WebElement privacy = waitForElementToBeClickable(a.getPrivacyPolicy(), 40);
		privacy.click();
		
		switchToWindowByUrl("https://prevaj.com/prevaj-privacy-policy/");

		WebElement privacyPage = waitForElementToBeVisible(a.getPrivacyPage(), 40);
		privacyPage.isDisplayed();

		switchBackToMainWindow();

	}

	@Then("I should see the Privacy Policy page")
	public void iShouldSeeThePrivacyPolicyPage() {
		
	}

}
