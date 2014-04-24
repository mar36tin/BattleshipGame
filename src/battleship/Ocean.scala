package battleship

class Ocean{

  def myArray = Array.ofDim[Int](10, 10)	

  def placeAllShipsRandomnly()	={
    var AircraftCarrier = 	Array(0,0,0,0,0,1,1,1,1,1);
    var Battleship = 		Array(0,0,0,0,0,0,1,1,1,1);
    var Submarine = 			Array(1,1,1,0,0,0,0,0,0,0);
    var Destroyer1 = 		Array(0,0,1,0,0,0,0,0,0,0);
    var Destroyer2 = 		Array(0,0,1,0,0,0,0,0,0,0);
    var PatrolBoat = 		Array(0,0,1,0,0,0,0,0,0,0);
    
    myArray.update(0, AircraftCarrier)
    myArray.update(1, Submarine);
    myArray.update(3, PatrolBoat);
    myArray.update(7, Battleship);
    myArray.update(8, Destroyer1);
    myArray.update(9, Destroyer2);



  }
  
   def isOccupied(row:Int, column:Int): Boolean={
     if(myArray(row)(column)==0)
    	 	false
     else
    	 	true
   }
  
   def shootAt(row:Int, column:Int): Boolean={ 
       if(myArray(row)(column)==0)
    	 	false
     else
    	 	true
   }
  
   def getShotsFired(): Int={ 
     0
   }
  
   def getHitCount(): Int={ 
     0
   }
  
   def getShipsSunk(): Int={ 
     0
   }
  
   def isGameOver(): Boolean={ 
     false
   }
  
   def getShipArray()={
     
   }
   		
}