Command Pattern helps you write flexible, loosely coupled code for implementing actions and events in your application. In simple words, the command design pattern is used to separate a request for action from the object which actually performs the action. This decoupling between Invoker and Receiver objects provides a uniform way to perform different types of actions. This decoupling is achieved using a Command object, which is usually an interface with methods like execute(). 

Client 		- Creates Concrete Command Object and configure with Receiver
Invoker 	- Who hold command and calls execute() method on Command object
Receiver 	- Actual object, which processes the request
Command 	- Interface, which takes a request from Invoker and delegates to Receiver
ConcreteCommand - implementation of Command interface for doing a particular task