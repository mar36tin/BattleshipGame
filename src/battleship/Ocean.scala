package battleship

class Ocean(){

	var myArray = Array.ofDim[Int](10, 10)
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
    
    var AircraftCarrier = 	Array(0,0,0,0,0,5,5,5,5,5);
    var Battleship = 		Array(0,0,0,0,0,0,4,4,4,4);
    var Submarine = 		Array(3,3,3,0,0,0,0,0,0,0);
    var Destroyer1 = 		Array(0,0,2,0,0,0,0,0,0,0);
    var Destroyer2 = 		Array(0,0,2,0,0,0,0,0,0,0);
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
       shotsFired+=1
       
       myArray(row)(column) match {
         case 0 =>  false
         case 1 =>	hits+=1
         			PatrolBoatHit+=1
		    	 	true
         case 2 =>	hits+=1
         			DestroyerHit+=1
		    	 	true
         case 3 =>	hits+=1
         			SubmarineHit+=1
		    	 	true
         case 4 =>	hits+=1
         			BattleshipHit+=1
		    	 	true
         case 5 =>	hits+=1
         			AircraftCarrierHit+=1
         			println("Aircraft Hit count :"+AircraftCarrierHit);
		    	 	true		    	 	
         
       }
      
   
   }
  
   def getShotsFired(): Int={ 
     println("No of shots fired so far is:"+shotsFired)
     shotsFired
     
   }
  
   def getHitCount(): Int={ 
     println("No of hits so far is:"+hits)
     hits
   }

   def getShipsSunk(): Int={ 
		   if(AircraftCarrierSunkFlag==false && AircraftCarrierHit==5){
		     shipsSunk+=1
		     AircraftCarrierSunkFlag = true
		   }
		     
		   if(BattleshipHitSunkFlag==false && BattleshipHit==4){
		     shipsSunk+=1
		     BattleshipHitSunkFlag = true
		   }
		   if(SubmarineHitSunkFlag==false && SubmarineHit==3){
		     shipsSunk+=1	
		     SubmarineHitSunkFlag = true
		   }
		   if(DestroyerHitSunkFlag==false && DestroyerHit==2){
		     shipsSunk+=1
		     DestroyerHitSunkFlag = true
   			}
		     
		   if(PatrolBoatHitSunkFlag==false && PatrolBoatHit==1){
		     shipsSunk+=1
		     PatrolBoatHitSunkFlag = true
		     
		   }
		     shipsSunk
   }
  
   def isGameOver(): Boolean={ 
     println ("No of Ships Sunk so far :"+shipsSunk)
     if (getShipsSunk==5)
       true
     else
       false
   }
  
   def getShipArray()={
     myArray
   }
   		
}