public class Mt implements Runnable{
    public static void main(String[] args) {
        Mt k = new Mt();
        Thread h = new Thread(k);
        h.start();
    }
    public void run(){
        System.out.println("Done");
    }

}