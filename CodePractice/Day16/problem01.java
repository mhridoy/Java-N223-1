package Day16;

import java.util.*;
public class problem01 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);


        while(in.hasNext()){

        byte v = in.nextByte();
        int time = in.nextInt();
        int displacement = 2*v*time;
        System.out.println(displacement);
    }
}

}
