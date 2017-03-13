package Problems.Chapter15_Generics.c_StackOfTheClass;

/**
 * @author SashaKhyzhun on 3/13/17. Page 507.
 * Стэк, реализованный на базе связанного списка.
 */

public class LinkedStack<T> {

    private static class Node<U> {
        U item;
        Node<U> next;

        Node() { item = null; next = null; }

        public Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() { return item == null && next == null; }
    }

    private Node<T> top = new Node<T>(); // Сторож

    public void push(T item) {
        top = new Node<T>(item, top);
    }

    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<String>();

        System.out.println((lss.top != null) ? null + " // создает new Node(U item, Node<T> next)" : lss.top);

        for (String s : "Phasers on stun!".split(" ")) {
            lss.push(s);
        }
        String s;
        while ((s = lss.pop()) != null) {
            System.out.println(s);
        }
    }

}
