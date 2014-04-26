package battleship

class Ocean(){

	var myArray = Array.ofDim[Char](10, 10)
	var shotsFired = 0
	var hits=0
	var shipsSunk = 0;
	
	var AircraftCarrierHit = 0;
	var BattleshipHit = 0;
	var SubmarineHit = 0;
	var DestroyerHit = 0;
	var PatrolBoatHit = 0;
	
	var AircraftCarrierSunkFlag = false;
	var BattleshipHitSunkFlag = false;
	var SubmarineHitSunkFlag = false;
	var DestroyerHitSunkFlag = false;
	var PatrolBoatHitSunkFlag = false;
	

  def placeAllShipsRandomnly():Unit={	
    
    var AircraftCarrier = 	Array('e','e','e','e','e','a','a','a','a','a')
    var Battleship = 		Array('e','e','e','e','e','e','b','b','b','b')
    var Submarine = 		Array('s','s','s','e','e','e','e','e','e','e')
    var Destroyer1 = 		Array('e','e','d','e','e','e','e','e','e','e')
    var Destroyer2 = 		Array('e','e','d','e','e','e','e','e','e','e')
    var PatrolBoat = 		Array('e','e','p','e','e','e','e','e','e','e')
    var EmptyRow  = 		Array('e','e','e','e','e','e','e','e','e','e')
    
    myArray.update(0, AircraftCarrier)
    myArray.update(1, Submarine);
    myArray.update(2, EmptyRow);
    myArray.update(3, PatrolBoat);
    myArray.update(4, EmptyRow);
    myArray.update(5, EmptyRow);
    myArray.update(6, EmptyRow);
    myArray.update(7, Battleship);
    myArray.update(8, Destroyer1);
    myArray.update(9, Destroyer2);
    

  }
  
   def isOccupied(row:Int, column:Int): Boolean={
     if(myArray(row)(column)=='e'){
    	 	println("\n\nMISS")
    	 	false
     }
     else{
    	 	println("\n\nHIT")
    	 	true	
     }
   }
  
   def shootAt(row:Int, column:Int): Boolean={ 
       shotsFired+=1
       
       myArray(row)(column) match {
         case 'e' =>  false
         case 'p' =>	hits+=1
         			PatrolBoatHit+=1
         			if(PatrolBoatHit==1){
         				PatrolBoatHitSunkFlag = true	
         				shipsSunk+=1
         				println("\nYou just sank a PatrolBoat!");
         			}
		    	 	true
         case 'd' =>	hits+=1
         			DestroyerHit+=1
         			if(DestroyerHit==2){
         				DestroyerHitSunkFlag = true	
         				shipsSunk+=1
         				println("\nYou just sank a Destroyer!!");
         			}
		    	 	true
         case 's' =>	hits+=1
         			SubmarineHit+=1
         			if(SubmarineHit==3){
         				SubmarineHitSunkFlag = true	
         				shipsSunk+=1
         				println("\nYou just sank a Yellow Submarine!!!");
         			}
		    	 	true
         case 'b' =>	hits+=1
         			BattleshipHit+=1
         			if(BattleshipHit==4){
         				BattleshipHitSunkFlag = true	
         				shipsSunk+=1
         				println("\nYou just sank a Battleship!!!!");
         			}
		    	 	true
         case 'a' =>	hits+=1
         			AircraftCarrierHit+=1
         			if(AircraftCarrierHit==5){
         				AircraftCarrierSunkFlag = true	
         				shipsSunk+=1
         				println("\nYou just sank an AircraftCarrier!!!!!");
         				
         			}
		    	 	true
         
       }
      
   
   }
  
   def getShotsFired(): Int={ 
     println("Shots so far :"+shotsFired)
     shotsFired
     
   }
  
   def getHitCount(): Int={ 
     println("Hits so far :"+hits)
     hits
   }

   def getShipsSunk(): Int={ 
     println ("No of Ships Sunk so far :"+shipsSunk)
	 shipsSunk
   }
  
   def isGameOver(): Boolean={ 
     
     if (shipsSunk==5){
       true
     }
     else
       false
   }
  
   def getShipArray()={
     myArray
   }
   
   override def toString():String={

	  ""
   }
   		
}