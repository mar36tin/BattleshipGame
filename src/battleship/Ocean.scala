package battleship

public class Ocean {

  public Ocean(){ }
  
  void placeAllShipsRandomnly(){ }
  
  boolean  isOccupied(int row, int column){ }
  
  boolean shootAt(int row, int column){ }
  
  int getShotsFired(){ }
  
  int getHitCount(){ }
  
  int getShipsSunk(){ }
  
  boolean isGameOver(){ }
  
  Ship[] [] getShipArray(){ }
  
  @Override 
  String toString(){ }

}