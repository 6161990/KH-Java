package kr.or.kh.obj4;

public interface IDelete {

	public abstract void delete();

	public abstract void studentDelete(int i, StudentDTO student);

	public abstract void professorDelete(int i, ProfessorDTO professor);

	public abstract void manageDelete(int i, ManageDTO manage);

}
