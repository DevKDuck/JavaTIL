package fileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourceExample {
   public static void main(String[] args) {

//      FileInputStream fis = null;
//      try {
//         fis = new FileInputStream("c:\\temp\\in.txt");
//         System.out.println("파일 읽기 작업 완료");
//         int num = Integer.parseInt("a100");
//         
//      } catch (Exception e) {
//         e.printStackTrace();
//      } finally {
//         if (fis != null) {
//            System.out.println("파일을 닫습니다 ");
//            try {
//               fis.close();
//            } catch (IOException e) {
//               e.printStackTrace();
//            }
//         }
//      }

//      MyResource res = new MyResource("A");
//      try {
//         String data = res.read1();
//         int value = Integer.parseInt(data);
//      } catch(Exception e) {
//         System.out.println("예외 처리: " + e.getMessage());
//      } finally {
//         res.close();
//      }

      try (MyResource res = new MyResource("A")) {
         String data = res.read1();
         int value = Integer.parseInt(data);
      } catch(Exception e) {
         System.out.println("예외 처리: " + e.getMessage());
      }
      
      System.out.println();
      
      try (MyResource res = new MyResource("A")) {
         String data = res.read2();
         //NumberFormatException 발생
         int value = Integer.parseInt(data);
      } catch(Exception e) {
         System.out.println("예외 처리: " + e.getMessage());
      }
      
      System.out.println();
      
      /*try (
         MyResource res1 = new MyResource("A"); 
         MyResource res2 = new MyResource("B")
      ) {
         String data1 = res1.read1();
         String data2 = res2.read1();
      } catch(Exception e) {
         System.out.println("예외 처리: " + e.getMessage());
      }*/
      
      MyResource res1 = new MyResource("A"); 
      MyResource res2 = new MyResource("B");
      try (res1; res2) {
         String data1 = res1.read1();
         String data2 = res2.read1();
      } catch(Exception e) {
         System.out.println("예외 처리: " + e.getMessage());
      }
   }
}