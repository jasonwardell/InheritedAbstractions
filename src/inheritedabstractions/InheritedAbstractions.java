package inheritedabstractions;

import java.util.Scanner;

public class InheritedAbstractions {

    public static void main(String[] args) {
        ChaseLounge cl = new ChaseLounge();
        houseElf he = new houseElf();

        System.out.println(cl.getColor());
        he.getPowers();
    }
}
