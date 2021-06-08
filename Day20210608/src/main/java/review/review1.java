package review;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/re")
public class review1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		String full_name = request.getParameter("full_name");
		String email_address = request.getParameter("email_address");
		String message_field = request.getParameter("message_field");
		String question_1 = request.getParameter("question_1");
		
		
//		int question_1 = Integer.parseInt(request.getParameter("question_1"));
//		if(question_1==1) {
//			question = "아주 안좋음";
//		}else if(question_1==2) {
//			question = "안좋음";
//		}else if(question_1==3) {
//			question ="보통";
//		}else if(question_1==4) {
//			question ="좋음";
//		}else {
//			question ="아주 좋음";
//		}
		out.println("이름 : "+full_name+"<br>");
		out.println("이메일주소 : "+email_address+"<br>");
		if(question_1 != null ){
			out.println("리뷰평가 : "+question_1+"<br>");
		}else {
			out.println("리뷰평가 : 점수 평가 하지 않음<br>");
		}
		out.println("리뷰내용 : "+message_field+"<br>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
