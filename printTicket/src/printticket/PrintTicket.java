
package printticket;

import java.util.Scanner; 
public class PrintTicket {

  
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     System.out.println("Enter your name and age");
     String name;
     name = input.nextLine().trim();
     int age;
     age = input.nextInt();
     double ticket_Price = 0;
     if (age <=13 )
     {
         ticket_Price = 9.99;
         System.out.println(name + " " + age + " " + ticket_Price);
     }
     
     else if (age>13 && age<65)
     {
        ticket_Price = 19.99;
        System.out.println(name + " " + age + " " + ticket_Price);
     }
     
     else if (age>=65)
     {   
              ticket_Price = 12.99;
              System.out.println(name + " " + age + " " + ticket_Price);
              
      } 
           
             
    }
    
}
