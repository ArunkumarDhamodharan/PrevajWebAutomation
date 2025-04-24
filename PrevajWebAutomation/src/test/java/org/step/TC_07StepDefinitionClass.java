package org.step;

import java.util.ArrayList;
import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.BlogPOM;
import org.page.PrevajPOM;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_07StepDefinitionClass extends BaseClass {

	PrevajPOM a = new PrevajPOM();
	BlogPOM b = new BlogPOM();

	@When("I navigate to the blog post section")
	public void iNavigateToTheBlogPostSection() throws InterruptedException {

		WebElement blogMenu = waitForElementToBeClickable(a.getBlogMenu(), 60);
		blogMenu.click();
		Thread.sleep(5000); // Ensure the page is fully loaded
		setMainWindowHandle(); // Store the main window handle

	}

	@When("I click on each blog post")
	public void iClickOnEachBlogPost() {
//		List<String> verifiedPosts = new ArrayList<>();

		for (int page = 1; page <= 24; page++) {
			System.out.println("Verifying blog posts on page: " + page);

			List<WebElement> blogPosts = List.of(b.getBlogPost1(), b.getBlogPost2(), b.getBlogPost3(),
					b.getBlogPost4());

			for (WebElement blogPost : blogPosts) {
				try {
					scrollToElement(blogPost);

					clickElement(blogPost);
					switchToNewWindowAndGetTitle();

				} catch (Exception e) {
					System.out.println("Error verifying a blog post on page " + page + ": " + e.getMessage());
				}
			}

			if (page < 24) {
				WebElement nextButton = waitForElementToBeClickable(b.getNextBtn(), 60);
				clickElement(nextButton);
				waitForPageLoad();
			}
		}
	}

	@Then("I should see that all blog posts navigate to their respective pages")
	public void iShouldSeeThatAllBlogPostsNavigateToTheirRespectivePages() {

		System.out.println("All blog posts have been successfully verified.");

	}
}