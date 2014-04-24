package battleship

trait Ship{

	def getLength:Int

	
	def getBowRow
	
	def getBowColumn
	
	def isHorizontal
	
	def setBowRow(row: Int)
	
	def setBowColumn(column: Int)
	
	def setHorizontal(horizontal: Boolean){ }
	
	def getShipType()
	
	def okToPlaceShipAt(row: Int, column: Int, hori: Boolean, ocean: Object): Boolean
	
	def placeShipAt(row: Int, column: Int, horizontal: Boolean, ocean: Object) 
	
	def shootAt(row: Int, column: Int): Boolean{ }
	
	def isSunk(): Boolean{ }

}