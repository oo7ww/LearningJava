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
		System.out.println("������ѧ��ѧ��:");
		number = input.next();
		System.out.println("������ѧ������:");
		name = input.next();
		System.out.println("������ѧ�������ſγɼ�����ѧ��Ӣ���ѧ����");
		Math = input.nextInt();
		English = input.nextInt();
		Science = input.nextInt();
		//s.Student();
		s = new Student(number, name);
		s.enterMarks(Math, English, Science);
		System.out.println("ѧ������Ϣ����");
		System.out.println(s.toString());
		input.close();
	}
}
