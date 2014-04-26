package battleship

trait Ship{
	
	var bowRow:Int
	var bowColumn:Int
	var horizontal:Boolean
	var length:Int
	var sunkFlag = false

	
	def getLength:Int = length

	
	def getBowRow = bowRow
	
	def getBowColumn = bowColumn
	


	
	def isHorizontal: Boolean = {
			horizontal
	}
	
	def setBowRow(row: Int) = {
		this.bowRow = bowRow
	}
	
	def setBowColumn(column: Int) = {
		this.bowColumn = column
	}
	
	def setHorizontal(horizontal: Boolean) = { 
		this.horizontal = horizontal
	}
	
	def getShipType()
	
	def okToPlaceShipAt(row: Int, column: Int, hori: Boolean, ocean: Ocean): Boolean = {
		
		
		if(ocean.myArray(row)(column)==0){
			return true
		}
		else {
			return false
		}
	}
	
	def placeShipAt(row: Int, column: Int, horizontal: Boolean, ocean: Object) = {
		
		this.setBowRow(row)
		this.setBowColumn(column)
		this.setHorizontal(horizontal)
		
		for(i <- 0 to (length-1)){
			if (horizontal == true) {
				
			}else{
			//REFERENCE TO A SHIP i.e. the tail of the ship
			}
		} 
				
		
	}
	
	def shootAt(row: Int, column: Int): Boolean = true
		
	
	def isSunk(): Boolean={ 
			sunkFlag
	}

}