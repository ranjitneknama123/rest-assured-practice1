package dsa;

public class CustomLinkImplementation {
    Node head,tail;

    static class Node {
        Object data;
        Node next;
        Node previous;

        Node(Object data) {
            this.data = data;
            this.next=null;
        }

    }

    public void addNumber(Object data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        else {
            newNode.next=head;
            head=newNode;

        }
    }

    public static void main(String[] args) {


        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        n1.next=n2;
        n2.next=n3;
        n3.next=null;

        System.out.println(n1.data);
        System.out.println(n2.data);
        System.out.println(n3.data);

        System.out.println(n1.next.data);
        System.out.println(n2.next.data);
        System.out.println(n3.next.data);


    }
}
