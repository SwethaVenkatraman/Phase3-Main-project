package com.project.SportyShoes.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.SportyShoes.entity.Login;
import com.project.SportyShoes.entity.UserDetails;
import com.project.SportyShoes.jdbc.LoginRepository;


@Service
public class LoginService{
	@Autowired
	private LoginRepository repo;
	private Object email;
	 public Login signgin(String username, String password) {
		  Login user = repo.findByUsernameAndPassword(username, password);
		  System.out.println("from service" + user);
		  
	  	return user;
	  }
	 
	public Login changePassword(String username, String newpassword) {
		// TODO Auto-generated method stub
		Login uplogin = null;
		Login user1 = repo.findByUsername(username);
		if(user1 !=null ) {
			System.out.println("user1" + user1);
			repo.changePassword(newpassword, user1.getId());
			uplogin = repo.findByUsername(username);
			System.out.println("Password Changed");
			return uplogin;
		}
		return null;
	}
}
	login=repo.findById((Long) email); 
		if(login != null)
		 {
			 Object resetPassword;
			login.setNewPassword(resetPassword);
			 repo.save(login);
		 }
		 else {
			System.out.println("couldnot find the emailid");
		}
	   }
	    catch (Exception e) {
		e.printStackTrace();
	    }
    }
	 
	public Login getByResetPassword(String resetPassword)
	{	
	  return repo.findByResetPassword(resetPassword);
	}     		
}
