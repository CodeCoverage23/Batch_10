package com.shiva.fundamentals;

public class Demo {

    private final int a=10;

    public int m1(){
      //  a=20;//can't reassign
        try {
            System.out.println("try block");
            System.exit(0);
            return 0;
        }catch(Exception e){
        	System.out.println("in catch block");
        }finally {
        	System.out.println("finally block");
            //clean those stream
           // return 1;
        }
        return 1;
        }
    

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize method called...");
    }

    public static void main(String[] args) {
        Demo demo=new Demo();
        demo.m1();
        demo=null;
        System.gc();
    }
}
