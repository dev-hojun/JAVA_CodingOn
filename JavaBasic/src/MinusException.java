
public class MinusException {

	public static void main(String[] args) {
		try {
			int num = -2;
			if(num < 0) {
				throw new MinusException();
			}
		}	catch (MinusException e) {
			e.printStackTrace();
		}
	}
}


class MinusException extends Exception {
	public MinusException() {
		super("음수가 입력됨");
	}
}
