import java.net.PortUnreachableException;

class Operations{
    public void A(int a,int b){
        System.out.println(a+b);
    }
    public void A(Float a, Float b, Float c){
        System.out.println(a-b+c);
    }
    public void A(String Name){
        System.out.println(Name);
    }
}


public class MethodOverlodig{

    public static void main(String[] args) {
        Operations k = new Operations();    
        k.A(4,5);
        k.A(5.2f,5.5f,1.3f);
        k.A("XU");
        
    }

}