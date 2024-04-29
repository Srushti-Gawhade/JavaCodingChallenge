package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.exception.ResourceNotFoundException;
import com.model.Client;
import com.service.ClientService;

public class ClientController {
	
		public static void main(String[] args) throws SQLException, ResourceNotFoundException {
			ClientService clientService = new ClientService();
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("----------Client Ops-------------");
				System.out.println("Press 1. Insert Client ");
				System.out.println("Press 2. Delete Client ");
				System.out.println("Press 3. Deactivate Delete Client[Soft delete] ");
				System.out.println("Press 4. Display all Client");
				System.out.println("Press 0. to Exit");
				int input = sc.nextInt();
				if(input == 0) {
					System.out.println("Exiting Client Module..");
					break; 
				}
				
				switch(input) {
				case 1: 
					//System.out.println(UUID.randomUUID()); --auto generating alphanumeric for ID
					Random random = new Random(); 
					int randomNumber = random.nextInt(); 
					int id =randomNumber<0?randomNumber*-1:randomNumber; 
					System.out.println("Enter Client name");
					sc.nextLine();
					String name = sc.nextLine();   
					System.out.println("Enter name");
					String contactInfo=sc.nextLine(); //email
					System.out.println("Enter policy");
					String policy=sc.nextLine();
					/* Attach values to Object  */
					Client client = new Client(id,name,contactInfo,policy);
					int status = clientService.insert(client);
					if(status == 1)
						System.out.println("Client record added to DB..");
					else
						System.out.println("Insert op failed");
					
					break; 
				case 2: 
					System.out.println("Enter Client ID");
					clientService.deleteByid(sc.nextInt());
					System.out.println("Client record deleted..");				
					break; 
				case 3: 
					System.out.println("Enter Artist ID");
					clientService.softDeleteByid(sc.nextInt());
					System.out.println("Client record de-activated..");				
					break; 
				case 4: 	 
					List<Client> list = clientService.findAll();
					for(Client c : list) {
						System.out.println(c);
					}
					break; 
				}
				
			}
			
			//sc.close();
		}
		
		
	}

	


