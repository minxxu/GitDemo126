package test;

public class Test1 {
	public static void main(String[] args) {
		// 변수 선언 (메모리에 생성) 및 대입
		// 변수는 소문자로 시작한다.
		System.out.println("*** 변수 ***");
		System.out.println("변수 : 하나의 값을 저장할 수 있는 메모리 공간");
		
		// 선언 => 자료형 변수명; => 메모리에 생성
		// 대입 => 변수명 = 값;  d sdfd 
		// 선언 및 대입 => 자료형 변수명 = 값;    
		
		int level = 10; 
		System.out.println("level : " + level);   // 10
		
		
		int age = 24;
		System.out.println("나이 : " + age);	// 24
		
		int age2 = 25;  
		System.out.println("나이 : " + age2);	// 25
		
		String name = "김태희";
		System.out.println("이름 : " + name);	// 김태희
		
		String name2 = "비";
		System.out.println("이름 : " + name2); // 기존 변수에 대입
		
		char chr = 'A';
		System.out.println("chr : " + chr);
		// char chr = 'A'; // 에러 : char는 한문자, 싱글따옴표 사용
		
		// int형은 4바이트(32비트)
		// int num1 = 12345678900; // 범위 초과
		
		// long형은 8바이트(64비트)
		long num2 = 12345678900l; // long형은 L이나 l을 숫자뒤에 붙인다.
		
		// 본인의 정보를 출력 이름(name), 나이(age), 집주소(address), 이메일(email)
		
	    name  = "신민수";
		System.out.println("이름 : " + name);
		
		int age3 = 24;
		System.out.println("나이 : " + age3);
		
		String address = "경기도 일산";
		System.out.println("주소 : " + address);
		
		String email = "jjjat28@naver.com";
		System.out.println("이메일 : " + email);
	}
}
