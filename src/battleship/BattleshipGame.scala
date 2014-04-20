package battleship

import scala.collection.immutable.Range

object BattleshipGame{
  
  def main(args:Array[String]){
    var count =0;
    var myArray = Array.ofDim[Int](10, 10)	
    println ("Empty Sea")
    println(myArray.deep.mkString("\n"))
    println()
/*    var arr0 = Array.range(0, 10)
    var arr1 = Array.range(10, 20)
    var arr2 = Array.range(20, 30)
    var arr3 = Array.range(30, 40)
    var arr4 = Array.range(40, 50)
    var arr5 = Array.range(50, 60)
    var arr6 = Array.range(60, 70)
    var arr7 = Array.range(70, 80)
    var arr8 = Array.range(80, 90)
    var arr9 = Array.range(90, 100)
    myArray(2)(4) = 0;

   

    println(myArray.deep.mkString("\n"))
    println()*/
    
    var AircraftCarrier = 	Array(0,0,0,0,0,1,1,1,1,1);
    var Battleship = 		Array(0,0,0,0,0,0,1,1,1,1);
    var Submarine = 		Array(1,1,1,0,0,0,0,0,0,0);
    var Destroyer1 = 		Array(0,0,1,0,0,0,0,0,0,0);
    var Destroyer2 = 		Array(0,0,1,0,0,0,0,0,0,0);
    var PatrolBoat = 		Array(0,0,1,0,0,0,0,0,0,0);
    
    myArray.update(0, AircraftCarrier)
    myArray.update(1, Submarine);
    myArray.update(3, PatrolBoat);
    myArray.update(7, Battleship);
    myArray.update(8, Destroyer1);
    myArray.update(9, Destroyer2);
    

    println("Ships in Sea");
    println(myArray.deep.mkString("\n"))
  }
	

}