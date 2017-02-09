/* By the CSI/CEN 213 class Spring 2017
 * This code is for teaching purposes only
 * and it might not be the greatest. Stealing
 * it would be a poor choice, because there's
 * better stuff out there. */


/* AsciiCanvas is a class that creates a square
 * character grid for producing Ascii artwork */
public class AsciiCanvas{
  // Properties
  private int sizeX = 20;
  private int sizeY = 10;
  private char[][] canvas = new char[sizeY][sizeX];
  private int drawLocationX = sizeX/2;
  private int drawLocationY = sizeY/2;
  
  // Constructors
  AsciiCanvas() {
    this.fillCanvas(' ');
  }
  
  AsciiCanvas(char character) {
    this.fillCanvas(character);
  }
  
  // Getters/Setters
  public int getSizeX () {
    return this.sizeX;
  }
  public int getSizeY () {
    return this.sizeY;
  }
  public int getDrawLocationX () {
    return this.drawLocationX;
  }
  
  public int getDrawLocationY () {
    return this.drawLocationY;
  }
  
  public void setDrawLocationX(int x) {
    // test if x is negative
    if (x >= 0) {
      this.drawLocationX = x;
    }
    else {
      // make draw location the edge it tried to cross
      this.drawLocationX = 0;
    } 
  }
  
  public void setDrawLocationY(int y) {
    // test if x is negative
    if (y >= 0) {
      this.drawLocationY = y;
    }
    else {
      // make draw location the edge it tried to cross
      this.drawLocationY = 0;
    } 
  }
  
  // no setters for sizeX, sizeY, and canvas
  // because changing the size of the array
  // will potentially cause a crash and shouldn't
  // be allowed.
  
  // Methods
  
  /* Fills the canvas so that each position
   * has the user specified character in it. */
  void fillCanvas(char character) {
    // fills each line of the cavnvas
    for (int i = 0; i < this.sizeY; i++) {
      // fills one line of canvas with character
      for (int j = 0; j < this.sizeX; j++) {
        this.canvas[i][j] = character;
      }
    }
  }
  
  public void render() {
    for(int i = 0; i < this.sizeY; i++){
      for(int j = 0;j < this.sizeX; j++){
        System.out.print(this.canvas[i][j]);
      }
    System.out.println();
    }
  }
  
  /* Tests if in is illegal (negative or too high). Returns the
   * legal value for in that is closest to it: 0 if it would be
   * negative, the maximum legal value if it would be too high. */
  public int bounds(int input, int high) {
    // if input is legal, return it
    if (input >= 0 && input < high) {
      return input;
    }
    else if (input >= 0) {
      // negative values become 0
      return 0;
    } 
    else {
      // too high values become the high boundary
      return high;
    }
  }

}