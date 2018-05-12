package Example_2_solution;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Auto_genereated_example2 {
	
	@Given("^I am a \"([a-zA-Z]{1,})\" Tester$")
	//@Given("^I am a \"([^\"]*)\" Tester$")
	public void i_am_a_Tester(String arg1) throws Throwable {
		
		System.out.println("i_am_a_Tester --> " + arg1 );
	   
	}
	@When("^I apply for a Job$")
	public void i_apply_for_a_Job() throws Throwable {
		System.out.println("i_apply_for_a_Job --> no variable / argument");

	}

	@Then("^I got a \"([^\"]*)\" paid job$")
	public void i_got_a_paid_job(String arg1) throws Throwable {
		System.out.println("i_got_a_paid_job -->" + arg1 );
	    
	}

	@Then("^I am \"([^\"]*)\" satisfied with my salary$")
	public void i_am_satisfied_with_my_salary(String arg1) throws Throwable {
		System.out.println("i_am_satisfied_with_my_salary --> " + arg1 );
	}

	@Then("^my parents are \"([^\"]*)\" satisfied$")
	public void my_parents_are_satisfied(String arg1) throws Throwable {
		System.out.println("my_parents_are_satisfied --> " + arg1 );
	}


}
