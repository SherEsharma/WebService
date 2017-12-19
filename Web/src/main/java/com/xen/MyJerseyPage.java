package com.xen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
	
	//List listOfCountries=new ArrayList();
	
	Map<Integer, String> map=new HashMap<Integer, String>();
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public Map<Integer, String> getCountries()
	{
		//List<Country> listOfCountries=countryService.getAllCountries();
		
	/*	listOfCountries.add("1","shubham");
		listOfCountries.add("2","anjali");
		listOfCountries.add("pradeep");*/
		
		
		map.put(1, "Shubham");
		map.put(2, "Pradeep");
		map.put(3, "Anjali");
		
		return map;
		
	}
	
	
	
	
	
	

}
