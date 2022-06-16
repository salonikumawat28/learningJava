# Java Concepts
### Can an abstract class be final in java ?
No, An abstract class can’t be final.
Both are opposite concecpt in java. 
An Abstract class must be inherited by a class to provide the implementation of the abstract methods of abstract class as they are incomplete classes. But on the other hand, final keyword in class is used to avoid inheritance. And if, it is do so then `Illegal Combination of modifiers: abstract and final` compile time error will occur.

### concrete classes

### What is Comparator in java?
Comparator is a interface in java, that contain comapre method. By overloading the compare method, we can efine on what basis you want to compre the values. For Example - In Employment(id, name, salary), if we want to sort the employment class by name.

### Is it possible to override static and private methods?
No. Static methods are class methods. They have no relevance with the objects.
In child class same static method with same method signature exactly like parent class can be prenet.
Private method is a concept of data hiding. Visibility of private method is only avaliable to parent class only. So, method overriding makes no sense.

### Difference between Hashset and Treeset.




