package ai.dltk.pages;
import ai.generic.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

public class SmartFeedPage extends BaseTest {


    private final String ClassifyingGalaxiesHeader= "ClassifyingGalaxies";
    private final String OptimizingRetailerRevenueHeader= "OptimizingRetailerRevenue";
    private final String RoboticAIlearnsHeader= "RoboticAIlearns";
    private final String DeeplearningAIHeader= "DeeplearningAI";
    private final String HowtoIdentifyOverfittingRevenueHeader= "HowtoIdentifyOverfitting";
    private final String SkillsdevelopmentinPhysicalAIHeader= "SkillsdevelopmentinPhysicalAI";
    private final String ShoppingonlineforthefestiveseasonHeader= "Shoppingonlineforthefestiveseason";
    private final String DevelopanIntuitionHeader= "DevelopanIntuition";
    private final String HHSAutomatingHiringHeader= "HHSAutomatingHiring";
    private final String SoftwareSuppliersRespondingHeader= "SoftwareSuppliersResponding";
    private final String GreenDataCentersHeader= "GreenDataCenters";
    private final String MarineBatteryProductionHeader= "MarineBatteryProduction";
    private final String TheRoleofMentalHeader= "TheRoleofMental";
    private final String AICloudMobileandRealityFuelHeader= "AICloudMobileandRealityFuel";
    private final String StochasticHillClimbingHeader= "StochasticHillClimbing";
    private final String NervoussystemsofinsectsHeader= "Nervoussystemsofinsects";
    private final String AlgorithmreducesuseofriskierHeader= " Algorithmreducesuseofriskier";
    private final String TwomotivationalartificialbeingsHeader= "Twomotivationalartificialbeings";
    private final String UsingmachinelearningtotrackHeader= "Usingmachinelearningtotrack";
    private final String CurveFittingWithPythonHeader= "CurveFittingWithPython";
    private final String StudentsdeveloptoolHeader= "Studentsdeveloptool";
    private final String CockroachesandlizardsHeader= "Cockroachesandlizards";
    private final String ArtificialintelligencecanspeedHeader= "Artificialintelligencecanspeed";
    private final String AIaidsgeneHeader= "AIaidsgene";
    private final String BirdwatchingfromafarHeader= "Birdwatchingfromafar";
    private final String WhatIsTheDifferenceBetweenHeader= "WhatIsTheDifferenceBetween";
    private final String KeyBenefitsofAITechnologiesHeader= "KeyBenefitsofAITechnologies";
    private final String WhyAIGeneratedContentHeader= "WhyAIGeneratedContent";
    private final String RandomForestTimeSeriesForecastingHeader= "RandomForestTimeSeriesForecasting";
    private final String AIteachersmustbeeffectiveHeader= "AIteachersmustbeeffective";
    private final String SpookierOrSaferHeader= "SpookierOrSafer";
    private final String BusyWeekforGoogleHeader= "BusyWeekforGoogle";
    private final String FederalGovernmentInvestmentsHeader= "FederalGovernmentInvestments";
    private final String HowtoDevelopaRandomSubspaceHeader= "HowtoDevelopaRandomSubspace";
    private final String TrustlevelsinAIHeader= "TrustlevelsinAI";
    private final String GraphenebasedmemoryresistorsHeader= "Graphenebasedmemoryresistors";
    private final String ArtificialintelligencemodeldetectsasymptomaticHeader= "Artificialintelligencemodeldetectsasymptomatic";
    private final String ResiliencyAndSecurityHeader= "Birdwatchingfromafar";
    private final String AIProjectsProgressingHeader= "AIProjectsProgressing";
    private final String TestingsewagetohomeHeader= "Testingsewagetohome";

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

    @FindBy(xpath = "//li[@id='menu-item-5751']/a[normalize-space()='Smart Feed']")
    private WebElement SmartFeed;

    @FindBy(xpath = "//a[contains(text(),'Classifying galaxies with artificial intelligence')]")
    private WebElement ClassifyingGalaxies ;

    @FindBy(xpath = "//a[normalize-space()='READ FULL ARTICLE HERE']")
    private WebElement Readthefullarticles ;

    @FindBy(xpath = "//a[normalize-space()='CLICK HERE TO READ THE FULL ARTICLE']")
    private WebElement Readthefullarticles2 ;

    @FindBy(xpath = "//a[normalize-space()='READ THE FULL ARTICLE HERE']")
    private WebElement Readthefullarticles3 ;



    @FindBy(xpath = "//a[normalize-space()='CLICK HERE TO READ FULL ARTICLE']")
    private WebElement Readthefullarticles4 ;


    @FindBy(xpath = "//a[contains(text(),'Optimizing Retailer Revenue with Sales Forecasting')]")
    private WebElement OptimizingRetailerRevenue ;

    @FindBy(xpath = "//a[normalize-space()='Robotic AI learns to be spontaneous']")
    private WebElement RoboticAIlearns ;

    @FindBy(xpath = "//a[contains(text(),'How to Identify Overfitting Machine Learning Model')]")
    private WebElement HowtoIdentifyOverfitting ;

    @FindBy(xpath = "//a[contains(text(),'Skills development in Physical AI could give birth')]")
    private WebElement SkillsdevelopmentinPhysicalAI ;

    @FindBy(xpath = "//a[contains(text(),'Shopping online for the festive season? AI chatbot')]")
    private WebElement Shoppingonlineforthefestiveseason ;

    @FindBy(xpath = "//a[contains(text(),'Staying ahead of the artificial intelligence curve')]")
    private WebElement StayingaheadoftheAIcurve ;

    @FindBy(xpath = "//a[contains(text(),'Develop an Intuition for How Ensemble Learning Wor')]")
    private WebElement DevelopanIntuition ;


    @FindBy(xpath = "//a[contains(text(),'Deep learning artificial intelligence keeps an eye')]")
    private WebElement DeeplearningAI ;

    @FindBy(xpath = "//a[contains(text(),'HHS Automating Hiring with Help of AI; FAA Plannin')]")
    private WebElement HHSAutomatingHiring ;

    @FindBy(xpath = "//a[contains(text(),'Software Suppliers Responding to Market Opportunit')]")
    private WebElement SoftwareSuppliersResponding ;

    @FindBy(xpath = "//a[contains(text(),'Green Data Centers Seen as Helping Manage AI Power')]")
    private WebElement GreenDataCenters ;

    @FindBy(xpath = "//a[contains(text(),'The Role of Mental Wayfinding For Robust AI Autono')]")
    private WebElement TheRoleofMental;

    @FindBy(xpath = "//a[contains(text(),'AI, Cloud, Mobile and Reality Fuel Advances in Tel')]")
    private WebElement AICloudMobileandRealityFuel ;

    @FindBy(xpath = "//a[contains(text(),'Marine Battery Production Making Gains Through Aut')]")
    private WebElement MarineBatteryProduction ;

    @FindBy(xpath = "//a[normalize-space()='Stochastic Hill Climbing in Python from Scratch']")
    private WebElement StochasticHillClimbing ;

    @FindBy(xpath = "//a[contains(text(),'Algorithm reduces use of riskier antibiotics for U')]")
    private WebElement Algorithmreducesuseofriskier ;

    @FindBy(xpath = "//a[contains(text(),'Nervous systems of insects inspire efficient futur')]")
    private WebElement Nervoussystemsofinsects ;

    @FindBy(xpath = "//a[contains(text(),'Two motivational artificial beings are better than')]")
    private WebElement Twomotivationalartificialbeings ;

    @FindBy(xpath = "//a[contains(text(),'Using machine learning to track the pandemic’s imp')]")
    private WebElement Usingmachinelearningtotrack;


    @FindBy(xpath = "//a[normalize-space()='Curve Fitting With Python']")
    private WebElement CurveFittingWithPython ;

    @FindBy(xpath = "//a[contains(text(),'Artificial intelligence aids gene activation disco')]")
    private WebElement AIaidsgene ;

    @FindBy(xpath = "//a[contains(text(),'Students develop tool to predict the carbon footpr')]")
    private WebElement Studentsdeveloptool ;

    @FindBy(xpath = "//a[normalize-space()='Cockroaches and lizards inspire new robot']")
    private WebElement Cockroachesandlizards ;

    @FindBy(xpath = "//a[contains(text(),'Birdwatching from afar: Amazing new AI-enabled cam')]")
    private WebElement Birdwatchingfromafar ;

    @FindBy(xpath = "//a[contains(text(),'What Is The Difference Between Artificial Intellig')]")
    private WebElement WhatIsTheDifferenceBetween ;


    @FindBy(xpath = "//a[contains(text(),'Key Benefits of AI Technologies and Third-Party Da')]")
    private WebElement KeyBenefitsofAITechnologies ;


    @FindBy(xpath = "//a[contains(text(),'Why AI-Generated Content Won’t Break the Web?')]")
    private WebElement WhyAIGeneratedContent ;


    @FindBy(xpath = "//a[normalize-space()='Random Forest for Time Series Forecasting']")
    private WebElement RandomForestTimeSeriesForecasting ;


    @FindBy(xpath = "//a[contains(text(),'AI teachers must be effective and communicate well')]")
    private WebElement AIteachersmustbeeffective ;

    @FindBy(xpath = "//a[normalize-space()='AI Contact Tracer Awarded at UNLV']")
    private WebElement AIContactTracerAwarded ;

    @FindBy(xpath = "//a[contains(text(),'Spookier Or Safer: How AI Autonomous Cars Alter Ha')]")
    private WebElement SpookierOrSafer ;

    @FindBy(xpath = "//a[contains(text(),'Busy Week for Google: Search Enhancements, Followe')]")
    private WebElement BusyWeekforGoogle ;

    @FindBy(xpath = "//a[contains(text(),'Federal Government Investments in AI Beginning to ')]")
    private WebElement FederalGovernmentInvestments;

    @FindBy(xpath = "//a[contains(text(),'How to Develop a Random Subspace Ensemble With Pyt')]")
    private WebElement HowtoDevelopaRandomSubspace ;

    @FindBy(xpath = "//a[contains(text(),'Trust levels in AI predicted by people’s relations')]")
    private WebElement TrustlevelsinAI ;

    @FindBy(xpath = "//a[contains(text(),'Graphene-based memory resistors show promise for b')]")
    private WebElement Graphenebasedmemoryresistors ;

    @FindBy(xpath = "//a[contains(text(),'Artificial intelligence model detects asymptomatic')]")
    private WebElement Artificialintelligencemodeldetectsasymptomatic ;

    @FindBy(xpath = "//a[contains(text(),'Resiliency And Security: Future-Proofing Our AI Fu')]")
    private WebElement ResiliencyAndSecurity ;

    @FindBy(xpath = "//a[contains(text(),'AI Projects Progressing Across Federal Government ')]")
    private WebElement AIProjectsProgressing ;

    @FindBy(xpath = "//a[normalize-space()='Testing sewage to home in on Covid-19']")
    private WebElement Testingsewagetohome ;

    @FindBy(xpath = "//a[contains(text(),'Artificial intelligence can speed up the detection')]")
    private WebElement Artificialintelligencecanspeed ;

    //a[contains(text(),'Artificial intelligence can speed up the detection')]
    public SmartFeedPage(WebDriver driver){
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

        assertSoftly(softAssertions -> {
            softAssertions.assertThat(password)
                    .hasSize(12)
                    .doesNotContainAnyWhitespaces();
        });

        click(loginButton, "Login Button");
    }

    public void ClassifyingGalaxies(){
        waitForLoad();
        click(SmartFeed, "SmartFeed");
        scrollandClick(ClassifyingGalaxies, "Classifying Galaxies");
        scrolldown();
        scrollto(Readthefullarticles2, "Readthefullarticles");
        click(Readthefullarticles2, "Readthefullarticles");
    }

    public void OptimizingRetailerRevenue(){
        waitForLoad();
        click(SmartFeed, "SmartFeed");
        scrollandClick(OptimizingRetailerRevenue, "Optimizing Retailer Revenue");
        scrolldown();
        scrollto(Readthefullarticles2, "Read The Full Articles");
        click(Readthefullarticles2, "Read The Full Articles");
    }

    public void RoboticAIlearns(){
        waitForLoad();
        click(SmartFeed, "SmartFeed");
        scrollandClick(RoboticAIlearns, "RoboticAIlearns");
        scrolldown();
        scrollto(Readthefullarticles2, "Readthefullarticles");
        click(Readthefullarticles2, "Readthefullarticles");
    }

    public void DeeplearningAI(){
        waitForLoad();
        click(SmartFeed, "SmartFeed");
        scrollandClick(DeeplearningAI, "DeeplearningAI");
        scrolldown();
        scrollto(Readthefullarticles, "Readthefullarticles");
        click(Readthefullarticles, "Readthefullarticles");
    }

    public void HowtoIdentifyOverfitting(){
        waitForLoad();
        click(SmartFeed, "SmartFeed");
        scrollandClick(HowtoIdentifyOverfitting, "HowtoIdentifyOverfitting");
        scrolldown();
        scrollto(Readthefullarticles, "Readthefullarticles");
        click(Readthefullarticles, "Readthefullarticles");
    }

    public void SkillsdevelopmentinPhysicalAI(){
        waitForLoad();
        click(SmartFeed, "SmartFeed");
        scrollandClick(SkillsdevelopmentinPhysicalAI, "SkillsdevelopmentinPhysicalAI");
        scrolldown();
        scrollto(Readthefullarticles2, "Readthefullarticles");
        click(Readthefullarticles2, "Readthefullarticles");
    }

    public void Shoppingonlineforthefestiveseason(){
        waitForLoad();
        click(SmartFeed, "SmartFeed");
        scrollandClick(Shoppingonlineforthefestiveseason, "Shoppingonlineforthefestiveseason");
        scrolldown();
        scrollto(Readthefullarticles, "Readthefullarticles");
        click(Readthefullarticles, "Readthefullarticles");
    }

    public void StayingaheadoftheAIcurve(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(StayingaheadoftheAIcurve, "StayingaheadoftheAIcurve");
        scrolldown();
        scrollto(Readthefullarticles, "Readthefullarticles");
        click(Readthefullarticles, "Readthefullarticles");
    }

    public void DevelopanIntuition(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(DevelopanIntuition, "DevelopanIntuition");
        scrolldown();
        scrollto(Readthefullarticles, "Readthefullarticles");
        click(Readthefullarticles, "Readthefullarticles");
    }

    public void HHSAutomatingHiring(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(HHSAutomatingHiring, "HHSAutomatingHiring");
        scrolldown();
        scrollto(Readthefullarticles2, "Readthefullarticles");
        click(Readthefullarticles2, "Readthefullarticles");
    }

    public void SoftwareSuppliersResponding(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(SoftwareSuppliersResponding, "SoftwareSuppliersResponding");
        scrolldown();
        scrolldown();
        scrolldown();
        scrolldown();
        scrollto(Readthefullarticles4, "Readthefullarticles");
        click(Readthefullarticles4, "Readthefullarticles");

    }

    public void GreenDataCenters(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(GreenDataCenters, "GreenDataCenters");
        scrolldown();
        scrolldown();
        scrolldown();
        scrollto(Readthefullarticles4, "Readthefullarticles");
        click(Readthefullarticles4, "Readthefullarticles");
    }

    public void MarineBatteryProduction(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(MarineBatteryProduction, " MarineBatteryProduction");
        click(Readthefullarticles4, "Readthefullarticles");
    }

    public void TheRoleofMental(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(TheRoleofMental, "TheRoleofMental");
        click(Readthefullarticles4, "Readthefullarticles");
    }

    public void AICloudMobileandRealityFuel(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(AICloudMobileandRealityFuel, "AICloudMobileandRealityFuel");
        click(Readthefullarticles4, "Readthefullarticles");
    }

    public void StochasticHillClimbing(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(StochasticHillClimbing, "StochasticHillClimbing");
        scrolldown();
        scrollto(Readthefullarticles, "Readthefullarticles");
        click(Readthefullarticles, "Readthefullarticles");
    }

    public void Algorithmreducesuseofriskier(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(DevelopanIntuition, "DevelopanIntuition");
        scrolldown();
        scrollto(Readthefullarticles, "Readthefullarticles");
        click(Readthefullarticles, "Readthefullarticles");
    }

    public void Nervoussystemsofinsects(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(Nervoussystemsofinsects, "Nervoussystemsofinsects");
        scrolldown();
        scrollto(Readthefullarticles2, "Readthefullarticles");
        click(Readthefullarticles2, "Readthefullarticles");
    }

    public void Twomotivationalartificialbeings(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(Twomotivationalartificialbeings, "Twomotivationalartificialbeings");
        scrolldown();
        scrollto(Readthefullarticles2, "Readthefullarticles");
        click(Readthefullarticles2, "Readthefullarticles");
    }

    public void Usingmachinelearningtotrack(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(Usingmachinelearningtotrack, "Usingmachinelearningtotrack");
        scrolldown();
        scrollto(Readthefullarticles3, "Readthefullarticles");
        click(Readthefullarticles3, "Readthefullarticles");
    }

    public void Artificialintelligencecanspeed(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(Artificialintelligencecanspeed, "Artificialintelligencecanspeed");
        scrolldown();
        scrollto(Readthefullarticles, "Readthefullarticles");
        click(Readthefullarticles, "Readthefullarticles");
    }

    public void CurveFittingWithPython(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(CurveFittingWithPython, "CurveFittingWithPython");
        scrolldown();
        scrollto(Readthefullarticles, "Readthefullarticles");
        click(Readthefullarticles, "Readthefullarticles");
    }

    public void AIaidsgene(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(AIaidsgene,"AI aids gene");
        scrolldown();
        scrollto(Readthefullarticles2, "Readthefullarticles");
        click(Readthefullarticles2, "Read the full articles");
    }

    public void Studentsdeveloptool(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(Studentsdeveloptool, "Studentsdeveloptool");
        scrolldown();
        scrollto(Readthefullarticles2, "Readthefullarticles");
        click(Readthefullarticles2, "Readthefullarticles");
    }

    public void Cockroachesandlizards(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(Cockroachesandlizards, "Cockroachesandlizards");
        scrolldown();
        scrollto(Readthefullarticles2, "Readthefullarticles");
        click(Readthefullarticles2, "Readthefullarticles");
    }

    public void Birdwatchingfromafar(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(Birdwatchingfromafar, "Birdwatchingfromafar");
        scrolldown();
        scrollto(Readthefullarticles2, "Readthefullarticles");
        click(Readthefullarticles2, "Readthefullarticles");
    }

    public void WhatIsTheDifferenceBetween(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(WhatIsTheDifferenceBetween, "WhatIsTheDifferenceBetween");
        scrolldown();
        scrollto(Readthefullarticles2, "Readthefullarticles");
        click(Readthefullarticles2, "Readthefullarticles");
    }

    public void KeyBenefitsofAITechnologies(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(KeyBenefitsofAITechnologies, "KeyBenefitsofAITechnologies");
        scrolldown();
        scrollto(Readthefullarticles2, "Readthefullarticles");
        click(Readthefullarticles2, "Readthefullarticles");
    }

    public void WhyAIGeneratedContent(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(WhyAIGeneratedContent, "WhyAIGeneratedContent");
        scrolldown();
        scrollto(Readthefullarticles2, "Readthefullarticles");
        click(Readthefullarticles2, "Readthefullarticles");
    }

    public void RandomForestTimeSeriesForecasting(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(RandomForestTimeSeriesForecasting, "RandomForestTimeSeriesForecasting");
        scrolldown();
        scrollto(Readthefullarticles, "Readthefullarticles");
        click(Readthefullarticles, "Readthefullarticles");
    }

    public void AIContactTracerAwarded(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(AIContactTracerAwarded, "AIContactTracerAwarded");
        scrolldown();
        scrollto(Readthefullarticles2, "Readthefullarticles");
        click(Readthefullarticles2, "Readthefullarticles");
    }

    public void AIteachersmustbeeffective(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(AIteachersmustbeeffective,"AIteachersmustbeeffective");
        scrolldown();
        scrollto(Readthefullarticles2, "Readthefullarticles");
        click(Readthefullarticles2, "Readthefullarticles");
    }

    public void SpookierOrSafer(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(SpookierOrSafer, "SpookierOrSafer");
        click(Readthefullarticles4, "Readthefullarticles");
    }

    public void BusyWeekforGoogle(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(BusyWeekforGoogle, "BusyWeekforGoogle");
        scrolldown();
        scrolldown();
        scrolldown();
        scrollto(Readthefullarticles4, "Readthefullarticles");
        click(Readthefullarticles4, "Readthefullarticles");
    }

    public void FederalGovernmentInvestments(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(FederalGovernmentInvestments, "FederalGovernmentInvestments");
        scrolldown();
        scrolldown();
        scrolldown();
        scrollto(Readthefullarticles4, "Readthefullarticles");
        click(Readthefullarticles4, "Readthefullarticles");
    }

    public void HowtoDevelopaRandomSubspace(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(HowtoDevelopaRandomSubspace, "HowtoDevelopaRandomSubspace");
        scrolldown();
        scrollto(Readthefullarticles, "Readthefullarticles");
        click(Readthefullarticles, "Readthefullarticles");
    }

    public void TrustlevelsinAI(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(TrustlevelsinAI, "TrustlevelsinAI");
        scrolldown();
        scrollto(Readthefullarticles2, "Readthefullarticles");
        click(Readthefullarticles2, "Readthefullarticles");
    }

    public void Graphenebasedmemoryresistors(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(Graphenebasedmemoryresistors, "Graphenebasedmemoryresistors");
        scrolldown();
        scrollto(Readthefullarticles2, "Readthefullarticles");
        click(Readthefullarticles2, "Readthefullarticles");
    }

    public void Artificialintelligencemodeldetectsasymptomatic(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(Artificialintelligencemodeldetectsasymptomatic, "Artificialintelligencemodeldetectsasymptomatic");
        scrolldown();
        scrollto(Readthefullarticles3, "Readthefullarticles");
        click(Readthefullarticles3, "Readthefullarticles");
    }

    public void ResiliencyAndSecurity(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(ResiliencyAndSecurity, "ResiliencyAndSecurity");
        click(Readthefullarticles4, "Readthefullarticles");
    }

    public void AIProjectsProgressing(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(AIProjectsProgressing, "AIProjectsProgressing");
        scrolldown();
        scrollto(Readthefullarticles4, "Readthefullarticles");
        click(Readthefullarticles4, "Readthefullarticles");
    }

    public void Testingsewagetohome(){
        click(SmartFeed, "SmartFeed");
        scrollandClick(Testingsewagetohome, "Testingsewagetohome");
        scrolldown();
        scrollto(Readthefullarticles3, "Readthefullarticles");
        click(Readthefullarticles3, "Readthefullarticles");
    }
}