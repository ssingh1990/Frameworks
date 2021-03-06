package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProgramManagerPage extends HomePage {
	
	public static final String LINK = "https://sysqa1.greenlotstest.com/skyx/demand-response/program-manager";
	
	public ProgramManagerPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "add_post_head")
	private WebElement add_Post_Heading;
	
	@FindBy(id = "title")
	private WebElement title;	
	
	@FindBy(id = "description")
	private WebElement description;	
	
	@FindBy(id = "body")
	private WebElement body;
	
	@FindBy(id = "author")
	private WebElement author;

    @FindBy(xpath = "//button[@class='add_btn mat-button']")
    private WebElement createdrbutton;

	@FindBy(id = "post")
	private WebElement submitbtn_Add_Post;
	
	@FindBy(xpath = "//table[@id='post_listing']/tbody/tr/td[1]/a")
	private WebElement post_Listing_Link;
		
	public WebElement get_Title() {
		return title;
	}
	
	public WebElement get_Description() {
		return description;
	}
	
	public WebElement get_Body() {
		return body;
	}
	
	public WebElement get_Author() {
		return author;
	}
	
	public WebElement get_Btn_Add_Post() {
		return submitbtn_Add_Post;
	}
	
	public void enter_Title(String title) {
		get_Title().clear();
		get_Title().sendKeys(title);
	}

    public WebElement create_DR_Button() throws InterruptedException {
        Thread.sleep(500);
        return createdrbutton;
    }
	
	public void enter_Description(String description) {
		get_Description().clear();
		get_Description().sendKeys(description);
	}
	
	public void enter_Body(String body) {
		get_Body().clear();
		get_Body().sendKeys(body);
	}
	
	public void enter_Author(String author) {
		get_Author().clear();
		get_Author().sendKeys(author);
	}
	
	public void click_On_Add_Post_Button() {
		get_Btn_Add_Post().click();
	}
	
	public WebElement get_Post_Listing_Link() {
		return post_Listing_Link;
	}
	
	public void click_On_Post_Listing_Link() {
		get_Post_Listing_Link().click();
	}
}