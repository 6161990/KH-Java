package dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import dto.SnsDTO;
import dto.UserDTO;

public class DataManager {
	private ArrayList<UserDTO> userList; //등록된 사용자정보 목록
	private ArrayList<SnsDTO> snsList; //쓰기 내용 목록
	
	public DataManager() {
		//등록된 사용자정보를 생성하고 목록에 추가
		userList = new ArrayList<UserDTO>();
		UserDTO udto;
		udto = new UserDTO("lee","pass1","이효리","icon-user","제주특별시 서귀포");
		userList.add(udto);
		udto = new UserDTO("park", "pass2", "박지성", "icon-user-female", "서울시 강남구");
		userList.add(udto);
		udto = new UserDTO("kim", "pass3", "김재우", "icon-bell", "경기 고양시");
		userList.add(udto);
		
		//기록한 정보를 생성하고 목록에 추가
		snsList = new ArrayList<SnsDTO>();
		SnsDTO sdto;
		sdto = new SnsDTO("kim","icon-rocket","2021-05-02 10:34:56","하이루");
		snsList.add(sdto);
	}
	
	//로그인 id와 비밀번호를 받고 등록된 사용자 목록에 일치하는 것이 있는지 검색
	public UserDTO getLoginUser(String loginId, String password) {
		UserDTO user = null;
		for(UserDTO u : userList) {
			if(u.getLoginId().equals(loginId)&& u.getPassword().equals(password)) {
				//일치한 것이 있으면 해당 사용자정보 참조를 리턴함
				user=u;
			}
		}
		return user;
	}
	
	//쓰기 내용 목록 getter
	public ArrayList<SnsDTO> getSnsList(){
		return snsList;
	}
	
	//로그인 사용자 정보와 기록내용을 받아 목록에 추가
	public void setWriting (UserDTO user, String Writing) {
		SnsDTO s = new SnsDTO();
		s.setUserName(user.getUserName());
		s.setIcon(user.getIcon());
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		s.setDate(sdf.format(calendar.getTime()));
		s.setWriting(Writing);
		snsList.add(0,s);
	}

}
