import java.util.List;

public class LinkedList<E> {
    Node<E> head;

    public LinkedList() {
       head = new Node<E>(null);
    }
    public void add(E e) {
       Node<E> temp = new Node<E>(e);
       Node<E> current = head;

       while (current.next != null) {
           current = current.next;
           System.out.println(current + ": " + current.data);
       }
       // current.next should be null

       current.next = temp;
       current = current.next;
       current.next = null;

    }
}
