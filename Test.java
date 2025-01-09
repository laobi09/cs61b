/**
 * @author wubiyu
 * @version 1.1
 */
public class Test {
    public static void main(String[] args) {
        // Initialize arrays x, y, and z
        int[] x, y;
        x = new int[]{1,2,3,4,5};
        y = new int[]{2,4,6,8,10};
        // Print the first element of each array
        System.arraycopy(x, 0, y, 2, 3);
        System.out.println(y[0] + " " + y[1] + " " + y[2] + " " + y[3] + " " + y[4]);
    }
}
