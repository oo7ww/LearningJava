package Student;
import java.util.Scanner;

public class StudentTest {
	public static void main(String args[]){
		Student s;
		String name;
		String number;
		int Math;
		int English;
		int Science;
		Scanner input = new Scanner(System.in);
		//input.useDelimiter(",");
		System.out.println("请输入学生学号:");
		number = input.next();
		System.out.println("请输入学生姓名:");
		name = input.next();
		System.out.println("请输入学生的三门课成绩（数学，英语，科学）：");
		Math = input.nextInt();
		English = input.nextInt();
		Science = input.nextInt();
		//s.Student();
		s = new Student(number, name);
		s.enterMarks(Math, English, Science);
		System.out.println("学生的信息如下");
		System.out.println(s.toString());
		input.close();
	}
}
