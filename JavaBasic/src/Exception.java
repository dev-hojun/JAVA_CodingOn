public class Exception {

	public static void main(String[] args) {
		try {			
			int [] num = new int[3];
			
			System.out.println("num �迭�� �ִ밪�� 3�Դϴ�.");
			
			num[4] = 0;
			
			System.out.println("num[4]�� ���� �Է��߽��ϴ�.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ���� �����Դϴ�.");
			e.printStackTrace();
		}
	}
}