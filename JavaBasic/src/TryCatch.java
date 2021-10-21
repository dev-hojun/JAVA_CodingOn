public class TryCatch {
	public static void main(String[] args) {
		try {			
			int num1 = 4;
			int num2 = 0;
			System.out.println(num1 + " + " + num2 + " = " + (num1/num2));
		}
	catch(ArithmeticException e) {
		System.out.println("0으로 나누어 예외가 발생하였습니다.");
		e.printStackTrace();
		}
	}
}
