package Day18;

public class UserExceptionExample {

    public void marksCheck (int mark) throws MakingException1,MakingException2{
 if(mark<=33){
    throw new MakingException1("Fail");
 }
 if(mark>=80){
    throw new MakingException2("Pass");
 }
    }
    public static void main(String[] args) throws MakingException2 {
        UserExceptionExample obj = new UserExceptionExample();
        try{
            obj.marksCheck(32);
            obj.marksCheck(80);
        }
        catch(MakingException1 e){
            System.out.println("Error message : "+e);

        }
    }

    
    
}

class MakingException1 extends Exception{
    MakingException1(String s){
        super(s);
    }
}
class MakingException2 extends Exception{
    MakingException2(String s){
        super(s);
    }
}