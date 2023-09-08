import java.util.LinkedList;

//Stack class
class Stack {
    //Node class
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //Create node
    private Node node1;
    //Size of the stack
    private int size;

    //Initial Stack method
    public Stack(){
        node1 = null;
        size = 0;
    }

    //Push Method
    public void push(int number){
        Node temp = new Node(number);
        //Check if node has anything in it
        if(node1 != null){
            temp.next = node1;
        }
        //Replace node with temp node;
        node1 = temp;
        size++;
    }

    //Pop method
    public int pop(){
        //Check if list is empty
        if (isEmpty()){
            return 0;
        }
        //Create variable for number being popped
        int number = node1.data;
        //Pull top number
        node1 = node1.next;
        //Reduce size
        size--;
        //Return the number from the top of stack
        return number;
    }

    //isEmpty method
    public boolean isEmpty(){
        //If size is 0, return true
        return size == 0;
    }

    //Size method
    public int size(){
        //Return size of stack
        return size;
    }

    //Peek method
    public int peek(){
        //Check if list is empty
        if (isEmpty()){
            return 0;
        }
        //Return number at the top
        return node1.data;
    }
}

//Main class
public class Main {
    public static void main(String[] args) {
        //Create Stack
        Stack s = new Stack();

        //Add values 10,20 and 30
        s.push(10);
        s.push(20);
        s.push(30);

        //pop()
        s.pop();

        //isEmpty()
        s.isEmpty();

        //size()
        s.size();

        //peek()
        s.peek();
    }
}
