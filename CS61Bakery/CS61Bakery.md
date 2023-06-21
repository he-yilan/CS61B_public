# CS61Bakery Debugging Demo 

This is a very simple demo of how to use the IntelliJ debugger. 

## Debugger Overview 
* debug button and stop button
* breakpoints
* step over 
* step into
* step out 
* start over 
* conditional breakpoints 
* exception breakpoint 
* Java visualizer

## Methods to debug

### restock
* breakpoint at CS61B.restock(2);
* step in 
* open this (to see object)
* step over
* stop
* fix: += not =

### getMaxPurchase
* breakpoint at assertEquals(16, CS61B.getMaxPurchase());
* step in (getMaxPurchase method)
* conditional breakpoint: i== 1 at if statement
* resume
* if statement is false 
* change > to <