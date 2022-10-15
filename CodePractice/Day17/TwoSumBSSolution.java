package CodePractice.Day17;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumBSSolution {

    public static void main(String[] args) {
    
        try(Scanner in = new Scanner (System.in)){
        int array [] = {3,5 ,8,-1,11,4,10,12,13,14,15,16,17,19100};

        Arrays.sort(array);

        int left =0;
        int right = array.length-1;
        int target = in.nextInt();

        while(left<right){

            int currentSum = array[left]+ array[right];

            if(currentSum== target) {
                System.out.println("Found : "+array[left]+ " "+array[right]);
                break;
            }

            else if (currentSum> target) right--;
            else {
                left++;
            }
        }

        



        }
    }
    
}
