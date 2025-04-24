package org.step;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.BrochersPOM;
import org.page.PrevajPOM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_08StepDefinitionClass extends BaseClass {

	PrevajPOM a = new PrevajPOM();
	BrochersPOM b = new BrochersPOM();

	@Given("I am on the home page")
	public void iAmOnTheHomePage() {

	}

	@When("I access the services section")
	public void iAccessTheServicesSection() throws InterruptedException {

		try {

			scrollToElement(a.getOurServiceSection());

			WebElement servicesSect = waitForElementToBeVisible(a.getOurServiceSection(), 90);
			servicesSect.isDisplayed();

			WebElement ecomLink = waitForElementToBeVisible(a.getECommerceLink(), 90);
			clickElement(ecomLink);
			Thread.sleep(5000);

			WebElement ecomPage = waitForElementToBeVisible(a.getECommerceSection(), 90);
			ecomPage.isDisplayed();
			Thread.sleep(5000);

			setMainWindowHandle();

			System.out.println("I access the services section and navigate to e commerce section");

		} catch (Exception e) {

			System.out.println("I did not access the services section" + "Error:" + e.getMessage());

		}
	}

	@When("I browse all available brochures in E-commerce services")
	public void iBrowseAllAvailableBrochuresInECommerceServices() {

		for (int page = 1; page <= 24; page++) {
			System.out.println("Verifying brochure posts on Ecommerce page: " + page);

			List<WebElement> brochurePosts = List.of(b.getBrochure1(), b.getBrochure2(), b.getBrochure3(),
					b.getBrochure4(), b.getBrochure5(), b.getBrochure6());

			for (WebElement brochurePost : brochurePosts) {
				try {
					scrollToElement(brochurePost);
					waitForPageLoad();

					clickElement(brochurePost);
					waitForPageLoad();
					switchToNewWindowAndGetTitle();

				} catch (Exception e) {
					System.out.println(
							"Error verifying a brochure post on Ecommerce page " + page + ": " + e.getMessage());
				}
			}

			if (page < 24) {
				WebElement nextButton = waitForElementToBeClickable(b.getNextBtn(), 60);
				clickElement(nextButton);
				waitForPageLoad();
			}
		}

	}

	@Then("I should be navigated to the respective brochure page")
	public void iShouldBeNavigatedToTheRespectiveBrochurePage() {

		System.out.println("I succesfully navigated to the respective brochure page");

	}

	@When("I move to the services section")
	public void iMoveToTheServicesSection() {

		try {

			scrollToElement(a.getOurServiceSection());

			WebElement servicesSect = waitForElementToBeVisible(a.getOurServiceSection(), 90);
			servicesSect.isDisplayed();

			WebElement apiLink = waitForElementToBeVisible(a.getApiLink(), 90);
			clickElement(apiLink);
			Thread.sleep(5000);

			WebElement apiPage = waitForElementToBeVisible(a.getApiSection(), 90);
			apiPage.isDisplayed();
			Thread.sleep(5000);

			setMainWindowHandle();

			System.out.println("I access the services section and navigate to api section");

		} catch (Exception e) {

			System.out.println("I did not access the services section" + "Error:" + e.getMessage());

		}

	}

	@When("I review each brochure in API services")
	public void iReviewEachBrochureInAPIServices() {

		for (int page = 1; page <= 19; page++) {
			System.out.println("Verifying brochure posts on Ecommerce page: " + page);

			List<WebElement> brochurePosts = List.of(b.getBrochure1(), b.getBrochure2(), b.getBrochure3(),
					b.getBrochure4(), b.getBrochure5(), b.getBrochure6());

			for (WebElement brochurePost : brochurePosts) {
				try {
					scrollToElement(brochurePost);
					waitForPageLoad();

					clickElement(brochurePost);
					waitForPageLoad();
					switchToNewWindowAndGetTitle();

				} catch (Exception e) {
					System.out.println(
							"Error verifying a brochure post on Ecommerce page " + page + ": " + e.getMessage());
				}
			}

			if (page < 19) {
				WebElement nextButton = waitForElementToBeClickable(b.getNextBtn(), 60);
				clickElement(nextButton);
				waitForPageLoad();
			}
		}

	}

	@Then("I should land on the correct brochure page")
	public void iShouldLandOnTheCorrectBrochurePage() {

		System.out.println("I succesfully navigated to the respective brochure page");

	}

	@When("I visit the services section")
	public void iVisitTheServicesSection() {

		try {

			scrollToElement(a.getOurServiceSection());

			WebElement endLink = waitForElementToBeVisible(a.getEndToEndLink(), 90);
			endLink.isDisplayed();

			WebElement endtoendLink = waitForElementToBeVisible(a.getEndToEndLink(), 90);
			clickElement(endtoendLink);
			Thread.sleep(5000);

			WebElement endPage = waitForElementToBeVisible(a.getEndToEndSection(), 90);
			endPage.isDisplayed();
			Thread.sleep(5000);

			setMainWindowHandle();

			System.out.println("I access the services section and navigate to end to end section");

		} catch (Exception e) {

			System.out.println("I did not access the services section" + "Error:" + e.getMessage());

		}

	}

	@When("I check all brochures under End-to-End services")
	public void iCheckAllBrochuresUnderEndToEndServices() {

		for (int page = 1; page <= 10; page++) {
			System.out.println("Verifying brochure posts on end to end page: " + page);

			List<WebElement> brochurePosts = List.of(b.getBrochure1(), b.getBrochure2(), b.getBrochure3(),
					b.getBrochure4(), b.getBrochure5(), b.getBrochure6());

			for (WebElement brochurePost : brochurePosts) {
				try {
					scrollToElement(brochurePost);
					waitForPageLoad();

					clickElement(brochurePost);
					waitForPageLoad();
					switchToNewWindowAndGetTitle();

				} catch (Exception e) {
					System.out.println(
							"Error verifying a brochure post on end to end page " + page + ": " + e.getMessage());
				}
			}

			if (page < 10) {
				WebElement nextButton = waitForElementToBeClickable(b.getNextBtn(), 60);
				clickElement(nextButton);
				waitForPageLoad();
			}
		}

	}

	@Then("I should be taken to the appropriate brochure page")
	public void iShouldBeTakenToTheAppropriateBrochurePage() {

		System.out.println("I succesfully navigated to the respective brochure page");

	}

	@When("I explore the services section")
	public void iExploreTheServicesSection() {

		try {

			scrollToElement(a.getOurServiceSection());

			WebElement dataLink = waitForElementToBeVisible(a.getDataIntelLink(), 90);
			dataLink.isDisplayed();

			WebElement datainLink = waitForElementToBeVisible(a.getDataIntelLink(), 90);
			clickElement(datainLink);
			Thread.sleep(5000);

			WebElement dataPage = waitForElementToBeVisible(a.getDataIntelSection(), 90);
			dataPage.isDisplayed();
			Thread.sleep(5000);

			setMainWindowHandle();

			System.out.println("I access the services section and navigate to dataAnalytics section");

		} catch (Exception e) {

			System.out.println("I did not access the services section" + "Error:" + e.getMessage());

		}

	}

	@When("I inspect every brochure in Data Analytics services")
	public void iInspectEveryBrochureInDataAnalyticsServices() {

		for (int page = 1; page <= 4; page++) {
			System.out.println("Verifying brochure posts on dataAnalytics page: " + page);

			List<WebElement> brochurePosts = List.of(b.getBrochure1(), b.getBrochure2(), b.getBrochure3(),
					b.getBrochure4(), b.getBrochure5(), b.getBrochure6());

			for (WebElement brochurePost : brochurePosts) {
				try {
					scrollToElement(brochurePost);
					waitForPageLoad();

					clickElement(brochurePost);
					waitForPageLoad();
					switchToNewWindowAndGetTitle();

				} catch (Exception e) {
					System.out.println(
							"Error verifying a brochure post on dataAnalytics page " + page + ": " + e.getMessage());
				}
			}

			if (page < 4) {
				WebElement nextButton = waitForElementToBeClickable(b.getNextBtn(), 60);
				clickElement(nextButton);
				waitForPageLoad();
			}
		}

	}

	@Then("I should reach the relevant brochure page")
	public void iShouldReachTheRelevantBrochurePage() {

		System.out.println("I succesfully navigated to the respective brochure page");

	}

	@When("I navigate through the services section")
	public void iNavigateThroughTheServicesSection() {

		try {

			scrollToElement(a.getOurServiceSection());

			WebElement cloudLink = waitForElementToBeVisible(a.getCloudImplementLink(), 90);
			cloudLink.isDisplayed();

			WebElement cloudIm = waitForElementToBeVisible(a.getCloudImplementLink(), 90);
			clickElement(cloudIm);
			Thread.sleep(5000);

			WebElement dataPage = waitForElementToBeVisible(a.getCloudImplementSection(), 90);
			dataPage.isDisplayed();
			Thread.sleep(5000);

			setMainWindowHandle();

			System.out.println("I access the services section and navigate to CloudImplement section");

		} catch (Exception e) {

			System.out.println("I did not access the services section" + "Error:" + e.getMessage());

		}

	}

	@When("I go through all brochures in Cloud services")
	public void iGoThroughAllBrochuresInCloudServices() {

		for (int page = 1; page <= 7; page++) {
			System.out.println("Verifying brochure posts on CloudImplement page: " + page);

			List<WebElement> brochurePosts = List.of(b.getBrochure1(), b.getBrochure2(), b.getBrochure3(),
					b.getBrochure4(), b.getBrochure5(), b.getBrochure6());

			for (WebElement brochurePost : brochurePosts) {
				try {
					scrollToElement(brochurePost);
					waitForPageLoad();

					clickElement(brochurePost);
					waitForPageLoad();
					switchToNewWindowAndGetTitle();

				} catch (Exception e) {
					System.out.println(
							"Error verifying a brochure post on CloudImplement page " + page + ": " + e.getMessage());
				}
			}

			if (page < 7) {
				WebElement nextButton = waitForElementToBeClickable(b.getNextBtn(), 60);
				clickElement(nextButton);
				waitForPageLoad();
			}
		}

	}

	@Then("I should be directed to the expected brochure page")
	public void iShouldBeDirectedToTheExpectedBrochurePage() {

		System.out.println("I succesfully navigated to the respective brochure page");

	}

	@When("I enter the services section")
	public void iEnterTheServicesSection() {

		try {

			scrollToElement(a.getProductEngSection());

			WebElement prodLink = waitForElementToBeVisible(a.getProductEngLink(), 90);
			prodLink.isDisplayed();

			WebElement prodEng = waitForElementToBeVisible(a.getProductEngSection(), 90);
			clickElement(prodEng);
			Thread.sleep(5000);

			WebElement prodEngPage = waitForElementToBeVisible(a.getProductEngSection(), 90);
			prodEngPage.isDisplayed();
			Thread.sleep(5000);

			setMainWindowHandle();

			System.out.println("I access the services section and navigate to ProductEng section");

		} catch (Exception e) {

			System.out.println("I did not access the services section" + "Error:" + e.getMessage());

		}

	}

	@When("I verify each brochure in Product Engineering services")
	public void iVerifyEachBrochureInProductEngineeringServices() {

		for (int page = 1; page <= 8; page++) {
			System.out.println("Verifying brochure posts on ProductEng page: " + page);

			List<WebElement> brochurePosts = List.of(b.getBrochure1(), b.getBrochure2(), b.getBrochure3(),
					b.getBrochure4(), b.getBrochure5(), b.getBrochure6());

			for (WebElement brochurePost : brochurePosts) {
				try {
					scrollToElement(brochurePost);
					waitForPageLoad();

					clickElement(brochurePost);
					waitForPageLoad();
					switchToNewWindowAndGetTitle();

				} catch (Exception e) {
					System.out.println(
							"Error verifying a brochure post on ProductEng page " + page + ": " + e.getMessage());
				}
			}

			if (page < 8) {
				WebElement nextButton = waitForElementToBeClickable(b.getNextBtn(), 60);
				clickElement(nextButton);
				waitForPageLoad();
			}
		}

	}

	@Then("I should be routed to the corresponding brochure page")
	public void iShouldBeRoutedToTheCorrespondingBrochurePage() {

		System.out.println("I succesfully navigated to the respective brochure page");

	}

	@When("I reach the services section")
	public void iReachTheServicesSection() {

		try {

			scrollToElement(a.getProductEngSection());

			WebElement platLink = waitForElementToBeVisible(a.getPlatformImplementLink(), 90);
			platLink.isDisplayed();

			WebElement platLink1 = waitForElementToBeVisible(a.getPlatformImplementSection(), 90);
			clickElement(platLink1);
			Thread.sleep(5000);

			WebElement platLink1Page = waitForElementToBeVisible(a.getPlatformImplementSection(), 90);
			platLink1Page.isDisplayed();
			Thread.sleep(5000);

			setMainWindowHandle();

			System.out.println("I access the services section and navigate to PlatformImplement section");

		} catch (Exception e) {

			System.out.println("I did not access the services section" + "Error:" + e.getMessage());

		}

	}

	@When("I analyze the brochures under Platform Implementation services")
	public void iAnalyzeTheBrochuresUnderPlatformImplementationServices() {

		for (int page = 1; page <= 22; page++) {
			System.out.println("Verifying brochure posts on PlatformImplement page: " + page);

			List<WebElement> brochurePosts = List.of(b.getBrochure1(), b.getBrochure2(), b.getBrochure3(),
					b.getBrochure4(), b.getBrochure5(), b.getBrochure6());

			for (WebElement brochurePost : brochurePosts) {
				try {
					scrollToElement(brochurePost);
					waitForPageLoad();

					clickElement(brochurePost);
					waitForPageLoad();
					switchToNewWindowAndGetTitle();

				} catch (Exception e) {
					System.out.println("Error verifying a brochure post on PlatformImplement page " + page + ": "
							+ e.getMessage());
				}
			}

			if (page < 22) {
				WebElement nextButton = waitForElementToBeClickable(b.getNextBtn(), 60);
				clickElement(nextButton);
				waitForPageLoad();
			}
		}

	}

	@Then("I should be forwarded to the right brochure page")
	public void iShouldBeForwardedToTheRightBrochurePage() {

		System.out.println("I succesfully navigated to the respective brochure page");

	}

	@When("I open the services section")
	public void iOpenTheServicesSection() {

		try {

			scrollToElement(a.getProductEngSection());

			WebElement qualLink = waitForElementToBeVisible(a.getQualityAssuranceLink(), 90);
			qualLink.isDisplayed();

			WebElement qualLink1 = waitForElementToBeVisible(a.getQualityAssuranceSection(), 90);
			clickElement(qualLink1);
			Thread.sleep(5000);

			WebElement qualLinkPage = waitForElementToBeVisible(a.getQualityAssuranceSection(), 90);
			qualLinkPage.isDisplayed();
			Thread.sleep(5000);

			setMainWindowHandle();

			System.out.println("I access the services section and navigate to QualityAssurance section");

		} catch (Exception e) {

			System.out.println("I did not access the services section" + "Error:" + e.getMessage());

		}

	}

	@When("I go through each brochure in Quality Assurance services")
	public void iGoThroughEachBrochureInQualityAssuranceServices() {

		for (int page = 1; page <= 6; page++) {
			System.out.println("Verifying brochure posts on QualityAssurance page: " + page);

			List<WebElement> brochurePosts = List.of(b.getBrochure1(), b.getBrochure2(), b.getBrochure3(),
					b.getBrochure4(), b.getBrochure5(), b.getBrochure6());

			for (WebElement brochurePost : brochurePosts) {
				try {
					scrollToElement(brochurePost);
					waitForPageLoad();

					clickElement(brochurePost);
					waitForPageLoad();
					switchToNewWindowAndGetTitle();

				} catch (Exception e) {
					System.out.println(
							"Error verifying a brochure post on QualityAssurance page " + page + ": " + e.getMessage());
				}
			}

			if (page < 6) {
				WebElement nextButton = waitForElementToBeClickable(b.getNextBtn(), 60);
				clickElement(nextButton);
				waitForPageLoad();
			}
		}

	}

	@Then("I should be redirected to the relevant brochure page")
	public void iShouldBeRedirectedToTheRelevantBrochurePage() {

		System.out.println("I succesfully navigated to the respective brochure page");

	}

	@When("I check the services section")
	public void iCheckTheServicesSection() {

		try {

			scrollToElement(a.getProductEngSection());

			WebElement mainLink = waitForElementToBeVisible(a.getMaintainLink(), 90);
			mainLink.isDisplayed();

			WebElement mainLink1 = waitForElementToBeVisible(a.getMaintainSection(), 90);
			clickElement(mainLink1);
			Thread.sleep(5000);

			WebElement mainLinkPage = waitForElementToBeVisible(a.getMaintainSection(), 90);
			mainLinkPage.isDisplayed();
			Thread.sleep(5000);

			setMainWindowHandle();

			System.out.println("I access the services section and navigate to Maintainance section");

		} catch (Exception e) {

			System.out.println("I did not access the services section" + "Error:" + e.getMessage());

		}

	}

	@When("I review the brochures listed under Maintenance services")
	public void iReviewTheBrochuresListedUnderMaintenanceServices() {

		for (int page = 1; page <= 36; page++) {
			System.out.println("Verifying brochure posts on Maintainance page: " + page);

			List<WebElement> brochurePosts = List.of(b.getBrochure1(), b.getBrochure2(), b.getBrochure3(),
					b.getBrochure4(), b.getBrochure5(), b.getBrochure6());

			for (WebElement brochurePost : brochurePosts) {
				try {
					scrollToElement(brochurePost);
					waitForPageLoad();

					clickElement(brochurePost);
					waitForPageLoad();
					switchToNewWindowAndGetTitle();

				} catch (Exception e) {
					System.out.println(
							"Error verifying a brochure post on Maintainance page " + page + ": " + e.getMessage());
				}
			}

			if (page < 36) {
				WebElement nextButton = waitForElementToBeClickable(b.getNextBtn(), 60);
				clickElement(nextButton);
				waitForPageLoad();
			}
		}

	}

	@Then("I should be taken to the expected brochure page")
	public void iShouldBeTakenToTheExpectedBrochurePage() {

		System.out.println("I succesfully navigated to the respective brochure page");

	}
}
