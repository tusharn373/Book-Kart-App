package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.DAOImplementor;

/**
 * Servlet implementation class GetTotalServ
 */
@WebServlet("/GetTotalServ")
public class GetTotalServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetTotalServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//request data
		String s[]=request.getParameterValues("bid");
		int arr[]=new int[s.length];
		for(int i=0;i<s.length;i++)
		{
			arr[i]=Integer.parseInt(s[i]);//to get array of book id in int format
		}
		DAOImplementor di=new DAOImplementor();
		try {
			float p=di.getTotal(arr);
			request.setAttribute("total",p);
			RequestDispatcher rd=request.getRequestDispatcher("ShowTotal.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
