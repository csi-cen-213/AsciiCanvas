/* By the CSI/CEN 213 class Spring 2017
 * This code is for teaching purposes only
 * and it might not be the greatest. Stealing
 * it would be a poor choice, because there's
 * better stuff out there. */


/* AsciiCanvas is a class that creates a square
 * character grid for producing Ascii artwork */
public class AsciiCanvas{
  // Properties
  int sizeX = 20;
  int sizeY = 10;
  char[][] canvas = new char[sizeY][sizeX];
  int drawLocationX = sizeX/2;
  int drawLocationY = sizeY/2;
  
  // Constructors
  AsciiCanvas() {
    this.fillCanvas(' ');
  }
  
  AsciiCanvas(char character) {
    this.fillCanvas(character);
  }
  
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
  

}