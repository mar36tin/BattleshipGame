package battleship

class BattleShip(bowR:Int, bowCol:Int, hori:Boolean) extends Ship{
	
	var bowRow:Int = bowR
	var bowColumn:Int=bowCol
	var horizontal:Boolean=hori
	var length:Int=4

	
	override def getShipType() = "BattleShip"
	
}
  