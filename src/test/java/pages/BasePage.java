package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class BasePage {
	
	public static final String LOGIN_LINK = "https://sysqa1.greenlotstest.com/";
	public static final String AddDRProg_LINK = "https://sysqa1.greenlotstest.com/skyx/demand-response/program-manager/program/add";
//	public static final String PROFILE_LINK = "http://localhost:8080/profile";
//	public static final String BLOG_POST_LINK = "http://localhost:8080/post";
//	public static final String FORGOT_PASSWORD_LINK = "http://localhost:8080/forgot";
//	public static final String RESET_PASSWORD_LINK = "http://localhost:8080/reset/f127c9883b132c61d82dca004654d4057a8fe285";
	
	WebDriver driver;
		
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "error")
	private WebElement alert_Error_Div;
	
	@FindBy(id = "alert_success")
	private WebElement alert_Success_Div;
	
	@FindBy(xpath = "//h2[text()='Add DR Program']")
	private WebElement panel_Heading_Div;
	
	@FindBy(xpath = "//div[@class='footer']/span/a")
	private WebElement panel_Footer_Div;
	
	@FindBy(className = "dashboard")
	private WebElement dashboard_Link;
	
	@FindBy(xpath = "//mat-list-item[6]//div[1]//div[2]//a[1]")
	private WebElement demand_response_Link;

    @FindBy(xpath = "//span[contains(text(),'Flex Charge Manager')]")
    private WebElement flex_charge_Link;
	
	@FindBy(id = "add_new_post_btn")
	private WebElement add_New_Post_Btn;
	
	@FindBy(xpath = ".//span[text()='Logout']")
	private WebElement logout_Link;

    @FindBy(xpath = "//*[@class='add_btn mat-button']")
    private WebElement create_dr_prog_button;
	
	@FindBy(id = "profile")
	private WebElement aAddDRProg_LINK;

    @FindBy(xpath = "//div[@class='mat-list-text']/a[contains(@href,'/demand-response/program-manager')]")
    private WebElement program_manager_Link;

	
	public void navigateTo_Page(String url) {
		driver.get(url);
	}
	
	public void navigateTo_LoginPage() {
		navigateTo_Page(LOGIN_LINK);
	}
	
	public void navigateTo_AddDRProgPage() {
		navigateTo_Page(AddDRProg_LINK);
	}
//
//	public void navigate_To_Add_Blog_Post_Page() {
//		navigateTo_Page(BLOG_POST_LINK);
//	}
//
//	public void navigate_To_Profile_Page() {
//		navigateTo_Page(PROFILE_LINK);
//	}
//
//	public void navigate_To_Forgot_Password_Page() {
//		navigateTo_Page(FORGOT_PASSWORD_LINK);
//	}
//
//	public void navigate_To_Reset_Password_Page() {
//		navigateTo_Page(RESET_PASSWORD_LINK);
//	}
	
	public String getLocationHref() {
		return driver.getCurrentUrl();
	}
	
	public WebElement get_Alert_Error_Div() {
		return alert_Error_Div;
	}
	
	public WebElement get_Alert_Success_Div() {
		return alert_Success_Div;
	}
	
	public WebElement get_Panel_Heading() {
		return panel_Heading_Div;
	}
	
	public WebElement get_Panel_Footer() {
		return panel_Footer_Div;
	}
	
	public WebElement get_Dashboard_Link() {
		return dashboard_Link;
	}
	
	public WebElement get_demand_response_Link() {
		return demand_response_Link;
	}

    public WebElement get_program_manager_Link() {
        return program_manager_Link;
    }

    public WebElement get_flex_charge_manager() {
        return flex_charge_Link;
    }
	
	public WebElement get_Add_New_Post_Btn() {
		return add_New_Post_Btn;
	}
	
	public WebElement get_Logout_Link() {
		return logout_Link;
	}

    public WebElement get_CreateDrProg_Button() {
        return create_dr_prog_button;
    }
	
//	//public WebElement get_Profile_Link() {
//		return profile_Link;
//	}
	
	public void validate_Panel_Header_Footer(String header, String footer) {
		String panelHeader = get_Panel_Heading().getText();
		String panelFooter = get_Panel_Footer().getText();
		assertEquals(header, panelHeader);
		assertEquals(footer, panelFooter);
	}
}
