package test;
public class test {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Node list = new Node();
        list.addInFirstPostion(1);
        list.addInFirstPostion(7);
        list.PrintList();
        
    }

}

class Node {
    int data;
    Node next;
    Node head;
Node(){

}
    Node(int data){
        this.data = data;
        this.next = null;
    }
public void addInFirstPostion(int data){

    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
}
public void PrintList (){
    Node currentNode = head;

    while(currentNode !=null){
      System.out.print(currentNode.data+" ->");
      currentNode = currentNode.next;
    }
    System.out.println("");


}

}