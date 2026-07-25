public class encapsulation {
   public encapsulation() {
   }

   public static void main(String[] var0) {
      student var1 = new student();
      var1.setId(101);
      var1.setName("gowtham");
      System.out.println("Student ID: " + var1.getId());
      System.out.println("Student Name: " + var1.getName());
   }
}
