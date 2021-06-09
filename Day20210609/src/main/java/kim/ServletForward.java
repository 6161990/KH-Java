package kim;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "sf", urlPatterns = { "/sf" })
public class ServletForward extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
	
		PrintWriter out = response.getWriter();

		out.println("<html lang='ko'>");
		out.println("<head>");
		out.println("<title>Servlet 포워드1</title>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("<h2>포워드</h2>");
		ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/st2");
        rd.forward(request, response);

        out.println("</body>");
		out.println("</html>");
	}

}
