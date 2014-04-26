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

	
	var aircraftCarrier = new AircraftCarrier
	var battleShip = new BattleShip
	var submarine = new Submarine
	var destroyer = new Destroyer
	var patrolBoat = new PatrolBoat
	

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
         				shipsSunk+=1
         				println("\nYou just sank a PatrolBoat!");
         				println("How long is the PatrolBoat? :"+patrolBoat.getLength)
         				patrolBoat.sunkFlag = true
         				println("Is patrolBoat Sunk? :"+patrolBoat.isSunk)         				
         			}
		    	 	true
         case 'd' =>	hits+=1
         			DestroyerHit+=1
         			if(DestroyerHit==2){
         				shipsSunk+=1
         				println("\nYou just sank a Destroyer!!");
         				println("How long is the Destroyer? :"+destroyer.getLength)
         				destroyer.sunkFlag = true
         				println("Is destroyer Sunk? :"+destroyer.isSunk)
         			}
		    	 	true
         case 's' =>	hits+=1
         			SubmarineHit+=1
         			if(SubmarineHit==3){
         				shipsSunk+=1
         				println("\nYou just sank a Yellow Submarine!!!");
         				println("How long is the Submarine? :"+submarine.getLength)
         				submarine.sunkFlag = true
         				println("Is submarine Sunk? :"+submarine.isSunk)
         			}
		    	 	true
         case 'b' =>	hits+=1
         			BattleshipHit+=1
         			if(BattleshipHit==4){
         				shipsSunk+=1
         				println("\nYou just sank a Battleship!!!!");
         				println("How long is the Batteleship? :"+battleShip.getLength)
         				battleShip.sunkFlag = true
         				println("Is Battlship Sunk? :"+battleShip.isSunk)
         			}
		    	 	true
         case 'a' =>	hits+=1
         			AircraftCarrierHit+=1
         			println("Is aircraft Sunk? :"+aircraftCarrier.isSunk)
         			if(AircraftCarrierHit==5){
         				shipsSunk+=1
         				println("\nYou just sank an AircraftCarrier!!!!!");
         				println("How long is the Aircraft? :"+aircraftCarrier.getLength)
         				aircraftCarrier.sunkFlag = true
         				println("Is aircraft Sunk? :"+aircraftCarrier.isSunk)
         				
         				
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