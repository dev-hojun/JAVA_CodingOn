import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���̸� �Է����ּ��� : ");
		
		int age = scan.nextInt();
		
		if (age > 20) {
			System.out.println("����");
			
		  if(age % 2 == 0) {
			System.out.println("���̰� ¦���� ����");
		} else if(age % 2 == 1){
			System.out.println("���̰� Ȧ���� ����");
		} 
	}
		else {
			System.out.println("�̼�����");
			
			  if(age % 2 == 0) {
					System.out.println("���̰� ¦���� �̼�����");
				} else if(age % 2 == 1){
					System.out.println("���̰� Ȧ���� �̼�����");
				} 
		}
		
	}
}
