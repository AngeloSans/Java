//package DataStructure;
//
//public class DoublyLinkedList {
//    public static void main(String[] args) {
//        DoublyLinked list = new DoublyLinked();
//        list.append(13);
//        list.append(29);
//        list.append(25);
//        list.show();
//    }
//}
//class Node{
//    int value;
//    Node prev;
//    Node next;
//
//    public Node(int value){
//        this.value = value;
//        this.prev = null;
//        this.next = null;
//    }
//}
//class DoublyLinked{
//    Node head;
//    Node tail;
//
//    DoublyLinked(){
//        this.head = null;
//        this.tail = null;
//    }
//
//    public void append(int value){
//        Node newNode = new Node(value);
//        if(head == null){
//            head = newNode;
//            tail = newNode;
//        }
//        else{
//            tail.next = newNode;
//            newNode.prev = tail;
//            tail = newNode;
//        }
//    }
//    public void prepend(int value){
//        Node newNode = new Node((value));
//        if(head == null){
//            head = newNode;
//            tail = newNode;
//        }else{
//            newNode.next = head;
//            head.prev = newNode;
//            head = newNode;
//        }
//    }
//    public void show(){
//        Node current = head;
//        while (current != null){
//            System.out.println(current.value + "");
//            current = current.next;
//        }
//        System.out.println();
//    }
//}