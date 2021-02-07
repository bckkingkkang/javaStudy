package p267.exam03;

public class MemberService {

	// login() 메소드와 logout 메소드 선언
	// login() 메소드의 호출 매개 값은 String id, String password
	// logout() 메소드의 호출 매개값은 String id
	
	// login() 매개 값 id가 "hong", password가 "12345"일 경우에만 true로 리턴하고 그 이외의 값일 경우 false
	// logout() 메소드의 내용은 "로그아웃 되었습니다." 출력

	boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		} else 
			return false;
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}

