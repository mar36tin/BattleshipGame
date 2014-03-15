package battleship

class EmptySea extends Ship{

	public EmptySea(){ }

	override shootAt(row: int, column: int): boolean{ }

	override isSunk(): boolean{ }

	override def toString(): String{ }	 
	
	

}