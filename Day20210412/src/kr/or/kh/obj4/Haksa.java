package kr.or.kh.obj4;



public class Haksa {
	protected int cnt;
	protected String age;
	protected String name;
	protected String studentNum;
	protected String subject;
	protected String part;
	protected String object;
	protected String nameSearch;
	protected String nameDelete;
	protected String commit;

		
	public Haksa() {}
	
	
	//register
	public void registerMenu() throws HaksaMenuException {
	    System.out.println("등록");
	    System.out.println("=======메뉴 선택======");
	    System.out.println("1.학생");
	    System.out.println("2.교수");
	    System.out.println("3.관리자");
	    System.out.println("4.이전메뉴");
	    System.out.println("번호를 선택해 주세요..");
	    cnt = Register.input.nextInt();
	    if( cnt < 0 || cnt > 4 ) {
			throw new HaksaMenuException("음수이거나 4 이상이면 에러입니다.");
	    }
	    
	}
	
	public void registerAgeName(StudentDTO student) throws HaksaAgeException, HaksaNameException {
	       System.out.println("나이:");
	       age = Register.input.next();
	       if(age == null || age == "") {
				throw new HaksaAgeException("나이가 null이거나 공백입니다.");
			}
	       System.out.println("이름:");
	       name = Register.input.next();
	       if( name == null || name == "") {
	    	   throw new HaksaNameException("이름이 null이거나 공백입니다.");
	       }
	}
	public void registerAgeName(ProfessorDTO professor) throws HaksaAgeException, HaksaNameException {
		   System.out.println("나이:");
		   age = Register.input.next();
	       if(age == null || age == "") {
	    	   throw new HaksaAgeException("나이가 null이거나 공백입니다.");
			}
	       System.out.println("이름:");
	       name = Register.input.next();
	       if( name == null || name == "") {
	    	   throw new HaksaNameException("이름이 null이거나 공백입니다.");
	       }
	}
	
	public void registerAgeName(ManageDTO manage) throws HaksaAgeException, HaksaNameException {
		System.out.println("나이:");
		   age = Register.input.next();
	       if(age == null || age == "") {
	    	   throw new HaksaAgeException("나이가 null이거나 공백입니다.");
			}
	       System.out.println("이름:");
	       name = Register.input.next();
	       if( name == null || name == "") {
	    	   throw new HaksaNameException("이름이 null이거나 공백입니다.");
	       }
	}
	
	public void registerDisplay(int cnt) {
		if(cnt==1) {
			System.out.println("학생이 등록되었습니다.");
		}else if(cnt==2) {
			System.out.println("교수님이 등록되었습니다.");
		}else if(cnt ==3) {
			System.out.println("관리자님이 등록되었습니다.");
		}
	}
	
	public void studentNum() throws StudentNumException {
		   System.out.println("학번:");
	       studentNum =Register.input.next();
	       if( studentNum == null || studentNum == "") {
				throw new StudentNumException("학번이 null이거나 공백입니다.");
			}
	}
	
	public void professorSubject() throws ProfessorSubjectException {
	       System.out.println("과목:");
	       subject = Register.input.next();
	       if(subject == null || subject == "") {
				throw new ProfessorSubjectException("담당과목이 null이거나 공백입니다.");
			}
	}
	public void managePart() throws ManagePartException {
	       System.out.println("부서:");
	       part = Register.input.next();
	       if( part == null || part  == "") {
				throw new ManagePartException("담당부서가 null이거나 공백입니다.");
			}
	}
	
	
	//search
	public void searchMenu() throws ObjectException, HaksaNameException {
		 System.out.println("찾을이름을 입력해주세요.");
	     System.out.println("이름:");
	     nameSearch = Register.input.next();
	     if(nameSearch==null || nameSearch=="") {
	    	 throw new HaksaNameException("이름 검색에서 null이거나 공백입니다.");
	     }
	     System.out.println("학생, 교수, 관리자 중 입력하세요.");
	     object = Register.input.next();
	     if(object==null || object=="") {
	    	 throw new ObjectException("학생, 교수, 관리자 중 입력하세요.");
	     }
	}
	
	public void searchDisplay(StudentDTO student) {
		   System.out.print("나이:"+student.getAge()+ "\t");
        System.out.print("이름:"+student.getName()+ "\t");
        System.out.print("학번:"+student.getStudentNum()+ "\n");
		
	}
	public void searchDisplay(ProfessorDTO professor) {
		   System.out.print("나이:"+professor.getAge()+ "\t");
		   System.out.print("이름:"+professor.getName()+ "\t");
		   System.out.print("담당과목:"+professor.getSubject()+ "\n");
		
	}
	public void searchDisplay(ManageDTO manage) {
		   System.out.print("나이:"+manage.getAge()+ "\t");
		   System.out.print("이름:"+manage.getName()+ "\t");
		   System.out.print("담당부서:"+manage.getPart()+ "\n");
		
	}
	
	
	//delete
	public void deleteMenu() throws HaksaNameException, ObjectException {
		 System.out.println("삭제할사람의 이름을 입력해 주세요.");
	     System.out.print("이름 : ");
	     nameDelete = Register.input.next();
	     if(nameDelete==null || nameDelete=="") {
	    	 throw new HaksaNameException("삭제할 대상이 없습니다.");
	     }
	     System.out.println("학생, 교수, 관리자 중 입력하세요.");
	     object=Register.input.next();
	     if(object==null || object=="") {
	    	 throw new ObjectException("학생, 교수, 관리자 중 입력하세요.");
	     }
	 }
	public void deleteDisplay(StudentDTO student) {
		System.out.println(student.getName()+"님 삭제하였습니다.");    
	 }
	 public void deleteDisplay(ProfessorDTO professor) {
			System.out.println(professor.getName()+"님 삭제하였습니다.");    
	 }
	 public void deleteDisplay(ManageDTO manage) {
			System.out.println(manage.getName()+"님 삭제하였습니다.");    
	 }
	
	//list
	   
	   public void listDisplay(StudentDTO student) {
		  
		    System.out.print("이름: " );
	        System.out.print(student.getName()+"\t");
	        System.out.print("나이: " );
	        System.out.print(student.getAge()+"\t");
	        System.out.print("학번: " );
	        System.out.print(student.getStudentNum()+"\n");
	
	   }
	   public void listDisplay(ProfessorDTO professor) {
			
			System.out.print("이름: " );
	        System.out.print(professor.getName()+"\t");
	        System.out.print("나이: " );
	        System.out.print(professor.getAge()+"\t");
	        System.out.print("담당과목: " );
	        System.out.print(professor.getSubject()+"\n");
	   }
	   public void listDisplay(ManageDTO manage) {
		    
		    System.out.print("이름: " );
	        System.out.print(manage.getName()+"\t");
	        System.out.print("나이: " );
	        System.out.print(manage.getAge()+"\t");
	        System.out.print("담당부서: " );
	        System.out.print(manage.getPart()+"\n");    
	   }
	   
	   //update
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
				studentNum();
			}else if(cnt==2) {
				try {
					updateAgeName();
				} catch (HaksaAgeException e) {
					e.printStackTrace();
				} catch (HaksaNameException e) {
					e.printStackTrace();
				}
				professorSubject();
			}else if(cnt==3) {
				try {
					updateAgeName();
				} catch (HaksaAgeException e) {
					e.printStackTrace();
				} catch (HaksaNameException e) {
					e.printStackTrace();
				}
				managePart();
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


		
//		public abstract void registerStudent() throws StudentNumException;
//		public abstract void registerProfessor() throws ProfessorSubjectException;
//		public abstract void registerManager() throws ManagePartException;
//		public abstract void register();
		
//		public abstract void search();
//		public abstract void studentDelete(int i, StudentDTO student);
//		public abstract void professorDelete(int i, ProfessorDTO professor);
//		public abstract void manageDelete(int i, ManageDTO manage);
//		public abstract void delete();
//		public abstract void list();
//		public abstract void update();
//		public abstract void updateManage(ManageDTO manage, int i);
//		public abstract void updateProfessor(ProfessorDTO professor, int i);
//		public abstract void updateStudent(StudentDTO student, int i);
		
		
}
