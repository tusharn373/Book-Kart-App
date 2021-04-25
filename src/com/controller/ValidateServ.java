package com.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.model.DAOImplementor;
import com.model.User;
import java.io.PrintWriter;
/**
 * Servlet implementation class ValidateServ
 */
@WebServlet("/ValidateServ")
public class ValidateServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		//request data/form data
		String un=request.getParameter("username");
		String pwd=request.getParameter("password");
		User u=new User();
		u.setUsername(un);
		u.setPassword(pwd);
		
		DAOImplementor di=new DAOImplementor();
		try {
			boolean x=di.validateUser(u);
			if(x)
			{
				HttpSession hs=request.getSession();
				hs.setAttribute("user",un);
				RequestDispatcher rd=request.getRequestDispatcher("Homeserv");
				rd.forward(request, response);
				
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
				pw.print("<h3 style='color:red;'>Invalid login details!!</h3>");
				rd.include(request, response);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
