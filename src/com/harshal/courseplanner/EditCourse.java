package com.harshal.courseplanner;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EditCourse")
public class EditCourse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public EditCourse() {
        super();
        // TODO Auto-generated constructor stub
    }

    @SuppressWarnings("unchecked")
	Courses getCourse(String code)
    {
    	ArrayList<Courses> courses = (ArrayList<Courses>) getServletContext().getAttribute("courses");
    	
    	for(Courses c : courses)
    	{
    		if(c.getCode().equals(code))
    		{
    			return c;
    		}
    	}
		return null;
    	
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String code = request.getParameter("code");
		Courses course = getCourse(code);
		getServletContext().setAttribute("course", course);
		
		request.getRequestDispatcher("editcourse.jsp").forward(request, response);
	}


	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<Courses> courses = (ArrayList<Courses>)getServletContext().getAttribute("courses");
		
		int id = (Integer.parseInt(request.getParameter("cid")));
		String code = request.getParameter("ccode");
		String title = request.getParameter("ctitle");
		
		for(Courses c : courses)
		{
			if(c.getId() == id)
			{
				c.setCode(code);
				c.setTitle(title);
			}
		}
		
		getServletContext().setAttribute("courses", courses);
		request.getRequestDispatcher("courses.jsp").forward(request, response);
	}

}
