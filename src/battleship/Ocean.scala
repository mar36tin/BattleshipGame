package battleship

import scala.collection.mutable.ListBuffer

class Ocean(){

	var ships = Array.ofDim[Char](10, 10)
	var shotsFired = 0
	var hits=0
	var shipsSunk = 0;
	
	var AircraftCarrierHit = 0;
	var BattleshipHit = 0;
	var SubmarineHit = 0;
	var DestroyerHit = 0;
	var PatrolBoatHit = 0;

	
	var aircraftCarrier = new AircraftCarrier(1,1,true)
	var battleShip = new BattleShip(2,2,true)
	var submarine = new Submarine(3,1,true)
	var destroyer = new Destroyer(4,1,true)
	var patrolBoat = new PatrolBoat(2,3,true)
	
	
	var aircraftTuple = Tuple2(0,0)
	var aircraftCarrierHitLocations = ListBuffer(aircraftTuple)
	
	var battleshipTuple = Tuple2(0,0)
	var battleshipHitLocations = ListBuffer(battleshipTuple)
	
	var submarineTuple = Tuple2(0,0)
	var submarineHitLocations = ListBuffer(submarineTuple)

	var destroyerTuple = Tuple2(0,0)
	var destroyerHitLocations = ListBuffer(submarineTuple)


  def placeAllShipsRandomnly():Unit={	
    
    var AircraftCarrier = 	Array('.','.','.','.','.','a','a','a','a','a')
    var Battleship = 		Array('.','.','.','.','.','.','b','b','b','b')
    var Submarine = 		Array('s','s','s','.','.','.','.','.','.','.')
    var Destroyer1 = 		Array('.','.','d','.','.','.','.','.','.','.')
    var Destroyer2 = 		Array('.','.','d','.','.','.','.','.','.','.')
    var PatrolBoat = 		Array('.','.','p','.','.','.','.','.','.','.')
    var EmptyRow1  = 		Array('.','.','.','.','.','.','.','.','.','.')
    var EmptyRow2  = 		Array('.','.','.','.','.','.','.','.','.','.')
    var EmptyRow3  = 		Array('.','.','.','.','.','.','.','.','.','.')
    var EmptyRow4  = 		Array('.','.','.','.','.','.','.','.','.','.')
    
    ships.update(0, AircraftCarrier)
    ships.update(1, Submarine);
    ships.update(2, EmptyRow1);
    ships.update(3, PatrolBoat);
    ships.update(4, EmptyRow2);
    ships.update(5, EmptyRow3);
    ships.update(6, EmptyRow4);
    ships.update(7, Battleship);
    ships.update(8, Destroyer1);
    ships.update(9, Destroyer2);
    

  }
  
   def isOccupied(row:Int, column:Int): Boolean={
     ships(row)(column) match {
       case '.' =>  println("\n\nMISS")
    		   		false
       case 'x' =>  println("\n\nMISS")
    		   		false
       case 'S' =>  println("\n\nHIT")
    		   		false  
       case '-' =>  println("\n\nMISS")
    		   		false 	   
       case 'a' =>  println("\n\nHIT")
    		   		true
       case 'b' =>  println("\n\nHIT")
    		   		true  
       case 'd' =>  println("\n\nHIT")
    		   		true 	
       case 'p' =>  println("\n\nHIT")
    		   		true  
       case 's' =>  println("\n\nHIT")
    		   		true 	    		   		
     }
   }
  
   def shootAt(row:Int, column:Int): Boolean={ 
       shotsFired+=1
       
       ships(row)(column) match {
         case '.' =>    ships(row)(column) = '-'
        		 		false
         case '-' => 	false       		 		
         case 'p' =>	ships(row)(column) = 'x'
           				hits+=1
	         			PatrolBoatHit+=1
	         			if(PatrolBoatHit==1){	
	         				shipsSunk+=1
	         				println("\nYou just sank a PatrolBoat!");
	         				patrolBoat.sunkFlag = true   				
	         			}
			    	 	true
			    	 	
			    	 	
         case 'd' =>	ships(row)(column) = 'S'
			    	 	hits+=1
	         			DestroyerHit+=1
	         			destroyerTuple = (row,column)
         				destroyerHitLocations.append(destroyerTuple)	         			
	         			if(DestroyerHit==2){
		         				shipsSunk+=1
		         				println("\nYou just sank a Destroyer!!");
		         				destroyer.sunkFlag = true
		         				for(i<-destroyerHitLocations){
			         				  if(ships(i._1)(i._2)=='S')
			         				    ships(i._1)(i._2) = 'x'
		         				}
	         			}
			    	 	true
		    	 	
		    	 	
         case 's' =>	ships(row)(column) = 'S'
			    	 	hits+=1
	         			SubmarineHit+=1
	         			submarineTuple = (row,column)
         				submarineHitLocations.append(submarineTuple)
	         			if(SubmarineHit==3){
		         				shipsSunk+=1
		         				println("\nYou just sank a Yellow Submarine!!!");
		         				submarine.sunkFlag = true
		         				for(i<-submarineHitLocations){
			         				  if(ships(i._1)(i._2)=='S')
			         				    ships(i._1)(i._2) = 'x'
	         				}
	         			}
			    	 	true
		    	 	
         case 'b' =>	ships(row)(column) = 'S'
			    	 	hits+=1
	         			BattleshipHit+=1
	         			battleshipTuple = (row,column)
         				battleshipHitLocations.append(battleshipTuple)
	         			if(BattleshipHit==4){
	         				shipsSunk+=1
	         				println("\nYou just sank a Battleship!!!!");
	         				battleShip.sunkFlag = true
	         				for(i<-battleshipHitLocations){
		         				  if(ships(i._1)(i._2)=='S')
		         				    ships(i._1)(i._2) = 'x'
	         				}	         				
	         			}
		    	 		true
		    	 		
         case 'a' =>	ships(row)(column) = 'S'
		    	 		hits+=1
	         			AircraftCarrierHit+=1
         				aircraftTuple = (row,column)
         				aircraftCarrierHitLocations.append(aircraftTuple)
	         			if(AircraftCarrierHit==5){	         			    
	         				shipsSunk+=1
	         				println("\nYou just sank an AircraftCarrier!!!!!");
	         				aircraftCarrier.sunkFlag = true
	         				for(i<-aircraftCarrierHitLocations){
		         				  if(ships(i._1)(i._2)=='S')
		         				    ships(i._1)(i._2) = 'x'
	         				}
	         			}
		    	 		true
		    	 		
         case 'S' => 	hits+=1
         				true
         case 'x' =>	hits+=1
           				false
         				

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
     ships
   }
   
   override def toString():String={

	  ""
   }
   		
}
