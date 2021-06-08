package kim;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/sc2")
public class ServletCookie2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String userName = request.getParameter("userName");
		userName = URLEncoder.encode(userName, "UTF-8");
		
		String cookieCheck = request.getParameter("cookieCheck");
		
		Cookie[] cookies = request.getCookies();
		Cookie cookie =null;
		
		if(cookies != null) {
			for(Cookie data : cookies) {
				if("username".equals(data.getName())) {
					cookie = data;
				}
			}
		}
		
		if("save".equals(cookieCheck)) {
			if(cookie !=null) {
				cookie.setValue(userName);
			}else {
				cookie = new Cookie("username",userName);
			}
		}else {
			if(cookie !=null) {
				cookie.setValue("");
			}else {
				cookie = new Cookie("username","");
			}
		}
		
		response.addCookie(cookie);
		
		PrintWriter out = response.getWriter();

		out.println("<html lang='ko'>");
		out.println("<head>");
		out.println("<title>쿠키 예제</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>쿠키 설정하였습니다.</h3>");
		out.println("<a href='sc1'>이전페이지로</a>");
		out.println("</body>");
		out.println("</html>");	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
