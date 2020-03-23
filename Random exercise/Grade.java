import java.util.Scanner;

public class Grade {
  public static String giveGrade(int mark){
    if (mark >= 80) {
      return "A";
    } else if (mark >= 60) {
      return "B";
    } else {
      return "Fail";
    }
  }
  public static void main(String[] args) {
    System.out.println("Your mark is: ");
    Scanner scan = new Scanner(System.in);
    int score = scan.nextInt();
    System.out.println("Your grade is: "+giveGrade(score));
  }
}
