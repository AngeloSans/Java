//package DataStructure;
//
//
//public class LinkedList{
//    public static void main(String[] args) {
//        Linked list1 = new Linked();
//        list1.Insert(23);
//        list1.Insert(29);
//        list1.Display();
//    }
//}
//class Node{
//    int value;
//    Node next;
//
//    public Node(int value){
//        this.value = value;
//        this.next = null;
//    }
//
//
//}
//class Linked{
//    Node head;
//
//    public void Insert(int value){
//        Node newNode = new Node(value);
//        newNode.next = head;
//        head = newNode;
//    }
//    public void Display(){
//        Node current = head;
//        while(current != null){
//            System.out.println("the current node: "+ current.value + "");
//            current = current.next;
//        }
//        System.out.println();
//    }
//}
//
