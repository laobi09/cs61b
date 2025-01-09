public class AList<Item> implements List61B<Item> {

    private Item[] items;
    private int size;

    /* create an empty list */
    public AList(){
        items = (Item[]) new Object[100];
        size = 0;
    }

    private void resize(int capacity) {
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    @Override
    public void addLast(Item x) {
        if (size == items.length) {
            resize(size*2);
        }
        items[size] = x; 
        size++;
    }

    @Override
    public Item getLast() {
        return items[size - 1];
    }

    @Override
    public Item get(int i) {
        return items[i];
    }

    @Override
    public Item removeLast() {
        Item x = getLast();
        size--;
        return x;
    } 

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addFirst(Item x) {
        if (size == items.length) {
            resize(size*2);
        }
        System.arraycopy(items, 0, items, 1, size);
        items[0] = x;
        size++;
    }

    @Override
    public void insert(Item x, int position) {
        if (size == items.length) {
            resize(size*2);
        }
        System.arraycopy(items, position, items, position + 1, size - position);
        items[position] = x;
        size++;
    }

    public static void main(String[] args) {
        AList<String> a = new AList<>();
        a.addLast("hi");
        a.addLast("there");
        a.addLast("how");
        a.addLast("are");
        a.addLast("you");
        System.out.println(a.size());  
    }
} 