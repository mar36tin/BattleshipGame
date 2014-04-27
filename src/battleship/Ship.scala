package battleship

trait Ship{
	
	var bowRow:Int
	var bowColumn:Int
	var horizontal:Boolean
	var length:Int
	var sunkFlag = false
	var hitArray:Array[Char]
	
	def getLength:Int = length

	def getBowRow = bowRow
	
	def getBowColumn = bowColumn
	
	def isHorizontal: Boolean = horizontal
	
	def setBowRow(row: Int) = { this.bowRow = bowRow }
	
	def setBowColumn(column: Int) = { this.bowColumn = column }
	
	def setHorizontal(horizontal: Boolean) = { this.horizontal = horizontal }
	
	def getShipType()
	
	def okToPlaceShipAt(row: Int, column: Int, hori: Boolean, ocean: Ocean): Boolean = {
		
		var count:Int = 0
		
		for(i <- 0 until this.length) { 
			//returns true if the ship can be positioned at this position.
			if((ocean.myArray(row+i)(column)==0) && (hori)){ 
				count += 1
				if (count == length) return true
			}
						
			if((ocean.myArray(row)(column+i)==0) && (!hori)) {
				count += 1
				if (count == length) return true
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
				ocean.myArray(row+i)(column)='a'//PLEASE CHECK THE char 'a'
			}else{
			
				ocean.myArray(row)(column+i)='a'//PLEASE CHECK THE char 'a'
			}
		} 
	}
	
	def shootAt(row: Int, column: Int, ocean: Ocean): Boolean = {
		if (ocean.myArray(row)(column)=='a'){
			if (!isSunk){
				//hitArray[] = ocean.myArray(row)(column)
				return true
			}
		}
		return false
	}
	
	def isSunk(): Boolean={ 
			sunkFlag
	}

}