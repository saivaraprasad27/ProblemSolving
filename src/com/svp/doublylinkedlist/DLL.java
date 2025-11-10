package com.svp.doublylinkedlist;

public class DLL {
    private Node head;
    private int size;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
        size++;
    }

    public Node findLastNode(){
        Node node = head;
        Node last = null;
        while(node != null){
            last = node;
            node = node.next;
        }

        System.out.println(">>" + last.value);
        return last;
    }

    public void display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print the reverse List");
        while(last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        Node(int value){
            this.value = value;
        }

        Node(int value, Node prev, Node next){
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}

class Main{
    public static void main(String[] args){
        DLL list = new DLL();
        list.insertFirst(7);
        list.insertFirst(6);
        list.insertFirst(5);
        list.insertFirst(4);
        list.display();
        list.findLastNode();
    }
}
