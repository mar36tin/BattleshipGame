package battleship

import scala.collection.immutable.Range

object BattleshipGame{
	var ocean = new Ocean

   def main(args:Array[String]){
	    var count =0;
	    var myArray = ocean.myArray	
	    
	    println ("Empty Sea")
	    println(myArray.deep.mkString("\n"))
	    
	    println(ocean.placeAllShipsRandomnly)
	    
	    println("Ships in Sea");
	    println(ocean.getShipArray.deep.mkString("\n"))
	    
	    while(ocean.isGameOver!=true)
	      getUserInput


  }
	
	def getUserInput(){

	  	print("\n\nEnter row to Shoot At :")
	    var row:Int = Console.readInt
	    print("Enter column to Shoot At :")
	    var column:Int = Console.readInt

	    
	    ocean.shootAt(row, column)
	    //println("\n\nisOccupied :"+ocean.isOccupied(row, column))
	    if(ocean.isOccupied(row, column))
	    	ocean.myArray(row)(column)=0
	    //ocean.getShotsFired
	    //ocean.getHitCount
	    
	    println("\nShips in Sea\n");
	    println(ocean.getShipArray.deep.mkString("\n"))
	    println("\n")
	    if(ocean.isGameOver)
	      println("\nALL SHIPS SUNK!!!! GAME OVER")
	      else
	        println ("\nGame not over! Continue...")
	}
  
	
	

	

}