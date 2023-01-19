public class Cons{
    int a=10;
    public Cons()
    {
        System.out.println("Default "+ a);
    }
    public Cons(int a){
        System.out.println("parameterized " + a);

    }
    public static void main(String args[]){
        Cons k = new Cons(50);
        Cons l = new Cons();
    }

}