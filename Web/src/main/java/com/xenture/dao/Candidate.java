package com.xenture.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xenture.connection.DConnection;
import com.xenture.dto.User;

public class Candidate {

	/*public void dataList() throws SQLException {
		Connection conn = DConnection.getConnection();
		PreparedStatement psmst = null;
		// String name=null;
		User u = new User();
		System.out.println("DB Connected");
		String sql = "SELECT `recruiter_first_name` FROM `recruiter`";
		psmst = conn.prepareStatement(sql);
		ResultSet rs = psmst.executeQuery();
		while (rs.next()) {
			u.setName(rs.getString("recruiter_first_name"));

		}
	}*/

	public List<User> list() throws SQLException {
	        List<User> users = new ArrayList<User>();
	    	Connection conn=DConnection.getConnection();
			PreparedStatement psmst=null;
			ResultSet resultSet=null;
	    
	        		 conn=DConnection.getConnection();
	        	 psmst=null;
	        		String sql="SELECT `recruiter_first_name` FROM `recruiter`";
	    			psmst=conn.prepareStatement(sql);
	        		 resultSet=psmst.executeQuery();
	    		 
	            while (resultSet.next()) {
	            	User user = new User();
	               
	                user.setName(resultSet.getString("recruiter_first_name"));
	              
	                users.add(user);
	            }
	      

	        return users;
	    }

/*	public static void main(String[] args) throws SQLException {

		Candidate c = new Candidate();
		//c.list();
		 List<User> users = c.list();

		
		System.out.println(users.size());
		System.out.println(users);
	}*/
}
