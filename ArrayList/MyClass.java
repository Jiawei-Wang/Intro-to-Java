import java.util.ArrayList;

public class MyClass {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("BMW");
    cars.add("Ford");
    System.out.println(cars);
    System.out.println(cars.get(0));
    cars.remove(0);
    System.out.println(cars);
  }
}
