package org.stepdef;


import java.util.List;


import org.pagerepo.PageRepo;
import org.pagerepo.PageRepo2;
import org.pagerepo.PageRepo3;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Booking  {
	PageRepo lv = new PageRepo();
	PageRepo2 lv2= new PageRepo2();
	PageRepo3 lv3 = new PageRepo3();
	@Given("Launch the website")
	public void launch_the_website() {
	   Hook.driver.get("https://www.cheapair.com/");
	}

	@When("Enter the from to locations and count of passengers")
	public void enter_the_from_to_locations() {
		Hook.waits();
	   lv.getTo().sendKeys("Delhi");
	   Hook.waits();
	   lv.getSuggest().click();
	   Hook.click(lv.getDepart());
	   Hook.click(lv.getReturn());
	   Hook.waits();
	   for(int i=1;i<4;i++) {
		   try {
			   Hook.click(lv.getAdultcount());
		} catch (Exception e) {
			// TODO: handle exception
			Hook.waits();
		}
	   }
	  
	   for(int i=1;i<=2;i++) {
		   try {
			   lv.getChildcount().click();
			   lv.getSeniorcount().click();
		} catch (Exception e) {
			// TODO: handle exception
			Hook.waits();
		}
	  }
	   Hook.scroll(lv.getSearch());
	   Hook.click(lv.getSearch());   
	}

	@Then("Select the lowest price fligth for depart and return")
	public void Select_the_fligth() {
		Hook.window(1);
		Hook.waits();
		try {
			Hook.click(lv2.getCross());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("not visible");
		}	
//		List<WebElement> price= lv2.getPrice();
//		Object[] price1 = new Object[price.size()];
//		for(int i=0;i<=price.size()-1;i++) {
//			price1[i]= price.get(i).getText();
//		}	    
//	    Arrays.sort(price1);
//	    for(int i =0;i<=price1.length-1;i++) {
//	    	System.out.println(price1[0]);
//	    }
	    
		Hook.click(lv2.getDepartflight());
		Hook.waits();
		Hook.click(lv2.getReturnflight());
		Hook.waits();
		Hook.scroll(lv2.getContinue());
		Hook.click(lv2.getContinue());
	
	}

	@And("Enter the details of passengers")
	public void detail(DataTable userdetails) 
	{
		List<List<String>> asList = userdetails.asLists();
		Hook.waits();
		lv3.getFirstName1().sendKeys(asList.get(0).get(0));
		lv3.getLastName1().sendKeys(asList.get(0).get(1));
		Hook.dropdown(lv3.getGender1(),asList.get(0).get(2));
		Hook.dropdown(lv3.getDobMonth1(), asList.get(0).get(3));
		lv3.getDobDay1().sendKeys(asList.get(0).get(4));
		lv3.getDobYear1().sendKeys(asList.get(0).get(5));
		
		lv3.getFirstName2().sendKeys(asList.get(1).get(0));
		lv3.getLastName2().sendKeys(asList.get(1).get(1));
		Hook.dropdown(lv3.getGender2(),asList.get(1).get(2));
		Hook.dropdown(lv3.getDobMonth2(), asList.get(1).get(3));
		lv3.getDobDay2().sendKeys(asList.get(1).get(4));
		lv3.getDobYear2().sendKeys(asList.get(1).get(5));
		
		lv3.getFirstName3().sendKeys(asList.get(2).get(0));
		lv3.getLastName3().sendKeys(asList.get(2).get(1));
		Hook.dropdown(lv3.getGender3(),asList.get(2).get(2));
		Hook.dropdown(lv3.getDobMonth3(), asList.get(2).get(3));
		lv3.getDobDay3().sendKeys(asList.get(2).get(4));
		lv3.getDobYear3().sendKeys(asList.get(2).get(5));
		
		lv3.getFirstName4().sendKeys(asList.get(3).get(0));
		lv3.getLastName4().sendKeys(asList.get(3).get(1));
		Hook.dropdown(lv3.getGender4(),asList.get(3).get(2));
		Hook.dropdown(lv3.getDobMonth4(), asList.get(3).get(3));
		lv3.getDobDay4().sendKeys(asList.get(3).get(4));
		lv3.getDobYear4().sendKeys(asList.get(3).get(5));
		
		lv3.getFirstName5().sendKeys(asList.get(4).get(0));
		lv3.getLastName5().sendKeys(asList.get(4).get(1));
		Hook.dropdown(lv3.getGender5(),asList.get(4).get(2));
		Hook.dropdown(lv3.getDobMonth5(), asList.get(4).get(3));
		lv3.getDobDay5().sendKeys(asList.get(4).get(4));
		lv3.getDobYear5().sendKeys(asList.get(4).get(5));
		
		lv3.getFirstName6().sendKeys(asList.get(5).get(0));
		lv3.getLastName6().sendKeys(asList.get(5).get(1));
		Hook.dropdown(lv3.getGender6(),asList.get(5).get(2));
		Hook.dropdown(lv3.getDobMonth6(), asList.get(5).get(3));
		lv3.getDobDay6().sendKeys(asList.get(5).get(4));
		lv3.getDobYear6().sendKeys(asList.get(5).get(5));
		
		lv3.getFirstName7().sendKeys(asList.get(6).get(0));
		lv3.getLastName7().sendKeys(asList.get(6).get(1));
		Hook.dropdown(lv3.getGender7(),asList.get(6).get(2));
		Hook.dropdown(lv3.getDobMonth7(), asList.get(6).get(3));
		lv3.getDobDay7().sendKeys(asList.get(6).get(4));
		lv3.getDobYear7().sendKeys(asList.get(6).get(5));
		
		lv3.getFirstName8().sendKeys(asList.get(7).get(0));
		lv3.getLastName8().sendKeys(asList.get(7).get(1));
		Hook.dropdown(lv3.getGender8(),asList.get(7).get(2));
		Hook.dropdown(lv3.getDobMonth8(), asList.get(7).get(3));
		lv3.getDobDay8().sendKeys(asList.get(7).get(4));
		lv3.getDobYear8().sendKeys(asList.get(7).get(5));		
	}
	
	@When("Enter the cerdit card details")
	public void enter_the_cerdit_card_details(DataTable carddetails) {
	    List<List<String>> asLists = carddetails.asLists();
	    lv3.getCreditcardno().sendKeys(asLists.get(0).get(0));
	    Hook.dropdown(lv3.getExpMonth1(),asLists.get(0).get(1));
	    Hook.dropdown(lv3.getExpYear1(),asLists.get(0).get(2));
	    lv3.getCvv().sendKeys(asLists.get(0).get(3));
	    lv3.getCardholdername().sendKeys(asLists.get(0).get(4));
	    Hook.dropdown(lv3.getCountry(),asLists.get(0).get(5));
	    lv3.getAddress().sendKeys(asLists.get(0).get(6));
	    lv3.getPhonenumber().sendKeys(asLists.get(0).get(7));
	}
	
	@Then("Click on purchase button")
	public void select_the_fligth() {
	   System.out.println("click the purchase button");
	}


}
