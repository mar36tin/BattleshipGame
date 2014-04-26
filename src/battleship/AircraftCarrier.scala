package battleship

class AircraftCarrier(bowR:Int, bowCol:Int, hori:Boolean) extends Ship{
	
	var bowRow:Int = bowR
	var bowColumn:Int=bowCol
	var horizontal:Boolean=hori
	var length:Int=5

	
	override def getShipType() = "AircraftCarrier"
	
	override def toString():String={
		if(isSunk) "x" else "S"  
	}
	
}
  
  