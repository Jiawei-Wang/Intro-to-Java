public class getRectangle {
  public static void main(String[] args) {
    Rectangle rec = new Rectangle(100, 50);
    int area = rec.width * rec.height;
    System.out.println("Area is: "+area);

    rec.width += 50;
    rec.height += 20;
    System.out.println("New width is: "+rec.width);
    System.out.println("New height is: "+rec.height);
  }
}
