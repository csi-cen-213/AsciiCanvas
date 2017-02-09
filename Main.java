public class Main{
  public static void main(String [ ] args) {
    // Test constructor
    AsciiCanvas canvasSpace = new AsciiCanvas();
    /*canvasSpace.render();
    // Test constructor that takes char argument
    AsciiCanvas canvasStar = new AsciiCanvas('*');
    canvasStar.render();*/
    // test getters
    /*System.out.println(canvasSpace.getSizeX());
    System.out.println(canvasSpace.getSizeY());
    System.out.println(canvasSpace.getDrawLocationX());
    System.out.println(canvasSpace.getDrawLocationY());*/
    // test setters
    // picking a different number for X and Y so when I 
    // print them I can tell them apart and make sure they
    // aren't getting mixed up.
    canvasSpace.setDrawLocationX(0);
    canvasSpace.setDrawLocationY(1); 
    System.out.println(canvasSpace.getDrawLocationX());
    System.out.println(canvasSpace.getDrawLocationY());
    // test setters to make sure they behave properly for 
    // values outside the drawing area (too low)
    canvasSpace.setDrawLocationX(-2);
    canvasSpace.setDrawLocationY(-1); 
    System.out.println(canvasSpace.getDrawLocationX());
    System.out.println(canvasSpace.getDrawLocationY());
    // test setters to make sure they behave properly for 
    // values outside the drawing area (too high)
    canvasSpace.setDrawLocationX(100);
    canvasSpace.setDrawLocationY(200); 
    System.out.println(canvasSpace.getDrawLocationX());
    System.out.println(canvasSpace.getDrawLocationY());
    // test canvasSpace
    /*System.out.println(canvasSpace.bounds(5, 10));  // should return 5
    System.out.println(canvasSpace.bounds(-1, 10)); // should return 0
    System.out.println(canvasSpace.bounds(100,10)); // should return 9 */
    
    
    
 
  }
}