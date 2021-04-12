package kr.or.kh.obj4;

public interface IRegister {
	public abstract void register();
	public abstract void registerStudent() throws StudentNumException  ;
	public abstract void registerProfessor() throws ProfessorSubjectException;
	public abstract void registerManager() throws ManagePartException;

	
	

	
}
