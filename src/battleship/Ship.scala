package battleship

trait Ship {

	abstract int getLength(){ }
	
	int getBowRow(){ }
	
	int getBowColumn(){ }
	
	boolean isHorizontal(int row){ }
	
	void setBowRow(int row){ }
	
	void setBowColumn(int column){ }
	
	void setHorizontal(boolean horizontal){ }
	
	abstract String getShipType(){ }
	
	boolean okToPlaceShipAt(int row, int column, boolean hori, Ocean ocean){ }
	
	void placeShipAt(int row, int column, boolean horizontal, Ocean ocean) { }
	
	boolean shootAt(int row, int column){ }
	
	boolean isSunk(){ }

}