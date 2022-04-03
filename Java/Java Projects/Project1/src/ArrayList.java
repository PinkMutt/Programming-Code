import java.lang.reflect.Array;

public class ArrayList<E> {
    private Object[] array;
    private int size;
    public ArrayList() {
        array = (E[]) Array.newInstance();
        size = 0;
    }
    public void add(Object e) {
        Object[] arrayN = new Object[array.length+1];
        System.out.println(e);
        for(int i = 0; i < array.length; i++) {
            arrayN[i] = array[i];
        }
        arrayN[array.length] = e;
        array = arrayN;
        size = size++;
    }

    public int size() {
       return size;
    }

    public Object get(int index) {
        return array[index];
    }

}
