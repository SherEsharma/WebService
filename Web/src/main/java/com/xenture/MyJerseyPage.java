package com.xenture;

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

@Path("/name")
public class MyJerseyPage {
	CountryService countryService=new CountryService();

	
	Map<Integer, String> map=new HashMap<Integer, String>();
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public Map<Integer, String> getname()
	{
		map.put(1, "Shubhasssm");
		map.put(2, "Pradeep");
		map.put(3, "Anjali");
		
		return map;
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
