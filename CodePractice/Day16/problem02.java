package Day16;

import java.util.*;
public class problem02 {
public static void main(String[] args) {
    
    Scanner in = new Scanner (System.in);
    int testCase = in.nextInt();

    while(testCase--!=0){
        long warriors = in.nextLong();

        long rowForm = (long)((-1 + Math.sqrt(1+8*warriors))/2);

        System.out.println(rowForm);


    }
}    
    
}
