package org.step;

import java.awt.AWTException;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.PrevajPOM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_06StepDefinitionClass extends BaseClass {

	PrevajPOM a = new PrevajPOM();

	@When("I enter numbers in the search field and click on the search icon")
	public void iEnterNumbersInTheSearchFieldAndClickOnTheSearchIcon() {

		WebElement blg = waitForElementToBeVisible(a.getBlogMenu(), 90);
		clickElement(blg);

		WebElement searchBox = waitForElementToBeVisible(a.getSearchBox(), 90);
		clickElement(searchBox);

		sendKeysBasedOnJs("465465446", searchBox);

		WebElement searchBtn = waitForElementToBeVisible(a.getSearchButton(), 90);
		clickElement(searchBtn);

	}

	@Then("I should see Sorry, no results  found displayed")
	public void iShouldSeeSorryNoResultsFoundDisplayed() {

		WebElement noResults = waitForElementToBeVisible(a.getNoResults(), 90);
		noResults.isDisplayed();

	}

	@When("I enter special characters in the search field and click on the search icon")
	public void iEnterSpecialCharactersInTheSearchFieldAndClickOnTheSearchIcon() {

		WebElement blg = waitForElementToBeVisible(a.getBlogMenu(), 90);
		clickElement(blg);

		WebElement searchBox = waitForElementToBeVisible(a.getSearchBox(), 90);
		clickElement(searchBox);

		sendKeysBasedOnJs("!@#$%^&", searchBox);

		WebElement searchBtn = waitForElementToBeVisible(a.getSearchButton(), 90);
		clickElement(searchBtn);

	}

	@Then("I should see Sorry, no results were found displayed")
	public void iShouldSeeSorryNoResultsWereFoundDisplayed() {

		WebElement noResults = waitForElementToBeVisible(a.getNoResults(), 90);
		noResults.isDisplayed();

	}

	@When("I click on the search icon without giving any input")
	public void iClickOnTheSearchIconWithoutGivingAnyInput() {

		WebElement blg = waitForElementToBeVisible(a.getBlogMenu(), 90);
		clickElement(blg);

		WebElement searchBox = waitForElementToBeVisible(a.getSearchBox(), 90);
		clickElement(searchBox);

		sendKeysBasedOnJs("", searchBox);

		WebElement searchBtn = waitForElementToBeVisible(a.getSearchButton(), 90);
		clickElement(searchBtn);

	}

	@Then("I should see the page reload")
	public void iShouldSeeThePageReload() {

		WebElement noResults = waitForElementToBeVisible(a.getNoResults(), 90);
		noResults.isDisplayed();

	}

	@When("I enter empty spaces in the search field and click on enter")
	public void iEnterEmptySpacesInTheSearchFieldAndClickOnEnter() throws AWTException {

		WebElement blg = waitForElementToBeVisible(a.getBlogMenu(), 90);
		clickElement(blg);

		WebElement searchBox = waitForElementToBeVisible(a.getSearchBox(), 90);
		clickElement(searchBox);

		spacePress();
		spaceRelease();

		WebElement searchBtn = waitForElementToBeVisible(a.getSearchButton(), 90);
		clickElement(searchBtn);
	}

	@Then("I should see  page reload")
	public void iShouldSeePageReload() {

	}

	@Given("I am on the blog page")
	public void iAmOnTheBlogPage() {

	}

	@When("I enter alphabets in the search field and click on the search icon")
	public void iEnterAlphabetsInTheSearchFieldAndClickOnTheSearchIcon() {

		WebElement blg = waitForElementToBeVisible(a.getBlogMenu(), 90);
		clickElement(blg);

		WebElement searchBox = waitForElementToBeVisible(a.getSearchBox(), 90);
		clickElement(searchBox);

		sendKeysBasedOnJs("magento", searchBox);

		WebElement searchBtn = waitForElementToBeVisible(a.getSearchButton(), 90);
		clickElement(searchBtn);

	}

	@Then("I should get related results")
	public void iShouldGetRelatedResults() {

		WebElement mgn = waitForElementToBeVisible(a.getMagento(), 90);
		mgn.isDisplayed();

	}

	@When("I click on the category any categries")
	public void iClickOnTheCategoryAnyCategries() {

		WebElement blg = waitForElementToBeVisible(a.getBlogMenu(), 90);
		clickElement(blg);

		WebElement ecom = waitForElementToBeVisible(a.getECommerceCategory(), 90);
		clickElement(ecom);

		scrollToElement(a.getSearchBox());

		WebElement ecomPost = waitForElementToBeVisible(a.getECommercePost(), 90);
		ecomPost.isDisplayed();

	}

	@Then("I should see blog related results")
	public void iShouldSeeBlogRelatedResults() {

	}

}
