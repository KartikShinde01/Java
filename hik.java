public class hik extends Thread{
    public static void main(String[] args) {
        Mt k = new Mt();
        
        k.start();
    }
    public void run(){
        System.out.println("Done");
    }

}