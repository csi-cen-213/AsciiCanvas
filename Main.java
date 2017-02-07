public class Main{
  public static void main(String [ ] args) {
    AsciiCanvas canvas = new AsciiCanvas('*');
    System.out.println(canvas.getSizeX());
    System.out.println(canvas.getSizeY());
    System.out.println(canvas.getDrawLocationX());
    System.out.println(canvas.getDrawLocationY());
    canvas.render();
 
  }
}