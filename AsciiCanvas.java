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
  
  void fillCanvas(char character) {
    for (int i = 0; i < this.sizeY; i++) 
      for (int j = 0; j < this.sizeX; j++)
        this.canvas[i][j] = character;
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