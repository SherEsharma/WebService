package com.xen;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class MyJerseyPage {
	CountryService countryService=new CountryService();
/*	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHtmlHello() {
		
	return "Hello from Jersey with shubham";
	}*/
	
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public List getCountries()
	{
		
		//List<Country> listOfCountries=countryService.getAllCountries();
		List listOfCountries=new ArrayList();
		listOfCountries.add("shubham");
		listOfCountries.add("anjali");
		listOfCountries.add("pradeep");
		
		
		return listOfCountries;
	}

}
