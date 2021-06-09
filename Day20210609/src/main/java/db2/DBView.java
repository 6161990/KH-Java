package db2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/dv")
public class DBView extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html lang='ko'>");
		out.println("<head>");
		out.println("<title>데이터베이스 연동</title>");
		out.println("</head>");
		out.println("<body>");
		
		DBManager dbm = new DBManager();
		UserDTO user = dbm.getLoginUser("black", "pink");
		
		if(user != null){
			out.print("로그인사용자  :  " + user.getUserName());
			out.print("<br> 사용자 주소  :  " + user.getProfile());
		}else{
			out.print("사용자명 또는 비밀번호가 잘못되었습니다.");
		}

        out.println("</body>");
		out.println("</html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
