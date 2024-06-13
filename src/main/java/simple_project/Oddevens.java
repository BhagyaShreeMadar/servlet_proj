package simple_project;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/oddeven")
public class Oddevens extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String message = req.getParameter("messag");
		int x = Integer.parseInt(message);

		if (x % 2 == 0) {
			res.getWriter().print("<h1 align='center' style='color:green'>" + x + " EvenNumber</h1>");
		} else {
			res.getWriter().print("<h1 align='center' style='color:red'>" + x + " OddNumber</h1>");
		}
	}

}
