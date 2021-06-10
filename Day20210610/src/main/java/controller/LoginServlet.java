package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DataManager;
import dto.SnsDTO;
import dto.UserDTO;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//직접 접근 시 index.jsp처리로 전송함
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//index.jsp 의 로그인 버튼에서 호출
		
		//전송정보 얻기
		String loginId = request.getParameter("loginId");
		String password = request.getParameter("password");
		
		RequestDispatcher dispatcher = null;
		String message = null;
		
		if(loginId.equals("")||password.equals("")) {
			//로그인ID 또는 비밀번호 중 하나 또는 모두 입력하지 않은 경우
			message = "로그인 ID와 비밀번호는 필수입력입니다.";
			
			//오류 메시지를 요청 객체 저장
			request.setAttribute("alert", message);
			
			//index.jsp 처리 전송
			dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		}else {
			// 로그인 인증하고 사용자 정보를 얻음
			DataManager dbm = new DataManager();
			UserDTO user = dbm.getLoginUser(loginId, password);
			if(user != null) {
				//사용자정보 얻을 수 있으면 입력한 내용 목록을 가져옴
				ArrayList<SnsDTO> list = dbm.getSnsList();
				HttpSession session = request.getSession();
				
				//로그인 사용자 정보 쓰기 내용 목록으로 세션에 저장
				session.setAttribute("user", user);
				session.setAttribute("sns", list);
				
				//처리 대상을 top.jsp로 지정
				dispatcher = request.getRequestDispatcher("top.jsp");
			}else {
				//사용자 정보를 얻을 수 없는 경우
				//오류 메시지를 요청 객체에 저장
				message = "로그인ID 또는 비밀번호가 올바르지 않습니다.";
				request.setAttribute("alert", message);
				
				//처리대상 index.jsp지정
				dispatcher = request.getRequestDispatcher("index.jsp");
			}
			
			//처리 전송
			dispatcher.forward(request, response);
		}
	}

}
