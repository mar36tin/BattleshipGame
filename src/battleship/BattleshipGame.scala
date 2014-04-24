package battleship

import scala.collection.immutable.Range

object BattleshipGame{
	var ocean = new Ocean

   def main(args:Array[String]){
    var count =0;
    var myArray = Array.ofDim[Int](10, 10)	
    
    println ("Empty Sea")
    println(myArray.deep.mkString("\n"))
    println()
    
    println(ocean.placeAllShipsRandomnly)
    println("Ships in Sea");
    println(myArray.deep.mkString("\n"))
    println(ocean.shootAt(0, 1))
    


  }
  

	

}