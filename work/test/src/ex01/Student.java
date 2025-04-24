package ex01;

//6. '학생' 클래스를 작성하고, '이름', '나이', '학번'을 인스턴스 변수로 가지며 이를 출력하는 메서드를 작성하세요.
public class Student {
	String name;
	int age;
	int id;
	
	public Student(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
}
