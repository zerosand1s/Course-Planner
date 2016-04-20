package com.harshal.courseplanner;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DisplayCourses")
public class DisplayCourses extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public DisplayCourses() {
        super();
        // TODO Auto-generated constructor stub
    }


	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		
		ArrayList<Courses> courses = new ArrayList<Courses>();
		
		courses.add(new Courses(1, "123", "DSA"));
		courses.add(new Courses(2, "456", "DBMS"));
		courses.add(new Courses(3, "789", "DAA"));
		
		getServletContext().setAttribute("courses", courses);
		
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("courses.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
