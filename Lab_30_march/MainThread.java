package Lab_30_march;



 class LoaderThread implements Runnable {
    private int startNumber;
    private int lastNumber;
    private int[] arr;

    public LoaderThread(int startNumber, int lastNumber, int[] arr) {
        this.startNumber = startNumber;
        this.lastNumber = lastNumber;
        this.arr = arr;
    }

   
    public void run() {
        for (int i = startNumber; i <= lastNumber; i++) {
            arr[i] = i;
        }
    }
}

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = new int[100000001];
        long startTime = System.currentTimeMillis();

        // Single threaded 
        /*ListLoader listLoader = new ListLoader();
        listLoader.loadList(0, 100000000);
        int[] arr = listLoader.getArr();*/

        // Multi threaded 
        LoaderThread loaderThread1 = new LoaderThread(0, 50000000, arr);
        LoaderThread loaderThread2 = new LoaderThread(50000001, 100000000, arr);
        Thread thread1 = new Thread(loaderThread1);
        Thread thread2 = new Thread(loaderThread2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        long endTime = System.currentTimeMillis();
        System.out.println("Start time:"+ startTime);
        System.out.println("End time:"+endTime);
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }
}
