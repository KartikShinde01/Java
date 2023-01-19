abstract class Student{
    public void Sname(){
        System.out.println("Kartik ");

    }
}
class Collage extends Student{
    public void Same(){
        System.out.print("Shinde");

    }
}
public class AbstractC{
    public static void main(String[] args) {
        Collage k = new Collage();
        k.Sname();
        k.Same();
        
    }
}