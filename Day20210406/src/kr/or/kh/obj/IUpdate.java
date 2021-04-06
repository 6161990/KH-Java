package kr.or.kh.obj;

import java.util.HashMap;

public interface IUpdate {
	public abstract void updateStudent(HashMap<String, String> haksaHash, int i);
	public abstract void updateProfessor(HashMap<String, String> haksaHash, int i);
	public abstract void updateManager(HashMap<String, String> haksaHash, int i);

}
