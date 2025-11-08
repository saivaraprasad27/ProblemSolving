package com.svp.linkedlist;

public class SingleLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public SingleLinkedList(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;

        size++;
    }

    public void insertAtPos(int val, int index){
        if(head == null){
            insertFirst(val);
        }

        if(size == index){
            insertLast(val);
        }

        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size<=1){
            deleteFirst();
        }

        Node secondLastNode = getNode(size-2);
        int val = tail.value;
        tail = secondLastNode;
        tail.next = null;

        size--;
        return val;
    }

    public int deleteAtPos(int index){
        if(index == 0){
            return deleteFirst();
        }

        if(index == size - 1){
            return deleteLast();
        }

        Node prev = getNode(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        size--;
        return val;
    }

    public Node getNode(int index){
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }

    public void displayLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ->");
            temp = temp.next;
        }

        System.out.println(" END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}

class Main
{
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.insertFirst(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);

        list.displayLL();

        list.insertAtPos(99,3);
        list.displayLL();


        System.out.println("Delete The First Item: " +list.deleteFirst());
        list.displayLL();

        System.out.println("Delete The Last Item: "+list.deleteLast());
        list.displayLL();

        System.out.println("Delete At Index Position: "+list.deleteAtPos(2));
        list.displayLL();
    }
}
