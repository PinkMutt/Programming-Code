public class Test {
    public static void main(String[] args) {
        /**
         * Linked List testing
         LinkedList<String> list = new LinkedList<String>();
         list.add("Hello");
         list.add(" World");
         list.add("!");

         Node<String> node = list.head.next;
         while(node != null) {
         System.out.print(node.data);
         node = node.next;
         }
         **/
        // ArrayList testing
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add(" World");
        list.add("!");

        System.out.println(list);
        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++) {
            System.out.println("for loop");
            System.out.print(list.get(i));
        }

    }
}
