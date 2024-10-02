package pages;

import org.testng.Assert;

public class InicioAutomationTestStore extends BasePage {
  private String searchBar="//div[@class='header-dir-ltr fixed-container--default--301iFsz _pc_new_header_ab_330_']";
  private String checkBoxStore="//body/div[@id='root']/div[@class='root--container--2gVZ5S0 root--newRoot--2-6FirH search-root-cls']/div[@class='main2023--container--1Km9a-K main2023--ltr--2Ro1nU3']/div[@class='refine2023--refine--3SE-006']/div[2]/div[2]/span[1]/span[1]/span[1]";
  private String selectCity="//span[@class='radio--icon--11l24uK radio--checked--ONAUUbk']";
  private String selectProduct="//div[@class='multi--outWrapper--SeJ8lrF multi--hover--1KdttAr card--out-wrapper']//div[@class='images--hover--1N5tJXp']";
  private String addToCart="//span[normalize-space()='Agregar al carrito']";  
  private String addProduct="//div[@class='comet-v2-input-number']//span[contains(@class,'comet-icon comet-icon-add')]//*[name()='svg']";
  private String goToTheCart="//a[@class='cart-summary-tocart']";
  private String productInformation="//p[contains(text(),'COP23,271.46'";  
  private String productInformationComparation="COP23,271.46";    
  public InicioAutomationTestStore() {
        super(driver);
      }

      public void navigateToAutomationPage(){
        navigateTo("https://es.aliexpress.com/");
        
       
    }

    public void searchProductBar(){
      clickElement(searchBar);
      write(searchBar, "maquina de boxeo");
      clickElement(checkBoxStore);
      clickElement(selectCity);
      

      
    }
    public void selectProduct(){
    clickElement(selectProduct);
    clickElement(addToCart);
    clickElement(addProduct);
    clickElement(addProduct);
    clickElement(addProduct);
    clickElement(addProduct);
  }

  public void addProductToCart(){

    clickElement(goToTheCart);

  }

  public void validatePriceProduct(){
    Assert.assertTrue(productInformation.contains(productInformationComparation)); 
  }
    
    }

  