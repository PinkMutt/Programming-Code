public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        LinkedList<String> lList = new LinkedList<String>();
        lList.add("Hello");
        lList.add("World");
        lList.add("!");
        Node current = lList.head;

        while(current.next != null) {
            System.out.println("Head Node: " + lList.head.data);
            System.out.println(current.data);
            current = current.next;
        }
    }
}