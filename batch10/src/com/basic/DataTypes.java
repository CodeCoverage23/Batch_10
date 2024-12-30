package com.basic;



//public class DataTypes {
//
//    public static void main(String[] args) {
//        int value = 50; 
//        System.out.println( value);
//    }
//}

public class DataTypes {

  
    public String getStudentName(String name) {
        return name; 
    }

    public static void main(String[] args) {
       
    	DataTypes student = new DataTypes();
        
  
        String studentName = student.getStudentName("John Doe");
        
      
        System.out.println("Student Name: " + studentName);
    }
}
