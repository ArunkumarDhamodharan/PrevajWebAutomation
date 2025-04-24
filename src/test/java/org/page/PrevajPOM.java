package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrevajPOM extends BaseClass {

	public PrevajPOM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class='cmplz-btn cmplz-accept']")
	private WebElement cookiesAccept;

	public WebElement getCookiesAccept() {
		return cookiesAccept;
	}

	// ***********************************Header
	// part********************************************//

	@FindBy(xpath = "//a[text()='Home']")
	private WebElement homeMenu;

	public WebElement getHomeMenu() {
		return homeMenu;
	}

	@FindBy(xpath = "//div[@class='et_pb_menu__logo-wrap']")
	private WebElement siteLogo;

	public WebElement getSiteLogo() {
		return siteLogo;
	}

	@FindBy(xpath = "(//a[text()='About'])[1]")
	private WebElement aboutMenu;

	public WebElement getAboutMenu() {
		return aboutMenu;
	}

	@FindBy(xpath = "(//a[text()='Services'])[1]")
	private WebElement servicesMenu;

	public WebElement getServicesMenu() {
		return servicesMenu;
	}

	@FindBy(xpath = "(//a[text()='Technologies'])[1]")
	private WebElement techMenu;

	public WebElement getTechMenu() {
		return techMenu;
	}

	@FindBy(xpath = "(//a[text()='Industries'])[1]")
	private WebElement industryMenu;

	public WebElement getIndustryMenu() {
		return industryMenu;
	}

	@FindBy(xpath = "(//a[text()='Clients'])[1]")
	private WebElement clientsMenu;

	public WebElement getClientsMenu() {
		return clientsMenu;
	}

	@FindBy(xpath = "(//a[text()='Team'])[1]")
	private WebElement teamMenu;

	public WebElement getTeamMenu() {
		return teamMenu;
	}

	@FindBy(xpath = "(//a[text()='Blog'])[1]")
	private WebElement blogMenu;

	public WebElement getBlogMenu() {
		return blogMenu;
	}

	@FindBy(xpath = "(//a[text()='Contact'])[1]")
	private WebElement contactMenu;

	public WebElement getContactMenu() {
		return contactMenu;
	}

	@FindBy(xpath = "(//a[text()='Book a Meeting'])[1]")
	private WebElement bookaMeetingButton;

	public WebElement getBookaMeetingButton() {
		return bookaMeetingButton;
	}

	@FindBy(xpath = "(//iframe[@class='lazy entered loaded'])[1]")
	private WebElement iframeBookMeeting;

	public WebElement getIframeBookMeeting() {
		return iframeBookMeeting;
	}

	@FindBy(xpath = "(//a[text()='Call Us Now'])[1]")
	private WebElement callUsNowButton;

	public WebElement getCallUsNowButton() {
		return callUsNowButton;
	}

	// **********************************************

	@FindBy(xpath = "//h2[text()='Who We Are']")
	private WebElement whoWeAreSection;

	public WebElement getWhoWeAreSection() {
		return whoWeAreSection;
	}

	@FindBy(xpath = "//h2[text()='Why Prevaj?']")
	private WebElement whyPrevaj;

	public WebElement getWhyPrevaj() {
		return whyPrevaj;
	}

	@FindBy(xpath = "//h2[text()='Our Advanced Level End To End Services']")
	private WebElement ourServiceSection;

	public WebElement getOurServiceSection() {
		return ourServiceSection;
	}

	@FindBy(xpath = "//h2[text()='Technologies We Work With']")
	private WebElement techSection;

	public WebElement getTechSection() {
		return techSection;
	}

	@FindBy(xpath = "//h2[text()='Industries']")
	private WebElement industrySection;

	public WebElement getIndustrySection() {
		return industrySection;
	}

	@FindBy(xpath = "//h2[text()='Our Clients']")
	private WebElement ourClientSection;

	public WebElement getOurClientSection() {
		return ourClientSection;
	}

	@FindBy(xpath = "//h2[text()='Meet Our Core Members']")
	private WebElement teamSection;

	public WebElement getTeamSection() {
		return teamSection;
	}

	@FindBy(xpath = "//h1[text()='Blogs']")
	private WebElement blogPage;

	public WebElement getBlogPage() {
		return blogPage;
	}

	@FindBy(xpath = "//span[text()='GET IN TOUCH']")
	private WebElement conatctSection;

	public WebElement getConatctSection() {
		return conatctSection;
	}

	@FindBy(xpath = "//h2[text()='Prevaj Technologies']")
	private WebElement meetingPopup;

	public WebElement getMeetingPopup() {
		return meetingPopup;
	}

	@FindBy(css = "#close-popup")
	private WebElement closeButton;

	public WebElement getCloseButton() {
		return closeButton;
	}

	@FindBy(xpath = "//a[text()='Google Calendar appointment scheduling']")
	private WebElement scrollCalender;

	public WebElement getScrollCalender() {
		return scrollCalender;
	}

	// ************************************Footer section
	// ************************************************

	@FindBy(xpath = "//a[@title='Follow on Facebook']")
	private WebElement fbLink;

	public WebElement getFbLink() {
		return fbLink;
	}

	@FindBy(xpath = "//a[@title='Follow on X']")
	private WebElement twitterLink;

	public WebElement getTwitterLink() {
		return twitterLink;
	}

	@FindBy(xpath = "//a[@title='Follow on Youtube']")
	private WebElement youtubeLink;

	public WebElement getYoutubeLink() {
		return youtubeLink;
	}

	@FindBy(xpath = "//a[@title='Follow on LinkedIn']")
	private WebElement linkedinLink;

	public WebElement getLinkedinLink() {
		return linkedinLink;
	}

	@FindBy(xpath = "//a[@title='Follow on Instagram']")
	private WebElement instagramLink;

	public WebElement getInstagramLink() {
		return instagramLink;
	}

	@FindBy(xpath = "//a[@title='Follow on Pinterest']")
	private WebElement pinterestLink;

	public WebElement getPinterestLink() {
		return pinterestLink;
	}

	@FindBy(xpath = "(//a[text()='Privacy Policy'])[1]")
	private WebElement privacyPolicy;

	public WebElement getPrivacyPolicy() {
		return privacyPolicy;
	}

	@FindBy(xpath = "//input[@class='tnp-email']")
	private WebElement newsEmail;

	public WebElement getNewsEmail() {
		return newsEmail;
	}

	@FindBy(xpath = "//input[@class='tnp-submit']")
	private WebElement subscribeButton;

	public WebElement getSubscribeButton() {
		return subscribeButton;
	}

	@FindBy(xpath = "//b[text()='Privacy Policy']")
	private WebElement privacyPage;

	public WebElement getPrivacyPage() {
		return privacyPage;
	}

	// ********************************************Get a
	// Consult*****************************

	@FindBy(xpath = "//h2[text()='Get a Consultation']")
	private WebElement consultForm;

	public WebElement getConsultForm() {
		return consultForm;
	}

	@FindBy(xpath = "//input[@placeholder='Your Name']")
	private WebElement yourName;

	public WebElement getYourName() {
		return yourName;
	}

	@FindBy(xpath = "//input[@placeholder='Your Email']")
	private WebElement yourEmail;

	public WebElement getYourEmail() {
		return yourEmail;
	}

	@FindBy(xpath = "//input[@placeholder='+16506107117']")
	private WebElement phoneNo;

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	@FindBy(xpath = "//input[@placeholder='What can we help you with?']")
	private WebElement helpText;

	public WebElement getHelpText() {
		return helpText;
	}

	@FindBy(xpath = "(//button[text()='Submit'])[1]")
	private WebElement submitButton;

	public WebElement getSubmitButton() {
		return submitButton;
	}

	@FindBy(xpath = "//label[text()='This field is required.']")
	private WebElement requiredError;

	public WebElement getRequiredError() {
		return requiredError;
	}

	@FindBy(xpath = "//label[text()='Letters only please']")
	private WebElement lettersOnlyError;

	public WebElement getLettersOnlyError() {
		return lettersOnlyError;
	}

	@FindBy(xpath = "//label[text()='Please enter a valid email address']")
	private WebElement validEmailError;

	public WebElement getValidEmailError() {
		return validEmailError;
	}

	@FindBy(xpath = "//p[text()='Thank you for contacting us. Our Experts will reach out to you shortly.']")
	private WebElement successMsg;

	public WebElement getSuccessMsg() {
		return successMsg;
	}

	// ***************************************page redirection*****************

	@FindBy(xpath = "(//a[text()='Book a Meeting'])[3]")
	private WebElement bookmeetHome;

	public WebElement getBookmeetHome() {
		return bookmeetHome;
	}

	@FindBy(xpath = "//a[text()='digital services']")
	private WebElement digitalServicesLink;

	public WebElement getDigitalServicesLink() {
		return digitalServicesLink;
	}

	@FindBy(xpath = "//a[text()='technologies']")
	private WebElement technologiesLink;

	public WebElement getTechnologiesLink() {
		return technologiesLink;
	}

	@FindBy(xpath = "//a[text()='industries']")
	private WebElement industriesLink;

	public WebElement getIndustriesLink() {
		return industriesLink;
	}

	@FindBy(xpath = "//iframe[@class='lazy entered loaded']")
	private WebElement iframeYoutubeLink;

	public WebElement getIframeYoutubeLink() {
		return iframeYoutubeLink;
	}

	@FindBy(xpath = "//button[@title='Play']")
	private WebElement youtubeclick;

	public WebElement getYoutubeclick() {
		return youtubeclick;
	}

	@FindBy(xpath = "//h4[text()='ECOMMERCE']")
	private WebElement eCommerceLink;

	public WebElement getECommerceLink() {
		return eCommerceLink;
	}

	@FindBy(xpath = "(//h4[text()='APPLICATION DEVELOPMENT AND API INTEGRATIONS'])[1]")
	private WebElement apiLink;

	public WebElement getApiLink() {
		return apiLink;
	}

	@FindBy(xpath = "(//h4[text()='END-TO-END DIGITAL TRANSFORMATION'])[1]")
	private WebElement endToEndLink;

	public WebElement getEndToEndLink() {
		return endToEndLink;
	}

	@FindBy(xpath = "(//h4[text()='DATA INTELLIGENCE AND ANALYTICS'])[1]")
	private WebElement dataIntelLink;

	public WebElement getDataIntelLink() {
		return dataIntelLink;
	}

	@FindBy(xpath = "(//h4[text()='CLOUD IMPLEMENTATION AND MIGRATION'])[1]")
	private WebElement cloudImplementLink;

	public WebElement getCloudImplementLink() {
		return cloudImplementLink;
	}

	@FindBy(xpath = "(//h4[text()='PRODUCT ENGINEERING AND DEVELOPMENT'])[1]")
	private WebElement productEngLink;

	public WebElement getProductEngLink() {
		return productEngLink;
	}

	@FindBy(xpath = "(//h4[text()='PLATFORM IMPLEMENTATION AND MIGRATION'])[1]")
	private WebElement platformImplementLink;

	public WebElement getPlatformImplementLink() {
		return platformImplementLink;
	}

	@FindBy(xpath = "(//h4[text()='QUALITY ASSURANCE'])[1]")
	private WebElement qualityAssuranceLink;

	public WebElement getQualityAssuranceLink() {
		return qualityAssuranceLink;
	}

	@FindBy(xpath = "(//h4[text()='MANAGED SERVICES WITH UPGRADE, MAINTENANCE AND SUPPORT'])[1]")
	private WebElement maintainLink;

	public WebElement getMaintainLink() {
		return maintainLink;
	}

	@FindBy(xpath = "//h1[text()='eCommerce']")
	private WebElement eCommerceSection;

	public WebElement getECommerceSection() {
		return eCommerceSection;
	}

	@FindBy(xpath = "//h1[text()='APPLICATION DEVELOPMENT AND API INTEGRATIONS']")
	private WebElement apiSection;

	public WebElement getApiSection() {
		return apiSection;
	}

	@FindBy(xpath = "//h1[text()='END-TO-END DIGITAL TRANSFORMATION']")
	private WebElement endToEndSection;

	public WebElement getEndToEndSection() {
		return endToEndSection;
	}

	@FindBy(xpath = "//h1[text()='DATA INTELLIGENCE AND ANALYTICS']")
	private WebElement dataIntelSection;

	public WebElement getDataIntelSection() {
		return dataIntelSection;
	}

	@FindBy(xpath = "//h1[text()='CLOUD IMPLEMENTATION AND MIGRATION']")
	private WebElement cloudImplementSection;

	public WebElement getCloudImplementSection() {
		return cloudImplementSection;
	}

	@FindBy(xpath = "//h1[text()='PRODUCT ENGINEERING AND DEVELOPMENT']")
	private WebElement productEngSection;

	public WebElement getProductEngSection() {
		return productEngSection;
	}

	@FindBy(xpath = "//h1[text()='PLATFORM IMPLEMENTATION AND MIGRATION']")
	private WebElement platformImplementSection;

	public WebElement getPlatformImplementSection() {
		return platformImplementSection;
	}

	@FindBy(xpath = "//h1[text()='QUALITY ASSURANCE']")
	private WebElement qualityAssuranceSection;

	public WebElement getQualityAssuranceSection() {
		return qualityAssuranceSection;
	}

	@FindBy(xpath = "//h1[text()='Managed Services With Upgrade, Maintenance And Support']")
	private WebElement maintainSection;

	public WebElement getMaintainSection() {
		return maintainSection;
	}

	@FindBy(xpath = "//div[text()='eCommerce']")
	private WebElement ecommerceSectionLink;

	public WebElement getEcommerceSectionLink() {
		return ecommerceSectionLink;
	}

	@FindBy(xpath = "//img[@title='Woocommerce']")
	private WebElement wooCommerceLink;

	public WebElement getWooCommerceLink() {
		return wooCommerceLink;
	}

	@FindBy(xpath = "//a[text()='Magento']")
	private WebElement magentoLink;

	public WebElement getMagentoLink() {
		return magentoLink;
	}

	@FindBy(xpath = "//a[text()='Shopify']")
	private WebElement shopifyLink;

	public WebElement getShopifyLink() {
		return shopifyLink;
	}

	@FindBy(xpath = "//a[text()='Bigcommerce']")
	private WebElement bigcommerceLink;

	public WebElement getBigcommerceLink() {
		return bigcommerceLink;
	}

	@FindBy(xpath = "//a[text()='Volusion']")
	private WebElement volusionLink;

	public WebElement getVolusionLink() {
		return volusionLink;
	}

	@FindBy(xpath = "//a[text()='ZenCart']")
	private WebElement zenCartLink;

	public WebElement getZenCartLink() {
		return zenCartLink;
	}

	@FindBy(xpath = "//a[text()='Prestashop']")
	private WebElement prestashopLink;

	public WebElement getPrestashopLink() {
		return prestashopLink;
	}

	@FindBy(xpath = "//a[text()='CS Cart']")
	private WebElement csCartLink;

	public WebElement getCsCartLink() {
		return csCartLink;
	}

	@FindBy(xpath = "//h1[text()='WooCommerce Services']")
	private WebElement wooCommercePage;

	public WebElement getWooCommercePage() {
		return wooCommercePage;
	}

	@FindBy(xpath = "//h1[text()='Magento Services']")
	private WebElement magentoPage;

	public WebElement getMagentoPage() {
		return magentoPage;
	}

	@FindBy(xpath = "//h1[text()='Shopify Services']")
	private WebElement shopifyPage;

	public WebElement getShopifyPage() {
		return shopifyPage;
	}

	@FindBy(xpath = "//h1[text()='BigCommerce Services']")
	private WebElement bigCommercePage;

	public WebElement getBigCommercePage() {
		return bigCommercePage;
	}

	@FindBy(xpath = "//h1[text()='Volusion Services']")
	private WebElement volusionPage;

	public WebElement getVolusionPage() {
		return volusionPage;
	}

	@FindBy(xpath = "//h1[text()='ZenCart']")
	private WebElement zenCartPage;

	public WebElement getZenCartPage() {
		return zenCartPage;
	}

	@FindBy(xpath = "//h1[text()='Prestashop']")
	private WebElement prestashopPage;

	public WebElement getPrestashopPage() {
		return prestashopPage;
	}

	@FindBy(xpath = "//h1[text()='CS Cart']")
	private WebElement csCartPage;

	public WebElement getCsCartPage() {
		return csCartPage;
	}

	@FindBy(xpath = "//div[text()='CMS']")
	private WebElement cmsSectionLink;

	public WebElement getCmsSectionLink() {
		return cmsSectionLink;
	}

	@FindBy(xpath = "//span[text()='WordPress']")
	private WebElement wordpressLink;

	public WebElement getWordpressLink() {
		return wordpressLink;
	}

	@FindBy(xpath = "//span[text()='Drupal']")
	private WebElement drupalLink;

	public WebElement getDrupalLink() {
		return drupalLink;
	}

	@FindBy(xpath = "//span[text()='Joomla']")
	private WebElement joomlaLink;

	public WebElement getJoomlaLink() {
		return joomlaLink;
	}

	@FindBy(xpath = "//h1[text()='WordPress Services']")
	private WebElement wordpressPage;

	public WebElement getWordpressPage() {
		return wordpressPage;
	}

	@FindBy(xpath = "//h1[text()='Drupal']")
	private WebElement drupalPage;

	public WebElement getDrupalPage() {
		return drupalPage;
	}

	@FindBy(xpath = "//h1[text()='Joomla']")
	private WebElement joomlaPage;

	public WebElement getJoomlaPage() {
		return joomlaPage;
	}

	@FindBy(xpath = "//div[text()='Frontend']")
	private WebElement frontendSectionLink;

	public WebElement getFrontendSectionLink() {
		return frontendSectionLink;
	}

	@FindBy(xpath = "//a[text()='Javascript']")
	private WebElement javascriptLink;

	public WebElement getJavascriptLink() {
		return javascriptLink;
	}

	@FindBy(xpath = "//a[text()='Typescript']")
	private WebElement typescriptLink;

	public WebElement getTypescriptLink() {
		return typescriptLink;
	}

	@FindBy(xpath = "//a[text()='Next JS']")
	private WebElement nextJsLink;

	public WebElement getNextJsLink() {
		return nextJsLink;
	}

	@FindBy(xpath = "//a[text()='React JS']")
	private WebElement reactJsLink;

	public WebElement getReactJsLink() {
		return reactJsLink;
	}

	@FindBy(xpath = "//a[text()='Vue']")
	private WebElement vueLink;

	public WebElement getVueLink() {
		return vueLink;
	}

	@FindBy(xpath = "//a[text()='Angular']")
	private WebElement angularLink;

	public WebElement getAngularLink() {
		return angularLink;
	}

	@FindBy(xpath = "//a[text()='Three JS']")
	private WebElement threeJsLink;

	public WebElement getThreeJsLink() {
		return threeJsLink;
	}

	@FindBy(xpath = "//a[text()='Backbone JS']")
	private WebElement backboneJsLink;

	public WebElement getBackboneJsLink() {
		return backboneJsLink;
	}

	@FindBy(xpath = "//a[text()='React Native']")
	private WebElement reactNativeLink;

	public WebElement getReactNativeLink() {
		return reactNativeLink;
	}

	// JavaScript Page
	@FindBy(xpath = "//h1[text()='Javascript']")
	private WebElement javascriptPage;

	public WebElement getJavascriptPage() {
		return javascriptPage;
	}

	// TypeScript Page
	@FindBy(xpath = "//h1[text()='Typescript']")
	private WebElement typescriptPage;

	public WebElement getTypescriptPage() {
		return typescriptPage;
	}

	// Next JS Page
	@FindBy(xpath = "//h1[text()='Next JS']")
	private WebElement nextJsPage;

	public WebElement getNextJsPage() {
		return nextJsPage;
	}

	// React JS Page
	@FindBy(xpath = "//h1[text()='React Js Services']")
	private WebElement reactJsPage;

	public WebElement getReactJsPage() {
		return reactJsPage;
	}

	// Vue Page
	@FindBy(xpath = "//h1[text()='Vue']")
	private WebElement vuePage;

	public WebElement getVuePage() {
		return vuePage;
	}

	// Angular Page
	@FindBy(xpath = "//h1[text()='Angular Services']")
	private WebElement angularPage;

	public WebElement getAngularPage() {
		return angularPage;
	}

	// Three JS Page
	@FindBy(xpath = "//h1[text()='Three JS']")
	private WebElement threeJsPage;

	public WebElement getThreeJsPage() {
		return threeJsPage;
	}

	// Backbone JS Page
	@FindBy(xpath = "//h1[text()='Backbone JS']")
	private WebElement backboneJsPage;

	public WebElement getBackboneJsPage() {
		return backboneJsPage;
	}

	// React Native Page
	@FindBy(xpath = "//h1[text()='React Native']")
	private WebElement reactNativePage;

	public WebElement getReactNativePage() {
		return reactNativePage;
	}

	@FindBy(xpath = "//div[text()='Backend']")
	private WebElement backendSectionLink;

	public WebElement getBackendSectionLink() {
		return backendSectionLink;
	}

	@FindBy(xpath = "//span[text()='PHP']")
	private WebElement phpLink;

	public WebElement getPhpLink() {
		return phpLink;
	}

	@FindBy(xpath = "//span[text()='.Net']")
	private WebElement dotNetLink;

	public WebElement getDotNetLink() {
		return dotNetLink;
	}

	@FindBy(xpath = "//span[text()='Node JS']")
	private WebElement nodeJsLink;

	public WebElement getNodeJsLink() {
		return nodeJsLink;
	}

	@FindBy(xpath = "//span[text()='Python']")
	private WebElement pythonLink;

	public WebElement getPythonLink() {
		return pythonLink;
	}

	@FindBy(xpath = "//span[text()='Java']")
	private WebElement javaLink;

	public WebElement getJavaLink() {
		return javaLink;
	}

	@FindBy(xpath = "//span[text()='Ruby']")
	private WebElement rubyLink;

	public WebElement getRubyLink() {
		return rubyLink;
	}

	@FindBy(xpath = "//span[text()='C++']")
	private WebElement cppLink;

	public WebElement getCppLink() {
		return cppLink;
	}

	@FindBy(xpath = "//span[text()='C#']")
	private WebElement csharpLink;

	public WebElement getCsharpLink() {
		return csharpLink;
	}

	@FindBy(xpath = "//h1[text()='PHP']")
	private WebElement phpPage;

	public WebElement getPhpPage() {
		return phpPage;
	}

	@FindBy(xpath = "//h1[text()='.Net']")
	private WebElement dotNetPage;

	public WebElement getDotNetPage() {
		return dotNetPage;
	}

	@FindBy(xpath = "//h1[text()='Node.Js']")
	private WebElement nodeJsPage;

	public WebElement getNodeJsPage() {
		return nodeJsPage;
	}

	@FindBy(xpath = "//h1[text()='Python']")
	private WebElement pythonPage;

	public WebElement getPythonPage() {
		return pythonPage;
	}

	@FindBy(xpath = "//h1[text()='Java']")
	private WebElement javaPage;

	public WebElement getJavaPage() {
		return javaPage;
	}

	@FindBy(xpath = "//h1[text()='Ruby']")
	private WebElement rubyPage;

	public WebElement getRubyPage() {
		return rubyPage;
	}

	@FindBy(xpath = "//h1[text()='C++']")
	private WebElement cppPage;

	public WebElement getCppPage() {
		return cppPage;
	}

	@FindBy(xpath = "//h1[text()='C#']")
	private WebElement cSharpPage;

	public WebElement getCSharpPage() {
		return cSharpPage;
	}

	@FindBy(xpath = "//div[text()='Frameworks']")
	private WebElement frameworkSectionLink;

	public WebElement getFrameworkSectionLink() {
		return frameworkSectionLink;
	}

	@FindBy(xpath = "//span[text()='CodeIgniter']")
	private WebElement codeIgniterLink;

	public WebElement getCodeIgniterLink() {
		return codeIgniterLink;
	}

	@FindBy(xpath = "//span[text()='Laravel']")
	private WebElement laravelLink;

	public WebElement getLaravelLink() {
		return laravelLink;
	}

	@FindBy(xpath = "//span[text()='Zend Framework']")
	private WebElement zendFrameworkLink;

	public WebElement getZendFrameworkLink() {
		return zendFrameworkLink;
	}

	@FindBy(xpath = "//span[text()='Symfony']")
	private WebElement symfonyLink;

	public WebElement getSymfonyLink() {
		return symfonyLink;
	}

	@FindBy(xpath = "//span[text()='Django']")
	private WebElement djangoLink;

	public WebElement getDjangoLink() {
		return djangoLink;
	}

	@FindBy(xpath = "//span[text()='Flask']")
	private WebElement flaskLink;

	public WebElement getFlaskLink() {
		return flaskLink;
	}

	@FindBy(xpath = "//span[text()='Express JS']")
	private WebElement expressJSLink;

	public WebElement getExpressJSLink() {
		return expressJSLink;
	}

	@FindBy(xpath = "//span[text()='NgRx']")
	private WebElement ngRxLink;

	public WebElement getNgRxLink() {
		return ngRxLink;
	}

	@FindBy(xpath = "//span[text()='PrototypeJS']")
	private WebElement prototypeJSLink;

	public WebElement getPrototypeJSLink() {
		return prototypeJSLink;
	}

	@FindBy(xpath = "//span[text()='Bootstrap']")
	private WebElement bootstrapLink;

	public WebElement getBootstrapLink() {
		return bootstrapLink;
	}

	@FindBy(xpath = "//span[text()='Jest']")
	private WebElement jestLink;

	public WebElement getJestLink() {
		return jestLink;
	}

	@FindBy(xpath = "//span[text()='PySpark']")
	private WebElement pysparkLink;

	public WebElement getPysparkLink() {
		return pysparkLink;
	}

	@FindBy(xpath = "//span[text()='PrimeNG']")
	private WebElement primeNGLink;

	public WebElement getPrimeNGLink() {
		return primeNGLink;
	}

	@FindBy(xpath = "//span[text()='Hapi JS']")
	private WebElement hapiJSLink;

	public WebElement getHapiJSLink() {
		return hapiJSLink;
	}

	@FindBy(xpath = "//span[text()='Appium']")
	private WebElement appiumLink;

	public WebElement getAppiumLink() {
		return appiumLink;
	}

	@FindBy(xpath = "//span[text()='BDD']")
	private WebElement bddLink;

	public WebElement getBDDLink() {
		return bddLink;
	}

	@FindBy(xpath = "//span[text()='Cucumber']")
	private WebElement cucumberLink;

	public WebElement getCucumberLink() {
		return cucumberLink;
	}

	@FindBy(xpath = "//span[text()='TestNG']")
	private WebElement testNGLink;

	public WebElement getTestNGLink() {
		return testNGLink;
	}

	@FindBy(xpath = "//span[text()='Karate']")
	private WebElement karateLink;

	public WebElement getKarateLink() {
		return karateLink;
	}

	@FindBy(xpath = "//span[text()='PhoneGap']")
	private WebElement phoneGapLink;

	public WebElement getPhoneGapLink() {
		return phoneGapLink;
	}

	@FindBy(xpath = "//span[text()='Ionic']")
	private WebElement ionicLink;

	public WebElement getIonicLink() {
		return ionicLink;
	}

	@FindBy(xpath = "//h1[text()='CodeIgniter']")
	private WebElement codeIgniterPage;

	public WebElement getCodeIgniterPage() {
		return codeIgniterPage;
	}

	@FindBy(xpath = "//h1[text()='Laravel']")
	private WebElement laravelPage;

	public WebElement getLaravelPage() {
		return laravelPage;
	}

	@FindBy(xpath = "//h1[text()='Zend Framework']")
	private WebElement zendFrameworkPage;

	public WebElement getZendFrameworkPage() {
		return zendFrameworkPage;
	}

	@FindBy(xpath = "//h1[text()='Symphony']")
	private WebElement symfonyPage;

	public WebElement getSymfonyPage() {
		return symfonyPage;
	}

	@FindBy(xpath = "//h1[text()='Django']")
	private WebElement djangoPage;

	public WebElement getDjangoPage() {
		return djangoPage;
	}

	@FindBy(xpath = "//h1[text()='Flask']")
	private WebElement flaskPage;

	public WebElement getFlaskPage() {
		return flaskPage;
	}

	@FindBy(xpath = "//h1[text()='Express JS']")
	private WebElement expressJSPage;

	public WebElement getExpressJSPage() {
		return expressJSPage;
	}

	@FindBy(xpath = "//h1[text()='NgRx']")
	private WebElement ngrxPage;

	public WebElement getNgrxPage() {
		return ngrxPage;
	}

	@FindBy(xpath = "//h1[text()='PrototypeJS']")
	private WebElement prototypeJSPage;

	public WebElement getPrototypeJSPage() {
		return prototypeJSPage;
	}

	@FindBy(xpath = "//h1[text()='Bootstrap']")
	private WebElement bootstrapPage;

	public WebElement getBootstrapPage() {
		return bootstrapPage;
	}

	@FindBy(xpath = "//h1[text()='Jest']")
	private WebElement jestPage;

	public WebElement getJestPage() {
		return jestPage;
	}

	@FindBy(xpath = "//h1[text()='PySpark']")
	private WebElement pysparkPage;

	public WebElement getPysparkPage() {
		return pysparkPage;
	}

	@FindBy(xpath = "//h1[text()='PrimeNG']")
	private WebElement primeNGPage;

	public WebElement getPrimeNGPage() {
		return primeNGPage;
	}

	@FindBy(xpath = "//h1[text()='Hapi JS']")
	private WebElement hapiJSPage;

	public WebElement getHapiJSPage() {
		return hapiJSPage;
	}

	@FindBy(xpath = "//h1[text()='Appium']")
	private WebElement appiumPage;

	public WebElement getAppiumPage() {
		return appiumPage;
	}

	@FindBy(xpath = "//h1[text()='BDD']")
	private WebElement bddPage;

	public WebElement getBddPage() {
		return bddPage;
	}

	@FindBy(xpath = "//h1[text()='Cucumber']")
	private WebElement cucumberPage;

	public WebElement getCucumberPage() {
		return cucumberPage;
	}

	@FindBy(xpath = "//h1[text()='TestNG']")
	private WebElement testNGPage;

	public WebElement getTestNGPage() {
		return testNGPage;
	}

	@FindBy(xpath = "//h1[text()='Karate']")
	private WebElement karatePage;

	public WebElement getKaratePage() {
		return karatePage;
	}

	@FindBy(xpath = "//h1[text()='PhoneGap']")
	private WebElement phoneGapPage;

	public WebElement getPhoneGapPage() {
		return phoneGapPage;
	}

	@FindBy(xpath = "//h1[text()='Ionic']")
	private WebElement ionicPage;

	public WebElement getIonicPage() {
		return ionicPage;
	}

	@FindBy(xpath = "//div[text()='Libraries']")
	private WebElement librariesSectionLink;

	public WebElement getLibrariesSectionLink() {
		return librariesSectionLink;
	}

	@FindBy(xpath = "//span[text()='Redux']")
	private WebElement reduxLink;

	public WebElement getReduxLink() {
		return reduxLink;
	}

	@FindBy(xpath = "//span[text()='RxJS']")
	private WebElement rxjsLink;

	public WebElement getRxjsLink() {
		return rxjsLink;
	}

	@FindBy(xpath = "//span[text()='jQuery']")
	private WebElement jqueryLink;

	public WebElement getJqueryLink() {
		return jqueryLink;
	}

	@FindBy(xpath = "//span[text()='ChartJS']")
	private WebElement chartJsLink;

	public WebElement getChartJsLink() {
		return chartJsLink;
	}

	@FindBy(xpath = "//span[text()='D3 JS']")
	private WebElement d3JsLink;

	public WebElement getD3JsLink() {
		return d3JsLink;
	}

	@FindBy(xpath = "//span[text()='Underscore JS']")
	private WebElement underscoreJsLink;

	public WebElement getUnderscoreJsLink() {
		return underscoreJsLink;
	}

	@FindBy(xpath = "//span[text()='Moment JS']")
	private WebElement momentJsLink;

	public WebElement getMomentJsLink() {
		return momentJsLink;
	}

	@FindBy(xpath = "//span[text()='Material-UI']")
	private WebElement materialUiLink;

	public WebElement getMaterialUiLink() {
		return materialUiLink;
	}

	@FindBy(xpath = "//span[text()='Enzyme']")
	private WebElement enzymeLink;

	public WebElement getEnzymeLink() {
		return enzymeLink;
	}

	@FindBy(xpath = "//span[text()='Storybook']")
	private WebElement storyBookLink;

	public WebElement getStoryBookLink() {
		return storyBookLink;
	}

	@FindBy(xpath = "//span[text()='Angular Material']")
	private WebElement angularMaterialLink;

	public WebElement getAngularMaterialLink() {
		return angularMaterialLink;
	}

	@FindBy(xpath = "//span[text()='Socket.io']")
	private WebElement socketIoLink;

	public WebElement getSocketIoLink() {
		return socketIoLink;
	}

	@FindBy(xpath = "//h1[text()='Redux']")
	private WebElement reduxPage;

	public WebElement getReduxPage() {
		return reduxPage;
	}

	@FindBy(xpath = "//h1[text()='RxJS']")
	private WebElement rxjsPage;

	public WebElement getRxjsPage() {
		return rxjsPage;
	}

	@FindBy(xpath = "//h1[text()='jQuery']")
	private WebElement jQueryPage;

	public WebElement getjQueryPage() {
		return jQueryPage;
	}

	@FindBy(xpath = "//h1[text()='ChartJS']")
	private WebElement chartJSPage;

	public WebElement getChartJSPage() {
		return chartJSPage;
	}

	@FindBy(xpath = "//h1[text()='D3 JS']")
	private WebElement d3JSPage;

	public WebElement getD3JSPage() {
		return d3JSPage;
	}

	@FindBy(xpath = "//h1[text()='Underscore JS']")
	private WebElement underscoreJSPage;

	public WebElement getUnderscoreJSPage() {
		return underscoreJSPage;
	}

	@FindBy(xpath = "//h1[text()='Moment JS']")
	private WebElement momentJSPage;

	public WebElement getMomentJSPage() {
		return momentJSPage;
	}

	@FindBy(xpath = "//h1[text()='Material-UI']")
	private WebElement materialUIPage;

	public WebElement getMaterialUIPage() {
		return materialUIPage;
	}

	@FindBy(xpath = "//h1[text()='Enzyme']")
	private WebElement enzymePage;

	public WebElement getEnzymePage() {
		return enzymePage;
	}

	@FindBy(xpath = "//h1[text()='Storybook']")
	private WebElement storyBookPage;

	public WebElement getStoryBookPage() {
		return storyBookPage;
	}

	@FindBy(xpath = "//h1[text()='Angular Material']")
	private WebElement angularMaterialPage;

	public WebElement getAngularMaterialPage() {
		return angularMaterialPage;
	}

	@FindBy(xpath = "//h1[text()='Socket.io']")
	private WebElement socketIOPage;

	public WebElement getSocketIOPage() {
		return socketIOPage;
	}

	@FindBy(xpath = "//div[text()='DevOps']")
	private WebElement devopsSection;

	public WebElement getDevopsSection() {
		return devopsSection;
	}

	@FindBy(xpath = "//a[text()='Docker']")
	private WebElement dockerLink;

	public WebElement getDockerLink() {
		return dockerLink;
	}

	@FindBy(xpath = "//a[text()='Kubernetes']")
	private WebElement kubernetesLink;

	public WebElement getKubernetesLink() {
		return kubernetesLink;
	}

	@FindBy(xpath = "//a[text()='Git']")
	private WebElement gitLink;

	public WebElement getGitLink() {
		return gitLink;
	}

	@FindBy(xpath = "//a[text()='SVN']")
	private WebElement svnLink;

	public WebElement getSvnLink() {
		return svnLink;
	}

	@FindBy(xpath = "//a[text()='Jenkins']")
	private WebElement jenkinsLink;

	public WebElement getJenkinsLink() {
		return jenkinsLink;
	}

	@FindBy(xpath = "//a[text()='Selenium']")
	private WebElement seleniumLink;

	public WebElement getSeleniumLink() {
		return seleniumLink;
	}

	@FindBy(xpath = "//a[text()='Chef']")
	private WebElement chefLink;

	public WebElement getChefLink() {
		return chefLink;
	}

	@FindBy(xpath = "//a[text()='Puppet']")
	private WebElement puppetLink;

	public WebElement getPuppetLink() {
		return puppetLink;
	}

	@FindBy(xpath = "//a[text()='DeployBot']")
	private WebElement deployBotLink;

	public WebElement getDeployBotLink() {
		return deployBotLink;
	}

	@FindBy(xpath = "//a[text()='TravisCI']")
	private WebElement travisCiLink;

	public WebElement getTravisCiLink() {
		return travisCiLink;
	}

	@FindBy(xpath = "//a[text()='DevOps']")
	private WebElement devopsLink;

	public WebElement getDevopsLink() {
		return devopsLink;
	}

	@FindBy(xpath = "//h1[text()='Docker']")
	private WebElement dockerPage;

	public WebElement getDockerPage() {
		return dockerPage;
	}

	@FindBy(xpath = "//h1[text()='Kubernetes']")
	private WebElement kubernetesPage;

	public WebElement getKubernetesPage() {
		return kubernetesPage;
	}

	@FindBy(xpath = "//h1[text()='Git']")
	private WebElement gitPage;

	public WebElement getGitPage() {
		return gitPage;
	}

	@FindBy(xpath = "//h1[text()='SVN']")
	private WebElement svnPage;

	public WebElement getSvnPage() {
		return svnPage;
	}

	@FindBy(xpath = "//h1[text()='Jenkins']")
	private WebElement jenkinsPage;

	public WebElement getJenkinsPage() {
		return jenkinsPage;
	}

	@FindBy(xpath = "//h1[text()='Selenium']")
	private WebElement seleniumPage;

	public WebElement getSeleniumPage() {
		return seleniumPage;
	}

	@FindBy(xpath = "//h1[text()='Chef']")
	private WebElement chefPage;

	public WebElement getChefPage() {
		return chefPage;
	}

	@FindBy(xpath = "//h1[text()='Puppet']")
	private WebElement puppetPage;

	public WebElement getPuppetPage() {
		return puppetPage;
	}

	@FindBy(xpath = "//h1[text()='DeployBot']")
	private WebElement deployBotPage;

	public WebElement getDeployBotPage() {
		return deployBotPage;
	}

	@FindBy(xpath = "//h1[text()='TravisCI']")
	private WebElement travisCIPage;

	public WebElement getTravisCIPage() {
		return travisCIPage;
	}

	@FindBy(xpath = "//h1[text()='Devops']")
	private WebElement devopsPage;

	public WebElement getDevopsPage() {
		return devopsPage;
	}

	@FindBy(xpath = "//div[text()='Cloud']")
	private WebElement cloudSectionLink;

	public WebElement getCloudSectionLink() {
		return cloudSectionLink;
	}

	@FindBy(xpath = "//span[text()='AWS']")
	private WebElement awsLink;

	public WebElement getAwsLink() {
		return awsLink;
	}

	@FindBy(xpath = "//span[text()='Azure']")
	private WebElement azureLink;

	public WebElement getAzureLink() {
		return azureLink;
	}

	@FindBy(xpath = "//span[text()='GCP']")
	private WebElement gcpLink;

	public WebElement getGcpLink() {
		return gcpLink;
	}

	@FindBy(xpath = "//h1[text()='Amazon Web Services']")
	private WebElement awsPage;

	public WebElement getAwsPage() {
		return awsPage;
	}

	@FindBy(xpath = "//h1[text()='Azure']")
	private WebElement azurePage;

	public WebElement getAzurePage() {
		return azurePage;
	}

	@FindBy(xpath = "//h1[text()='GCP']")
	private WebElement gcpPage;

	public WebElement getGcpPage() {
		return gcpPage;
	}

	@FindBy(xpath = "//div[text()='Database']")
	private WebElement databaseSectionPage;

	public WebElement getDatabaseSectionPage() {
		return databaseSectionPage;
	}

	@FindBy(xpath = "//span[text()='SQL Server']")
	private WebElement sqlServerLink;

	public WebElement getSqlServerLink() {
		return sqlServerLink;
	}

	@FindBy(xpath = "//span[text()='MySQL']")
	private WebElement mySQLLink;

	public WebElement getMySQLLink() {
		return mySQLLink;
	}

	@FindBy(xpath = "//span[text()='Postgre SQL']")
	private WebElement postgreSQLLink;

	public WebElement getPostgreSQLLink() {
		return postgreSQLLink;
	}

	@FindBy(xpath = "//span[text()='SQLite']")
	private WebElement sqLiteLink;

	public WebElement getSQLiteLink() {
		return sqLiteLink;
	}

	@FindBy(xpath = "//span[text()='MongoDB']")
	private WebElement mongoDBLink;

	public WebElement getMongoDBLink() {
		return mongoDBLink;
	}

	@FindBy(xpath = "//span[text()='MariaDB']")
	private WebElement mariaDBLink;

	public WebElement getMariaDBLink() {
		return mariaDBLink;
	}

	@FindBy(xpath = "//span[text()='ElasticSearch']")
	private WebElement elasticSearchLink;

	public WebElement getElasticSearchLink() {
		return elasticSearchLink;
	}

	@FindBy(xpath = "//span[text()='Firebase']")
	private WebElement firebaseLink;

	public WebElement getFirebaseLink() {
		return firebaseLink;
	}

	@FindBy(xpath = "//span[text()='RDS']")
	private WebElement rdsLink;

	public WebElement getRDSLink() {
		return rdsLink;
	}

	@FindBy(xpath = "//span[text()='DynamoDB']")
	private WebElement dynamoDBLink;

	public WebElement getDynamoDBLink() {
		return dynamoDBLink;
	}

	@FindBy(xpath = "//span[text()='Oracle']")
	private WebElement oracleLink;

	public WebElement getOracleLink() {
		return oracleLink;
	}

	@FindBy(xpath = "//h1[text()='SQL Server']")
	private WebElement sqlServerPage;

	public WebElement getSqlServerPage() {
		return sqlServerPage;
	}

	@FindBy(xpath = "//h1[text()='MySQL']")
	private WebElement mySQLPage;

	public WebElement getMySQLPage() {
		return mySQLPage;
	}

	@FindBy(xpath = "//h1[text()='Postgre SQL']")
	private WebElement postgreSQLPage;

	public WebElement getPostgreSQLPage() {
		return postgreSQLPage;
	}

	@FindBy(xpath = "//h1[text()='SQLite']")
	private WebElement sqlLitePage;

	public WebElement getSqlLitePage() {
		return sqlLitePage;
	}

	@FindBy(xpath = "//h1[text()='MongoDB']")
	private WebElement mongoDBPage;

	public WebElement getMongoDBPage() {
		return mongoDBPage;
	}

	@FindBy(xpath = "//h1[text()='Maria DB']")
	private WebElement mariaDBPage;

	public WebElement getMariaDBPage() {
		return mariaDBPage;
	}

	@FindBy(xpath = "//h1[text()='ElasticSearch']")
	private WebElement elasticSearchPage;

	public WebElement getElasticSearchPage() {
		return elasticSearchPage;
	}

	@FindBy(xpath = "//h1[text()='Firebase']")
	private WebElement firebasePage;

	public WebElement getFirebasePage() {
		return firebasePage;
	}

	@FindBy(xpath = "//h1[text()='RDS']")
	private WebElement rdsPage;

	public WebElement getRdsPage() {
		return rdsPage;
	}

	@FindBy(xpath = "//h1[text()='DynamoDB']")
	private WebElement dynamoDBPage;

	public WebElement getDynamoDBPage() {
		return dynamoDBPage;
	}

	@FindBy(xpath = "//h1[text()='Oracle']")
	private WebElement oraclePage;

	public WebElement getOraclePage() {
		return oraclePage;
	}

	@FindBy(xpath = "//span[text()='Retail eCommerce']")
	private WebElement retailEcommerceLink;

	public WebElement getRetailEcommerceLink() {
		return retailEcommerceLink;
	}

	@FindBy(xpath = "//span[text()='Manufacturing']")
	private WebElement manufacturingLink;

	public WebElement getManufacturingLink() {
		return manufacturingLink;
	}

	@FindBy(xpath = "//span[text()='Software and IT']")
	private WebElement softwareITLink;

	public WebElement getSoftwareITLink() {
		return softwareITLink;
	}

	@FindBy(xpath = "//span[text()='Insurance & Financial Services']")
	private WebElement insuranceFinancialServicesLink;

	public WebElement getInsuranceFinancialServicesLink() {
		return insuranceFinancialServicesLink;
	}

	@FindBy(xpath = "//span[text()='Construction Industry']")
	private WebElement constructionIndustryLink;

	public WebElement getConstructionIndustryLink() {
		return constructionIndustryLink;
	}

	@FindBy(xpath = "//span[text()='Entertainment']")
	private WebElement entertainmentLink;

	public WebElement getEntertainmentLink() {
		return entertainmentLink;
	}

	@FindBy(xpath = "//span[text()='Marketing & Advertising']")
	private WebElement marketingAdvertisingLink;

	public WebElement getMarketingAdvertisingLink() {
		return marketingAdvertisingLink;
	}

	@FindBy(xpath = "//span[text()='Energy & Utilities']")
	private WebElement energyUtilitiesLink;

	public WebElement getEnergyUtilitiesLink() {
		return energyUtilitiesLink;
	}

	@FindBy(xpath = "//span[text()='Legal']")
	private WebElement legalLink;

	public WebElement getLegalLink() {
		return legalLink;
	}

	@FindBy(xpath = "//span[text()='Telecom']")
	private WebElement telecomLink;

	public WebElement getTelecomLink() {
		return telecomLink;
	}

	@FindBy(xpath = "//span[text()='Real Estate']")
	private WebElement realEstateLink;

	public WebElement getRealEstateLink() {
		return realEstateLink;
	}

	@FindBy(xpath = "//h1[text()='Retail eCommerce']")
	private WebElement retailEcommercePage;

	public WebElement getRetailEcommercePage() {
		return retailEcommercePage;
	}

	@FindBy(xpath = "//h1[text()='Manufacturing']")
	private WebElement manufacturingPage;

	public WebElement getManufacturingPage() {
		return manufacturingPage;
	}

	@FindBy(xpath = "//h1[text()='Software and IT']")
	private WebElement softwareAndItPage;

	public WebElement getSoftwareAndItPage() {
		return softwareAndItPage;
	}

	@FindBy(xpath = "//h1[text()='Insurance & Financial Services']")
	private WebElement insuranceAndFinancialServicesPage;

	public WebElement getInsuranceAndFinancialServicesPage() {
		return insuranceAndFinancialServicesPage;
	}

	@FindBy(xpath = "//h1[text()='Construction Industry']")
	private WebElement constructionIndustryPage;

	public WebElement getConstructionIndustryPage() {
		return constructionIndustryPage;
	}

	@FindBy(xpath = "//h1[text()='Entertainment']")
	private WebElement entertainmentPage;

	public WebElement getEntertainmentPage() {
		return entertainmentPage;
	}

	@FindBy(xpath = "//h1[text()='Marketing and Advertising']")
	private WebElement marketingAndAdvertisingPage;

	public WebElement getMarketingAndAdvertisingPage() {
		return marketingAndAdvertisingPage;
	}

	@FindBy(xpath = "//h1[text()='Energy and Utilities']")
	private WebElement energyAndUtilitiesPage;

	public WebElement getEnergyAndUtilitiesPage() {
		return energyAndUtilitiesPage;
	}

	@FindBy(xpath = "//h1[text()='Legal']")
	private WebElement legalPage;

	public WebElement getLegalPage() {
		return legalPage;
	}

	@FindBy(xpath = "//h1[text()='Telecom']")
	private WebElement telecomPage;

	public WebElement getTelecomPage() {
		return telecomPage;
	}

	@FindBy(xpath = "//h1[text()='Real Estate']")
	private WebElement realEstatePage;

	public WebElement getRealEstatePage() {
		return realEstatePage;
	}

	// lets discuss section

	@FindBy(xpath = "//h2[text()='Let’s Discuss Your Project']")
	private WebElement letsDiscuss1;

	public WebElement getLetsDiscuss1() {
		return letsDiscuss1;
	}

	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement contactButton;

	public WebElement getContactButton() {
		return contactButton;
	}

	@FindBy(xpath = "(//div[@class='slick-track'])[1]")
	private WebElement clientAbout;

	public WebElement getClientAbout() {
		return clientAbout;
	}

	@FindBy(xpath = "//h2[text()='What do our clients say about us?']")
	private WebElement clientTest;

	public WebElement getClientTest() {
		return clientTest;
	}

	@FindBy(xpath = "//div[@class='swiper-wrapper']")
	private WebElement clientSwiper;

	public WebElement getClientSwiper() {
		return clientSwiper;
	}

	// our team section

	@FindBy(xpath = "//span[text()='SM Rajan']")
	private WebElement smRajan;

	public WebElement getSmRajan() {
		return smRajan;
	}

	@FindBy(xpath = "//span[text()='Priya Rajan']")
	private WebElement priyaRajan;

	public WebElement getPriyaRajan() {
		return priyaRajan;
	}

	@FindBy(xpath = "//span[text()='Maheshwar K']")
	private WebElement maheshwarK;

	public WebElement getMaheshwarK() {
		return maheshwarK;
	}

	@FindBy(xpath = "//span[text()='Manojkumar C']")
	private WebElement manojkumarC;

	public WebElement getManojkumarC() {
		return manojkumarC;
	}

	@FindBy(xpath = "//span[text()='Sree Krishna Raja']")
	private WebElement sreeKrishnaRaja;

	public WebElement getSreeKrishnaRaja() {
		return sreeKrishnaRaja;
	}

	@FindBy(xpath = "//span[text()='Nadeem Tanvir']")
	private WebElement nadeemTanvir;

	public WebElement getNadeemTanvir() {
		return nadeemTanvir;
	}

	@FindBy(xpath = "//span[text()='Karonic Doss']")
	private WebElement karonicDoss;

	public WebElement getKaronicDoss() {
		return karonicDoss;
	}

	// project discuss section

	@FindBy(xpath = "//a[text()='Get a Consultation']")
	private WebElement consultButton;

	public WebElement getConsultButton() {
		return consultButton;
	}

	// lets talk section

	@FindBy(xpath = "//select[@class='wpcf7-form-control wpcf7-select wpcf7-validates-as-required et_pb_contact_select input required']")
	private WebElement serviceChoose;

	public WebElement getServiceChoose() {
		return serviceChoose;
	}

	@FindBy(id = "contact-form-name")
	private WebElement nameInLetsTalk;

	public WebElement getNameInLetsTalk() {
		return nameInLetsTalk;
	}

	@FindBy(css = "#wpcf7-f27788-o2 > form > p:nth-child(5) > span > input")
	private WebElement emailInLetsTalk;

	public WebElement getEmailInLetsTalk() {
		return emailInLetsTalk;
	}

	@FindBy(id = "company-name")
	private WebElement companyNameInLetsTalk;

	public WebElement getCompanyNameInLetsTalk() {
		return companyNameInLetsTalk;
	}

	@FindBy(xpath = "//textarea[@class='wpcf7-form-control wpcf7-textarea']")
	private WebElement tellAboutInLetsTalk;

	public WebElement getTellAboutInLetsTalk() {
		return tellAboutInLetsTalk;
	}

	@FindBy(xpath = "(//button[text()='Submit'])[2]")
	private WebElement submitInLets;

	public WebElement getSubmitInLets() {
		return submitInLets;
	}

	@FindBy(xpath = "(//label[text()='This field is required.'])[1]")
	private WebElement requiredErrorinSelect;

	public WebElement getRequiredErrorinSelect() {
		return requiredErrorinSelect;
	}

	@FindBy(xpath = "(//label[text()='This field is required.'])[2]")
	private WebElement requiredErrorInName;

	public WebElement getRequiredErrorInName() {
		return requiredErrorInName;
	}

	@FindBy(xpath = "(//label[text()='This field is required.'])[3]")
	private WebElement requiredErrorInEmail;

	public WebElement getRequiredErrorInEmail() {
		return requiredErrorInEmail;
	}

	@FindBy(xpath = "(//label[text()='This field is required.'])[4]")
	private WebElement requiredErrorInCompanyName;

	public WebElement getRequiredErrorInCompanyName() {
		return requiredErrorInCompanyName;
	}

	@FindBy(xpath = "//label[text()='Please enter a valid email address']")
	public WebElement invalidEmailError;

	public WebElement getInvalidEmailError() {
		return invalidEmailError;
	}

	@FindBy(xpath = "//div[text()='Thank you for contacting us. Our Experts will reach out to you shortly.']")
	private WebElement successMsginLets;

	public WebElement getSuccessMsginLets() {
		return successMsginLets;
	}

	@FindBy(xpath = "//a[@class='facebook']")
	private WebElement messageIcon;

	public WebElement getMessageIcon() {
		return messageIcon;
	}

	@FindBy(xpath = "//a[@class='whatsapp']")
	private WebElement whatsappIcon;

	public WebElement getWhatsappIcon() {
		return whatsappIcon;
	}

	@FindBy(xpath = "//a[@class='skype']")
	private WebElement skypeIcon;

	public WebElement getSkypeIcon() {
		return skypeIcon;
	}

	@FindBy(xpath = "//a[@class='instagram']")
	private WebElement instaIcon;

	public WebElement getInstaIcon() {
		return instaIcon;
	}

	@FindBy(xpath = "//a[@class='twitter']")
	private WebElement xIcon;

	public WebElement getXIcon() {
		return xIcon;
	}

	@FindBy(xpath = "//a[@class='email']")
	private WebElement mailIcon;

	public WebElement getMailIcon() {
		return mailIcon;
	}

	@FindBy(xpath = "//a[@class='phone']")
	private WebElement phoneIcon;

	public WebElement getPhoneIcon() {
		return phoneIcon;
	}

	@FindBy(xpath = "//a[@class='booking book_meeting']")
	private WebElement meetIcon;

	public WebElement getMeetIcon() {
		return meetIcon;
	}

	@FindBy(xpath = "//input[@class='ltr-input']")
	private WebElement searchBox;

	public WebElement getSearchBox() {
		return searchBox;
	}

	@FindBy(xpath = "//button[text()='Search']")
	private WebElement searchButton;

	public WebElement getSearchButton() {
		return searchButton;
	}

	@FindBy(xpath = "//h4[text()='No results']")
	private WebElement noResults;

	public WebElement getNoResults() {
		return noResults;
	}

	@FindBy(xpath = "//span[text()='eCommerce']")
	private WebElement eCommerceCategory;

	public WebElement getECommerceCategory() {
		return eCommerceCategory;
	}

	@FindBy(xpath = "//h3[text()='Essential Security Practices for Your Drupal Website']")
	private WebElement eCommercePost;

	public WebElement getECommercePost() {
		return eCommercePost;
	}

	@FindBy(xpath = "//h3[text()='Best Practices for Magento Security to Prevent Cyber Threats']")
	private WebElement magento;

	public WebElement getMagento() {
		return magento;
	}
}
