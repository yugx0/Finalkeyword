package com;

// immutable class
//final class XYZ{  
//}  

 class XYZ1{  
}  
         
public class FinalClassLevelDemoO extends XYZ1{  
   void demo(){
      System.out.println("My Method");
   }  
   public static void main(String args[]){  
      FinalClassLevelDemo obj= new FinalClassLevelDemo(); 
      obj.demo();
   }  
}