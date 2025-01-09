/**
 * @author wubiyu
 * @version 1.1
 */
public class IntList {
    public int first;
    public IntList rest;

    /**
     * Constructor to initialize the list.
     * @param f The first element of the list.
     * @param r The rest of the list.
     */
    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    } 

    /**
     * Return the size of the list using recursion.
     * @return The size of the list.
     */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + rest.size();
    }

    /**
     * Return the size of the list using iteration.
     * @return The size of the list.
     */
    public int iterativeSize() {
        IntList p = this;
        int totalSize = 0;
        while (p != null) {
            totalSize += 1;
            p = p.rest;
        }
        return totalSize;
    }

    //return the ith item of this list
    public int get(int i) {
        if (i == 0) {
            return first;
        }
        return rest.get(i-1);
    }

    /**
     * Main method to test the IntList class.
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L = new IntList(10, L);
        L = new IntList(15, L);
        System.out.print(L.first + " ");
        System.out.print(L.rest.first + " ");
        System.out.print(L.rest.rest.first + " ");
        int len = L.iterativeSize();
        int g = L.get(2);
        System.out.println();
        System.out.println("len: " + len); 
        System.out.println("g: " + g); 
    }
}