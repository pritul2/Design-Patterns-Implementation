# Implementing the Object Oriented based adapter design pattern

### Problem statement

We have a web-server that is taking only the json based object. However, the client can give the object of any type.   
Thus, we need an adapter class that can translate the client request into appropiate format and provide response from the web server.  

# Steps involved in designing the solution of the problem

1. A server class (WebServer.java) that is a part of some external system (Adaptee). It can take the json object and return True if processing is done else return False.   
2. A client class (Client.java) that is directly calling an interface (WebRequester.java), which is target class, to process his query.   
3. An adapter class (WebAdapter.java) that is translating the request object into the Json format. 

# Class UML Diagram

<img src="https://github.com/pritul2/Design-Patterns-Implementation/blob/structural/adapter/Structral_Patterns/Adapter/Java_adapter_oop/ClassUML_Diagram/AdapterClass.png">
