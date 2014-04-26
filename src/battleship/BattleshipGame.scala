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
	    	ocean.myArray(row)(column)='S'
	    	else
	    	ocean.myArray(row)(column)='-'  
	    
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
	
	var es = new EmptySea(1)
	def pp():String={
		
	var strArray = Array.ofDim[Char](10, 10)
	println(strArray.deep.mkString("\n"))

    var AircraftCarrier = 	Array('e','e','e','e','e','A','A','A','A','A')
    var Battleship = 		Array('e','e','e','e','e','e','B','B','B','B')
    var Submarine = 		Array('S','S','S','e','e','e','e','e','e','e')
    var Destroyer1 = 		Array('e','e','D','e','e','e','e','e','e','e')
    var Destroyer2 = 		Array('e','e','D','e','e','e','e','e','e','e')
    var PatrolBoat = 		Array('e','e','P','e','e','e','e','e','e','e')
    var EmptyRow  = 		Array('e','e','e','e','e','e','e','e','e','e')
    strArray.update(0, AircraftCarrier)
    strArray.update(1, Submarine);
    strArray.update(2, EmptyRow);
    strArray.update(3, PatrolBoat);
    strArray.update(4, EmptyRow);
    strArray.update(5, EmptyRow);
    strArray.update(6, EmptyRow);
    strArray.update(7, Battleship);
    strArray.update(8, Destroyer1);
    strArray.update(9, Destroyer2);
    
    println(strArray.deep.mkString("\n"))

	    ""
	}

}