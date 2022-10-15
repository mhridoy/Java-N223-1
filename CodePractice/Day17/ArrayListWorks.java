package CodePractice.Day17;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListWorks {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int array [] = new int [10];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        
        ArrayList<Integer> nameOfthearray = new ArrayList<>();

        nameOfthearray.add(10);
        nameOfthearray.add(in.nextInt());

        nameOfthearray.get(0); // array[0]

        nameOfthearray.set(1,10); // array[1]= 10;


    }
}
