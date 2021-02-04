

import java.awt.*;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        // Task 1
        int[] arrayNum = new int[100];
        for (int i = 0; i < arrayNum.length; i++)
            arrayNum[i] = i + 1;
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print(arrayNum[i] + ", ");
        }
        System.out.println();
        System.out.print("Even numbers: ");
        int evenNum = arrayNum[0];
        for (int i = 1; i < arrayNum.length; i++){
            if (arrayNum[i] %2==0){
                evenNum = arrayNum[i];
                System.out.print(evenNum + ", ");
            }
        }

        HashSet<Integer> h = new HashSet<Integer>();
       for (int i = 1; i<arrayNum.length; i++){
           h.add(arrayNum[i]);
       }

 //       Iterator<Integer> i = h.iterator();
   //    while(i.hasNext()){
     //      System.out.print(i.next() + " ");
       //}

        for (Iterator<Integer> it = h.iterator(); it.hasNext();) {
            for (int i = 1; i < arrayNum.length; i++) {
                Integer item = it.next();
                if (arrayNum[i] % 5 == 0) {
                    // if(evenNum % 5 == 0){         не смогла сделать: делимые на 5 без остатка записать сначала. такие есть: 10, 20, 30, 40....
                    // h.add(evenNum);

                    h.add(arrayNum[i]);
                    System.out.println(h + " ");
                } else
                    h.add(arrayNum[i]);
            }
        }
}}
