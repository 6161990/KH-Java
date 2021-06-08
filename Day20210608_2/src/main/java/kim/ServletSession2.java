package kim;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ss2")
public class ServletSession2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		String userName = request.getParameter("userName");
		String sessionCheck = request.getParameter("sessionCheck");

		HttpSession session = request.getSession();
		
		if("save".equals(sessionCheck)) {
			session.setAttribute("username", userName);
		}else {
			session.setAttribute("username", "");
		}
		
		PrintWriter out = response.getWriter();

		out.println("<html lang='ko'>");
		out.println("<head>");
		out.println("<title>세션 사용 예제</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>세션이 저장되었습니다.</h3>");
		out.println("<a href='ss1'>이전페이지로</a>");
		out.println("</body>");
		out.println("</html>");	
		
	}

}
