package cooperation;

public class Student {

	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void showInfo() {
		System.out.println(studentName + "���� ���� ���� " + money + "�� �Դϴ�");
	}
}
