package module5;

import java.util.*;

public class AssignmentThird {

    public void listOfNames (){
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Steve");
        myList.add("Tim");
        myList.add("Lusy");
        myList.add("Steve");
        myList.add("Pat");
        myList.add("Angela");
        myList.add("Tom");
        myList.add("Tim");
        myList.add("Anna");
        myList.add("Lusy");

        Collections.sort(myList);
        System.out.println("The initial sorted list: " + myList);

           HashSet<String> newList = new HashSet<>(myList);
           //System.out.println(newList);

           List<String> backToMyList = new ArrayList<>(newList);
           Collections.sort(backToMyList);
           System.out.println("The sorted list without dublicates : "+ backToMyList);




    }
}
