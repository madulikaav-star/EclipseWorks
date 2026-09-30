package junitBasics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class demo {
	@Before
	public void envSetUp() {
		System.out.println("Broswer and url setup");
	}
	@Test
	public void currenturlVerification() {
		System.out.println("text contains");
	}
	@Test
	public void titleVerification() {
		System.out.println("correct title");
	}
	@After
	public void closeBrowser(){
		System.out.println("closed browser");
	}
	
	
	
	
	
	

}
