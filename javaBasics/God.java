public class God{
    
      public static void main(String[] args) {
        
        // object / instance of Human class
        Human chinu= new Human("saloni" , "kumawat", 25 , "fair"); 
        Human micky = new Human("Mehul", "Kumawat",21,"Weatish");


        //printing human class properties 
        // when properties( firstname, lastname, age , complextion) are public in human class
        System.out.println("Details of objects");
        System.out.println("chinu's name is " + chinu.firstName +" " + chinu.lastName);;
        System.out.println("chinu ki age hai " + chinu.age) ;
        System.out.println("chinu ka complextion hai " + chinu.complextion);

        

        
    }
}