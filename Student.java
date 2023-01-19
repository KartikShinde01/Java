class University{
    public String Uname = "SPPU";
}

interface StudName{
    public void A();
}
class Collage extends University{
    public String collageName = "xu";

    }
class Cources extends Collage implements StudName {
    public String courceName = "It";
   // public String name ="Kartik";
   public void A(){
    System.out.println("NNN");
   }


}
public class Student{
    public static void main(String args[]){
    Cources k = new Cources();
    System.out.println(k.courceName);
    System.out.println(k.collageName);
    k.A();
    System.out.println(k.Uname);
}
}