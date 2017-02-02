public class AsciiCanvas{
  // Properties
  int sizeX = 10;
  int sizeY = 20;
  char[][] canvas = new char[sizeX][sizeY];
  int drawLocationX = sizeX/2;
  int drawLocationY = sizeY/2;
  
  // Constructors
  AsciiCanvas() {
    this.fillCanvas(' ');
  }
  
  // Methods
  
  void fillCanvas(char character) {
    for (int i = 0; i < this.sizeX; i++) 
      for (int j = 0; j < this.sizeY; j++)
        this.canvas[i][j] = character;
  }
 

}