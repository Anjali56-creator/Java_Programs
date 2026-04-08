public class downcasting {
   public static void main(String[] args) {
    Object o="Anjali";
    String S2=(String) o; // downcasting Object to String
    System.out.println(S2); // Anjali

    //upcasting is dangerous because it can lead to ClassCastException at runtime if the object being downcasted is not of the expected type. For example:
    // Object o2= 10;
    // String s3=(String) o2; // this will throw ClassCastException at runtime because o2 is not a String
    // System.out.println(s3);
   } 
}
