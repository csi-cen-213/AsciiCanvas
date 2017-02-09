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
  
  /* Sets DrawLocationX to the legal value closest to its value */
  public void setDrawLocationX(int x) {
    this.drawLocationX = this.bounds(x,this.sizeX);
    
  }
  
  /* Sets DrawLocationY to the legal value closest to its value */
  public void setDrawLocationY(int y) {
    this.drawLocationY = this.bounds(y,this.sizeY);
  }
  
  // no setters for sizeX, sizeY, and canvas
  // because changing the size of the array
  // will potentially cause a crash and shouldn't
  // be allowed.
  
  // Methods
  
  /* uses x,y coordinates to set draw point */
  public void setDrawPoint(int x, int y) {
    // uses setter instead of = because the set method 
    // makes sure that the location is legal.
    // even if our set method didn't do that, this might
    // be a good idea because we might find a bug later
    // that would make us have a more complicated set
    // method
    this.setDrawLocationX(x);
    this.setDrawLocationY(y);
  }
  
  /* Moves drawLocation up one space */
  public void up() {
    this.setDrawLocationY(this.getDrawLocationY()-1);
  }
  
  /* Moves drawLocation down one space */
  public void down() {
    this.setDrawLocationY(this.getDrawLocationY()+1);
  }
  
  /* Moves drawLocation left one space */
  public void left() {
    this.setDrawLocationX(this.getDrawLocationX()-1);
  }
  
  /* Moves drawLocation right one space */
  public void right() {
    this.setDrawLocationX(this.getDrawLocationX()+1);
  }
  
  /* Puts a character in the canvas at the current draw location */
  public void drawCharacter(char character) {
    this.canvas[this.drawLocationY][this.drawLocationX] = character;
  }
  
  /* Fills the canvas so that each position
   * has the user specified character in it. */
  public void fillCanvas(char character) {
    // fills each line of the cavnvas
    for (int i = 0; i < this.sizeY; i++) {
      // fills one line of canvas with character
      for (int j = 0; j < this.sizeX; j++) {
        this.canvas[i][j] = character;
      }
    }
  }
  
  /* prints canvas to screen */
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
  private int bounds(int input, int high) {
    // if input is legal, return it
    if (input >= 0 && input < high) {
      return input;
    }
    if (input < 0) {
      // negative values become 0
      return 0;
    } 
    else {
      // too high values become the high boundary
      // subtract 1 because the last index of an 
      // array is 1 less than its size
      return high-1;
    }
  }

}