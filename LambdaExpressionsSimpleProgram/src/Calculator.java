
public class Calculator implements IntegerMath{
	
	public int operateBinary(int a, int b, IntegerMath functionName) {
		return functionName.operation(a, b);
	}

	@Override
	public int operation(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
}
