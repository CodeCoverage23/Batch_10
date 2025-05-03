package com.shiva.exception;

public class ExceptionOrder {


    public static void main(String[] args) {

        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
     } catch (Exception ae) {
            System.out.println(ae.getMessage());
       } finally {
            System.out.println("finally");
        }
    }
}
