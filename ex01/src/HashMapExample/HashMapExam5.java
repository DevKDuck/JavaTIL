package HashMapExample;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 배열에서 자료를 찾는 방법  
 */
public class HashMapExam5 {

	
	//Map<String,String> 형태의 ArrayList
   List<Map<String, String>> array = new ArrayList<Map<String,String>>();

   
   //id,name,phone의 키, id,name,phone으로 받는 값 - value 
   public void addStudent(String id, String name, String phone) {
      Map<String, String>  map = new HashMap<>();

      map.put("id", id);
      map.put("name", name);
      map.put("phone", phone);
      
      //배열에 map 객체를 추가한다
      array.add(map);
   }

   //name을 이용해 찾는 방법 함수화
   public boolean findName(String name) {
	      for (Map<String, String> student : array) {
	         if (name.equals(student.get("name"))) {
	            //원하는 자료 찾음 
	            System.out.println(student);
	            return true;
	         }
	      }
	      return false;
	   }
   
   //id를 이용해 찾는 방법 함수화
   public boolean findId(String id) {
	      for (Map<String, String> student : array) {
	         if (id.equals(student.get("id"))) {
	            //원하는 자료 찾음 
	            System.out.println(student);
	            return true;
	         }
	      }
	      return false;
	   }


   
   
   public void output() {
      for (var map : array) {
         System.out.println(map);
      }
   }
   
   //한사람의 객체를 map으로 생성하여 List에 추가하여 관리함
   public static void main(String[] args) {
      
      HashMapExam5 exam = new HashMapExam5();
      
      for (int i=0;i<10000;i++) {
         //exam.addStudent("" + i, "홍길동", "010-1234-1234");
         //exam.addStudent(String.valueOf(i), "홍길동" + i, "010-1234-1234");
         exam.addStudent(String.valueOf(i), "홍길동" + String.valueOf(i), "010-1234-1234");
      }      
      //String.valueof(i) = int형 자료형을 String으로 변경해주는 메서드

      
//      exam.output();

      //찾을 자료 
      String name = "홍길동9000";

//      
//      //이름을 이용하여 배열에서 자료를 찾는 코드 
     
//      //검색 시간을 출력할 것 
      
      
      //홍길동9000이라는 이름을 이용해 찾을 경우
      long startTime = System.nanoTime();
      
      for (Map<String, String> student : exam.array) {
         if (name.equals(student.get("name"))) {
            //원하는 자료 찾음 
            System.out.println(student);
            break;
         }
      }
      
      long endTime = System.nanoTime();
      
      System.out.println("홍길동9000 찾는 시간: " + (endTime-startTime));
      
      
      //홍길동10이라는 이름을 이용해 찾을 경우
      String name2 = "홍길동10";
      
      
      long startTime2 = System.nanoTime();
      
      for (Map<String, String> student : exam.array) {
          if (name2.equals(student.get("name2"))) {
             //원하는 자료 찾음 
             System.out.println(student);
             break;
          }
       }
      
      long endTime2 = System.nanoTime();
      
      System.out.println("홍길동10 찾는 시간: " + (endTime2-startTime2));
      
      
      
      String id = "9000";
      
      long startTime3 = System.nanoTime();
      
      for (Map<String, String> identity: exam.array) {
    	  if(id.equals(identity.get("id"))) {
    		  System.out.println(identity);
              break;
    	  }
      }
      long endTime3 = System.nanoTime();
      
      System.out.println("id9000 찾는 시간: " + (endTime3-startTime3));
      
      
      //함수화한 findName, findId 함수 호출
      long tick = System.nanoTime();
      exam.findName("홍길동9000");
      tick = System.nanoTime() - tick;
      System.out.println("실행 시간 : " + tick);
      
      tick = System.nanoTime();
      exam.findName("홍길동10");
      tick = System.nanoTime() - tick;
      System.out.println("실행 시간 : " + tick);
      
      tick = System.nanoTime();
      exam.findName("홍길동100000");
      tick = System.nanoTime() - tick;
      System.out.println("실행 시간 : " + tick);
      
      tick = System.nanoTime();
      exam.findId("9000");
      tick = System.nanoTime() - tick;
      System.out.println("실행 시간 : " + tick);
      
      tick = System.nanoTime();
      exam.findId("10");
      tick = System.nanoTime() - tick;
      System.out.println("실행 시간 : " + tick);

      
   }

}