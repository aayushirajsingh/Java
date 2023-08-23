package dsa;

public class DoubleLinkList {
 
    Node head;

    class Node 
    {
      int data;
      Node prev;
      Node next;

      Node(int d) 
      {
        data = d;
      }
    }
  
    public void insert(int data) 
    {
      Node nNode = new Node(data);
      nNode.next = head;
      nNode.prev = null;
      if (head != null)
      {
          head.prev = nNode;
      }
      head = nNode;
    }

   void deleteNode(Node dnode) 
    {

        if (head == null || dnode ==null) 
        {
          return;
        }
        if (head == dnode) 
        {
            head = dnode.next;
        }
        if (dnode.next != null) {
            dnode.next.prev = dnode.prev;
        }
        if (dnode.prev != null) {
            dnode.prev.next = dnode.next;
        }
        return;
    }

    public void deleteNodeAtGivenPos(int n)
    {
        if (head == null || n <= 0)
        {
            return;
        }
 
        Node current = head;
        int i;
 
        for (i = 1; current != null && i < n; i++)
        {
            current = current.next;
        }
         
        if (current == null)
            return;
 
        deleteNode(current);
    }
    public void print(Node node) {
      Node last = null;
      while (node != null) {
        System.out.print(node.data + " , ");
        last = node;
        node = node.next;
      }
      System.out.println();
    }

    public static void main(String[] args) {
      DoubleLinkList dll = new DoubleLinkList();

      dll.insert(5);
      dll.insert(1);
      dll.insert(6);
      dll.insert(9);
      dll.insert(10);
      dll.insert(8);
      System.out.print("Elements present: ");
      dll.print(dll.head);
      System.out.print("Elements after Deletion: ");
      //dll.deleteNode(dll.head);
      dll.deleteNodeAtGivenPos(2);
      dll.print(dll.head);
    }
}