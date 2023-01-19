import java.util.*;
class Student{
    Scanner k = new Scanner(System.in);
    String Name,Email;
    int Roll; 
    void getData()
    {   
        System.out.println("Enter your Name :- ");
        Name =  k.nextLine();
        System.out.println("Enter Your Email id :- ");
        Email =k.nextLine();

        System.out.println("Enter Your Roll no :- ");
        Roll = k.nextInt();
        
        

    }
    void ShowData()
    {
        System.out.println("\n"+Name);
        System.out.println(Roll);
        System.out.println(Email);
    }


    }
public class ArrayObj{
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        int d;
        System.out.println("How many records u want to Enter :- ");
        d =  j.nextInt();
        Student obj[] = new Student[d];
        for(int i = 0; i < d; i++){
        obj[i] = new Student();
        obj[i].getData();
        }
            for(int i = 0; i < d; i++){
                obj[i].ShowData();
            }
        
}
}
