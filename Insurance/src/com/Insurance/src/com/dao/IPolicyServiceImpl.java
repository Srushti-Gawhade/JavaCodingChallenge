package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.model.Policy;
import com.model.User;
import com.mysql.jdbc.PreparedStatement;
import com.utility.DBConnection;

public class IPolicyServiceImpl implements IPolicyService {
	

	@Override
	public boolean createPolicy(Policy policy) {
		Connection con = DBConnection.dbConnect();
		String sql = "INSERT INTO policy (policyId, name, premium, rateOfInterest) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(sql)) {
            pstmt.setInt(1, policy.getPolicyId());
            pstmt.setString(2, policy.getName());
            pstmt.setDouble(3, policy.getPremium());
            pstmt.setDouble(4, policy.getRateOfInterest());
            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
	}

	@Override
	public Policy getPolicy(int policyId) {
		Connection con = DBConnection.dbConnect();
		String sql = "SELECT * FROM policy WHERE policyId = ?";
        try (PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(sql)) {
        	pstmt.setInt(1, policyId);
            ResultSet resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                return new Policy(resultSet.getInt("policyId"),
                                  resultSet.getString("name"),
                                  resultSet.getDouble("premium"),
                                  resultSet.getInt("rateOfInterest"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
		
	}

	@Override
	public Collection<Policy> getAllPolicies() {
		Connection con = DBConnection.dbConnect();
		String sql = "SELECT * FROM policy";
        Collection<Policy> policies = new ArrayList<>();
        try (PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(sql)) {
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                policies.add(new Policy(resultSet.getInt("policyId"),
                                         resultSet.getString("name"),
                                         resultSet.getDouble("premium"),
                                         resultSet.getInt("rateOfInterest")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return policies;
	}

	@Override
	public boolean updatePolicy(Policy policy) {
		Connection con = DBConnection.dbConnect();
		String sql = "UPDATE policy SET name = ?, premium = ?, rateOfInterest = ? WHERE policyId = ?";
        try (PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(sql)) {
        	pstmt.setString(1, policy.getName());
        	pstmt.setDouble(2, policy.getPremium());
        	pstmt.setDouble(3, policy.getRateOfInterest());
        	pstmt.setInt(4, policy.getPolicyId());
            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
	 public boolean deletePolicy(int policyId) {
		 Connection con = DBConnection.dbConnect();
	 String sql = "DELETE FROM policy WHERE policyId = ?";
     try (PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(sql)) {
         pstmt.setInt(1, policyId);
         return pstmt.executeUpdate() > 0;
     } catch (SQLException e) {
         e.printStackTrace();
         return false;
     }
	 }
	@Override
	public int save(User user) {
		
		return 0;
	}

	@Override
	public boolean findOne(int policyId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteById(int policyId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
