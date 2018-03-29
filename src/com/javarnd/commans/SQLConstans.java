package com.javarnd.commans;

/**
 * This Class Holds the All SQL Constants.
 * 
 * @author Deepak
 */
public class SQLConstans {

	// Car Related Constants
	public static final String JNDI_LOOKUP_SERVICE = "java:comp/env/jdbc/javarnd";

	public static final String ADD_CAR = "insert into Car values(?,?,?,?,?)";

	public static final String UPDATE_CAR_BY_NAME = "insert into Car values(?,?,?,?,?)";

	public static final String GET_ALL_AVAILBLE_CAR = "select * from Car";

	public static final String EDIT_CAR = "update Car set carName=?,careType=?,carColor=?,carStatus=?";

	public static final String DELETE_CAR = "delete from Car where carId=?";

	public static final String CHANGE_CAR_STATUS = "update Car set carStatus=? where carId=?";

	public static final String GET_CAR_NAMES = "select carName from Car where carStatus=?";

	public static final String GET_CAR_BY_NAME = "select * from car where carName=?";

	public static final String BOOK_CAR = "insert into BOOKCAR values(?,?,?,?,?,?) ";

	public static final String DELETE_CAR_AFTER_CAR_BOOK = "delete from Car where carName=?";

	// Customer Related Constants
	public static final String ADD_CUSTOMER = "insert into Customer values(?,?,?,?,?)";

	public static final String GET_ALL_CUSTOMER_CAR = "select * from Customer";

	public static final String DELETE_CUSTMER = "delete from Customer where customerId=?";

	public static final String CHANGE_CUSTOMER_STATUS = "update Customer set customerStatus=? where customerId=?";

}
