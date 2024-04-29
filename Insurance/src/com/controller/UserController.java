package com.controller;


import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.exception.PolicyNotFoundException;
import com.exception.ResourceNotFoundException;
import com.model.User;
import com.service.UserService;

public class UserController {
	public static void main(String[] args) throws SQLException, ResourceNotFoundException, PolicyNotFoundException {
		UserService userService = new UserService();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("----------User Ops-------------");
			System.out.println("Press 1. Insert User ");
			System.out.println("Press 2. Delete User ");
			System.out.println("Press 3. Deactivate Delete User[Soft delete] ");
			System.out.println("Press 4. Display all users");
			System.out.println("Press 0. to Exit");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("Exiting User Module..");
				break; 
			}
			
			switch(input) {
			case 1: 
				//System.out.println(UUID.randomUUID()); --auto generating alphanumeric for ID
				Random random = new Random(); 
				int randomNumber = random.nextInt(); 
				int id =randomNumber<0?randomNumber*-1:randomNumber; 
				System.out.println("Enter User name");
				sc.nextLine();
				String name = sc.nextLine();   
				System.out.println("Enter Password");
				String password=sc.nextLine(); //email
				System.out.println("Enter Role");
				String role=sc.nextLine();
				/* Attach values to Object  */
				User user = new User(id,name,password,role);
				int status = userService.insert(user);
				if(status == 1)
					System.out.println("User record added to DB..");
				else
					System.out.println("Insert op failed");
				
				break; 
			case 2: 
				System.out.println("Enter User ID");
				userService.deleteByid(sc.nextInt());
				System.out.println("Artist record deleted..");				
				break; 
			case 3: 
				System.out.println("Enter Artist ID");
				userService.softDeleteByid(sc.nextInt());
				System.out.println("Artist record de-activated..");				
				break; 
			case 4: 	 
				List<User> list = userService.findAll();
				for(User u : list) {
					System.out.println(u);
				}
				break; 
			}
			
		}
		
		//sc.close();
	}
	
	
}
