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
		
		var count:Int = 0
		for(i <- 0 until this.length) { 
			//returns true if the position can 
			if((ocean.myArray(row+i)(column)==0) && (hori)){ 
				count = count+1
				if (count == length){
					return true
				}
			}
						
			if((ocean.myArray(row)(column+i)==0) && (hori!=false)) {
				count = count+1
				if (count == length){
					return true
				}
				
			}
		
		}
		return false
	}
	
	def placeShipAt(row: Int, column: Int, horizontal: Boolean, ocean: Ocean) = {
		
		this.setBowRow(row)
		this.setBowColumn(column)
		this.setHorizontal(horizontal)
		
		for(i <- 0 to (length-1)){
			if (horizontal) {
				ocean.myArray(row+i)(column)='a'
			}else{
			
				ocean.myArray(row)(column+i)='a'
			}
		} 
				
		
	}
	
	def shootAt(row: Int, column: Int): Boolean = true
		
	
	def isSunk(): Boolean={ 
			sunkFlag
	}

}