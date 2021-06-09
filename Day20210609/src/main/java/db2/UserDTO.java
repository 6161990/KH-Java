package db2;

public class UserDTO {

	private String loginId;  // 로그인id
	private String password;  // 비밀번호
	private String userName;  // 사용자명
	private String icon;  // 사용자 아이콘
	private String profile;  // 프로필 
	
	//각 멤버변수별 getter, setter
	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	

}
