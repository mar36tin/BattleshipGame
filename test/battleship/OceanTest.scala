package battleship

import org.junit._

import Assert._

class OceanTest {
  //1 Ocean()--------------------------------------------------------------------------------
  @Test
  def testOceanDimensions() {
    val ROW_LENGTH = 10 
    val COLUMN_LENGTH = 10 
    var atlantic = new Ocean()
    var totalGridCell = 0

    for(i <- 0 until ROW_LENGTH) {
      totalGridCell += (atlantic.getShipArray())(i).length
  	}
    assertEquals(ROW_LENGTH * COLUMN_LENGTH, totalGridCell)
  } 

  @Test
  def testGridEmpty() {
    val ROW_LENGTH = 10 
    val COLUMN_LENGTH = 10
    val NOT_FIRED_UPON = '.'
    
    var atlantic = new Ocean()
    var gridEmpty = true
    var i = 0
    var j = 0

    while(i < ROW_LENGTH && gridEmpty) {
    	while(j < COLUMN_LENGTH && gridEmpty) {
    		
    		gridEmpty = (atlantic.getShipArray())(i)(j) == NOT_FIRED_UPON
    		println("i = " + i)
    		println("\nj = " + i)
    		println("\ncontents = " + (atlantic.getShipArray())(i)(j))
    		j += 1
  		}
    	i += 1
    }
    assertEquals(true, gridEmpty)
  }

  def testShotsFiredInitialised {
    val SHOTS_FIRED = 0 
    var atlantic = new Ocean()
    assertEquals(SHOTS_FIRED, atlantic.getShotsFired())
  }
  
  def tesHitsInitialised {
    val HITS = 0 
    var pacific = new Ocean()
    assertEquals(HITS, pacific.getHitCount())
  }
  
  def testShipsSunkInitialised {
    val SHIPS_SUNK = 0 
    var indian = new Ocean()
    assertEquals(SHIPS_SUNK, indian.getShipsSunk())
  }
  
  def testAircraftCarrierHitInitialised {
    val AIRCRAFT_CARRIER_HIT = 0 
    var artic = new Ocean()
    assertEquals(AIRCRAFT_CARRIER_HIT, artic.getShipsSunk())
  }

  def testBattleshipHitInitialised {
    val BATTLESHIP_HIT = 0 
    var southern = new Ocean()
    assertEquals(BATTLESHIP_HIT, southern.getShipsSunk())
  } 
  
  
}