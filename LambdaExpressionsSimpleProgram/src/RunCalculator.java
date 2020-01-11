/**
 * 
 * @author Dimitrios
 *
 */
public class RunCalculator {

	public static void main(String... args) {
		Calculator myApp = new Calculator();
		IntegerMath addition = (a, b) -> a + b;
		IntegerMath subtraction = (a, b) -> a - b;
		IntegerMath multiplication = (a, b) -> a * b;
		IntegerMath division = (a, b) -> a / b;
		IntegerMath modulo = (a, b) -> a % b;
		
		System.out.println("20 + 40 = " + myApp.operateBinary(40, 20, addition) + "\n"
				+ "40 - 20 = " + myApp.operateBinary(40, 20, subtraction) + "\n" +
				"20 * 40 = " + myApp.operateBinary(40, 20, multiplication) + "\n" +
				"40 / 20 = " + myApp.operateBinary(40, 20, division) + "\n" +
				"40 % 20 = " + myApp.operateBinary(40, 20, modulo) + "\n");
	}
}
