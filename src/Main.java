public class Main {
    public static void main(String[] args) {

        OnTaskDoneListner listner = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;
        Worker worker = new Worker(listner, errorListener);
        worker.start();

    }
}
