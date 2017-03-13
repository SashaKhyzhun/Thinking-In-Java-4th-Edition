package Problems.Chapter15_Generics.c_StackOfTheClass;

/**
 * @author SashaKhyzhun on 3/13/17.
 */

/**
 * @author SashaKhyzhun on 3/13/17. Page 508.
 * Стэк, реализованный на базе связанного списка.
 */

public class LinkedStackTask<T> {

    private static class Node {
        Object item;
        Node next;

        Node() { item = null; next = null; }

        public Node(Object item, Node next) {
            this.item = item;
            this.next = next;
        }

        boolean end() { return item == null && next == null; }
    }

    private Node top = new Node(); // Сторож

    public void push(T item) {
        top = new Node(item, top);
    }

    public Object pop() {
        Object result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedStackTask<String> lss = new LinkedStackTask<>();

        System.out.println((lss.top != null) ? null + " // создает new Node(U item, Node<T> next)" : lss.top);

        for (String s : "Phasers on stun!".split(" ")) {
            lss.push(s);
        }
        Object s;
        while ((s = lss.pop()) != null) {
            System.out.println(s);
        }
    }

}
