# Overview 
 
Object-Oriented Programming (OOP) is a programming paradigm that revolves around the concept of objects, which represent real-world entities. 
In OOP, objects are used as the primary building blocks to implement functionality. It aims to model real-world entities in code by incorporating concepts like encapsulation, inheritance, polymorphism, and abstraction.

## Classes and Objects

A class is a blueprint for creating objects. It defines the attributes (data) and behaviors (methods) that all objects of that class will have. An object is an instance of a class, meaning it is a specific realization of the class blueprint.

In our coding example, we got our `Person` class with `age`,`name` and `occupation` as attributes (instance variables) and `setName()`, `setAge()`, `setOccupation()`, `getName()`, `getAge()`, `getOccupation()` as behavior (methods)

We then create our `person` object and set it with specific attributes

## Encapsulation

Encapsulation is the bundling of data and methods that operate on the data into a single unit (class). It hides the internal state of an object and only exposes the necessary functionalities through methods.

For example, the `Person` class encapsulates the `name`, `age`, and `occupation` attributes and provides methods (`setName()`, `setAge()`, `setOccupation()`, `getName()`, `getAge()`, `getOccupation()`) to access and modify them

## Inheritance 

Inheritance is a mechanism where a new class (subclass) inherits properties and behaviors from an existing class (superclass). It promotes code reuse and establishes a hierarchical relationship between classes.

Here, the `SoftwareEngineer` class inherits from the `Job` class, gaining attributes and behaviors defined in `Job`. It extends `Job` by adding a `programmingLanguage` attribute and overrides the `displayJobDetails()` method to include additional information specific to a software engineering job

## Polymorphism

Polymorphism allows objects of different classes to be treated as objects of a common superclass. It enables a single interface to represent multiple underlying implementations, providing flexibility and extensibility in the code.

The `SoftwareEngineer` class overrides the `displayJobDetails()` method inherited from `Job`, providing a specialized implementation. This allows a `SoftwareEngineer` object to be treated as a `Job` object, enabling flexibility in method invocation.

## Abstraction

Abstraction focuses on hiding the complex implementation details and exposing only the necessary functionalities to the user. It allows developers to work at a higher level of understanding without worrying about the internal complexities.

By providing getter and setter methods in the `Person` class, only the necessary functionalities to manipulate `name`, `age`, and `occupation` are exposed, while the internal implementation details remain hidden.


## Conclusion

Feel free to clone this repo and play around the code to familiarize yourself more with the terms I mentioned above. Comments are placed so you can grasp the instructions in the code and what role they play.

