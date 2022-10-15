package Day18;

public class ExceptionHandling {
    public static void main(String[] args) {
        //System.out.println(5/0);

        // try{
        //     int num = 10/0;
        //     System.out.println(num);
        // }
        // catch(ArithmeticException e){
        //     System.out.println("Do not try to divide by zero");
        //     System.out.println("Error message : "+e);
        // }
        // System.out.println("I'm running");

        // NumberFormatException
        String string ="hello world";
        try{
       String s = "Hello";
       char c = s.charAt(1);
        }
        catch(Exception e){
            System.out.println("Error message: "+e);
        }
        finally{
            System.out.println("I'm still running");
        }

    }
}
/*
 *  Arithmetic 
 * NullPointerException
 */