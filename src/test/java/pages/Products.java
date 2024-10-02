package pages;

import org.testng.Assert;

public class Products extends BasePage {

    public Products() {
        super(driver);
        
    }

    private String search="//input[@class='pull-left input-medium search-query dropdown-toggle']";
    private String searchButton="//div[@class='button-in-search']";   
    private String productInformation="//p[contains(text(),'This natural coverage concealer lets you instantly eliminate tell-tale signs of stress and fatigue. Provides complete, natural-looking coverage, evens skin tone, covers dark circles and minimizes fine lines around the eyes. The Result: A soft, matte finish')]";   
    private String productInformationComparation="This natural coverage concealer lets you instantly eliminate tell-tale signs of stress and fatigue. Provides complete, natural-looking coverage, evens skin tone, covers dark circles and minimizes fine lines around the eyes. The Result: A soft, matte finish";    
    private String hairCareOption="//a[@href='https://automationteststore.com/index.php?rt=product/category&path=52']";
    private String panteneProduct="//div[@id='maincontainer']//div[2]//div[2]//a[1]//img[1]";
    private String dollarPrice="//span[contains(text(),'$11.45')]";
    private String dollarPriceComparation="$11.45";
    private String coinContainer="//body/div[@class='container-fixed']/header/div[@class='container-fluid']/div[@class='col-md-12 headerdetails']/div[@class='block_6']/ul[@class='nav language pull-left']/li[@class='dropdown hover open']/a[@class='dropdown-toggle']/span[1]";
    private String selectEuroCoin="//a[contains(text(),'€ Euro')]";
    private String euroPrice="//span[contains(text(),'83.53€')]";
    private String euroPriceComparation="83.53€";
    private String selectSterlinCoin="//a[contains(text(),'£ Pound Sterling')]";
    private String sterlinPrice="//span[contains(text(),'83.53€')]";
    private String sterlinPriceComparation="83.53€";
    private String makeUpOption="//a[normalize-space()='Makeup']";
    private String lipStick="//div[7]//div[2]//a[1]//img[1]";
    private String skinCareOption="//a[@href='https://automationteststore.com/index.php?rt=product/category&path=43']";
    private String preciousCells="//div[@id='maincontainer']//div[2]//div[2]//a[1]//img[1]";

    public void searchOption(){   
        write(search, "Waterproof Protective Undereye Concealer");
        clickElement(searchButton);
    }   
    
    public void validateMakeupProduct(){
        Assert.assertTrue(productInformation.contains(productInformationComparation));   
    }

    public void productWithDollars(){   
        clickElement(hairCareOption);
        clickElement(panteneProduct);
    }   

    public void productWithEuros(){   
        clickElement(coinContainer);
        clickElement(selectEuroCoin);
        clickElement(skinCareOption);
        clickElement(preciousCells);
    }   

    public void productWithSterlin(){   
        clickElement(coinContainer);
        clickElement(selectSterlinCoin);
        clickElement(makeUpOption);
        clickElement(lipStick);
    }   


    public void validateDollarProduct(){
        Assert.assertTrue(dollarPrice.contains(dollarPriceComparation));   
    }

    public void validateEuroProduct(){
        Assert.assertTrue(euroPrice.contains(euroPriceComparation));   
    }
    public void validateSterlinProduct(){
        Assert.assertTrue(sterlinPrice.contains(sterlinPriceComparation));   
    }
}
