package com.model;
import static com.model.DAOProvider.*;
import java.sql.*;
public class DBConnection {
public static Connection connectDB() throws ClassNotFoundException, SQLException
{
	Class.forName(DRIVER);
	Connection con=DriverManager.getConnection(URL, DBUSER, DBPASS);
	return con;
}
}
