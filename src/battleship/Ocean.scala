package battleship

public class Ocean {

  public Ocean(){ }
  
  placeAllShipsRandomnly(){ }
  
  isOccupied(int row, int column): boolean{ }
  
  shootAt(int row, int column): boolean{ }
  
  getShotsFired(): int{ }
  
  getHitCount(): int{ }
  
  getShipsSunk(): int{ }
  
  isGameOver(): boolean{ }
  
  getShipArray(): Ship[][]{ }
   
  override toString(): String{ }

}