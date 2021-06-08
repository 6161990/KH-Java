package question1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/send_email_1.php")
public class questionData extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String[] question_1 = request.getParameterValues("question_1[]"); //방문한 나라
		String question_2 = request.getParameter("question_2"); //확진자접촉유무
		String question_3 = request.getParameter("question_3"); //호흡곤란유무
		String[] question_4 = request.getParameterValues("question_4[]"); // 해당 증상
		String question_5 = request.getParameter("question_5"); //열 유무
		String question_6 = request.getParameter("question_6");//콧물유무
		String question_7 = request.getParameter("question_7"); // 근육통, 현기증 경험 유무
		String question_8 = request.getParameter("question_8"); //설사, 복통, 구토 유무
		
		String name = request.getParameter("name"); 
		String email = request.getParameter("email"); 
		String phone = request.getParameter("phone"); 
		String gender = request.getParameter("gender"); 
		
		if(question_1 !=null) {
			for(String s : question_1) {
				out.println("최근 방문한 나라 : " + s +" "+ "<br>");
			}
		} 
		
		out.println("확진자 접촉 유무 : " + question_2 + "<br>");
		out.println("호흡곤란 유무 : " + question_3 + "<br>");
		
		if(question_4 !=null) {
			for(String s : question_4) {
				out.println("해당 증상 : " + s +" ");
			}
		}
		
		out.println("발열 유무 : " + question_5 + "<br>");
		out.println("콧물 증상 유무 : " + question_6 + "<br>");
		out.println("근육통 및 현기증 증상 유무 : " + question_7 + "<br>");
		out.println("설사, 복통, 구토 증상 유무 : " + question_8 + "<br><br>");
		

		out.println("이름 : " + name + "<br>");
		out.println("메일 : " + email + "<br>");
		out.println("핸드폰번호 : " + phone + "<br>");
		out.println("성별 : " + gender + "<br>");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
