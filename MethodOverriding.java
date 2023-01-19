class A{
    public void xu(){
        System.out.println("Not Done");
    };
}
class B extends A{
    @Override
    public void xu(){
        System.out.println("Done");
    }

}

public class MethodOverriding{
    public static void main(String[] args) {
        A k = new A();
        B f = new B();
        k.xu();
        f.xu();

        
    }
}