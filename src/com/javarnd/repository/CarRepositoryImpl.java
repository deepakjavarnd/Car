package com.javarnd.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.javarnd.beans.Car;
import com.javarnd.beans.CarBO;
import com.javarnd.beans.CarDTO;
import com.javarnd.commans.SQLConstans;
import com.javarnd.util.ConnectionUtil;
import com.javarnd.util.UtilConstants;

public class CarRepositoryImpl implements CarRepository {
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	@Override
	public int addNewCar(CarBO carBO) {
		int flag = 0;
		try {
			con = ConnectionUtil.getDataSource().getConnection();
			ps = con.prepareStatement(SQLConstans.ADD_CAR);
			ps.setInt(1, carBO.getCarId());
			ps.setString(2, carBO.getCareName());
			ps.setString(3, carBO.getCarType());
			ps.setString(4, carBO.getCarColor());
			ps.setString(5, UtilConstants.ACTIVE_STATUS);
			flag = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public int deleteCarById(int id) {
		int flag = 0;
		try {
			con = ConnectionUtil.getDataSource().getConnection();
			ps = con.prepareStatement(SQLConstans.DELETE_CAR);
			ps.setInt(1, id);
			flag = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public List<CarDTO> getAvailbleCars() {
		List<CarDTO> list = null;
		CarDTO carDTO = null;

		try {
			con = ConnectionUtil.getDataSource().getConnection();
			ps = con.prepareStatement(SQLConstans.GET_ALL_AVAILBLE_CAR);
			rs = ps.executeQuery();
			list = new ArrayList<CarDTO>();

			while (rs.next()) {
				carDTO = new CarDTO();
				carDTO.setCarId(rs.getInt(1));
				carDTO.setCarName(rs.getString(2));
				carDTO.setCarType(rs.getString(3));
				carDTO.setCarColor(rs.getString(4));
				carDTO.setStatus(rs.getString(5));
				list.add(carDTO);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Car> getBookedCar() {

		return null;
	}

	@Override
	public int updateCarDetailsById(int id) {

		return 0;
	}

	@Override
	public int changeCarStatusById(int id) {
		int flag = 0;
		try {
			con = ConnectionUtil.getDataSource().getConnection();
			ps = con.prepareStatement(SQLConstans.CHANGE_CAR_STATUS);
			ps.setString(1, UtilConstants.BLOCK_STATUS);
			ps.setInt(2, id);
			flag = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

}
