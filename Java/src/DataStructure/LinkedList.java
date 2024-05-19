//package DataStructure;
//
//public class LinkedList {
//    public static void main(String[] args) {
//        Linked linkedlist = new Linked();
//        linkedlist.add(13);
//        linkedlist.add(14);
//        linkedlist.getList();
//    }
//}
//class Node{
//    int data;
//    Node next;
//
//    public Node(int data){
//        this.data = data;
//        this.next = null;
//    }
//}
//class Linked{
//    Node head;
//
//    public void add(int data){
//        Node newNode = new Node(data);
//        if(head == null){
//            head = newNode;
//        }else{
//            Node current = head;
//            while(current.next != null){
//                current = current.next;
//            }
//            current.next = newNode;
//        }
//
//
//    }
//    public void getList(){
//        Node current = head;
//        while (current != null){
//            System.out.println(current.data + "");
//            current = current.next;
//        }
//        System.out.println();
//    }
//    public void Remove(int data){
//        if(head == null){
//            return;
//        }
//        if(head.data == data){
//            head = head.next;
//            return;
//        }
//
//        Node current = head;
//
//        while (current.next != null && current.next.data != data){
//            current = current.next;
//        }
//        if(current.next != null){
//            current.next = current.next.next;
//        }
//    }
//}
