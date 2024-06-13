package simple_project;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/print_time")
public class PrintTime implements Servlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		//res.getWriter().print("<h1 align='center'>"+LocalTime.now()+"</h1>");	
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:ss");
		String formattedTime=LocalTime.now().format(formatter);
		
		res.getWriter().print("<h1 align='center'>"+formattedTime+"</h1>");	
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	

}
//with date LocalDateTime
