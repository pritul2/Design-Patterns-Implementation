# Java Polymorphic Interface Implementation

1. There will be one interface (MainInterface.java) with 3 features (A, B, C).
2. The dummy implementation of all these features will be provided by the adapter class (AdapterClass.java).
3. The adapter class will be inherited by child class 1 (Child1.java) and child class 2 (Child2.java) to overwrite these dummy methods.
4. Whole system is wrapped by Service class (ClientService.java) so that client can easily access.
5. Client class is defined as (Client.java).

# Advantages

This is improving the code readibility and easy to manage unlike defining abstract classes or to give implementation in all classes. 

# Class UML Diagram

<img src="https://github.com/pritul2/Design-Patterns-Implementation/blob/structural/adapter/Structral_Patterns/Adapter/Java_polymorphic_implementation/ClassUML_Diagram/ClassAdapter.png">
