package kim;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test")
public class testServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String msg = "Hello World";
		
		PrintWriter out = response.getWriter();
		out.println("<html lang='ko'>");
		out.println("<head>");
		out.println("<title>테스트</title> <meta charset='UTF-8'>");
		out.println("</head>");
		out.println("<body>테스트임<br><h2>"+msg+"</h2></body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
