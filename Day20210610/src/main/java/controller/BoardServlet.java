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

import dao.DataManagerBefore;
import dto.SnsDTO;
import dto.UserDTO;


@WebServlet("/board")
public class BoardServlet extends HttpServlet {
	
	private DataManagerBefore dbm; //로그인 사용자정보 쓰기 관련 클래스
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String writing = request.getParameter("shout");
		RequestDispatcher dispatcher;
		
		//쓰기 내용이 있으면 목록추가
		if(!writing.equals("")) {
			HttpSession session = request.getSession();
			
			//로그인 한 사용자 정보 얻기 (세션)
			UserDTO user = (UserDTO) session.getAttribute("user");
			
			//한번만 DataManager객체생성
			if(dbm == null) {
				dbm = new DataManagerBefore();
			}
			
			//로그인 사용자 정보와 기록 내용을 인수목록에 추가하는 메소드
			dbm.setWriting(user, writing);
			
			// 쓰기내용 추가후 목록 검색
			ArrayList<SnsDTO> list = dbm.getSnsList();

			// 목록 세션 저장
			session.setAttribute("sns", list);
		}
		//top.jsp 처리 전송
		dispatcher = request.getRequestDispatcher("top.jsp");
		dispatcher.forward(request, response);
	
	}

}
