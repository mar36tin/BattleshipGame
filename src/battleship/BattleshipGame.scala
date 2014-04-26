package battleship

import scala.collection.immutable.Range

object BattleshipGame{
  
	var ocean = new Ocean
	var continueFlag:Char = 'y'
	var row:Int = 0
	var column:Int = 0


	
   def main(args:Array[String]){
	    var count =0;
	    var myArray = ocean.myArray	
	    
	    println ("Empty Sea")
	    println(myArray.deep.mkString("\n"))
	    
	    println(ocean.placeAllShipsRandomnly)
	    
	    println("\nShips in Sea");
	    println("0,0   0  1  2  3  4  5  6  7  8  9\n")
	    
	    
	    println(ocean.getShipArray.deep.mkString("\n"))
	    
	    while(ocean.isGameOver!=true)
	      getUserInput

  }
	
	def getUserInput(){

	    
	  	print("\nEnter row:")
	    row = Console.readInt
	    print("Enter column:")
	    column = Console.readInt
	    
	    ocean.shootAt(row, column)
	    if(ocean.isOccupied(row, column))
	    	ocean.myArray(row)(column)=0

	    
	    println("\n");
	  	println("0,0   0  1  2  3  4  5  6  7  8  9\n")
	    println(ocean.getShipArray.deep.mkString("\n"))
	    if(ocean.isGameOver){
	      println("\nALL SHIPS SUNK!!!! GAME OVER")
	      println("\nNo of shots required to sink all ships :"+ocean.shotsFired)
	    }
	      else{
	        print ("\nGame not over! Wish to Continue(y/n)? :")
	        continueFlag = Console.readChar
	        if(continueFlag=='n')
	          System.exit(1)
	      }
	        
	}
	


}