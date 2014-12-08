Overview

Project: Battleship Game

Author: Martin Gwarada

----------------------------------------------------
Classes

BattleshipGame:
This is the main class, containing the main method and a variable of type Ocean.

Ocean:
This contains a 10x10 grid of Ships which represents the “ocean”, and some methods to manipulate it.

Ship:
This describes characteristics common to all the ships. It has the following sub- classes:
	
	AircraftCarrier — describes a ship with length 5.
	Battleship — describes a ship with length 4.
	Submarine — describes a ship with length 3.
	Destroyer — describes a ship with length 2.
	PatrolBoat — describes a ship with length 1.
	EmptySea — Describes a part of the ocean that doesn’t have a ship in it.
	

OceanTest:
This is a JUnit test class for Ocean. Tests will be done for every required method for Ocean, 
including the constructor, but not including the toString() method. 
