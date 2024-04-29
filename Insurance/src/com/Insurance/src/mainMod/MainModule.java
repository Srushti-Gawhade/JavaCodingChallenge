package mainMod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;
import com.utility.DBConnection;
import com.dao.InsuranceServiceImpl;
import com.exception.PolicyNotFoundException;
import com.model.Policy;

public class MainModule {
	
	    public static void main(String[] args) throws SQLException, PolicyNotFoundException {
			InsuranceServiceImpl service = new InsuranceServiceImpl(getConnection()); // Assuming getConnection() method provides a database connection

	        // Trigger all the methods in the service implementation class
	        createPolicyExample(service);
	        getPolicyExample(service);
	        getAllPoliciesExample(service);
	        updatePolicyExample(service);
	        deletePolicyExample(service);
	    }


		// Method to provide a database connection
	    private static Connection getConnection() throws SQLException {
	    	Connection con = null;
	    	try {
	    		//load the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//establish the connection
				 String url= "jdbc:mysql://localhost:3306/insurance";
			     String userDB = "root";
			     String passDB = "";
			     con = DriverManager.getConnection(url, userDB, passDB);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
	        // Implement your database connection logic here
	    }

	    // Example method to trigger createPolicy method
	    private static void createPolicyExample(InsuranceServiceImpl service) {
	        Policy policy = new Policy(123, "Example Policy", 100.00, (int) 5.0); // Example policy data
	        boolean success = service.createPolicy(policy);
	        System.out.println("Policy created: " + success);
	    }

	    // Example method to trigger getPolicy method
	    private static void getPolicyExample(InsuranceServiceImpl service) throws PolicyNotFoundException {
	        Policy policy = service.getPolicy(123); // Replace 123 with the policy ID you want to retrieve
			System.out.println("Retrieved Policy: " + policy);
	    }

	    // Example method to trigger getAllPolicies method
	    private static void getAllPoliciesExample(InsuranceServiceImpl service) {
	        Collection<Policy> policies = service.getAllPolicies();
	        System.out.println("All Policies: " + policies);
	    }

	    // Example method to trigger updatePolicy method
	    private static void updatePolicyExample(InsuranceServiceImpl service) {
	        Policy policy = new Policy(123, "Updated Policy", 150.00, (int) 6.0); // Updated policy data
	        boolean success = service.updatePolicy(policy);
	        System.out.println("Policy updated: " + success);
	    }

	    // Example method to trigger deletePolicy method
	    private static void deletePolicyExample(InsuranceServiceImpl service) {
	        boolean success = service.deletePolicy(123); // Replace 123 with the policy ID you want to delete
	        System.out.println("Policy deleted: " + success);
	    }
	}



