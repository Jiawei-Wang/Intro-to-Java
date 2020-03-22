public class MyClass {
  public static void main(String[] args) {
    try {
      int[] numbers = {1,2,3};
      System.out.println(numbers[10]);
    } catch (Exception e) {
      System.out.println("There is no 11th number");
    } finally {
      System.out.println("The 'try and catch' is finished");
    }
  }
}
