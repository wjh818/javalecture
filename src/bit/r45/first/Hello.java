package bit.r45.first;

import java.io.IOException;
import bit.r45.members.*;


public class Hello {

	public static void main(String[] args) {
		
		Student student;
		
		student = new Student(); // 해당하는 내용 사용하려면 new로 할당해줘야함
		student.run();
		student.setAge(100);
		student.run();
	}

}
