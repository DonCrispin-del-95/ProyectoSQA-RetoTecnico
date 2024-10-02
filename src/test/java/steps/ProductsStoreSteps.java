package steps;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InicioAutomationTestStore;




public class ProductsStoreSteps {
    InicioAutomationTestStore principalPage = new InicioAutomationTestStore();


 @Given("I get into the page and i search a product in the searching bar")
    public void iGoToLoginThePage() {
       principalPage.navigateToAutomationPage();
       principalPage.searchProductBar();

       
    }

    @When("I click in the product to add a cart")
    public void iSearchForProduct(){
      principalPage.addProductToCart();
      
    }
    
    @Then("I can see the price of the prodcut")
    public void iSeeTheProduct(){
      principalPage.validatePriceProduct(); 
    }
    
}


 
    
