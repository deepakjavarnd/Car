package com.javarnd.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.javarnd.beans.CarBookDTO;
import com.javarnd.commans.SQLConstans;
import com.javarnd.util.ConnectionUtil;
import com.javarnd.util.UtilConstants;
/**
 * This Class implements all method of CarBookRepository interface. 
 * @author Deepak
 */
public class CarBookRepositoryImpl implements CarBookRepository {

	private Connection con = null;
	private PreparedStatement ps = null, ps1 = null, ps2 = null;
	private ResultSet rs = null;

	@Override
	public List<String> getAllCarName() {
		List<String> carName = null;
		try {
			con = ConnectionUtil.getDataSource().getConnection();
			ps = con.prepareStatement(SQLConstans.GET_CAR_NAMES);
			ps.setString(1, UtilConstants.ACTIVE_STATUS);
			rs = ps.executeQuery();
			carName = new ArrayList<String>();
			while (rs.next()) {
				carName.add(rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return carName;
	}

	@Override
	public int bookCar(CarBookDTO carBookDTO) {
		int flag = 0, flag1 = 0, flag2 = 0;
		try {
			con = ConnectionUtil.getDataSource().getConnection();
			con.setAutoCommit(false);
			ps = con.prepareStatement(SQLConstans.GET_CAR_BY_NAME);

			ps.setString(1, carBookDTO.getCarName());
			rs = ps.executeQuery();
			rs.next();
			ps1 = con.prepareStatement(SQLConstans.BOOK_CAR);
			ps1.setInt(1, rs.getInt(1));
			ps1.setString(2, rs.getString(2));
			ps1.setString(3, rs.getString(3));
			ps1.setString(4, rs.getString(4));
			ps1.setString(5, carBookDTO.getAcOrNonAc());
			ps1.setString(6, carBookDTO.getDuration());
			flag1 = ps1.executeUpdate();

			ps2 = con.prepareStatement(SQLConstans.DELETE_CAR_AFTER_CAR_BOOK);
			ps2.setString(1, carBookDTO.getCarName());
			flag = ps2.executeUpdate();

			if (flag1 > 0 && flag2 > 0) {
				con.commit();
				flag = 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

}
