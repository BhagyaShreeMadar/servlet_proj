package simple_project;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/print-message")
public class Messageprint extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String message=req.getParameter("message");
		String color=req.getParameter("color");
		res.getWriter().print("<h1 align='center' style='color:"+color+"'>"+message+"</h1>");	
	}

}
