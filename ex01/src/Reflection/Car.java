package Reflection;


public class Car {
   //필드
   private String model;
   private String owner;
   
   //생성자
   public Car() {
      System.out.println("자동차 객체 생성");
   }
   public Car(String model) {
      this.model = model;
   }
   public Car(String model, String owner) {
      this.model = model;
      this.owner = owner;
   }
   
   //메소드
   public String getModel() { return model; }
   public void setModel(String model) { this.model = model; }
   public String getOwner() { return owner; }
   public void setOwner(String owner) { this.owner = owner; }
   
   @Override
   public String toString() {
      return "Car [model=" + model + ", owner=" + owner + "]";
   }
}
