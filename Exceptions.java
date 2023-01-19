import java.util.*;
public class Exceptions{
    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Index");
        try {
            a = sc.nextInt();
            System.out.println(A[a]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Caught");
        }
        finally{
            System.out.println("Executed Successfully");
        }
        

    }

}
// implement throw and throws