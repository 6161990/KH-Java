package kr.or.kh.obj;


public class Update {
	
	private String name;
	private String object;
	private String commit;
	private String age;
	private String studentNum;
	private String subject;
	private String part;
	
	public Update() {}

	public void updateMenu() throws HaksaNameException, ObjectException {
		 System.out.println("수정할이름을입력하세요.");
	     System.out.println("이름:");
	     name = Register.input.next();
	     if(name == null || name == "") {
	    	 throw new HaksaNameException("이름 검색에서 null이거나 공백입니다.");
	     }
	     System.out.println("학생, 교수, 관리자 중 입력하세요.");
	     object=Register.input.next();
	     if(object==null || object=="") {
	    	 throw new ObjectException("학생, 교수, 관리자 중 입력하세요.");
	     }
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
						updateDisplay(1);
					}
				}
			}
		}

     }//수정의끝
	

	public void updateConfirmDisplay(StudentDTO student) {
		System.out.print("나이:"+student.getAge()+"\t");
		System.out.print("이름:"+student.getName()+"\t");
		System.out.print("학번:"+student.getStudentNum()+"\n");
	}
	public void updateConfirmDisplay(ProfessorDTO professor) {
		System.out.print("나이:"+professor.getAge()+"\t");
		System.out.print("이름:"+professor.getName()+"\t");
		System.out.print("과목:"+professor.getSubject()+"\n");
	}
	public void updateConfirmDisplay(ManageDTO manage) {
		System.out.print("나이:"+manage.getAge()+"\t");
		System.out.print("이름:"+manage.getName()+"\t");
		System.out.print("관리자:"+manage.getPart()+"\n");
	}
		 
	
	
	public void updateConfirmMenu() throws CommitException {
		 System.out.println("변경하기전내용입니다.수정할까요yes/no");
		 commit = Register.input.next();
		 if(commit == null || commit == "") {
	    	 throw new CommitException("yes,no중 선택하세요");
	     }
	}
	
	public void updateStudent(StudentDTO student, int i) {
		student.setAge(age);
		student.setName(name);
		student.setStudentNum(studentNum);
        student.setObject("학생");
        Register.studentList.set(i, student);
	}
	public void updateProfessor(ProfessorDTO professor, int i) {
		professor.setAge(age);
		professor.setName(name);
		professor.setSubject(subject);
		professor.setObject("교수");
        Register.professorList.set(i, professor);
	}
	public void updateManage(ManageDTO manage, int i) {
		manage.setAge(age);
		manage.setName(name);
		manage.setPart(part);
		manage.setObject("관리자");
        Register.manageList.set(i, manage);
	}
	
	public void updateAgeName() throws HaksaAgeException, HaksaNameException {
		System.out.println("나이:");
        age = Register.input.next();
        if(age == null || age == "") {
        	throw new HaksaAgeException("나이가 null이거나 공백입니다.");
	     }
        System.out.println("이름:");
        name = Register.input.next();
        if(name == null || name == "") {
        	   throw new HaksaNameException("이름이 null이거나 공백입니다.");
	     }
	}
	public void updateRegister(int cnt) throws StudentNumException, ProfessorSubjectException, ManagePartException {
		if(cnt==1) {
			try {
				updateAgeName();
			} catch (HaksaAgeException e) {
				e.printStackTrace();
			} catch (HaksaNameException e) {
				e.printStackTrace();
			}
	        System.out.println("학번:");
	        studentNum = Register.input.next();
	        if(studentNum == null || studentNum == "") {
	        	throw new StudentNumException("학번이 null이거나 공백입니다.");
		     }
		}else if(cnt==2) {
			try {
				updateAgeName();
			} catch (HaksaAgeException e) {
				e.printStackTrace();
			} catch (HaksaNameException e) {
				e.printStackTrace();
			}
            System.out.println("과목:");
            subject = Register.input.next();
            if(subject == null || subject == "") {
            	throw new ProfessorSubjectException("담당과목이 null이거나 공백입니다.");
		    }
		}else if(cnt==3) {
			try {
				updateAgeName();
			} catch (HaksaAgeException e) {
				e.printStackTrace();
			} catch (HaksaNameException e) {
				e.printStackTrace();
			}
            System.out.println("부서:");
            part = Register.input.next();
            if(part == null || part == "") {
            	throw new ManagePartException("담당부서가 null이거나 공백입니다.");
		    }
		}
	}
	
	public void updateDisplay(int cnt) {
		if(cnt==1) {
		 System.out.println("학생이수정되었습니다.");
		} else if(cnt ==2) {
		 System.out.println("교수님이 수정되었습니다.");
		}else if (cnt ==3){
		 System.out.println("관자리님이 수정되었습니다.");
		}
	}
	
}
