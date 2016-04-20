package com.harshal.courseplanner;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/AddCourse")
public class AddCourse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AddCourse() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<Courses> courses = (ArrayList<Courses>)getServletContext().getAttribute("courses");
		
		String code = request.getParameter("code");
		
		for(Courses c : courses)
		{
			if(c.getCode().equals(code))
			{
				courses.remove(c);
				break;
			}
		}
		
		getServletContext().setAttribute("courses", courses);
		request.getRequestDispatcher("courses.jsp").forward(request, response);
	}


	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Courses> courses = (ArrayList<Courses>)getServletContext().getAttribute("courses");
		
		HttpSession session = request.getSession(false);
		if(session == null || session.getAttribute("user") == null)
		{
			response.sendRedirect("login.jsp");
			return;
		}
		
		int id = (Integer.parseInt(request.getParameter("courseid")));
		String code = request.getParameter("coursecode");
		String title = request.getParameter("coursetitle");
		
		courses.add(new Courses(id, code, title));
		
		getServletContext().setAttribute("courses", courses);
		
		response.sendRedirect("courses.jsp");
	}

}
