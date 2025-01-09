/**
 * Immutable Singly Linked List implementation
 * @author wubiyu
 * @version 1.1
 */ 
public class DLList<pineapple> {
    public class IntNode {
        public pineapple item;
        public IntNode next;
        public IntNode prev;
    
        public IntNode(pineapple i, IntNode n, IntNode p) {
            item = i;
            next = n;
            prev = p;
        }
        
    }

    /* the first item, if it exists, is at sentinel.next */
    public IntNode pointer; 
    private IntNode sentinel; 
    private int size;

    /* create a new SLList with one item, namely x */
    public DLList(pineapple x) {
        sentinel = new IntNode(null, null, null);
        sentinel.next = new IntNode(x, sentinel, sentinel);
        sentinel.prev = sentinel.next;
        size = 1; 
    }

    /* create a new SLList with no item */
    public DLList() {
        sentinel = new IntNode(null, null, null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
        size = 0;  
    }

    
    public void addFirst(pineapple x) {
        sentinel.next = new IntNode(x, sentinel.next, sentinel);
        size ++;
    }

    public void addLast(pineapple x) {
        sentinel.prev.next = new IntNode(x, sentinel, sentinel.prev); 
        sentinel.prev = sentinel.prev.next;
        size ++; 
    } 

    public void popLast() {
        sentinel.prev.prev.next = sentinel;
        sentinel.prev = sentinel.prev.prev;
        size --;
    }

/* 
    public int size_iterative() {
        IntNode p = first;
        int size = 1;
        while (p.next != null) {
            size ++;
            p = p.next;
        }
        return size;
    }

    public int size() {
        return size_recursive(first);
    }

    private int size_recursive(IntNode p) {
        if (p.next == null) {
            return 1;
        }
        return 1 + size_recursive(p.next);
    }
*/
 
    public static void main(String[] args) {
        DLList<String> L = new DLList<String>();
        L.addLast("15");
        L.addFirst("10"); 
        L.addFirst("5");
        L.addLast("xx");
        L.addLast("yy");
        L.popLast();
        L.pointer = L.sentinel;
        while (L.pointer.next != L.sentinel) {
            System.out.print(L.pointer.next.item + " ");
            L.pointer = L.pointer.next;
        }     
        System.out.println();
        System.out.println(L.size);   
    }  
}
