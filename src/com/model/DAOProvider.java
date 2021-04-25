package com.model;
import java.util.List;

public interface DAOProvider {
	public static String DRIVER="com.mysql.jdbc.Driver";
	public static String URL="jdbc:mysql://localhost:3306/emp";
	public static String DBUSER="root";
	public static String DBPASS="tushar97@";
	//method declarations
	public boolean validateUser(User u)throws Exception;
	public List<String>getBookCat()throws Exception;
	public List<Book>getBooks(String []bc)throws Exception;
	public float getTotal(int[] bid) throws Exception;



}
