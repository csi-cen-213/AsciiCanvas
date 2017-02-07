public class Main{
  public static void main(String [ ] args) {
    AsciiCanvas canvas = new AsciiCanvas('*');
    System.out.println(canvas.sizeX);
    System.out.println(canvas.sizeY);
    System.out.println(canvas.drawLocationX);
    System.out.println(canvas.drawLocationY);
    canvas.render();
  }
}