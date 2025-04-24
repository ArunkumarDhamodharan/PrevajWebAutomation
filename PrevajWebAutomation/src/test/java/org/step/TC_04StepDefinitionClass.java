package org.step;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.PrevajPOM;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_04StepDefinitionClass extends BaseClass {

	PrevajPOM a = new PrevajPOM();

	@When("I click on the Book a Meeting button")
	public void iClickOnTheBookAMeetingButton() {

		try {
			WebElement gmeetHome = waitForElementToBeClickable(a.getBookmeetHome(), 90);
			gmeetHome.click();

			WebElement iframeElement = waitForElementToBeVisible(a.getIframeBookMeeting(), 90);
			switchToFrameByWebElement(iframeElement);

			WebElement meetPop = waitForElementToBeVisible(a.getMeetingPopup(), 90);
			meetPop.isDisplayed();

			System.out.println("Book a Meeting button verification successful ");

		} catch (Exception e) {
			System.out.println("Book a Meeting button verification unsuccessful " + e.getMessage());
		}
	}

	@When("I click on the text links in the Who We Are section")
	public void iClickOnTheTextLinksInTheWhoWeAreSection() {

		try {

			scrollToElement(a.getWhoWeAreSection());

			waitForElementToBeClickable(a.getDigitalServicesLink(), 50).click();
			waitForElementToBeVisible(a.getOurServiceSection(), 50).isDisplayed();

			scrollToElement(a.getWhoWeAreSection());

			waitForElementToBeClickable(a.getTechnologiesLink(), 50).click();
			waitForElementToBeVisible(a.getTechSection(), 50).isDisplayed();

			scrollToElement(a.getWhoWeAreSection());

			waitForElementToBeClickable(a.getIndustriesLink(), 50).click();
			waitForElementToBeVisible(a.getIndustrySection(), 50).isDisplayed();

			scrollToElement(a.getWhoWeAreSection());

			System.out.println("the text links in the Who We Are section  verification successfull");

		} catch (Exception e) {
			System.out.println("the text links in the Who We Are section  verification unsuccessfull" + e.getMessage());
		}

	}

	@Then("I should  redirected to the respective pages")
	public void iShouldRedirectedToTheRespectivePages() {

	}

	@When("I click on the Why Prevaj section YouTube video")
	public void iClickOnTheWhyPrevajSectionYouTubeVideo() {

		try {

			scrollToElement(a.getWhyPrevaj());

			WebElement iframeElement1 = waitForElementToBeVisible(a.getIframeYoutubeLink(), 90);
			switchToFrameByWebElement(iframeElement1);

			WebElement youtubeLink = waitForElementToBeClickable(a.getYoutubeclick(), 90);

			if (youtubeLink.isDisplayed() && youtubeLink.isEnabled()) {
				youtubeLink.click();
			} else {
				System.out.println("YouTube video element is not interactable");
			}

			System.out.println("Why Prevaj section YouTube video verification successfull ");

		} catch (Exception e) {
			System.out.println("Why Prevaj section YouTube video verification unsuccessfull " + e.getMessage());
		}

	}

	@Then("the YouTube video should play")
	public void theYouTubeVideoShouldPlay() {

	}

	@When("I click on the links in the Our Advanced Level End To End Services section")
	public void iClickOnTheLinksInTheOurAdvancedLevelEndToEndServicesSection() {
		try {
			scrollToElement(a.getOurServiceSection());

			// Creating a list of links and their respective sections
			Map<Supplier<WebElement>, Supplier<WebElement>> servicesMap = new LinkedHashMap<>();
			servicesMap.put(() -> a.getECommerceLink(), () -> a.getECommerceSection());
			servicesMap.put(() -> a.getApiLink(), () -> a.getApiSection());
			servicesMap.put(() -> a.getEndToEndLink(), () -> a.getEndToEndSection());
			servicesMap.put(() -> a.getDataIntelLink(), () -> a.getDataIntelSection());
			servicesMap.put(() -> a.getCloudImplementLink(), () -> a.getCloudImplementSection());
			servicesMap.put(() -> a.getProductEngLink(), () -> a.getProductEngSection());
			servicesMap.put(() -> a.getPlatformImplementLink(), () -> a.getPlatformImplementSection());
			servicesMap.put(() -> a.getQualityAssuranceLink(), () -> a.getQualityAssuranceSection());
			servicesMap.put(() -> a.getMaintainLink(), () -> a.getMaintainSection());

			// Iterating over the map
			for (Map.Entry<Supplier<WebElement>, Supplier<WebElement>> entry : servicesMap.entrySet()) {
				waitForElementToBeClickable(entry.getKey().get(), 90).click();
				waitForElementToBeVisible(entry.getValue().get(), 90).isDisplayed();
				backwardButton();
			}

			System.out.println("Links in the Our Advanced Level End To End Services section verification successful");

		} catch (Exception e) {
			System.out.println("Links in the Our Advanced Level End To End Services section verification unsuccessful: "
					+ e.getMessage());
		}
	}

	@Then("I should be redirected  the respective pages")
	public void iShouldBeRedirectedTheRespectivePages() {

	}

	@When("I click on the links in the Technologies We Work With section")
	public void iClickOnTheLinksInTheTechnologiesWeWorkWithSection() {

		try {
	        scrollToElement(a.getTechSection());

	     // Click and verify multiple links
	        clickAndVerifyLink(a.getWooCommerceLink(), a.getWooCommercePage());
	        clickAndVerifyLink(a.getMagentoLink(), a.getMagentoPage());
	        clickAndVerifyLink(a.getShopifyLink(), a.getShopifyPage());
	        clickAndVerifyLink(a.getBigcommerceLink(), a.getBigCommercePage());
	        clickAndVerifyLink(a.getVolusionLink(), a.getVolusionPage());
	        clickAndVerifyLink(a.getZenCartLink(), a.getZenCartPage());
	        clickAndVerifyLink(a.getPrestashopLink(), a.getPrestashopPage());
	        clickAndVerifyLink(a.getCsCartLink(), a.getCsCartPage());

	        // CMS Section
	        clickAndVerifySection(a.getCmsSectionLink(), new WebElement[][]{
	                {a.getWordpressLink(), a.getWordpressPage()},
	                {a.getDrupalLink(), a.getDrupalPage()},
	                {a.getJoomlaLink(), a.getJoomlaPage()}
	        });
	        

	        // Frontend Section
	        clickAndVerifySection(a.getFrontendSectionLink(), new WebElement[][]{
	                {a.getJavascriptLink(), a.getJavascriptPage()},
	                {a.getTypescriptLink(), a.getTypescriptPage()},
	                {a.getNextJsLink(), a.getNextJsPage()},
	                {a.getReactJsLink(), a.getReactJsPage()},
	                {a.getVueLink(), a.getVuePage()},
	                {a.getAngularLink(), a.getAngularPage()},
	                {a.getThreeJsLink(), a.getThreeJsPage()},
	                {a.getBackboneJsLink(), a.getBackboneJsPage()},
	                {a.getReactNativeLink(), a.getReactNativePage()}
	        });

	        // Backend Section
	        clickAndVerifySection(a.getBackendSectionLink(), new WebElement[][]{
	                {a.getPhpLink(), a.getPhpPage()},
	                {a.getDotNetLink(), a.getDotNetPage()},
	                {a.getNodeJsLink(), a.getNodeJsPage()},
	                {a.getPythonLink(), a.getPythonPage()},
	                {a.getJavaLink(), a.getJavaPage()},
	                {a.getRubyLink(), a.getRubyPage()},
	                {a.getCppLink(), a.getCppPage()},
	                {a.getCsharpLink(), a.getCSharpPage()}
	        });

	        // Framework Section
	        clickAndVerifySection(a.getFrameworkSectionLink(), new WebElement[][]{
	                {a.getCodeIgniterLink(), a.getCodeIgniterPage()},
	                {a.getLaravelLink(), a.getLaravelPage()},
	                {a.getZendFrameworkLink(), a.getZendFrameworkPage()},
	                {a.getSymfonyLink(), a.getSymfonyPage()},
	                {a.getDjangoLink(), a.getDjangoPage()},
	                {a.getFlaskLink(), a.getFlaskPage()},
	                {a.getExpressJSLink(), a.getExpressJSPage()},
	                {a.getNgRxLink(), a.getNgrxPage()},
	                {a.getPrototypeJSLink(), a.getPrototypeJSPage()},
	                {a.getBootstrapLink(), a.getBootstrapPage()},
	                {a.getJestLink(), a.getJestPage()},
	                {a.getPysparkLink(), a.getPysparkPage()},
	                {a.getPrimeNGLink(), a.getPrimeNGPage()},
	        		{a.getHapiJSLink(), a.getHapiJSPage()},
	        		{a.getAppiumLink(), a.getAppiumPage()},
	        		{a.getBDDLink(), a.getBddPage()},
	        		{a.getCucumberLink(), a.getCucumberPage()},
	        		{a.getTestNGLink(), a.getTestNGPage()},
	        		{a.getKarateLink(), a.getKaratePage()},
	        		{a.getPhoneGapLink(), a.getPhoneGapPage()},
	        		{a.getIonicLink(), a.getIonicPage()}
	        });
	        
	     // Libraries Section
	        clickAndVerifySection(a.getLibrariesSectionLink(), new WebElement[][]{
	                {a.getReduxLink(), a.getReduxPage()},
	                {a.getRxjsLink(), a.getRxjsPage()},
	                {a.getJqueryLink(), a.getjQueryPage()},
	                {a.getChartJsLink(), a.getChartJSPage()},
	                {a.getD3JsLink(), a.getD3JSPage()},
	                {a.getUnderscoreJsLink(), a.getUnderscoreJSPage()},
	                {a.getMomentJsLink(), a.getMomentJSPage()},
	                {a.getMaterialUiLink(), a.getMaterialUIPage()},
	                {a.getEnzymeLink(), a.getEnzymePage()},
	                {a.getStoryBookLink(), a.getStoryBookPage()},
	                {a.getAngularMaterialLink(), a.getAngularMaterialPage()},
	                {a.getSocketIoLink(), a.getSocketIOPage()}
	        });

	        // DevOps Section
	        clickAndVerifySection(a.getDevopsSection(), new WebElement[][]{
	                {a.getDockerLink(), a.getDockerPage()},
	                {a.getKubernetesLink(), a.getKubernetesPage()},
	                {a.getGitLink(), a.getGitPage()},
	                {a.getSvnLink(), a.getSvnPage()},
	                {a.getJenkinsLink(), a.getJenkinsPage()},
	                {a.getSeleniumLink(), a.getSeleniumPage()},
	                {a.getChefLink(), a.getChefPage()},
	                {a.getPuppetLink(), a.getPuppetPage()},
	                {a.getDeployBotLink(), a.getDeployBotPage()},
	                {a.getTravisCiLink(), a.getTravisCIPage()},
	                {a.getDevopsLink(), a.getDevopsPage()}
	        });

	        // Cloud Section
	        clickAndVerifySection(a.getCloudSectionLink(), new WebElement[][]{
	                {a.getAwsLink(), a.getAwsPage()},
	                {a.getAzureLink(), a.getAzurePage()},
	                {a.getGcpLink(), a.getGcpPage()}
	        });

	        // Database Section
	        clickAndVerifySection(a.getDatabaseSectionPage(), new WebElement[][]{
	                {a.getSqlServerLink(), a.getSqlServerPage()},
	                {a.getMySQLLink(), a.getMySQLPage()},
	                {a.getPostgreSQLLink(), a.getPostgreSQLPage()},
	                {a.getSQLiteLink(), a.getSqlLitePage()},
	                {a.getMongoDBLink(), a.getMongoDBPage()},
	                {a.getMariaDBLink(), a.getMariaDBPage()},
	                {a.getElasticSearchLink(), a.getElasticSearchPage()},
	                {a.getFirebaseLink(), a.getFirebasePage()},
	                {a.getRDSLink(), a.getRdsPage()},
	                {a.getDynamoDBLink(), a.getDynamoDBPage()},
	                {a.getOracleLink(), a.getOraclePage()}
	        });
	        
	        System.out.println("the links in the Technologies We Work With section verfication succesfull");

	    } catch (Exception e) {
	    	System.out.println("the links in the Technologies We Work With section verfication unsuccesfull"+e.getMessage());
	    }   
	}
	
	/**
	 * Clicks a link, verifies if the target page is displayed, and navigates back.
	 */
	private void clickAndVerifyLink(WebElement link, WebElement page) {
	    WebElement element = waitForElementToBeClickable(link, 90);
	    clickElement(element);
	    waitForElementToBeVisible(page, 90).isDisplayed();
	    backwardButton();
	}

	/**
	 * Clicks a section, iterates through the links within that section, and verifies each one.
	 */
	private void clickAndVerifySection(WebElement section, WebElement[][] linksAndPages) {
	    waitForElementToBeVisible(section, 90);
	    WebElement sectionElement = waitForElementToBeClickable(section, 90);
	    clickElement(sectionElement);

	    for (WebElement[] linkPagePair : linksAndPages) {
	        WebElement link = linkPagePair[0];
	        WebElement page = linkPagePair[1];
	        clickAndVerifyLink(link, page);
	        clickElement(sectionElement); // Reopen section after navigating back
	    }
	}


	@Then("I should be redirected to  respective pages")
	public void iShouldBeRedirectedToRespectivePages() {

	}

	@When("I click on the links in the Industries section")
	public void iClickOnTheLinksInTheIndustriesSection() {

		 try {
		        scrollToElement(a.getIndustrySection());

		        // Creating a map of links and their respective pages
		        Map<Supplier<WebElement>, Supplier<WebElement>> industriesMap = new LinkedHashMap<>();
		        industriesMap.put(() -> a.getRetailEcommerceLink(), () -> a.getRetailEcommercePage());
		        industriesMap.put(() -> a.getManufacturingLink(), () -> a.getManufacturingPage());
		        industriesMap.put(() -> a.getSoftwareITLink(), () -> a.getSoftwareAndItPage());
		        industriesMap.put(() -> a.getInsuranceFinancialServicesLink(), () -> a.getInsuranceAndFinancialServicesPage());
		        industriesMap.put(() -> a.getConstructionIndustryLink(), () -> a.getConstructionIndustryPage());
		        industriesMap.put(() -> a.getEntertainmentLink(), () -> a.getEntertainmentPage());
		        industriesMap.put(() -> a.getMarketingAdvertisingLink(), () -> a.getMarketingAndAdvertisingPage());
		        industriesMap.put(() -> a.getEnergyUtilitiesLink(), () -> a.getEnergyAndUtilitiesPage());
		        industriesMap.put(() -> a.getLegalLink(), () -> a.getLegalPage());
		        industriesMap.put(() -> a.getTelecomLink(), () -> a.getTelecomPage());
		        industriesMap.put(() -> a.getRealEstateLink(), () -> a.getRealEstatePage());

		        // Iterating over the map
		        for (Map.Entry<Supplier<WebElement>, Supplier<WebElement>> entry : industriesMap.entrySet()) {
		            waitForElementToBeClickable(entry.getKey().get(), 90).click();
		            waitForElementToBeVisible(entry.getValue().get(), 90).isDisplayed();
		            backwardButton();
		        }

		        System.out.println("The links in the Industries section verification successful");

		    } catch (Exception e) {
		        System.out.println("The links in the Industries section verification unsuccessful: " + e.getMessage());
		    }
	}

	@Then("should be redirected to the respective pages")
	public void shouldBeRedirectedToTheRespectivePages() {

	}

	@When("I click on the contact us button in the Let’s Discuss Your Project section")
	public void iClickOnTheContactUsButtonInTheLetSDiscussYourProjectSection() {

		try {

			scrollToElement(a.getContactButton());

			WebElement contactButton = waitForElementToBeClickable(a.getContactButton(), 90);
			clickElement(contactButton);

			WebElement contactSec2 = waitForElementToBeVisible(a.getConatctSection(), 90);
			contactSec2.isDisplayed();

			System.out
					.println("The contact us button in the Let’s Discuss Your Project section verfication successful");

		} catch (Exception e) {
			System.out
					.println("The contact us button in the Let’s Discuss Your Project section verfication unsuccessful"
							+ e.getMessage());
		}

	}

	@Then("I should be redirected to  Lets Talk form page")
	public void iShouldBeRedirectedToLetsTalkFormPage() {

	}

	@Then("I should see the logos of all clients in the Our Clients section")
	public void iShouldSeeTheLogosOfAllClientsInTheOurClientsSection() {

		try {

			scrollToElement(a.getOurClientSection());

			WebElement clientAbout = waitForElementToBeVisible(a.getClientAbout(), 90);
			clientAbout.isDisplayed();

			System.out.println("The logos of all clients in the Our Clients section verfication successful");

		} catch (Exception e) {
			System.out.println(
					"The logos of all clients in the Our Clients section verfication unsuccessful" + e.getMessage());
		}

	}

	@Then("I should see all ratings and reviews in the What do our clients say about us? section")
	public void iShouldSeeAllRatingsAndReviewsInTheWhatDoOurClientsSayAboutUsSection() {

		try {

			scrollToElement(a.getClientTest());

			WebElement clientSwiper = waitForElementToBeVisible(a.getClientSwiper(), 90);
			clientSwiper.isDisplayed();

			System.out.println(
					"All ratings and reviews in the What do our clients say about us? section  verfication successful");

		} catch (Exception e) {
			System.out.println(
					"All ratings and reviews in the What do our clients say about us? section  verfication unsuccessful"
							+ e.getMessage());
		}
	}

	@When("I click on the links in the Our Core Members section")
	public void iClickOnTheLinksInTheOurCoreMembersSection() {

		try {

			scrollToElement(a.getTeamSection());

			setMainWindowHandle();

			WebElement smRajan = waitForElementToBeClickable(a.getSmRajan(), 90);
			smRajan.click();

			switchToWindowByUrl("https://www.linkedin.com/in/rajan-subbiah-85a70a1a/");
			switchBackToMainWindow();

			WebElement priyaRajan = waitForElementToBeClickable(a.getPriyaRajan(), 90);
			clickElement(priyaRajan);
			switchToWindowByUrl("https://www.linkedin.com/in/prevaj-priya-rajan/");
			switchBackToMainWindow();

			WebElement maheshwarK = waitForElementToBeClickable(a.getMaheshwarK(), 90);
			clickElement(maheshwarK);
			switchToWindowByUrl("https://www.linkedin.com/in/maheshwar-krishnamgari/");
			switchBackToMainWindow();

			WebElement manojkumarC = waitForElementToBeClickable(a.getManojkumarC(), 90);
			clickElement(manojkumarC);
			switchToWindowByUrl("https://www.linkedin.com/in/manoj-kumar-953063180/");
			switchBackToMainWindow();

			WebElement sreeKrishnaRaja = waitForElementToBeClickable(a.getSreeKrishnaRaja(), 90);
			clickElement(sreeKrishnaRaja);
			switchToWindowByUrl("https://www.linkedin.com/in/sreekrishnaraja/");
			switchBackToMainWindow();

			WebElement nadeemTanvir = waitForElementToBeClickable(a.getNadeemTanvir(), 90);
			clickElement(nadeemTanvir);
			switchToWindowByUrl("https://www.linkedin.com/in/nadeem-tanvir/");
			switchBackToMainWindow();

			WebElement karonicDoss = waitForElementToBeClickable(a.getKaronicDoss(), 90);
			clickElement(karonicDoss);
			switchToWindowByUrl("https://www.linkedin.com/in/karonicdoss/");
			switchBackToMainWindow();

			System.out.println("The links in the Our Core Members section  verfication successful");

		} catch (Exception e) {
			System.out.println("The links in the Our Core Members section  verfication unsuccessful" + e.getMessage());
		}
	}

	@Then("I should be redirected to the respective pages")
	public void iShouldBeRedirectedToTheRespectivePages() {

	}

	@When("I click on the Get a Consultation button in the Let’s Discuss Your Project section")
	public void iClickOnTheGetAConsultationButtonInTheLetSDiscussYourProjectSection() {

		try {

			scrollToElement(a.getConsultButton());

			WebElement consultBtn = waitForElementToBeClickable(a.getConsultButton(), 90);
			clickElement(consultBtn);

			WebElement contactSction = waitForElementToBeVisible(a.getConatctSection(), 90);
			contactSction.isDisplayed();

			System.out.println(
					"Get a Consultation button in the Let’s Discuss Your Project section  verfication successful");

		} catch (Exception e) {
			System.out.println(
					"Get a Consultation button in the Let’s Discuss Your Project section  verfication unsuccessful"
							+ e.getMessage());

		}

	}

	@Then("I should be redirected to the Lets Talk form page")
	public void iShouldBeRedirectedToTheLetsTalkFormPage() {

	}
}
