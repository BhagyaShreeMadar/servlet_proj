package simple_project;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/birth")
public class Bwish extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String message=req.getParameter("message");
		res.getWriter().print("<h1 align='center'>"+message+" Happy Birthday</h1>");
		
	}

}
