package com.model;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
public class DAOImplementor implements DAOProvider{
	static Connection con;
	PreparedStatement pst;
	ResultSet rs;
	Statement st;
	static
	{
		try {
			con=DBConnection.connectDB();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

public boolean validateUser(User u) throws Exception {
		pst=con.prepareStatement("select * from User where Username=? and Password=?");
		pst.setString(1, u.getUsername());
		pst.setString(2, u.getPassword());
		rs=pst.executeQuery();
		if(rs.next())
		{
			return true;
		}
		else
		{
			return false;
		}
		}

@Override
public List<String> getBookCat() throws Exception {
	List<String>l=new ArrayList<String>();
	st=con.createStatement();
	rs=st.executeQuery("select distinct(BCategory) from Book");
	while(rs.next())
	{
		l.add(rs.getString(1));
	}
	return l;

}

public List<Book> getBooks(String[] bc) throws Exception {
	List<Book>l=new ArrayList<Book>();	
	pst=con.prepareStatement("select * from Book where BCategory=?");
	for(String i:bc)
	{
	pst.setString(1, i);
	rs=pst.executeQuery();
	while(rs.next())
	{
		Book b=new Book();
		b.setbid(rs.getInt(1));
		b.setbname(rs.getString(2));
		b.setbAuthor(rs.getString(3));
		b.setbcategory(rs.getString(4));
		b.setbPrice(rs.getFloat(5));
		l.add(b);
	}
	}
	return l;
	}
public float getTotal(int[] bid) throws Exception {
	float total=0.0f;
	pst=con.prepareStatement("select BPrice from Book where BID=?");
	for(int i:bid)
	{
		pst.setInt(1, i);
		rs=pst.executeQuery();
		while(rs.next())
		{
			total=total+rs.getFloat(1);
		}
	}
	return total;	
}



}
