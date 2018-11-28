package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

public class HomePage extends BasePage {

	public static final String HOME_LINK = "https://sysqa1.greenlotstest.com/greenlots/protectednew/admin/dashboard.jsf#";
		
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "post_listing")
	private WebElement table_Post_Listing;
		
	public void navigateTo_Home_Page() {
		navigateTo_Page(HOME_LINK);
	}
	
	public WebElement get_Table_Post_Listing() { 
		return table_Post_Listing;
	}
	
	public void demand_response() {
        assertTrue("Demand Response section is not displayed", get_demand_response_Link().isDisplayed());
		get_demand_response_Link().click();
	}

    public void program_manager() throws InterruptedException {
        Thread.sleep(500);
        assertTrue("Program Manager page is not displayed", get_program_manager_Link().isDisplayed());
        get_program_manager_Link().click();
    }

    public void flex_charge_manager() {
        get_flex_charge_manager().click();
    }
	
//	public void click_On_Profile_link() {
//		get_Profile_Link().click();
//	}
	
	public void click_On_Logout_link() {
		get_Logout_Link().click();
	}

    public void click_On_CreateDrProg_Button() {
        get_CreateDrProg_Button().click();
    }
	
	public boolean is_User_On_Homepage() {
		return HOME_LINK.equals(getLocationHref());
	}
}
