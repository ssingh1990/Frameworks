package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddDRprogram extends BasePage {
    public static final String LINK = "https://sysqa1.greenlotstest.com/skyx/demand-response/program-manager/program/add";
	public AddDRprogram(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "profile_heading")
	private WebElement profile_Heading;	

	@FindBy(id = "username")
	private WebElement userName;
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "mat-input-0")
	private WebElement firstName;
	
	@FindBy(xpath = "//*[@aria-label='Program Type']")
	private WebElement programtype;
	
	@FindBy(xpath = "//*[@aria-label='Utility']")
	private WebElement utility;
	
	@FindBy(id = "mat-input-1")
	private WebElement date;

    @FindBy(id = "mat-input-2")
    private WebElement edate;
	
	@FindBy(id="mat-select-2")
	private WebElement status;
	
	@FindBy(xpath="//*[text()='Create']")
	private WebElement create_button;
	
	@FindBy(id="active_Female")
	private WebElement active_Female; 
	
	@FindBy(id="notActive_Female")
	private WebElement notActive_Female;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(xpath = "//*[@id='mat-option-10']/span[text()='Active']")
	private WebElement active_Status;
	
	@FindBy(id = "update_profile")
	private WebElement btn_Update_Profile;
	
	public String get_Profile_Heading() {
		return profile_Heading.getText();
	}
	
//	public boolean is_Profile_Link_active() {
//		return get_Profile_Link().getAttribute("class").contains("active");
//	}
//
//	public void click_On_Profile_link() {
//		get_Profile_Link().click();
//	}
	
	public WebElement get_Username() {
		return userName;
	}
	
	public boolean is_Username_field_Readonly() {
		return get_Username().getAttribute("readonly").equalsIgnoreCase("readonly");
	}
	
	public WebElement get_Email() {
		return email;
	}
	
	public WebElement get_First_Name() {
		return firstName;
	}
	
	public void enter_First_Name(String firstName) {
		get_First_Name().clear();
		get_First_Name().sendKeys(firstName);
	}
	
	public WebElement get_Program_Type() {
		return programtype;
	}
	
	public void enter_Program_Type(String programtype) {
//        get_Program_Type().clear();
        get_Program_Type().sendKeys(programtype);
	}
	
	public WebElement get_Utility() {
		return utility;
	}
	
	public void enter_Utility(String utility) {
//		get_Utility().clear();
		get_Utility().sendKeys(utility);
	}

    public WebElement get_Date() {
        return date;
    }

    public WebElement get_Status() {
        return status;
    }

    public WebElement get_EDate() {
        return edate;
    }

	public void enter_Date(String date) {
        get_Date().clear();
        get_Date().sendKeys(date);
    }

    public void enter_End_Date(String edate) {
        get_EDate().clear();
        get_EDate().sendKeys(edate);
    }
	
//	public void select_date(String gender) {
//		String selectedDate = get_Date().getAttribute("value");
//
//		switch(selectedGender) {
//			case "M":
//				System.out.println("Male gender already selected!");
//				break;
//			case "F":
//				System.out.println("Female gender already selected!");
//				break;
//			case "":
//				if(gender.equalsIgnoreCase("M"))
//					get_notActive_Male().click();
//				else
//					get_notActive_Female().click();
//				break;
//			default:
//				break;
//		}
//	}

    public void select_status(String status){
        WebElement selectedStatus = get_Status();
        switch(status) {
			case "Active":
                selectedStatus.click();
                get_active_Status().click();
                default:
				break;
		}
    }

	public WebElement get_active_Status() {
		return active_Status;
	}

	public WebElement click_On_create_Button() {
		return create_button;
	}

	public WebElement get_notActive_Female() {
		return notActive_Female;
	}

	public WebElement get_Address() {
		return address;
	}

	public void enter_Address(String address) {
		get_Address().clear();
		get_Address().sendKeys(address);
	}


	public WebElement get_Btn_Update_Profile() {
		return btn_Update_Profile;
	}

	public void click_On_Update_Profile_Button() {
		get_Btn_Update_Profile().click();
	}
	
	public boolean is_Update_Profile_Button_Enabled() {
		return get_Btn_Update_Profile().isEnabled();
		// String updateProfileButtonDisabled = get_Btn_Update_Profile().getAttribute("disabled");
		// return (updateProfileButtonDisabled != null) ? updateProfileButtonDisabled.equalsIgnoreCase("true") : false;
	}
	
	public void submit_Form() {
		get_Btn_Update_Profile().sendKeys(Keys.ENTER);
	}
}
