package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlogPOM extends BaseClass {
	public BlogPOM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#next_page")
	private WebElement nextBtn;

	public WebElement getNextBtn() {
		return nextBtn;
	}

	@FindBy(css = "#prev_page")
	private WebElement preBtn;

	public WebElement getPreBtn() {
		return preBtn;
	}

	@FindBy(xpath = "(//a[@class='bl-posts-hdrtxt'])[1]")
	private WebElement blogPost1;

	public WebElement getBlogPost1() {
		return blogPost1;
	}

	@FindBy(xpath = "(//a[@class='bl-posts-hdrtxt'])[2]")
	private WebElement blogPost2;

	public WebElement getBlogPost2() {
		return blogPost2;
	}

	@FindBy(xpath = "(//a[@class='bl-posts-hdrtxt'])[3]")
	private WebElement blogPost3;

	public WebElement getBlogPost3() {
		return blogPost3;
	}

	@FindBy(xpath = "(//a[@class='bl-posts-hdrtxt'])[4]")
	private WebElement blogPost4;

	public WebElement getBlogPost4() {
		return blogPost4;
	}

	@FindBy(xpath = "//h1[@class='entry-title']")
	private WebElement entryTitle;

	public WebElement getEntryTitle() {
		return entryTitle;
	}

}
