package battleship

import scala.collection.immutable.Range

object BattleshipGame{
	var ocean = new Ocean

   def main(args:Array[String]){
	    var count =0;
	    var myArray = ocean.myArray	
	    
	    println ("Empty Sea")
	    println(myArray.deep.mkString("\n"))
	    println()
	    
	    println(ocean.placeAllShipsRandomnly)
	
	    Iterator.continually(Console.readLine).takeWhile(_ != "exit").foreach(line => getUserInput)
    


  }
	
	def getUserInput(){
	  	println("Enter row to Shoot At :")
	    var row:Int = Console.readInt
	    println("Row entered :"+row)
	    
	    println("Enter column to Shoot At :")
	    var column:Int = Console.readInt
	    println("Column entered :"+column)
	    
	    println(ocean.shootAt(row, column))
	}
  
	
	

	

}