package LambdaExpression;


interface MethodWithTwoParams{
	void add(int a,int b);
}

public class LambdaExpressionDemo3 {

	public static void main(String[] args) {
		MethodWithTwoParams m = (a,b) -> {
			int c = a+b;
			System.out.println(c);
		};
		m.add(45, 45);
		
	}

}
