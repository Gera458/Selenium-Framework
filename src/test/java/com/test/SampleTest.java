package com.test;

import org.testng.annotations.Test;

import com.qa.BaseTest;

import pageEvents.Login;

public class SampleTest extends BaseTest {
	
	@Test
	public void sample() throws InterruptedException
	{
		Login obj= new Login();
		obj.login1();


	}
	@Test
	public void sample1() throws InterruptedException
	{
		Login obj= new Login();
		obj.login2();


	}
	
	@Test
	public void sample2() throws InterruptedException
	{
		Login obj= new Login();
		obj.login3();


	}
	
	@Test
	public void sample3() throws InterruptedException
	{
		Login obj= new Login();
		obj.login4();


	}

}
