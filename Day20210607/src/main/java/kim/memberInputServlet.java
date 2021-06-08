package kim;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/mInput")
public class memberInputServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		// 보낼 데이터 객체
		String userName = request.getParameter("userName");
		String pass = request.getParameter("pass");
		String gender = request.getParameter("gender");
		
		// 체크박스 배열로 얻기
		String[] hobby = request.getParameterValues("hobby");
		String blood = request.getParameter("blood");
		String remarks = request.getParameter("remarks");

		// 값 출력
		out.println("이름 : " + userName + "<br>");
		out.println("비밀번호 : " + pass + "<br>");
		out.println("성별 : " + gender + "<br>");
		out.println("혈액형 : " + blood + "<br>");
		out.println("비고 : " + remarks + "<br>");
		out.println("취미 : ");

		if(hobby != null){
			for(String s : hobby){
				out.println(s);
			}
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
