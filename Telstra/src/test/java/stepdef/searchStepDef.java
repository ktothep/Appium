package stepdef;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchStepDef {

	public static Logger logs;

@Before
public void initialisation() 
{
 logs=LoggerFactory.getLogger("Amazon Search Functionality");	
}
	
@Given("^User navigates to the signin page$")
public void user_navigates_to_the_signin_page() throws Throwable {

    
}

@When("^User submit username and password$")
public void user_submit_username_and_password() throws Throwable {
	logs.info("Starting the Login Functionality");
}

@Then("^User should be logged in$")
public void user_should_be_logged_in() throws Throwable {
	logs.info("Checking if the User is logged in succsfully");
    
}

@When("^User searches for the \"([^\"]*)\"$")
public void user_searches_for_the(String arg1) throws Throwable {
	logs.info("Seaching for the product");
  
}

@Then("^User Adds the item to the cart$")
public void user_Adds_the_item_to_the_cart() throws Throwable {
	logs.info("Adding the searched item in the cart");
}

@Then("^Verifies the details at the Checkout$")
public void verifies_the_details_at_the_Checkout() throws Throwable {
	logs.info("Validating the different aspects of the object added in the cart");

}


}
