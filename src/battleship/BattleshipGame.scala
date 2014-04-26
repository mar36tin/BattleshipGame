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
	    
	    println("Legends : ")
	    println("S 		indicates location of fired at and hit a ship")
	    println("- 		indicates location of fired at and found nothing")
	    println(". 		indicates location never fired at")
	    println("x 		indicates location of a sunken ship")
	    println("a 		indicates location of an Aircraft")
	    println("b 		indicates location of a Battleship")
	    println("s 		indicates location of a Submarine")
	    println("d 		indicates location of a Destroyer")
	    println("p 		indicates location of a Patrol Boat")
		println("\nShips in Sea\n");    
	    println("0,0   0  1  2  3  4  5  6  7  8  9")

	    println(ocean.getShipArray.deep.mkString("\n"))

	    while(ocean.isGameOver!=true)
	      getUserInput

  }
	
	def getUserInput(){

	  	print("\nEnter row:")
	    row = Console.readInt
	    print("Enter column:")
	    column = Console.readInt	
	    ocean.isOccupied(row, column) 
	    ocean.shootAt(row, column)
	    
	    println("\n");
	  	println("0,0   0  1  2  3  4  5  6  7  8  9\n")
	    println(ocean.myArray.deep.mkString("\n"))
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