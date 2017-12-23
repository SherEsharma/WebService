package com.xenture;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.xenture.dao.AlienRepo;

@Path("aliens")
public class AlienResources {
	AlienRepo repo= new AlienRepo();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Alien> getAliens(){
		
		System.out.println("Method aliens Get");
		
		
		
		return repo.getaliens();
		
	}
	
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("aliens/{id}")
	public Alien getAlien(@PathParam("id") int id){
		
		System.out.println("One alien Get method call");
		
		
		
		return repo.getalien(id);
	}
	
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("aliens/{id}")
	public Alien killAlien(@PathParam("id") int id){
		System.out.println("In delete method");
		Alien a = repo.getalien(id);
		if(a.getId()!=0){
		 repo.delete(id);
		}
		return a;
	}
	
	
	@POST
	@Path("alien")
	@Produces(MediaType.APPLICATION_JSON)
	public Alien createAlienn(Alien a1){
		System.out.println("Inser nethod call");
		System.out.println(a1);
		
		repo.create(a1);
		
		return a1;
		
	}
	
	@PUT
	@Path("alien")
	@Produces(MediaType.APPLICATION_JSON)
	public Alien updateAlien(Alien a1){
		System.out.println("Update nethod call");
		System.out.println(a1);
		
		repo.uodate(a1);
		
		return a1;
		
	}
	
	
	
}
