package module5;

import java.util.HashMap;
import java.util.Scanner;

public class AssignmentSecond {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        toyByScanId(scan);
    }
    public static void toyByScanId(Scanner scan) {
        System.out.println("Enter toy's Id ");
        int x = Integer.parseInt(scan.next());
//        int z = scan.nextInt();
//        System.out.println(z);
        boolean initial = true;

        HashMap<Integer, String> toysIds = new HashMap<>();
        toysIds.put(12, "Batmobile");
        toysIds.put(45, "Light Saber");
        toysIds.put(6, "Wonder Woman");
        toysIds.put(201, "Hello Kitty Bag");
        toysIds.put(56, "Junior QA Analyst Doll");

        boolean result = toysIds.containsKey(x);
        if (initial == result) {
            System.out.println("The result is: " +toysIds.get(x));
        } else {
            System.out.println("No such Toy");
        }


    }

}












