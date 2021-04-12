package kr.or.kh.obj4;


public class Update extends Haksa implements IUpdate{
	
	
	public Update() {
	
	}
	
	
	public void update() {//수정의시작
	     
		try {
			updateMenu();
		} catch (HaksaNameException e) {
			e.printStackTrace();
		} catch (ObjectException e) {
			e.printStackTrace();
		}
		for(int i = 0; i<Register.studentList.size(); i++) {
			StudentDTO student = Register.studentList.get(i);
			if(object.equals(student.getObject())) {
				if(name.equals(student.getName())) {
					updateConfirmDisplay(student);
					try {
						updateConfirmMenu();
					} catch (CommitException e) {
						e.printStackTrace();
					}
					if(commit.equals("yes")||commit.equals("YES")) {
						student = new StudentDTO();
						try {
							updateRegister(1);
						} catch (StudentNumException e) {
							e.printStackTrace();
						} catch (ProfessorSubjectException e) {
							e.printStackTrace();
						} catch (ManagePartException e) {
							e.printStackTrace();
						}
						updateStudent(student,i);
						updateDisplay(1);
					}
				}
			}
		}
		for(int i=0; i<Register.professorList.size(); i++) {
			ProfessorDTO professor = Register.professorList.get(i);
			if(object.equals(professor.getObject())) {
				if(name.equals(professor.getName())) {
					updateConfirmDisplay(professor);
					try {
						updateConfirmMenu();
					} catch (CommitException e) {
						e.printStackTrace();
					}
					if(commit.equals("yes")||commit.equals("YES")) {
						professor = new ProfessorDTO();
						try {
							updateRegister(2);
						} catch (StudentNumException e) {
							e.printStackTrace();
						} catch (ProfessorSubjectException e) {
							e.printStackTrace();
						} catch (ManagePartException e) {
							e.printStackTrace();
						}
						updateProfessor(professor,i);
						updateDisplay(2);
					}
				}
			}
		}
		for(int i=0; i<Register.manageList.size(); i++) {
			ManageDTO manage = Register.manageList.get(i);
			if(object.equals(manage.getObject())) {
				if(name.equals(manage.getName())) {
					updateConfirmDisplay(manage);
					try {
						updateConfirmMenu();
					} catch (CommitException e) {
						e.printStackTrace();
					}
					if(commit.equals("yes")||commit.equals("YES")) {
						manage = new ManageDTO();
		
							try {
								updateRegister(3);
							} catch (StudentNumException e) {
								e.printStackTrace();
							} catch (ProfessorSubjectException e) {
								e.printStackTrace();
							} catch (ManagePartException e) {
								e.printStackTrace();
							}
						
						updateManage(manage,i);
						updateDisplay(3);
					}
				}
			}
		}

     }//수정의끝

	@Override
	public void updateStudent(StudentDTO student, int i) {
		student.setAge(age);
		student.setName(name);
		student.setStudentNum(studentNum);
        student.setObject("학생");
        Register.studentList.set(i, student);
	}
	@Override
	public void updateProfessor(ProfessorDTO professor, int i) {
		professor.setAge(age);
		professor.setName(name);
		professor.setSubject(subject);
		professor.setObject("교수");
		Register.professorList.set(i, professor);
	}
	@Override
	public void updateManage(ManageDTO manage, int i) {
		manage.setAge(age);
		manage.setName(name);
		manage.setPart(part);
		manage.setObject("관리자");
		Register.manageList.set(i, manage);
	}
	
	
}
