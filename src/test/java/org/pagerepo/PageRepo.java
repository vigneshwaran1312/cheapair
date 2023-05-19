package org.pagerepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdef.Hook;

public class PageRepo {
	public PageRepo() {
		PageFactory.initElements(Hook.driver, this);
	}
	
	@FindBy(id = "to1")
	private WebElement to;
	
	@FindBy(xpath = "(//span[@class='suggest-type'])[1]")
	private WebElement suggest;
	
	public WebElement getSuggest() {
		return suggest;
	}

	@FindBy(xpath = "(//table[@class='ui-datepicker-calendar'])[2]//a[text()='13']")
	private WebElement depart;
	
	@FindBy(xpath = "(//table[@class='ui-datepicker-calendar'])[2]//a[text()='15']")
	private WebElement Return;
	
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement search;
	
	@FindBy(xpath = "(//div[@class='trav-select first']//button[@type='button'])[2]")
	private WebElement adultcount;
	
	@FindBy(xpath = "(//div[@class='trav-select first']//button[@type='button'])[4]")
	private WebElement childcount;
	
	@FindBy(xpath = "(//div[@class='trav-select']//button[@type='button'])[2]")
	private WebElement seniorcount;

	public WebElement getTo() {
		return to;
	}

	public WebElement getDepart() {
		return depart;
	}

	public WebElement getReturn() {
		return Return;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getAdultcount() {
		return adultcount;
	}

	public WebElement getChildcount() {
		return childcount;
	}

	public WebElement getSeniorcount() {
		return seniorcount;
	}
}
