package bit.r45.members;

// 클래스
public class Student {

	// 멤버들: 필드(속성), 메서드(함수)
	
	/* 필드 */
	int age;
	int color; //  1: red, 2: blue, 3: black
	
	/* 메서드 */
	public void run() {
		int x = 1;
		int y = 2;
		/*
		 같음
		 * int y;
		 * y = 2;
		 */
		
		int result = x + y;
		/*
		int는 줄바꿈 안됨
		int
		result
		= x + y;   (X)
		
		int result2
		= x + y
		x = 10
		;          (X)
		*/
		
		System.out.println("1+2=" + result);
		System.out.println("Student AGE: " + this.age);
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
