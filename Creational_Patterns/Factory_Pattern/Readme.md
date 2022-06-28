## Factory Design Pattern
A class that has the object of factory class is called Factory design pattern  
**Factory class:-**  
A class that has factory method (Which creates and give the object as per requirement)  
For example, if we want car object, it creates and give car object  
if we want truck object, it creates and give truck object  

## Abstract factory design 
Here we allow child to determine which type of object he want to create  
## Revisiting concepts
1) Abstract modifiers  
--> Applicable to classes and methods  
### Abstract Method
An abstract method has declaration but no implementation. It's child classes responsible for implementation. So method is abstract when more than one implementation is possible.   
Moreover, every child compulsory needs to provide implementation    
``public abstract void m1()``  
  
Compile time error will be generated if any modifier (final, static etc) that requires implementation is placed with abstract
  
  
2) Abstract Class
If a class is abstract, it's object instantiation not possible. It can have 0 or more than 1 abstract method. 
Creating object of a class with abstract method is not meaningful so we generally declare a class with abstract method as abstract class 

## Benifits of factory design pattern
Creating new objects without disturbing client code  