package ListExample;


import java.util.Objects;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//@Data
//@AllArgsConstructor
public class Board {
   private int    id;
   private String subject;
   private String content;
   private String writer;
   
   public Board(int id) {
	   //생성자를 호출this()하면서 인자를 넣는 경우
	   //아래 두개 사용가능
      this(id, null, null, null);
//      this(id, "", "", "");

      //      this.id = id;
//      this.subject = "";
//      this.content = "";
//      this.writer = "";
   }
//
   public Board(int id, String subject, String content, String writer) {
      super();
      this.id = id;
      this.subject = subject;
      this.content = content;
      this.writer = writer;
   }

   public String getSubject() {
      return subject;
   }

   public void setSubject(String subject) {
      this.subject = subject;
   }

   public String getContent() {
      return content;
   }

   public void setContent(String content) {
      this.content = content;
   }

   public String getWriter() {
      return writer;
   }

   public void setWriter(String writer) {
      this.writer = writer;
   }

   public int getId() {
      return id;
   }
   
   //해쉬값을 id 기준으로 생성
   @Override
   public int hashCode() {
      return Objects.hash(subject);
   }
   
   
   
//   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Board other = (Board) obj;
      return id == other.id;
   }


 @Override 
 public String toString() { return "Board [id=" + id + ", subject="
 + subject + ", content=" + content + ", writer=" + writer + "]"; }
//@Override
//public int hashCode() {
//	return Objects.hash(subject);
//}
//@Override
//public boolean equals(Object obj) {
//	if (this == obj)
//		return true;
//	if (obj == null)
//		return false;
//	if (getClass() != obj.getClass())
//		return false;
//	Board other = (Board) obj;
//	return Objects.equals(subject, other.subject);
//}

   
}