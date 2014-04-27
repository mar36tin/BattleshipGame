package battleship

class PatrolBoat( bowR:Int, bowCol:Int, hori:Boolean) extends Ship{
	
	var bowRow:Int = bowR
	var bowColumn:Int=bowCol
	var horizontal:Boolean=hori
	var length:Int=1
	var hitArray = new Array[Char](length)

	
	override def getShipType() = "PatrolBoat"
		
	override def toString():String={
		if(isSunk) "x" else "S"  
	}
	
}
  
  