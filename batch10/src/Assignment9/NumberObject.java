package Assignment9;
//Question 9.1

    public class NumberObject 
    {
	static int count=0;

    NumberObject()
    {
      count++;

   }
	public static void main(String[] args) {
		
		NumberObject obj1 = new NumberObject();

        NumberObject obj2 = new NumberObject();
        NumberObject obj3 = new NumberObject();

        NumberObject obj4 = new NumberObject();
        NumberObject obj5 = new NumberObject();
        System.out.println("Number of objects created:"+count);
      //  System.out.println(obj4.count);
	   }
}

