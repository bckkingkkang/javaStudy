package sec03.exam02;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("고가현", "991014-1234567");
		System.out.println("k1.이름 : "+ k1.name);
		System.out.println("k1.주민등록번호 : "+ k1.ssn);
		
		System.out.println();
		
		Korean k2 = new Korean("KoKahyun", "991014-7654321");
		System.out.println("k2.이름 : "+ k2.name);
		System.out.println("k2.주민등록번호 : "+ k2.ssn);
	}
	
	
}
