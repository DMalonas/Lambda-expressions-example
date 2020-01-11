
public class Calculator implements IntegerMath{
	
	
	
	IntegerMath addition = (a, b) -> a + b;
	IntegerMath subtraction = (a, b) -> a - b;
	IntegerMath multiplication = (a, b) -> a * b;
	IntegerMath division = (a, b) -> a / b;
	IntegerMath modulo = (a, b) -> a % b;
	
	

	public int operateBinary(int a, int b, IntegerMath addition) {
		return addition.operation(a, b);
	}


	@Override
	public int operation(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
}
