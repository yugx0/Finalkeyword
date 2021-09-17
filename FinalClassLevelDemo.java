package com;

  class ABC{  //without final keyword
}  
         
public class FinalClassLevelDemo extends ABC{  
   void demo(){
      System.out.println("My Method");
   }  
   public static void main(String args[]){  
      FinalClassLevelDemo obj= new FinalClassLevelDemo(); 
      obj.demo();
   }  
}