public class Human{

     //properties /instance 
     //scope: method variable = local ; instance variable = global ; static variable
     String firstName;
     String lastName;
     int age;
     String complextion;

     //constructor of human class
     //constructor is also a method but a special kind of method
     //constructor name = same as class name
     //firstname,lastname,age , complection .... are parameters of constructor 
     public Human( String firstName, String lastName, int age, String complextion){
         this.firstName=firstName;
         this.lastName=lastName;
         this.age=age;
         this.complextion=complextion;

        
    }
}