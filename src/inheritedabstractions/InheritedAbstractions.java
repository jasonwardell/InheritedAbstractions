package inheritedabstractions;

import java.util.Scanner;


public class InheritedAbstractions {

    
    public static void main(String[] args) {
       
        couch c1 = new couch();
        ChaseLounge cl = new ChaseLounge();
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What color is the couch?");
        c1.setColor(keyboard.nextLine());
        cl.color();
        
    }
}
