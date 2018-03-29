package com.javarnd.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.javarnd.beans.CustomerBO;
import com.javarnd.beans.CustomerDTO;
import com.javarnd.commans.SQLConstans;
import com.javarnd.util.ConnectionUtil;
import com.javarnd.util.UtilConstants;

public class CustomerRepositoryImpl implements CustomerRepository {
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	@Override
	public int addNewCustomer(CustomerBO customerBO) {
		int flag = 0;
		try {
			con = ConnectionUtil.getDataSource().getConnection();
			ps = con.prepareStatement(SQLConstans.ADD_CUSTOMER);
			ps.setInt(1, customerBO.getCustomerId());
			ps.setString(2, customerBO.getCustomerName());
			ps.setLong(3, customerBO.getCustomerContact());
			ps.setString(4, customerBO.getCustomerAddress());
			ps.setString(5, UtilConstants.ACTIVE_STATUS);
			flag = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public int deleteCustomerById(int id) {
		int flag = 0;
		try {
			con = ConnectionUtil.getDataSource().getConnection();
			ps = con.prepareStatement(SQLConstans.DELETE_CUSTMER);
			ps.setInt(1, id);
			flag = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public int updateCustomerDetailsById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int changeCustomerStatusById(int id) {
		int flag = 0;
		try {
			con = ConnectionUtil.getDataSource().getConnection();
			ps = con.prepareStatement(SQLConstans.CHANGE_CUSTOMER_STATUS);
			ps.setString(1, UtilConstants.BLOCK_STATUS);
			ps.setInt(2, id);
			flag = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public List<CustomerDTO> getAllCustomers() {
		List<CustomerDTO> list = null;
		CustomerDTO customerDTO = null;

		try {
			con = ConnectionUtil.getDataSource().getConnection();
			ps = con.prepareStatement(SQLConstans.GET_ALL_CUSTOMER_CAR);
			rs = ps.executeQuery();
			list = new ArrayList<CustomerDTO>();

			while (rs.next()) {
				customerDTO = new CustomerDTO();
				customerDTO.setCustomerId(rs.getInt(1));
				customerDTO.setCustomerName(rs.getString(2));
				customerDTO.setCustomerContact(rs.getLong(3));
				customerDTO.setCustomerAddress(rs.getString(4));
				customerDTO.setCustomerStatus(rs.getString(5));
				list.add(customerDTO);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
