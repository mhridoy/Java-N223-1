package Day18;

public class UserException {
    public static void main(String[] args) {
        
        try{
            System.out.println("Try Block");
            throw new Myexception("This is the error!");

        }
        catch(Exception e){
            System.out.println("Error message : "+e);
        }
    }
}
class Myexception extends Exception{
    String s1;

    Myexception(String s2){
        this.s1 =s2;
    }
    public String toString(){
        return ("Exception Occurred"+s1);
    }
}
