package com.javarnd.util;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.javarnd.commans.SQLConstans;

/**
 * This Class used to create server Managed Connection Pool.
 * 
 * @author Deepak
 */
public class ConnectionUtil {
	private static DataSource dataSource;

	static {
		try {
			Context context = new InitialContext();
			Object lookup = context.lookup(SQLConstans.JNDI_LOOKUP_SERVICE);
			if (lookup != null) {
				dataSource = (DataSource) lookup;
			} else {
				new RuntimeException("DataSource is not found");
			}
		} catch (NamingException ne) {
			ne.printStackTrace();
		}
	}

	public static DataSource getDataSource() {
		return dataSource;
	}

}
