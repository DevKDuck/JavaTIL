package HashMapExample;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
abstract class 애완동물 {
   private String name;
   abstract public void 울다();
}
//추상 클래스 애완동물 생성

class 강아지 extends 애완동물 {   
   public 강아지(String name) {
      super(name);
   }
   
   public void 울다() {
      System.out.println(getName() + "가 멍멍~~~");
   }
}

class 고양이 extends 애완동물 {

   public 고양이(String name) {
      super(name);
   }

   public void 울다() {
      System.out.println(getName() + "가 야옹야옹~~~");
   }
}

class 앵무새 extends 애완동물 {

   public 앵무새(String name) {
      super(name);
   }

   public void 울다() {
      System.out.println(getName() + "가 앵앵앵~~~");
   }
}


//Data 관리 
public class ListExam {
   List<애완동물> array = new ArrayList<>();

   public void createInstance() {
      array.add(new 강아지("여름이"));
      array.add(new 고양이("셜록"));
      array.add(new 강아지("루키"));
      array.add(new 고양이("치즈"));
      array.add(new 고양이("빵떡이"));
      array.add(new 앵무새("지구~~"));
   }
   
   public void action() {
      for (애완동물 obj : array) {
         obj.울다();
      }
   }
   
   public static void main(String[] args) {
//      List<강아지> array1 = new ArrayList<>();
//      List<고양이> array2 = new ArrayList<>();
//      
//      array1.add(new 강아지("여름이"));
//      array1.add(new 강아지("루키"));
//      array2.add(new 고양이("셜록"));
//      array2.add(new 고양이("치즈"));
//      array2.add(new 고양이("빵떡이"));
//      
//      for (강아지 obj : array1) {
//         obj.강아지울다();
//      }
//      
//      for (고양이 obj : array2) {
//         obj.고양이울다();
//      }
      
//      List<애완동물> array = new ArrayList<>();
//      
//      array.add(new 강아지("여름이"));
//      array.add(new 고양이("셜록"));
//      array.add(new 강아지("루키"));
//      array.add(new 고양이("치즈"));
//      array.add(new 고양이("빵떡이"));
//      
//      for (애완동물 obj : array) {
//         obj.울다();
//      }

      //메소드를 사용하여 변경함 
      ListExam exam = new ListExam();
      exam.createInstance();
      exam.action();
      
   }
}










