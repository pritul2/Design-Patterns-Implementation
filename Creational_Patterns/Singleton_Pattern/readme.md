## Singleton Design Pattern
> To create only one single instance of a particular class in the complete program.
### Use Case:
> In a printing queue, many documents are present. However, there must be only one instance of a printer serving multiple requests. 

## Flashback:
>In Java 4 types of access modifiers are there:  
(1) Public  
(2) Private  
(3) Protected  
(4) Default  
If a constructor is private, its object can be created from same class only. Another class can't create its object. Because that class has private accessibiliy.


>Factory method:  
Function that creates an object and return object's instance.  
Example of static factory method: java.lang.Runtime.   
You can't use **new Runtime()**. But you can use Runtime.getRuntime().

> Design:
<img src="Creational_Patterns/Singleton_Pattern/singleton_design.png" width="128"/>
