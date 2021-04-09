package kr.or.kh.obj3;


public class Update {
	
	public Haksa haksa;
	public Update() {
		haksa = new Haksa();
	}

	public void updateStudent(StudentDTO student, int i) {
		student.setAge(haksa.age);
		student.setName(haksa.name);
		student.setStudentNum(haksa.studentNum);
        student.setObject("학생");
        Haksa.studentList.set(i, student);
	}
	public void updateProfessor(ProfessorDTO professor, int i) {
		professor.setAge(haksa.age);
		professor.setName(haksa.name);
		professor.setSubject(haksa.subject);
		professor.setObject("교수");
		Haksa.professorList.set(i, professor);
	}
	public void updateManage(ManageDTO manage, int i) {
		manage.setAge(haksa.age);
		manage.setName(haksa.name);
		manage.setPart(haksa.part);
		manage.setObject("관리자");
		Haksa.manageList.set(i, manage);
	}
	
	public void update() {//수정의시작
	     
		try {
			haksa.updateMenu();
		} catch (HaksaNameException e) {
			e.printStackTrace();
		} catch (ObjectException e) {
			e.printStackTrace();
		}
		for(int i = 0; i<Haksa.studentList.size(); i++) {
			StudentDTO student = Haksa.studentList.get(i);
			if(haksa.object.equals(student.getObject())) {
				if(haksa.name.equals(student.getName())) {
					haksa.updateConfirmDisplay(student);
					try {
						haksa.updateConfirmMenu();
					} catch (CommitException e) {
						e.printStackTrace();
					}
					if(haksa.commit.equals("yes")||haksa.commit.equals("YES")) {
						student = new StudentDTO();
						try {
							haksa.updateRegister(1);
						} catch (StudentNumException e) {
							e.printStackTrace();
						} catch (ProfessorSubjectException e) {
							e.printStackTrace();
						} catch (ManagePartException e) {
							e.printStackTrace();
						}
						updateStudent(student,i);
						haksa.updateDisplay(1);
					}
				}
			}
		}
		for(int i=0; i<Haksa.professorList.size(); i++) {
			ProfessorDTO professor = Haksa.professorList.get(i);
			if(haksa.object.equals(professor.getObject())) {
				if(haksa.name.equals(professor.getName())) {
					haksa.updateConfirmDisplay(professor);
					try {
						haksa.updateConfirmMenu();
					} catch (CommitException e) {
						e.printStackTrace();
					}
					if(haksa.commit.equals("yes")||haksa.commit.equals("YES")) {
						professor = new ProfessorDTO();
						try {
							haksa.updateRegister(2);
						} catch (StudentNumException e) {
							e.printStackTrace();
						} catch (ProfessorSubjectException e) {
							e.printStackTrace();
						} catch (ManagePartException e) {
							e.printStackTrace();
						}
						updateProfessor(professor,i);
						haksa.updateDisplay(2);
					}
				}
			}
		}
		for(int i=0; i<Haksa.manageList.size(); i++) {
			ManageDTO manage = Haksa.manageList.get(i);
			if(haksa.object.equals(manage.getObject())) {
				if(haksa.name.equals(manage.getName())) {
					haksa.updateConfirmDisplay(manage);
					try {
						haksa.updateConfirmMenu();
					} catch (CommitException e) {
						e.printStackTrace();
					}
					if(haksa.commit.equals("yes")||haksa.commit.equals("YES")) {
						manage = new ManageDTO();
		
							try {
								haksa.updateRegister(3);
							} catch (StudentNumException e) {
								e.printStackTrace();
							} catch (ProfessorSubjectException e) {
								e.printStackTrace();
							} catch (ManagePartException e) {
								e.printStackTrace();
							}
						
						updateManage(manage,i);
						haksa.updateDisplay(1);
					}
				}
			}
		}

     }//수정의끝
	
	
	
	
}
