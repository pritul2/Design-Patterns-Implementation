<h1>What is Facade design pattern</h1>
The literal meaning is a front wall or outerlook of something. It acts as a single point of access of a large system like banking, shopping, etc.   
Since Facade deals with the structure of the code it is a Structral design pattern.  

<h2> General algorithm in Facade implementation </h2>

1. Design the interface. <br/>
2. Implement the interface with one or more methods through different classes.   <br/> 
3. Create a facade class to wrap all this methods.  <br/>  
4. Client will directly use facade class to interact with the whole system.   

<h2> Concept revision about Interface </h2>

* Interface are the pure abstract class, which acts as an service provider of features.  <br/>
* Since Interface is the service provider it's method should be public.   <br/>
* Any class that is implemented the interface should provide the implementation of the interface feature.   <br/>
* Unlike inheritance, one class can implement any number of interfaces.   <br/> 
* By default interface variables are public static and final. So we can access but can't modify.  

<h2> The class diagram of the implemented Facade Class is as follows </h2>
<img src="https://github.com/pritul2/Design-Patterns-Implementation/blob/structral/facade/Structral_Patterns/Facade/FacadeClassDiagram.png"></img>