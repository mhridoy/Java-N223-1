package Day16;
import java.util.*;
public class problem03 {
    public static void main(String[] args) {
        Scanner input  = new Scanner (System.in); 
        int testCase = input.nextInt();
        int index =0;

        while(testCase--!=0){
            byte NumberPlayers = input.nextByte();
            byte KthPlayer = input.nextByte();

            int NumberOfPass = input.nextInt();

            int result = (KthPlayer+ NumberOfPass)%NumberPlayers;

            if(result==0)
            System.out.println("Case "+(++index)+": "+NumberPlayers);
            else 
            System.out.println("Case "+(++index)+": "+result);
        }
    }
}
