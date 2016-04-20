package com.harshal.courseplanner;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ValidateUser")
public class ValidateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ValidateUser() {
        super();
        // TODO Auto-generated constructor stub
    }


	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		
		ArrayList<Users> users = new ArrayList<Users>();
		
		users.add(new Users("harsh", "abc"));
		users.add(new Users("amol", "abc"));
		
		getServletContext().setAttribute("users", users);
		
		//System.out.println(users);
	}

	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ArrayList<Users> users = (ArrayList<Users>) getServletContext().getAttribute("users");
		
		String username = request.getParameter("user");
		String password = request.getParameter("password");
		
		for(Users u : users)
		{
			if(u.getUsername().equals(username) && u.getPassword().equals(password))
			{
				//request.getRequestDispatcher("DisplayCourses").forward(request, response);
				HttpSession session = request.getSession();
				session.setAttribute("user", username);
				response.sendRedirect("DisplayCourses");
				return;
			}
		}
		//request.getRequestDispatcher("login.jsp").forward(request, response);
		response.sendRedirect("login.jsp");
		return;
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession(false);
		session.invalidate();
		response.sendRedirect("login.jsp");
	}
	
}




