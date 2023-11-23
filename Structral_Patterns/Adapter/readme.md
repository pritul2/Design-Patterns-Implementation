# Adapter Design Pattern

Sometimes the output of one is not compatible to the input of another then in this case we need an adapter that facilitates the communication between two existing systems. It is same as electronic adapters like adpater of AC.   

## Terminologies with adapter design pattern

* Client Class: The class that will going to interact with the whole system.
* Adaptee Class: The class of an external system.
* Adapter Class: This implement a target interface to map client request and adaptee result.
* Target Interface: Interface used by client to send a request to adapter.

## Breakdown of the adapter design pattern is as follows

1. Design the target interface  
2. Implement the target interface as an adapter class  
3. Send request from the client to the adapter using the target interface 

## Application of adapter design pattern in Java Interfaces (Polymorphic Interfaces)

An implementing class of interface should implement all the methods or become abstract. But apart from these two an adapter class can be formed with dummy implemented methods and it's child classes are overwritting those methods. 



