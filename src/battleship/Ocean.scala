package battleship

abstract class Ocean {

  
  def placeAllShipsRandomnly(){ }
  
  def isOccupied(row:Int, column:Int): Boolean{ }
  
  def shootAt(row:Int, column:Int): Boolean{ }
  
  def getShotsFired(): Int{ }
  
  def getHitCount(): Int{ }
  
  def getShipsSunk(): Int{ }
  
  def isGameOver(): Boolean{ }
  
  def getShipArray()

}