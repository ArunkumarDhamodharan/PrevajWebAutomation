package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrochersPOM extends BaseClass {

	public BrochersPOM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class='flyr-btn'])[1]")
	private WebElement brochure1;

	public WebElement getBrochure1() {
		return brochure1;
	}

	@FindBy(xpath = "(//a[@class='flyr-btn'])[2]")
	private WebElement brochure2;

	public WebElement getBrochure2() {
		return brochure2;
	}

	@FindBy(xpath = "(//a[@class='flyr-btn'])[3]")
	private WebElement brochure3;

	public WebElement getBrochure3() {
		return brochure3;
	}

	@FindBy(xpath = "(//a[@class='flyr-btn'])[4]")
	private WebElement brochure4;

	public WebElement getBrochure4() {
		return brochure4;
	}

	@FindBy(xpath = "(//a[@class='flyr-btn'])[5]")
	private WebElement brochure5;

	public WebElement getBrochure5() {
		return brochure5;
	}

	@FindBy(xpath = "(//a[@class='flyr-btn'])[6]")
	private WebElement brochure6;

	public WebElement getBrochure6() {
		return brochure6;
	}

	@FindBy(id = "next_page")
	private WebElement nextBtn;

	public WebElement getNextBtn() {
		return nextBtn;
	}

	@FindBy(id = "prev_page")
	private WebElement preBtn;

	public WebElement getPreBtn() {
		return preBtn;
	}

}
