import java.util.Scanner;

public class Main_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�̸��� �Է����ּ��� : ");
		
		String name = scan.next();
		
		if (name.equals("ȫ�浿")) {
			System.out.println("����");
		} else if (name.equals("������")) {
			System.out.println("����");
		} else {
			System.out.println("�𸣰ھ��");
		}
	}

}
