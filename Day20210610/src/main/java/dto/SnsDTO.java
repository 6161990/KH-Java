package dto;

//쓰기 내용 유지 클래스
public class SnsDTO {
	
	private String userName; //사용자명
	private String icon;   // 사용자아이콘
	private String date;   // 작성시간
	private String writing ;   // 내용
	
	public SnsDTO() {}
	
	public SnsDTO(String userName, String icon, String date, String writing) {
		this.userName = userName;
		this.icon = icon;
		this.date = date;
		this.writing = writing;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getWriting() {
		return writing;
	}

	public void setWriting(String writing) {
		this.writing = writing;
	}
	
	

}
