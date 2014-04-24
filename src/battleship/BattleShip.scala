package battleship

class BattleShip(
      length:Int = 4
  ) extends Ship{

	override def getLength:Int={
	  length
	}
	
	
	override def getBowRow{
	  
	}
	
	override def getBowColumn{
	  
	}
	
	override def isHorizontal{
	  
	}
	
	override def setBowRow(row: Int){
	  
	}
	
	override def setBowColumn(column: Int){
	  
	}
	
	override def setHorizontal(horizontal: Boolean){ }
	
	override def getShipType()={
	  "BattleShip"
	}
	
	override def okToPlaceShipAt(row: Int, column: Int, hori: Boolean, ocean: Object): Boolean={
	  false
	  
	}
	
	override def placeShipAt(row: Int, column: Int, horizontal: Boolean, ocean: Object) {
	  
	}
	
	override def shootAt(row: Int, column: Int): Boolean={ 
	  true
	}
	
	override def isSunk(): Boolean={ 
	  false
	}
	override def toString():String={
		if(isSunk) "x" else "S"  
	}
}
  