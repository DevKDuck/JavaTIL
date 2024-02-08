package Reflection;

public class Person {
   private String name;
   public Person() {
      System.out.println("사람 객체 생성");
   }
   
   @Override
   public String toString() {
      return "Person [name=" + name + "]";
   }
   
}