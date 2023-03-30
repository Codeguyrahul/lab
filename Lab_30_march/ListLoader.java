package Lab_30_march;
public class ListLoader {
    private int[] array;

    public ListLoader(int size) {
        array = new int[size];
    }

    public void loadArray(int startNumber, int lastNumber) {
        for (int i = startNumber; i <= lastNumber; i++) {
            array[i] = i;
        }
    }

    public static void main(String[] args) {
        ListLoader arrayLoader = new ListLoader(10000001);
        long startTime = System.currentTimeMillis();
        arrayLoader.loadArray(0, 10000000);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
    }
}



