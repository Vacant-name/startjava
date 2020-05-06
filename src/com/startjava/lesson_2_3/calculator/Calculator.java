public class Calculator {
	private int firstNum;
	private String sign;
	private int secondNum;

	void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	void setSign(String sign) {
		this.sign = sign;
	}

	void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	void calculate() {

		switch(sign) {
			case "+" :
				System.out.println("Answer = " + (firstNum + secondNum));
				break;
			case "-" :
				System.out.println("Answer = " + (firstNum - secondNum));
				break;
			case "*" :
				System.out.println("Answer = " + (firstNum * secondNum));
				break;
			case "/" :
				System.out.println("Answer = " + (firstNum / secondNum));
				break;
			case "%" :
				System.out.println("Answer = " + (firstNum % secondNum));
				break;
			case "^" :
				int result = 1;
				for(int i = 1; i <= secondNum; i++) {
					result *= firstNum;
				}
				System.out.println("Answer = " + result);
				break;
		}
	}
}