package SHARAD;

public class DivisionOfNum {

	public static int divnum(int a, int b) {
		if(b == 0) {
			
			System.out.println("exception occure divide by zero :");
			return 0;
		}
		return a/b;
	}
		public static void main(String[] args) {
			
	int a = 100;
	int b = 50;
	int Div = divnum(a,b);

System.out.println("The division of "+a+" / " +b+" = " +Div);
		}
      }


