package ch03;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		 	throws ServletException, IOException {
		 		PrintWriter out = response.getWriter();
		 		out.println("Hello Servlet!");
		 
		 	}
	
}
