import backpack.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

     ArrayList<String> apple1 = new ArrayList<>();
     for (int i = 0; i <= 50; i++){
      apple1.add("Apple");
          }

     ArrayList<String> apple3 = new ArrayList<>();
     for (int i = 0; i <= 50; i++) {
         apple3.add("Apple");
     }
       // Apple[] arrayApp1 = new Apple[20];
        //Apple[] arrayApp3 = new Apple[10];

        //for (int i = 0; i<arrayApp1.length; i++)
       //arrayApp1[i] = i + 1;

//        int[] arrayApp3 = new int[10];
//        for (int i = 0; i<arrayApp3.length; i++)
//            arrayApp3[i] = i + 1;

        int[] arrayTBalls2 = new int[50];       //tennis balls for the Backpack Two
        for (int i = 0; i < arrayTBalls2.length; i++)
            arrayTBalls2[i] = i + 1;
        int[] arrayTBalls3 = new int[3];        // tennis balls for the backpack Three
        for (int i = 0; i < arrayTBalls3.length; i++)
            arrayTBalls3[i] = i + 1;

        Book book1 = new Book("Atlant raspravil plechi");
        Folder folder2 = new Folder("A4 format");
        Folder folder3 = new Folder("A2 format");
        Coke coke1 = new Coke("diet Coke");
        Coke coke3 = new Coke("classic Coke");
        Water water2 = new Water("Legenda");

    CircleKind apple = new Apple();
    CircleKind tennisBall = new TennisBalls();

     BackpackOne backpackOnes = new BackpackOne();
     backpackOnes.setPlaneKind(book1);
     backpackOnes.setCylindricKind(coke1);
     backpackOnes.setCircleKind(apple);
     backpackOnes.put();

     BackpackTwo backpackTwo = new BackpackTwo();
     backpackOnes.setPlaneKind(folder2);
     backpackOnes.setCylindricKind(water2);
     backpackOnes.setCircleKind(tennisBall);
     backpackTwo.put();

     BackpackThree backpackThree = new BackpackThree();
     backpackThree.setPlaneKind(folder3);
     backpackThree.setCylindricKind(coke3);
     backpackThree.setCircleKind(tennisBall);
     backpackThree.setCircleKind(apple);
     backpackThree.put();


    }
}
