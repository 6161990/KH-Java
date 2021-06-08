package kim;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "ss1", urlPatterns = { "/ss1" })
public class ServletSession extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		HttpSession session = request.getSession();

		String uName = (String) session.getAttribute("username");

		if(uName == null){
			uName = "";
		}
	
	
		PrintWriter out = response.getWriter();

		out.println("<html lang='ko'>");
		out.println("<head>");
		out.println("<title>세션 사용 예제</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form action='ss2' method='post'>");
		out.println("<table border='1' class='table'>");
		out.println("<tr>");
		out.println("<th><label for='userName'>사용자명</label></th>");
		out.println("<td><input type='text' name='userName' id='userName' value='"+ uName +"'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th><label for='sessionCheck'>아이디저장</label></th>");
		out.println("<td><input type='checkbox' name='sessionCheck' id='sessionCheck' value='save'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td colspan='2' style='text-align:right'><input type='submit' value='보내기'></td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//doGet(request, response);
	}

}