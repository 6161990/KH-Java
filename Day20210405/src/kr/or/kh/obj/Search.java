package kr.or.kh.obj;

import java.util.HashMap;

public class Search extends Haksa{
	
	//search 전용변수 중복이 아니라 이 클래스 특수 용도 이기 때문
	private String nameSearch;
	
	public void Search() {
		nameSearch=null;
	}
	public HashMap<String, String> SearchProcess(int i) {
		HashMap<String,String> haksaHash = Register.haksaList.get(i);
		return haksaHash;
	}
	public void search() {//검색함수의시작
		 searchMenu(); //함수를 실행하고 돌아옴 
	     for(int i=0;i<Register.haksaList.size();i++) {//반복문시작
	    	 HashMap<String, String> haksaHash= SearchProcess(i);
	         object = haksaHash.get("object");
	         nameSearch = haksaHash.get("name");
	         if(object.equals("학생")) {//학생찾기시작
	            if(name.equals(nameSearch)) {//학생이름시작
	              searchDisplay(1,haksaHash);
	            }//학생이름끝
	         }//학생찾기끝
	         else if(object.equals("교수")) {//교수찾기시작
	            if(name.equals(nameSearch)) {//교수이름시작
	            	searchDisplay(2,haksaHash);
	            }//교수이름끝
	         }//교수찾기끝
	         else if(object.equals("관리자")) {//관리자시작
	            if(name.equals(nameSearch)) {//관리자이름시작
	            	searchDisplay(2,haksaHash);
	            }//관리자이름끝
	         }//관리자끝
	     }//반복문끝    
	}//검색함수의끝

	@Override
	public void registerStudent() {
		
	}

	@Override
	public void registerProfessor() {
		
	}

	@Override
	public void registerManager() {
		
	}

	@Override
	public void studentDelete(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void professorDelete(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void managerDelete(int i) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateStudent(HashMap<String, String> haksaHash, int i) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateProfessor(HashMap<String, String> haksaHash, int i) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateManager(HashMap<String, String> haksaHash, int i) {
		// TODO Auto-generated method stub
		
	}
	
}