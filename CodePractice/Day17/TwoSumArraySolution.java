
package CodePractice.Day17;
import java.util.Scanner;

public class TwoSumArraySolution{
    public static void main(String[] args) {
        
        try(Scanner in = new Scanner (System.in)){
        int array [] = {3,5 ,8,-1,11,4,10,12,13,14,15,16,17,19100};
       
    

        int target = in.nextInt();
        int count =0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]+array[j]==target){
                    System.out.println("X :"+array[i]+" Y : "+array[j]+" Target : "+target);

                }
                System.out.println("Iteration : "+(++count));
            }
            
        }
    }

    }
}