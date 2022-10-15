package CodePractice.Day17;

import java.util.ArrayList;

public class StackImplementationUsingArray {
    static class StackImplementation{
        ArrayList <Integer>  list = new ArrayList<>();


        public void push(int data){
            list.add(data);
        }
        public boolean isEmpty(){
            return list.size()==0;
        }
        public int pop(){

            if(isEmpty()) return -1;

            int top = list.remove(list.size()-1);

            return top;
        }
        public int peek(){
            if(isEmpty()) return -1;

            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        StackImplementation obj = new StackImplementation();
        obj.push(10);
        obj.push(11);
        obj.push(12);
        obj.push(13);

        while(!obj.isEmpty()){
            System.out.println(obj.peek());
            obj.pop();
        }


    }
}
