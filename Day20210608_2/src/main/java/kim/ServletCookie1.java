package kim;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "sc1", urlPatterns = { "/sc1" })
public class ServletCookie1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		
		Cookie[] cookies = request.getCookies();
		String uName ="";
		
		if(cookies != null) {
			for(Cookie data : cookies) {
				if("username".equals(data.getName())) {
					uName = data.getValue();
					uName = URLDecoder.decode(uName,"UTF-8");
				}
			}
		}
		
		PrintWriter out = response.getWriter();

		out.println("<html lang='ko'>");
		out.println("<head>");
		out.println("<title>쿠키 예제</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form action='sc2' method='post'>");
		out.println("<table border='1' class='table'>");
		out.println("<tr>");
		out.println("<th><label for='userName'>사용자명</label></th>");
		out.println("<td><input type='text' name='userName' id='userName' value='"+ uName +"'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th><label for='cookieCheck'>아이디저장</label></th>");
		out.println("<td><input type='checkbox' name='cookieCheck' id='cookieCheck' value='save'></td>");
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
		
		doGet(request, response);
	}

}