package CodePractice.Day17;

public class StackImplementationUsingLinkedList {
    static class Node{
        int value;
        Node next;
        
        Node (int value ){
            this.value = value;
            next = null;
        }

        static class stackImp{
            public static Node head = null;
            public static void push(int data ){
                Node nodeCreate = new Node(data);

                if(head==null){

                    head = nodeCreate;
                    return;
                }
                nodeCreate.next= head;
                head = nodeCreate;
            }

            public static boolean isEmpty(){
                return head == null;
            }

            public static int pop (){

                if(isEmpty()) return -1;

                Node top = head;
                head = head.next;

                return top.value;

            }

            public static int peek(){

                if(isEmpty()) return -1;

                Node top = head;

                return top.value;

            }


        }
        public static void main(String[] args) {
            stackImp obj= new stackImp();
            obj.push(1);
            obj.push(2);
            obj.push(3);
            obj.push(4);

            while(!obj.isEmpty()){
                System.out.println(obj.peek());
                obj.pop();
            }

        
        }
    }
}
