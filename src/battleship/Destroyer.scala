package battleship

class Destroyer(bowR:Int, bowCol:Int, hori:Boolean) extends Ship{
	
	var bowRow:Int = bowR
	var bowColumn:Int=bowCol
	var horizontal:Boolean=hori
	var length:Int = 2
	var hitArray = new Array[Char](length)

	
	override def getShipType() = "Destroyer"
		
	override def toString():String={
		if(isSunk) "x" else "S"  
	}
	
	override def toString():String={
		if(isSunk) "x" else "S"  
	}
	
}