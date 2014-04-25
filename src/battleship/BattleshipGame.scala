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
	    
	    Iterator.continually(Console.readLine).takeWhile(_ != "exit").foreach(line => getUserInput)
    


  }
	
	def getUserInput(){

	  
	  	print("Enter row to Shoot At :")
	    var row:Int = Console.readInt
	    println("Row entered :"+row)
	    
	    println("Enter column to Shoot At :")
	    var column:Int = Console.readInt
	    println("Column entered :"+column)
	    
	    println("ShootAt :"+ocean.shootAt(row, column))
	    println("isOccupied :"+ocean.isOccupied(row, column))
	    if(ocean.isOccupied(row, column))
	      ocean.myArray(row)(column)=0
	    ocean.getShotsFired
	    ocean.getHitCount
	    
	    println("Ships in Sea");
	    println(ocean.getShipArray.deep.mkString("\n"))
	    
	    println("Is game over? "+ocean.isGameOver)
	    
	}
  
	
	

	

}