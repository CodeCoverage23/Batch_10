package Assign10;

public class Que1 {

	public static void main(String[] args) {

int a = 10;
int b =0;

for(int i = 2; i<a ; i++) {
	if(a % i==0) {
		b = b +1;
	}
}
if(b==0) {
	System.out.println("Prime");
}
else {
	System.out.println("Not a prime");
}

}
}