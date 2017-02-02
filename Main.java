public class Main{
  public static void main(String [ ] args) {
    AsciiCanvas canvas = AsciiCanvas();
    System.out.println(canvas.sizeX);
    System.out.println(canvas.sizeY);
    System.out.println(canvas.canvas[0][0]);
    System.out.println(canvas.drawLocationX);
    System.out.println(canvas.drawLocationY);
  }
}