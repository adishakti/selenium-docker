package ai.dltk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ai.generic.BaseTest;

public class CommunityPage extends BaseTest {


    private final String expectedNotification= "You successfully left the group.";
    private final String AIHeader= "Artificial Intelligence";
    private final String DeepLearningHeader= "Deep Learning";
    private final String BlockchainHeader= "Blockchain";
    private final String DronesHeader= "Drones";
    private final String NLPHeader= "Natural Language Processing";
    private final String ARHeader= "Augmented Reality";
    private final String CVHeader= "Computer Vision";
    private final String MLHeader= "Machine Learning";
    private final String IOTHeader= "Internet of Things";
    private final String QuantumComputingHeader= "Quantum Computing";
    private final String JOBHeader= "Jobs";
    private final String RoboticsHeader= "Robotics";
    private final String InviteHeader= "Invite";
    private final String DocsHeader= "Docs";
    private final String EventsHeader= "Events";
    private final String MenubuttonHeader= "Menubutton";
    private final String MembersHeader= "Members";
    private final String ActivityHeader= "Activity";
    private final String ProfileHeader= "Profile";
    private final String NotificationsHeader= "Notifications";
    private final String MessagesHeader= "MessagesActivity";
    private final String FriendRequestsHeader= "FriendRequests";
    private final String GroupInvitesHeader= "GroupInvites";
    private final String ForumsHeader= "Forums";
    private final String AddaNewPostHeader= "AddaNewPost";
    private final String SettingsHeader= "Settings";
    private final String LogOutHeader= "LogOut";


    @FindBy(xpath = "//h2[text()='The Unified Open Source Deep Learning Platform']")
    private WebElement WelcomeMessage;

    @FindBy(xpath= "//input[@id='shortcode-user-login']")
    private WebElement userName;

    @FindBy(xpath = "//input[@id='shortcode-user-pass']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='shortcode-login-submit']")
    private WebElement loginButton;


    @FindBy(xpath = "//iframe[contains(@data-testid, 'dialog_iframe')]")
    private WebElement iframe;

    @FindBy(xpath = "//div[@aria-label='close']")
    private WebElement close;

    @FindBy(xpath = "//ul[@id='menu-primary-menu']/li[7]/a")
    private WebElement Community;

    @FindBy(xpath = "//a[@id='home']")
    private WebElement home;

    @FindBy(xpath = "//a[text()='Blog']")
    private WebElement blog;

    @FindBy(xpath = "//a[@id='nav-forum']")
    private WebElement forum;

    @FindBy(xpath = "//a[text()='Buddydrive']")
    private WebElement buddydrive;

    @FindBy(xpath = "//li[@id='menu-item-6850']//a[normalize-space()='Community']")
    private WebElement community;

    @FindBy(xpath = "//div[@id='item-header-content']/h2")
    private WebElement communityheader;

    @FindBy(xpath = "//a[text()='Artificial Intellige...']")
    private WebElement ArtificalIntelligence;

    @FindBy(xpath = "//button[normalize-space()='Join Group']")
    private WebElement JoinGroup;

    @FindBy(xpath = "//button[normalize-space()='Leave Group']")
    private WebElement LeaveGroup;

    @FindBy(xpath = "//div[@class='list-wrap']//li[2]/div/div[1]")
    private WebElement deeplearning;

    @FindBy(xpath = "//img[@alt='Group logo of Blockchain']")
    private WebElement Blockchain;

    @FindBy(xpath = " //a[normalize-space()='Augmented Reality']")
    private WebElement AugmentedReality;

    @FindBy(xpath = "//div[@class='list-wrap']//li[5]/div/div[1]")
    private WebElement natural_language_processing;

    @FindBy(xpath = "//a[normalize-space()='Drones']")
    private WebElement Drones;

    @FindBy(xpath = "//img[@alt='Group logo of Computer Vision']")
    private WebElement Computervision;

    @FindBy(xpath = "//a[@href='https://dltk.ai/special-interest-groups/machine-learning/'][normalize-space()='Machine Learning']")
    private WebElement MachineLearning;

    @FindBy(xpath = "//a[normalize-space()='Internet of Things']")
    private WebElement InternetofThings;

    @FindBy(xpath = "//a[normalize-space()='Quantum Computing']")
    private WebElement QuantumComputing;

    @FindBy(xpath = "//a[normalize-space()='Jobs']")
    private WebElement Jobs;

    @FindBy(xpath = "//a[normalize-space()='Robotics']")
    private WebElement Robotics ;

    @FindBy(xpath = "//aside[@class='bp-feedback bp-messages bp-template-notice success']/p")
    private WebElement LeaveGroupNotification ;

    @FindBy(xpath= "//a[text()='Invite']")
    private WebElement invite;

    @FindBy(xpath= "//a[text()='Docs']")
    private WebElement Docs;

    @FindBy(xpath= "//a[@id='events']")
    private WebElement Events;

    @FindBy(xpath= "//a[@class='object-nav-menu-button-a']")
    private WebElement Menubutton;

    @FindBy(xpath= "//a[contains(text(),'Members (7,848)')]")
    private WebElement Members;

    @FindBy(xpath= "//a[normalize-space()='Activity']")
    private WebElement activity;

    @FindBy(xpath= "//div[@id='user-top-menu-expander']")
    private WebElement dropdownmenu;

    @FindBy(xpath= "//a[normalize-space()='Profile']")
    private WebElement profile;

    @FindBy(xpath= "//a[normalize-space()='Notifications']")
    private WebElement notifications;

    @FindBy(xpath= "//a[normalize-space()='Messages']")
    private WebElement messages;

    @FindBy(xpath= "//a[normalize-space()='Friend Requests']")
    private WebElement Friendsrequests;

    @FindBy(xpath= "//a[normalize-space()='Group Invites']")
    private WebElement GroupInvites;

    @FindBy(xpath="//a[normalize-space()='Add a New Post']")
    private WebElement AddaNewPost;

    @FindBy(xpath= "//a[normalize-space()='Forums']")
    private WebElement Forums;

    @FindBy(xpath= "//input[@id='user_login']")
    private WebElement userlogin;

    @FindBy(xpath= "//input[@id='user_pass']")
    private WebElement userpass;

    @FindBy(xpath= "//input[@id='wp-submit']")
    private WebElement submit;

    @FindBy(xpath= "//a[normalize-space()='Settings']")
    private WebElement Settings;

    @FindBy(xpath= "//a[normalize-space()='Log Out']")
    private WebElement LogOut;

    @FindBy(xpath= "//div[normalize-space()='Media']")
    private WebElement media;

    @FindBy(xpath= "//a[normalize-space()='Read']")
    private WebElement read;

    @FindBy(xpath= "//a[normalize-space()='Requests']")
    private WebElement request;

    @FindBy(xpath= "//a[@id='group-events']")
    private WebElement groupevents;


    @FindBy(xpath= "//a[normalize-space()='Compose']")
    private WebElement compose;

    @FindBy(xpath= "//a[normalize-space()='Edit']")
    private WebElement editprofile;



    public CommunityPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void goTo(){
        this.driver.get("https://dltk.ai/");
        driver.manage().window().maximize();
        this.wait.until(ExpectedConditions.visibilityOf(this.WelcomeMessage));
    }

    public void login(String userName, String password){
        closeChatBOt(iframe, close,"Close Chatbot");
        sendKeys(this.userName,userName,"Username");
        sendKeys(this.password,password,"Password");
        click(loginButton, "Login Button");
    }


    public void blogs(){
        click(Community, "Community");
        click(blog, "Blog");
    }

    public void home(){
        click(Community, "Community");
        click(home, "Home");
    }

    public void forum(){
        click(Community, "Community");
        click(forum, "forum");
    }

    public void buddydrive(){
        click(Community, "Community");
        click(buddydrive, "buddydrive");
    }

    public void ArtificalIntelligence(){
        //scrollandclick(ArtificalIntelligence, "Artifical Intelligence");
        click(Community, "Community");
        click(ArtificalIntelligence, "Artifical Intelligence");
        String actualtxt=getText(communityheader, "Artificial Intelligence Header");
        asserttxt(AIHeader, actualtxt, "Assertion on Artificial Intelligence Header");
        click(LeaveGroup, "Leave Group");
        actualtxt=getText(LeaveGroupNotification, "Leave Group Notification");
        asserttxt(expectedNotification, actualtxt, "Assertion on notifications");
        click(JoinGroup, "Join Group");
    }


    public void Deeplearning(){
        scrollto(ArtificalIntelligence, "Artifical Intelligence");
        click(deeplearning, "Deep Learning");
        click(deeplearning, "Deep Learning");
        String actualtxt=getText(communityheader, "Deep Learning Header");
        asserttxt(DeepLearningHeader, actualtxt, "Assertion on Deep Learning Header");
        click(LeaveGroup, "Leave Group");
        actualtxt=getText(LeaveGroupNotification, "Leave Group Notification");
        asserttxt(expectedNotification, actualtxt, "Assertion on notifications");
        click(JoinGroup, "Join Group");
    }


    public void Blockchain(){
        scrollto(ArtificalIntelligence, "Artifical Intelligence");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(Blockchain, "Blockchain");
        String actualtxt=getText(communityheader, "Blockchain Header");
        asserttxt(BlockchainHeader, actualtxt, "Assertion on Blockchain Header");
        click(LeaveGroup, "Leave Group");
        actualtxt=getText(LeaveGroupNotification, "Leave Group Notification");
        asserttxt(expectedNotification, actualtxt, "Assertion on notifications");
        click(JoinGroup, "Join Group");
    }

    public void AugmentedReality(){
        click(Community, "Community");
        click(AugmentedReality, "AugmentedReality");
        String actualtxt=getText(communityheader, "Augmented Reality Header");
        asserttxt(ARHeader, actualtxt, "Assertion on Augmented Reality Header");
        click(LeaveGroup, "Leave Group");
        actualtxt=getText(LeaveGroupNotification, "Leave Group Notification");
        asserttxt(expectedNotification, actualtxt, "Assertion on notifications");
        click(JoinGroup, "Join Group");
    }



    public void natural_language_processing(){
        scrollto(ArtificalIntelligence, "Artifical Intelligence");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(natural_language_processing, "natural_language_processing");
        String actualtxt=getText(communityheader, "NLP Header");
        asserttxt(NLPHeader, actualtxt, "Assertion on NLP Header");
        click(LeaveGroup, "Leave Group");
        actualtxt=getText(LeaveGroupNotification, "Leave Group Notification");
        asserttxt(expectedNotification, actualtxt, "Assertion on notifications");
        click(JoinGroup, "Join Group");
    }


    public void Drones(){
        click(Community, "Community");
        click(Drones, "Drones");
        String actualtxt=getText(communityheader, "Drones Header");
        asserttxt(DronesHeader, actualtxt, "Assertion on Drones Header");
        click(LeaveGroup, "Leave Group");
        actualtxt=getText(LeaveGroupNotification, "Leave Group Notification");
        asserttxt(expectedNotification, actualtxt, "Assertion on notifications");
        click(JoinGroup, "Join Group");
    }

    public void Computervision(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scrollto(ArtificalIntelligence, "Artifical Intelligence");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(Computervision, "Computervision");
        String actualtxt=getText(communityheader, "Computer vision Header");
        asserttxt(CVHeader, actualtxt, "Assertion on Computer vision Header");
        click(LeaveGroup, "Leave Group");
        actualtxt=getText(LeaveGroupNotification, "Leave Group Notification");
        asserttxt(expectedNotification, actualtxt, "Assertion on notifications");
        click(JoinGroup, "Join Group");
    }


    public void MachineLearning(){
        scrollto(ArtificalIntelligence, "Artifical Intelligence");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(MachineLearning, "MachineLearning");
        String actualtxt=getText(communityheader, "MachineLearning Header");
        asserttxt(MLHeader, actualtxt, "Assertion on MachineLearning Header");
        click(LeaveGroup, "Leave Group");
        actualtxt=getText(LeaveGroupNotification, "Leave Group Notification");
        asserttxt(expectedNotification, actualtxt, "Assertion on notifications");
        click(JoinGroup, "Join Group");
    }

    public void InternetofThings(){
        scrollto(ArtificalIntelligence, "Artifical Intelligence");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(InternetofThings, "InternetofThings");
        //click(InternetofThings, "InternetofThings");
        String actualtxt=getText(communityheader, "InternetofThings");
        asserttxt(IOTHeader, actualtxt, "Assertion on InternetofThings Header");
        click(LeaveGroup, "Leave Group");
        actualtxt=getText(LeaveGroupNotification, "Leave Group Notification");
        asserttxt(expectedNotification, actualtxt, "Assertion on notifications");
        click(JoinGroup, "Join Group");
    }

    public void QuantumComputing(){
        scrollto(ArtificalIntelligence, "Artifical Intelligence");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(QuantumComputing, "QuantumComputing");
        String actualtxt=getText(communityheader, "QuantumComputing");
        asserttxt(QuantumComputingHeader, actualtxt, "Assertion on QuantumComputing Header");
        click(LeaveGroup, "Leave Group");
        actualtxt=getText(LeaveGroupNotification, "Leave Group Notification");
        asserttxt(expectedNotification, actualtxt, "Assertion on notifications");
        click(JoinGroup, "Join Group");
    }

    public void Jobs(){
        scrollto(ArtificalIntelligence, "Artifical Intelligence");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(Jobs, "Jobs");
        String actualtxt=getText(communityheader, "Jobs");
        asserttxt(JOBHeader, actualtxt, "Assertion on Jobs Header");
        click(LeaveGroup, "Leave Group");
        actualtxt=getText(LeaveGroupNotification, "Leave Group Notification");
        asserttxt(expectedNotification, actualtxt, "Assertion on notifications");
        click(JoinGroup, "Join Group");
    }
    public void Robotics(){
        scrollto(ArtificalIntelligence, "Artifical Intelligence");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(Robotics, "Robotics");
        String actualtxt=getText(communityheader, "Robotics");
        asserttxt(RoboticsHeader, actualtxt, "Assertion on Robotics Header");
        click(LeaveGroup, "Leave Group");
        actualtxt=getText(LeaveGroupNotification, "Leave Group Notification");
        asserttxt(expectedNotification, actualtxt, "Assertion on notifications");
        click(JoinGroup, "Join Group");
    }

    public void invite(){
        click(invite, "invite");

    }

    public void Docs(){
        click(Docs, "Docs");

    }

    public void Events(){
        click(Docs, "Events");

    }

    public void Menubutton(){
        click(Docs, "Menubutton");

    }

    public void Members(){
        click(Docs, "Members");

    }

    public void activity(){
        submenuexpander(dropdownmenu, activity, "Activity");
        String actualtxt=getText(media, "Media text under community");
        asserttxt("Media", actualtxt, "Assertion on community page");
    }

    public void Profile(){
        submenuexpander(dropdownmenu, profile, "Profile");
        click(editprofile, "Edit Profile");
    }

    public void Notifications(){
        submenuexpander(dropdownmenu, notifications, "notifications");
        click(read, "Read");
    }

    public void Messages(){
        submenuexpander(dropdownmenu, messages, "messages");
        click(compose, "compose");
    }

    public void Friendrequests(){
        submenuexpander(dropdownmenu, Friendsrequests, "Friends Requests");
        click(request, "request");
    }

    public void GroupInvites(){
        submenuexpander(dropdownmenu, GroupInvites, "Group Invites");
        click(groupevents, "Group Events");
    }

    public void Forums(){
        submenuexpander(dropdownmenu, Forums, "Forums");

    }

    public void AddanewPost(){
        submenuexpander(dropdownmenu, AddaNewPost, "Add a New Post");
        click(userlogin, "userlogin");
        click(userpass, "userpass");
        click(submit, "submit");
    }

    public void Settings(){
        submenuexpander(dropdownmenu, Settings, "Settings");

    }

    public void LogOut(){
        submenuexpander(dropdownmenu, LogOut, "LogOut");

    }
}