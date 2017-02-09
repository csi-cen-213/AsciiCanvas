public class Main{
  public static void main(String [ ] args) {
    // Test constructor
    //AsciiCanvas canvasSpace = new AsciiCanvas();
    //canvasSpace.render();
    // Test constructor that takes char argument
    //AsciiCanvas canvasStar = new AsciiCanvas('*');
    //canvasStar.render();
    // test getters
    /*System.out.println(canvasSpace.getSizeX());
    System.out.println(canvasSpace.getSizeY());
    System.out.println(canvasSpace.getDrawLocationX());
    System.out.println(canvasSpace.getDrawLocationY());*/
    // test setters
    // picking a different number for X and Y so when I 
    // print them I can tell them apart and make sure they
    // aren't getting mixed up.
    /*canvasSpace.setDrawLocationX(0);
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
    System.out.println(canvasSpace.getDrawLocationY());*/
    // test bounds
    /*System.out.println(canvasSpace.bounds(5, 10));  // should return 5
    System.out.println(canvasSpace.bounds(-1, 10)); // should return 0
    System.out.println(canvasSpace.bounds(100,10)); // should return 9 */
    // test setDrawPoint 
    /*canvasSpace.setDrawPoint(8, 9);
    System.out.println(canvasSpace.getDrawLocationX());
    System.out.println(canvasSpace.getDrawLocationY());
    // test setDrawPoint with illegal values (too low)
    canvasSpace.setDrawPoint(-14, -485);
    System.out.println(canvasSpace.getDrawLocationX());
    System.out.println(canvasSpace.getDrawLocationY());
    // test setDrawPoint with illegal values (too high)
    canvasSpace.setDrawPoint(3456, 234);
    System.out.println(canvasSpace.getDrawLocationX());
    System.out.println(canvasSpace.getDrawLocationY());*/
    // test drawCharacter
    /*canvasSpace.setDrawPoint(0,0);
    canvasSpace.drawCharacter('+');
    canvasSpace.render();*/
    // make sure X and Y aren't mixed up; using * canvas
    // so it's easier to see what is going on
    /*canvasStar.setDrawPoint(5,0);
    canvasStar.drawCharacter('x');
    canvasStar.setDrawPoint(0,5);
    canvasStar.drawCharacter('y');
    canvasStar.render();*/
    // test up method
    /*canvasSpace.setDrawPoint(10,5);
    canvasSpace.drawCharacter('0');
    canvasSpace.up();
    canvasSpace.drawCharacter('1'); // should put 1 in square above 0
    canvasSpace.setDrawPoint(0,0);
    canvasSpace.drawCharacter('2');
    canvasSpace.up();
    canvasSpace.drawCharacter('3'); // 3 should overwrite 2
    canvasSpace.render();*/
    // test down method
    /*canvasSpace.setDrawPoint(10,5);
    canvasSpace.drawCharacter('0');
    canvasSpace.down();
    canvasSpace.drawCharacter('1'); // should put 1 in square below 0
    canvasSpace.setDrawPoint(100,100);
    canvasSpace.drawCharacter('2');
    canvasSpace.down();
    canvasSpace.drawCharacter('3'); // 3 should overwrite 2
    canvasSpace.down();
    canvasSpace.render();*/
    // test left method
    /*canvasSpace.setDrawPoint(10,5);
    canvasSpace.drawCharacter('0');
    canvasSpace.left();
    canvasSpace.drawCharacter('1'); // should put 1 in square left of 0
    canvasSpace.setDrawPoint(0,0);
    canvasSpace.drawCharacter('2');
    canvasSpace.left();
    canvasSpace.drawCharacter('3'); // 3 should overwrite 2
    canvasSpace.render();*/
    // test right method
    /*canvasSpace.setDrawPoint(10,5);
    canvasSpace.drawCharacter('0');
    canvasSpace.right();
    canvasSpace.drawCharacter('1'); // should put 1 in square right of 0
    canvasSpace.setDrawPoint(456,123);
    canvasSpace.drawCharacter('2');
    canvasSpace.right();
    canvasSpace.drawCharacter('3'); // 3 should overwrite 2
    canvasSpace.render();*/
    AsciiCanvas canvas = new AsciiCanvas();
    // pictures inspired by http://www.trussel.com/f_char.htm
    
    // frog to practice loops
    canvas.setDrawPoint(13,5);
    canvas.drawCharacter('@');
    for (int i = 0; i < 2; i++) {
      canvas.right();
      canvas.drawCharacter('.');
    }
    canvas.right();
    canvas.drawCharacter('@');
    canvas.down();
    canvas.right();
    canvas.drawCharacter(')');
    for (int i = 0; i < 4; i++) {
      canvas.left();
      canvas.drawCharacter('-');
    }
    canvas.left();
    canvas.drawCharacter('(');
    canvas.left();
    canvas.down();
    canvas.drawCharacter('(');
    canvas.right();
    canvas.right();
    canvas.drawCharacter('>');
    for (int i = 0; i < 2; i++) {
      canvas.right();
      canvas.drawCharacter('_');
    }
    canvas.right();
    canvas.drawCharacter('<');
    canvas.right();
    canvas.right();
    canvas.drawCharacter(')');
    canvas.down();
    canvas.drawCharacter('^');
    canvas.left();
    canvas.drawCharacter('^');
    canvas.left();
    for (int i = 0; i < 2; i++) {
      canvas.left();
      canvas.drawCharacter('~');
    }
    canvas.left();
    for (int i = 0; i < 2; i++) {
      canvas.left();
      canvas.drawCharacter('^');
    }
      
    // bird to practice 2D arrays
    canvas.setDrawPoint(4, 1);
    canvas.drawCharacter('(');
    canvas.setDrawPoint(5, 1);
    canvas.drawCharacter('(');
    canvas.setDrawPoint(6, 1);
    canvas.drawCharacter('(');
    canvas.setDrawPoint(3, 2);
    canvas.drawCharacter('(');
    canvas.setDrawPoint(4, 2);
    canvas.drawCharacter('.');
    canvas.setDrawPoint(6, 2);
    canvas.drawCharacter('.');
    canvas.setDrawPoint(7, 2);
    canvas.drawCharacter(')');
    canvas.setDrawPoint(2, 3);
    canvas.drawCharacter('(');
    canvas.setDrawPoint(3, 3);
    canvas.drawCharacter('(');
    canvas.setDrawPoint(5, 3);
    canvas.drawCharacter('v');
    canvas.setDrawPoint(7, 3);
    canvas.drawCharacter(')');
    canvas.setDrawPoint(8, 3);
    canvas.drawCharacter(')');
    canvas.setDrawPoint(1, 4);
    canvas.drawCharacter('-');
    canvas.setDrawPoint(2, 4);
    canvas.drawCharacter('-');
    canvas.setDrawPoint(3, 4);
    canvas.drawCharacter('-');
    canvas.setDrawPoint(4, 4);
    canvas.drawCharacter('m');
    canvas.setDrawPoint(5, 4);
    canvas.drawCharacter('-');
    canvas.setDrawPoint(6, 4);
    canvas.drawCharacter('m');
    canvas.setDrawPoint(7, 4);
    canvas.drawCharacter('-');
    canvas.setDrawPoint(8, 4);
    canvas.drawCharacter('-');
    canvas.setDrawPoint(9, 4);
    canvas.drawCharacter('-');
    
    // draw finished canvas
    canvas.render();
  }
}