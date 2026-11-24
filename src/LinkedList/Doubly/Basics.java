package LinkedList.Doubly;

public class Basics {
    public static class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }
    public static Node head;
    public static Node tail;
    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +" -> ");
            temp=temp.next;
        }
    }

    public static void Reverse(){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.prev;
        }
    }
    public static void deleteFirst(){
        if(head==null){
            System.out.println(" List is Empty");
            return;
        }
        head=head.next;
    }

    public static void deleteLast(){
        if(head==null){
            System.out.println(" List is Empty ");
            return;
        }
        if(head.next==null){
            head=null;
            return ;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;

        head=a;
        tail=e;
        display();
        System.out.println();
        Reverse();
        System.out.println();
        deleteFirst();
        display();
        System.out.println();
        deleteLast();
        display();
    }
}
