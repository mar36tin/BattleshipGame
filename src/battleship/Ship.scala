package battleship

trait Ship {

	abstract getLength(): int{ }
	
	getBowRow(): int{ }
	
	getBowColumn(): int{ }
	
	isHorizontal(row: int): boolean{ }
	
	setBowRow(row: int){ }
	
	setBowColumn(column: int){ }
	
	setHorizontal(horizontal: boolean){ }
	
	abstract String getShipType(){ }
	
	okToPlaceShipAt(row: int, column: int, hori: boolean, ocean: Ocean): boolean{ }
	
	placeShipAt(row: int, column: int, horizontal: boolean, ocean: Ocean) { }
	
	shootAt(row: int, column: int): boolean{ }
	
	isSunk(): boolean{ }

}