package com.xenture.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.xenture.Alien;
import com.xenture.connection.DConnection;

public class AlienRepo
{
	Connection conn=null;
	
	List<Alien> aliens;
	
	public AlienRepo(){
		conn=DConnection.getConnection();
		System.out.println("DB connected");
		
	}
	
	public List<Alien> getaliens(){
		
		List<Alien>  aliens=  new ArrayList<>();
		String sql="SELECT * FROM `alien`";
		try{
		Statement stmt= conn.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()){
			Alien a= new Alien();
			a.setId(rs.getInt(1));
			a.setName(rs.getString(2));
			a.setPoints(rs.getInt(3));
			aliens.add(a);
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return aliens;
		
	}
	
	public  Alien getalien(int id){
		System.out.println(id);
		Alien a= new Alien();
		String sql="SELECT * FROM `alien` where alien_id="+id;
		try{
		Statement stmt= conn.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		if(rs.next()){
			
			a.setId(rs.getInt(1));
			a.setName(rs.getString(2));
			a.setPoints(rs.getInt(3));
			
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return a;
		
		
		
		
		/*for(Alien a:aliens){
			
			if(a.getId()==id){
				
				return a;
			}
		}
		return null;*/
	}

	public void create(Alien data) {
		//Alien a= new Alien();
		System.out.println(data);
		String sql="insert into alien value(?,?,?)";
		try{
			System.out.println(sql);
		PreparedStatement Pstmt= conn.prepareStatement(sql);
		Pstmt.setInt(1, data.getId());
		Pstmt.setString(2, data.getName());
		Pstmt.setInt(3, data.getPoints());
		int i=Pstmt.executeUpdate();
		System.out.println(i);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void uodate(Alien a){
		System.out.println("Update Method");
		String sql="update alien set alien_name=?,alien_point=? where alien_id=?";
		try{
			System.out.println(sql);
		PreparedStatement Pstmt= conn.prepareStatement(sql);
		Pstmt.setInt(3, a.getId());
		Pstmt.setString(1, a.getName());
		Pstmt.setInt(2, a.getPoints());
		int i=Pstmt.executeUpdate();
		System.out.println(i);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public Alien delete(int id){
		System.out.println("In delete method");
		String sql="delete from alien where alien_id=?";
		
		try{
			PreparedStatement psmt=conn.prepareStatement(sql);
			psmt.setInt(1, id);
			psmt.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		
	}
}
