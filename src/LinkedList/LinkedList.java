package LinkedList;

import org.w3c.dom.Node;

public class LinkedList {
    private class Node{
        int val;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;
    public void addNode(int item){
        Node nn = new Node();
        nn.val = item;
        if (size==0){
            head = nn;
            tail =nn;
            size++;
        }
        else {
            nn.next =head;
            head = nn;
            size++;
        }
    }
    public  void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.println(".");
    }
}
